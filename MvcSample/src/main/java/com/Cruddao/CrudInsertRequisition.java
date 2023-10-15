package com.Cruddao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.connection.Crud;
import com.modal.Requisition;

public class CrudInsertRequisition {

	//CrudInsertRequisition req = new CrudInsertRequisition();

	public static int saveRequisition(Requisition requisition) {
		String sql = "INSERT into requisition1(businessunit,requisitiontitle,currency,buildingaddress,requisitiondate) values(?,?,?,?,?)";
		int status = 0;
		Connection con = Crud.getConnection();
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, requisition.getBusinessUnit());
			ps.setString(2, requisition.getRequisitionTitle());
			//	ps.setString(3, requisition.getRequisitionType());
			//ps.setString(3, requisition.getOfUser());
			ps.setString(3, requisition.getCurrency());
			ps.setString(4, requisition.getBuildingAddress());
			ps.setString(5, requisition.getRequisitionDate());
			status = ps.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e);
		}
		return status;
	}

	public static List<Requisition> getAll() {
		List<Requisition> list = new ArrayList<Requisition>();

		try {
			Connection con = Crud.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from requisition1");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Requisition i = new Requisition();
				i.setId(rs.getInt(1));
				i.setBusinessUnit(rs.getString(2));
				i.setRequisitionTitle(rs.getString(3));
				//i.setOfUser(rs.getString(4));
				i.setCurrency(rs.getString(4));

				i.setBuildingAddress(rs.getString(5));
				i.setRequisitionDate(rs.getString(6));
				list.add(i);
			}
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

}
