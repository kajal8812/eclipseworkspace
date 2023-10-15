package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.entity.Information;

public class InformationDao {

	public static Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Fun", "postgres", "sillicon");
		} catch (Exception e) {
			System.out.println(e);
		}
		return con;
	}

	public static int save(Information i) {
		int status = 0;
		try {
			Connection con = InformationDao.getConnection();
			PreparedStatement ps = con
					.prepareStatement("INSERT INTO search(quantity,uom,estimatedprice) values(?,?,?)");

			ps.setString(1, i.getQuantity());
			ps.setString(2, i.getUom());
			ps.setString(3, i.getEstimatedPrice());

			status = ps.executeUpdate();

			con.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return status;
	}

	public static int update(Information i) {
		int status = 0;
		try {
			Connection con = InformationDao.getConnection();
			PreparedStatement ps = con
					.prepareStatement("update search set quantity=?,uom=?,estimatedprice=? where id=?");

			ps.setString(1, i.getQuantity());
			ps.setString(2, i.getUom());
			ps.setString(3, i.getEstimatedPrice());
			ps.setInt(4, i.getId());
			status = ps.executeUpdate();

			con.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return status;
	}

	public static int delete(int id) {
		int status = 0;
		try {
			Connection con = InformationDao.getConnection();
			PreparedStatement ps = con.prepareStatement("delete from search where id=?");
			ps.setInt(1, id);
			status = ps.executeUpdate();

			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return status;
	}

	public static Information getEmployeeById(int id) {
		Information i = new Information();

		try {
			Connection con = InformationDao.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from search where id=?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				i.setId(rs.getInt(1));
				i.setQuantity(rs.getString(2));
				i.setUom(rs.getString(3));
				i.setEstimatedPrice(rs.getString(4));
				i.setDeleted(rs.getInt(5));

			}
			con.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return i;
	}

	public static List<Information> getAll() {
		List<Information> list = new ArrayList<Information>();

		try {
			Connection con = InformationDao.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from search");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Information i = new Information();
				i.setId(rs.getInt(1));
				i.setQuantity(rs.getString(2));
				i.setUom(rs.getString(3));
				i.setEstimatedPrice(rs.getString(4));
				i.setDeleted(rs.getInt(5));
				list.add(i);
			}
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

	public static int softDelete(int id) {
		int status = 0;
		try {
			Connection con = InformationDao.getConnection();
			PreparedStatement ps = con.prepareStatement("update search set deleted=1 where id=?");
			ps.setInt(1, id);
			status = ps.executeUpdate();

			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return status;
	}
}
