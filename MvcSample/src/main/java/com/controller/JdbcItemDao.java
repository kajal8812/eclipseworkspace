package com.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.connection.Crud;
import com.modal.ItemDetails;

@Service
public class JdbcItemDao implements ItemDao {

	@Override
	public List<ItemDetails> getItemsByUserId(int requisitionId) {
		String sql = "SELECT id, Type,Category,SubCategory,ItemName,Quantity,EstimatedPrice FROM item1 WHERE requisitionid = ?";
		List<ItemDetails> items = new ArrayList<>();

		try (Connection connection = Crud.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
			preparedStatement.setInt(1, requisitionId);

			try (ResultSet resultSet = preparedStatement.executeQuery()) {
				while (resultSet.next()) {
					ItemDetails item = new ItemDetails();
					item.setId(resultSet.getInt("id"));
					item.setType(resultSet.getString("Type"));
					item.setCategory(resultSet.getString("Category")); // Set the user ID
					item.setSubCategory(resultSet.getString("SubCategory"));
					item.setItemName(resultSet.getString("ItemName"));
					item.setQuantity(resultSet.getString("Quantity"));
					item.setEstimatedPrice(resultSet.getString("EstimatedPrice"));
					item.setRequisitionId(requisitionId);

					items.add(item);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace(); // Handle exception properly in a real application
		}

		return items;
	}
}
