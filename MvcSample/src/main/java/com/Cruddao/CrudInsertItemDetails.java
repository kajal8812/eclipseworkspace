package com.Cruddao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.connection.Crud;
import com.modal.ItemDetails;

public class CrudInsertItemDetails {

	//CrudInsertItemDetails det = new CrudInsertItemDetails();

	public static int saveDetails(ItemDetails details) {
		String sql = "INSERT into item1(Type,Category,SubCategory,ItemName,Quantity,EstimatedPrice,RequisitionId) values(?,?,?,?,?,?,?)";
		int status = 0;
		Connection con = Crud.getConnection();
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, details.getType());
			ps.setString(2, details.getCategory());
			ps.setString(3, details.getSubCategory());
			ps.setString(4, details.getItemName());
			ps.setString(5, details.getQuantity());
			ps.setString(6, details.getEstimatedPrice());
			ps.setInt(7, details.getRequisitionId());
			//ps.setString(7, requisition.getRequisitionDate());
			status = ps.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e);
		}
		return status;
	}

}
