package com.controller;

import java.util.List;

import com.modal.ItemDetails;

public interface ItemDao {
	List<ItemDetails> getItemsByUserId(int requisitionId);
}
