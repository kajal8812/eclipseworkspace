package com.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Service;

import com.connection.Crud;
import com.modal.Requisition;

@Service
public class JdbcUserDao implements UserDao {

	@Override
	public Requisition getUserById(int id) {
		String sql = "SELECT id, businessunit,requisitiontitle,currency,buildingaddress,requisitiondate FROM requisition1 WHERE id = ?";
		try (Connection connection = Crud.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
			preparedStatement.setInt(1, id);

			try (ResultSet resultSet = preparedStatement.executeQuery()) {
				if (resultSet.next()) {
					Requisition user = new Requisition();
					user.setId(resultSet.getInt("id"));
					user.setBusinessUnit(resultSet.getString("businessunit"));
					user.setRequisitionTitle(resultSet.getString("requisitiontitle"));
					//user.setOfUser(resultSet.getString("ofuser"));
					user.setCurrency(resultSet.getString("currency"));
					user.setBuildingAddress(resultSet.getString("buildingaddress"));
					user.setRequisitionDate(resultSet.getString("requisitiondate"));
					//user.setBusinessUnit(resultSet.getString("businessunit"));

					return user;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace(); // Handle exception properly in a real application
		}
		return null; // User not found
	}
}
