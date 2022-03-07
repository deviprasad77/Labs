package com.abc.loan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abc.loan.entity.Address;
import com.abc.loan.entity.Customer;
import com.abc.loan.entity.IncomeAndProperty;
import com.abc.loan.entity.MortgageLoan;
import com.abc.loan.entity.PropertyDocument;
import com.abc.loan.entity.TypesOfMortgageLoans;
import com.abc.loan.service.CustomerService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@ApiOperation(value = "Save Customer Details", response = Customer.class, tags = "Enter Customer Details")
	@PostMapping("/CustomerDetails")
	public ResponseEntity<Customer> customerDetails(@RequestBody Customer customer) {

		Customer newCustomer = customerService.saveCustomer(customer);
		ResponseEntity<Customer> responseEntity = new ResponseEntity<>(newCustomer, HttpStatus.CREATED);
		return responseEntity;
	}

/////////////////******** save details ****************/////////////////
	
	@ApiOperation(value = "Save Address Customer Details", response = Address.class, tags = "Enter AdressDetails")
	@PostMapping("/LocationDetails")
	public ResponseEntity<Address> addressDetails(@RequestBody Address address) {

		Address customerAddress = customerService.saveCustomerAdress(address);
		ResponseEntity<Address> responseEntity = new ResponseEntity<>(customerAddress, HttpStatus.CREATED);
		return responseEntity;
	}
	@ApiOperation(value = "Mortgage Loan Details", response = MortgageLoan.class, tags = "MortgageLoan")
	@PostMapping("/MortgageLoan")
	public ResponseEntity<MortgageLoan> mortgageLoan(@RequestBody MortgageLoan mortgageLoan) {

		MortgageLoan newMortgageLoan =customerService.saveMortgageLoan(mortgageLoan);
		ResponseEntity<MortgageLoan> responseEntity = new ResponseEntity<>(newMortgageLoan, HttpStatus.CREATED);
		return responseEntity;
	}
	
	/*
	 * @PostMapping("/MortgageLoanTypes") public
	 * ResponseEntity<TypesOfMortgageLoans> mortgageLoanTypes(@RequestBody
	 * TypesOfMortgageLoans typesOfMortgageLoans) {
	 * 
	 * TypesOfMortgageLoans newMortgageLoanType
	 * =customerService.savetypesOfMortgageLoans(typesOfMortgageLoans);
	 * ResponseEntity<TypesOfMortgageLoans> responseEntity = new
	 * ResponseEntity<>(newMortgageLoanType, HttpStatus.CREATED); return
	 * responseEntity; }
	 */
	@ApiOperation(value = "See TypesOfMortgageLoans Details", response = TypesOfMortgageLoans.class, tags = "view TypesOfMortgageLoans")
	@GetMapping("/all")
	public List<TypesOfMortgageLoans> fetchAll(TypesOfMortgageLoans typesOfMortgageLoans) {
		List<TypesOfMortgageLoans> TypesOfMortgageLoans = customerService.getAllTypesOfLoans();
		return TypesOfMortgageLoans;
	}
	
	@ApiOperation(value = "Enter IncomeAndProperty Details", response = IncomeAndProperty.class, tags = "Enter IncomeAndProperty Details")
	@PostMapping("/Income")
	public ResponseEntity<IncomeAndProperty> income(@RequestBody IncomeAndProperty incomeAndProperty) {
		
		IncomeAndProperty newIncomeAndProperty= customerService.saveIncomeAndProperty(incomeAndProperty);
		ResponseEntity<IncomeAndProperty> responseEntity = new ResponseEntity<>(newIncomeAndProperty, HttpStatus.CREATED);
		
		return responseEntity;
		
	}
	@ApiOperation(value = "Enter PropertyDocument Details", response = PropertyDocument.class, tags = "Enter PropertyDocument Details")
	@PostMapping("/Property")
	public ResponseEntity<PropertyDocument> property(@RequestBody PropertyDocument propertyDocument) {
		PropertyDocument newPropertyDocument=customerService.savePropertyDocument(propertyDocument);
ResponseEntity<PropertyDocument> responseEntity = new ResponseEntity<>(newPropertyDocument, HttpStatus.CREATED);
		
		return responseEntity;
	}
	
