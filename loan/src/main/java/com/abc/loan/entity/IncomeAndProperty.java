package com.abc.loan.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="income_and_property")
public class IncomeAndProperty {
	
	@Id
	private int customer_id;
	private String typeOfEmployment;
	private String organizationType;
	private long income;
	private int retirementAge;
	
	
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public String getTypeOfEmployment() {
		return typeOfEmployment;
	}
	public void setTypeOfEmployment(String typeOfEmployment) {
		this.typeOfEmployment = typeOfEmployment;
	}
	public String getOrganizationType() {
		return organizationType;
	}
	public void setOrganizationType(String organizationType) {
		this.organizationType = organizationType;
	}
	public long getIncome() {
		return income;
	}
	public void setIncome(long income) {
		this.income = income;
	}
	public int getRetirementAge() {
		return retirementAge;
	}
	public void setRetirementAge(int retirementAge) {
		this.retirementAge = retirementAge;
	}
	
	

}
