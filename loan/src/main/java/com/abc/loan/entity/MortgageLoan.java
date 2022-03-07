package com.abc.loan.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mortgageLoan")
public class MortgageLoan {

	@Id
	private int customer_id;
	private String typeofMortgage;
	private int tenure;
	private long loanAmount;
	private String approvalStatus;
	

	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public String getTypeofMortgage() {
		return typeofMortgage;
	}
	public void setTypeofMortgage(String typeofMortgage) {
		this.typeofMortgage = typeofMortgage;
	}
	public int getTenure() {
		return tenure;
	}
	public void setTenure(int tenure) {
		this.tenure = tenure;
	}
	public long getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(long loanAmount) {
		this.loanAmount = loanAmount;
	}
	public String getApprovalStatus() {
		return approvalStatus;
	}
	public void setApprovalStatus(String approvalStatus) {
		this.approvalStatus = approvalStatus;
	}
	
	
	
	
}
