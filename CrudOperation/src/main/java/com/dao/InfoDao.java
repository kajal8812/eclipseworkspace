package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.entity.Info;

public class InfoDao {
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

	public static int save(Info i) {
		int status = 0;
		try {
			Connection con = InfoDao.getConnection();
			PreparedStatement ps = con.prepareStatement(
					"INSERT INTO bus(requestorName,businessUnit,poType,title,requisitionType,currency,ccp,costcenter,warehouseaddress,buildingaddress) values(?,?,?,?,?,?,?,?,?,?)");

			ps.setString(1, i.getRequestorName());
			ps.setString(2, i.getBusinessUnit());
			ps.setString(3, i.getPoType());
			ps.setString(4, i.getTitle());
			ps.setString(5, i.getRequisitionType());
			ps.setString(6, i.getCurrency());
			ps.setString(7, i.getCcp());
			ps.setString(8, i.getCostcenter());
			ps.setString(9, i.getWarehouseaddress());
			ps.setString(10, i.getBuildingaddress());

			status = ps.executeUpdate();

			con.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return status;
	}

	public static int update(Info i) {
		int status = 0;
		try {
			Connection con = InfoDao.getConnection();
			PreparedStatement ps = con.prepareStatement(
					"update bus requestorName=?,businessUnit=?,poType=?,title=?,requisitionType=?,currency=?,ccp=?,costcenter=?,warehouseaddress=?,buildingaddress=? where id=?");
			//			PreparedStatement ps = con.prepareStatement(
			//					"update("INSERT INTO bus(requestorName,businessUnit,poType,title,requisitionType,currency,ccp,costcenter,warehouseaddress,buildingaddress) values(?,?,?,?,?,?,?,?,?,?")");

			ps.setString(1, i.getRequestorName());
			ps.setString(2, i.getBusinessUnit());
			ps.setString(3, i.getPoType());
			ps.setString(4, i.getTitle());
			ps.setString(5, i.getRequisitionType());
			ps.setString(6, i.getCurrency());
			ps.setString(7, i.getCcp());
			ps.setString(8, i.getCostcenter());
			ps.setString(9, i.getWarehouseaddress());
			ps.setString(10, i.getBuildingaddress());

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
			Connection con = InfoDao.getConnection();
			PreparedStatement ps = con.prepareStatement("delete from bus where id=?");
			ps.setInt(1, id);
			status = ps.executeUpdate();

			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return status;
	}

	public static Info getEmployeeById(int id) {
		Info i = new Info();

		try {
			Connection con = InfoDao.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from bus where id=?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				i.setId(rs.getInt(1));
				//businessUnit,poType,title,requisitionType,currency,ccp,costcenter,warehouseaddress,buildingaddress
				i.setRequestorName(rs.getString(2));
				i.setBusinessUnit(rs.getString(3));
				i.setPoType(rs.getString(4));
				i.setTitle(rs.getString(5));
				i.setRequisitionType(rs.getString(6));
				i.setCurrency(rs.getString(7));
				i.setCcp(rs.getString(8));
				i.setCostcenter(rs.getString(9));
				i.setWarehouseaddress(rs.getString(10));
				i.setBuildingaddress(rs.getString(11));

			}
			con.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return i;
	}

	//requestorName,businessUnit,poType,title,requisitionType,currency,ccp,costcenter,warehouseaddress,buildingaddress) 

	public static List<Info> getAll() {
		List<Info> list = new ArrayList<Info>();

		try {
			Connection con = InfoDao.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from bus");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Info i = new Info();
				i.setId(rs.getInt(1));
				i.setRequestorName(rs.getString(2));
				i.setBusinessUnit(rs.getString(3));
				i.setPoType(rs.getString(4));
				i.setTitle(rs.getString(5));
				i.setRequisitionType(rs.getString(6));
				i.setCurrency(rs.getString(7));
				i.setCcp(rs.getString(8));
				i.setCostcenter(rs.getString(9));
				i.setWarehouseaddress(rs.getString(10));
				i.setBuildingaddress(rs.getString(11));
				list.add(i);
			}
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}
}
