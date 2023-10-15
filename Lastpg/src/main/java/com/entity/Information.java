package com.entity;

public class Information {

	private int id;

	private String quantity;
	private String uom;
	private String estimatedPrice;
	private int deleted;

	public void setId(int id) {
		this.id = id;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public void setUom(String uom) {
		this.uom = uom;
	}

	public void setEstimatedPrice(String estimatedPrice) {
		this.estimatedPrice = estimatedPrice;
	}

	public void setDeleted(int deleted) {
		this.deleted = deleted;
	}

	public int getId() {
		return id;
	}

	public String getQuantity() {
		return quantity;
	}

	public String getUom() {
		return uom;
	}

	public String getEstimatedPrice() {
		return estimatedPrice;
	}

	public int getDeleted() {
		return deleted;
	}

}
