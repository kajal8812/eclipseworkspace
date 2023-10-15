package com.modal;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

public class Requisition {

	private int id;

	@NotEmpty(message = "Please opt the businessunit")
	private String businessUnit;

	private String requisitionDate;

	@Size(min = 2, max = 10, message = "plz enter a minimumn length of 2 and upto 10")
	private String requisitionTitle;

	//private String ofUser;
	private String currency;

	@NotBlank(message = "Please atleast have one non whitespace character")
	private String buildingAddress;

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setBusinessUnit(String businessUnit) {
		this.businessUnit = businessUnit;
	}

	public void setRequisitionDate(String requisitionDate) {
		this.requisitionDate = requisitionDate;
	}

	public void setRequisitionTitle(String requisitionTitle) {
		this.requisitionTitle = requisitionTitle;
	}

	//	public void setOfUser(String ofUser) {
	//		this.ofUser = ofUser;
	//	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public void setBuildingAddress(String buildingAddress) {
		this.buildingAddress = buildingAddress;
	}

	public String getBusinessUnit() {
		return businessUnit;
	}

	public String getRequisitionDate() {
		return requisitionDate;
	}

	public String getRequisitionTitle() {
		return requisitionTitle;
	}

	//	public String getOfUser() {
	//		return ofUser;
	//	}

	public String getCurrency() {
		return currency;
	}

	//	@Override
	//	public String toString() {
	//		return "Requisition [id=" + id + ", businessUnit=" + businessUnit + ", requisitionDate=" + requisitionDate
	//				+ ", requisitionTitle=" + requisitionTitle + ", currency=" + currency + ", buildingAddress="
	//				+ buildingAddress + "]";
	//	}

	public String getBuildingAddress() {
		return buildingAddress;
	}

}
