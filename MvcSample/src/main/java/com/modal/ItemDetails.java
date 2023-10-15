package com.modal;

public class ItemDetails {

	private int id;
	private String type;
	private String category;
	private String subCategory;
	private String itemName;
	private String quantity;
	private String estimatedPrice;

	//private String itemName;
	private int requisitionId;

	public void setId(int id) {
		this.id = id;
	}

	public void setRequisitionId(int requisitionId) {
		this.requisitionId = requisitionId;
	}

	public void setType(String type) {
		//System.out.print("control goes to type");
		this.type = type;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void setSubCategory(String subCategory) {
		this.subCategory = subCategory;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public void setEstimatedPrice(String estimatedPrice) {
		this.estimatedPrice = estimatedPrice;
	}

	public String getType() {
		return type;
	}

	public String getCategory() {
		return category;
	}

	public String getSubCategory() {
		return subCategory;
	}

	public String getItemName() {
		return itemName;
	}

	public String getQuantity() {
		return quantity;
	}

	public String getEstimatedPrice() {
		return estimatedPrice;
	}

	public int getId() {
		return id;
	}

	public int getRequisitionId() {
		return requisitionId;
	}

}
