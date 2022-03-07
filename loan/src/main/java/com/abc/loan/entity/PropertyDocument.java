package com.abc.loan.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="property_document")
public class PropertyDocument {
	
	@Id
	private int customer_id;
	private int docId;
	private String docName;
	private String propertyLoc;
	private long propertyValue;

	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public int getDocId() {
		return docId;
	}
	public void setDocId(int docId) {
		this.docId = docId;
	}
	public String getDocName() {
		return docName;
	}
	public void setDocName(String docName) {
		this.docName = docName;
	}
	public String getPropertyLoc() {
		return propertyLoc;
	}
	public void setPropertyLoc(String propertyLoc) {
		this.propertyLoc = propertyLoc;
	}
	public long getPropertyValue() {
		return propertyValue;
	}
	public void setPropertyValue(long propertyValue) {
		this.propertyValue = propertyValue;
	}
	
	

}
