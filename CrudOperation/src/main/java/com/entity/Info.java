package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bus")
public class Info {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String requestorName;
	private String businessUnit;
	private String poType;
	private String title;
	private String requisitionType;
	private String currency;
	private String ccp;
	private String costcenter;
	private String warehouseaddress;
	private String buildingaddress;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setRequestorName(String requestorName) {
		this.requestorName = requestorName;
	}

	public void setBusinessUnit(String businessUnit) {
		this.businessUnit = businessUnit;
	}

	public void setPoType(String poType) {
		this.poType = poType;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setRequisitionType(String requisitionType) {
		this.requisitionType = requisitionType;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public void setCcp(String ccp) {
		this.ccp = ccp;
	}

	public void setCostcenter(String costcenter) {
		this.costcenter = costcenter;
	}

	public void setWarehouseaddress(String warehouseaddress) {
		this.warehouseaddress = warehouseaddress;
	}

	public void setBuildingaddress(String buildingaddress) {
		this.buildingaddress = buildingaddress;
	}

	public String getRequestorName() {
		return requestorName;
	}

	public String getBusinessUnit() {
		return businessUnit;
	}

	public String getPoType() {
		return poType;
	}

	public String getTitle() {
		return title;
	}

	public String getRequisitionType() {
		return requisitionType;
	}

	public String getCurrency() {
		return currency;
	}

	public String getCcp() {
		return ccp;
	}

	public String getCostcenter() {
		return costcenter;
	}

	public String getWarehouseaddress() {
		return warehouseaddress;
	}

	public String getBuildingaddress() {
		return buildingaddress;
	}

}
