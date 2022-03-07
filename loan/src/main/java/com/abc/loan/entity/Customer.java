package com.abc.loan.entity;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer_tbl")
public class Customer {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int customer_id;
	private String firstName;
	private String middleName;
	private String lastName;
	
	
     private String email;
	
	private long phone_no;
	private String gender;
	private LocalDate dob;
	private long adhar_No;
	private String pan_No;
	

	
	
	public int getCustomerId() {
		return customer_id;
	}
	public void setCustomerId(int customer_id) {
		this.customer_id = customer_id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(long phone_no) {
		this.phone_no = phone_no;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public long getAdhar_No() {
		return adhar_No;
	}
	public void setAdhar_No(long adhar_No) {
		this.adhar_No = adhar_No;
	}
	public String getPan_No() {
		return pan_No;
	}
	public void setPan_No(String pan_No) {
		this.pan_No = pan_No;
	}
	
	
	

}
