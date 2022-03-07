package com.abc.loan.service;

import java.util.List;

import com.abc.loan.entity.Address;
import com.abc.loan.entity.Customer;
import com.abc.loan.entity.IncomeAndProperty;
import com.abc.loan.entity.MortgageLoan;
import com.abc.loan.entity.PropertyDocument;
import com.abc.loan.entity.TypesOfMortgageLoans;



public interface CustomerService {
	

	public Customer saveCustomer(Customer customer);
	public Address saveCustomerAdress(Address address);
	public MortgageLoan saveMortgageLoan(MortgageLoan mortgageLoan);
	public TypesOfMortgageLoans savetypesOfMortgageLoans(TypesOfMortgageLoans typesOfMortgageLoans);
	public List<TypesOfMortgageLoans> getAllTypesOfLoans();
	public IncomeAndProperty saveIncomeAndProperty(IncomeAndProperty incomeAndProperty);
	public PropertyDocument savePropertyDocument(PropertyDocument propertyDocument);

	public Customer getCustomerById(int customer_id);
	public Address getCustomerAddressById(int customer_id);
	public MortgageLoan getMortgageLoanById(int customer_id);
	public IncomeAndProperty getIncomeAndPropertyById(int customer_id);
	public PropertyDocument getPropertyDocumentById(int customer_id);
	
	public Customer updateCustomer(Customer customer);
	public Address updateCustomerAddress(Address address);
	public MortgageLoan updateMortgageLoan(MortgageLoan mortgageLoan);
	public IncomeAndProperty updateIncomeAndProperty(IncomeAndProperty incomeAndProperty);
	public PropertyDocument updatePropertyDocument(PropertyDocument propertyDocument);
	
	public void deleteCustomer(int customer_id);

}