/////////////////******** Get details by id ****************/////////////////
	@ApiOperation(value = "customer Details by id", response = Customer.class, tags = "Get Customer Details By id")
	@GetMapping("/get/{cid}")
	public ResponseEntity<?> fetchCustomerDetails(@PathVariable("cid") int customer_id) {
		Customer customer = customerService.getCustomerById(customer_id);
		return new ResponseEntity<>(customer, HttpStatus.OK);
	}
	
	@ApiOperation(value = " address Details by id", response = PropertyDocument.class, tags = "Get Address Details By id")
	@GetMapping("/getAddress/{cid}")
	public ResponseEntity<?> fetchAddressDetails(@PathVariable("cid") int customer_id) {
		Address address = customerService.getCustomerAddressById(customer_id);
		return new ResponseEntity<>(address, HttpStatus.OK);
	}
	
	@ApiOperation(value = " income Details by id", response = PropertyDocument.class, tags = "Get IncomeAndProperty Details By id")
	@GetMapping("/getIncome/{cid}")
	public ResponseEntity<?> fetchIncomeAndPropertyDetails(@PathVariable("cid") int customer_id) {
		IncomeAndProperty property = customerService.getIncomeAndPropertyById(customer_id);
		return new ResponseEntity<>(property, HttpStatus.OK);
	}
	
	@ApiOperation(value = "MortgageLoan Details by id", response = PropertyDocument.class, tags = "Get MortgageLoan Details By id")
	@GetMapping("/getMortgageLoan/{cid}")
	public ResponseEntity<?> fetchMortgageLoanDetails(@PathVariable("cid") int customer_id) {
		MortgageLoan loan = customerService.getMortgageLoanById(customer_id);
		return new ResponseEntity<>(loan, HttpStatus.OK);
	}
	 
	@ApiOperation(value = " propertydocumnet Details by id", response = PropertyDocument.class, tags = "Get PropertyDocument Details By id")
	@GetMapping("/getProperty/{cid}")
	public ResponseEntity<?> fetchPropertyDocumentDetails(@PathVariable("cid") int customer_id) {
		PropertyDocument property = customerService.getPropertyDocumentById(customer_id);
		return new ResponseEntity<>(property, HttpStatus.OK);
	}
	
	/////////////////******** update details ****************/////////////////
	
	@ApiOperation(value = "update customer Details", response = Customer.class, tags = "Update Customer Details")
	@PutMapping("/update")
	public ResponseEntity<Customer> modifyCustomer(@RequestBody Customer customer) {

		Customer updatedCustomer = customerService.updateCustomer(customer);
		return new ResponseEntity<>(updatedCustomer, HttpStatus.OK);
	}
	
	@ApiOperation(value = "update address Details", response = Address.class, tags = "Update Address Details")
	@PutMapping("/updateAdress")
	public ResponseEntity<Address> modifyAddress(@RequestBody Address address) {

		Address updatedAddress = customerService.updateCustomerAddress(address);
		return new ResponseEntity<>(updatedAddress, HttpStatus.OK);
	}
	
	@ApiOperation(value = "update income Details", response = IncomeAndProperty.class, tags = "Update IncomeAndProperty Details")
	@PutMapping("/updateIncomeProperty")
	public ResponseEntity<IncomeAndProperty> modifyIncomeAndProperty(@RequestBody IncomeAndProperty incomeAndProperty) {

		IncomeAndProperty updatedincomeAndProperty = customerService.updateIncomeAndProperty(incomeAndProperty);
		return new ResponseEntity<>(updatedincomeAndProperty, HttpStatus.OK);
	}
	
	
	@ApiOperation(value = "update MortgageLoan Details", response = MortgageLoan.class, tags = "Update MortgageLoan Details")
	@PutMapping("/updateMortgageLoan")
	public ResponseEntity<MortgageLoan> modifyMortgageLoan(@RequestBody MortgageLoan mortgageLoan) {

		MortgageLoan updatedMortgageLoan = customerService.updateMortgageLoan(mortgageLoan);
		return new ResponseEntity<>(updatedMortgageLoan, HttpStatus.OK);
	}
	
	@ApiOperation(value = "update propertydocumnet Details", response = PropertyDocument.class, tags = "Update PropertyDocument Details")
	@PutMapping("/updatePropertyDocument")
	public ResponseEntity<PropertyDocument> modifyPropertyDocument(@RequestBody PropertyDocument propertyDocument) {

		PropertyDocument updatedPropertyDocument = customerService.updatePropertyDocument(propertyDocument);
		return new ResponseEntity<>(updatedPropertyDocument, HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{cid}")
	public ResponseEntity<?> deleteCustomer(@PathVariable("cid") int customerId) {

		customerService.deleteCustomer(customerId);
		return new ResponseEntity<>("Customer Deleted with id:" + customerId, HttpStatus.OK);
	}
}

