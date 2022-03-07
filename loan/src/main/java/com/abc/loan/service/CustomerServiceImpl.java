package com.abc.loan.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.loan.entity.Address;
import com.abc.loan.entity.Customer;
import com.abc.loan.entity.IncomeAndProperty;
import com.abc.loan.entity.MortgageLoan;
import com.abc.loan.entity.PropertyDocument;
import com.abc.loan.entity.TypesOfMortgageLoans;
import com.abc.loan.exception.CustomerNotFoundException;
import com.abc.loan.repository.AddressRepository;
import com.abc.loan.repository.CustomerRepository;
import com.abc.loan.repository.IncomeAndPropertyRepository;
import com.abc.loan.repository.MortgageLoanRepository;
import com.abc.loan.repository.PropertyDocumentRepository;
import com.abc.loan.repository.TypesOfMortgageLoansRepository;

@Service
public class CustomerServiceImpl implements CustomerService{
	

	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private AddressRepository addressRepository;
	
	@Autowired
	private MortgageLoanRepository mortgageLoanRepository;
	
	@Autowired
	private TypesOfMortgageLoansRepository typesOfMortgageLoansRepository;
	
	@Autowired
	private IncomeAndPropertyRepository incomeAndPropertyRepository;
	
	@Autowired
	private PropertyDocumentRepository propertyDocumentRepository;
	

	@Override
	public Customer saveCustomer(Customer customer) {
		Customer savedCustomer = customerRepository.save(customer);
		return savedCustomer;
	}

	@Override
	public Address saveCustomerAdress(Address address) {
		Address savedCustomer = addressRepository.save(address);
		return savedCustomer;
	}

	@Override
	public MortgageLoan saveMortgageLoan(MortgageLoan mortgageLoan) {
		MortgageLoan saveMortgageLoan = mortgageLoanRepository.save(mortgageLoan);
		return saveMortgageLoan;
	}

	@Override
	public List<TypesOfMortgageLoans> getAllTypesOfLoans() {
		List<TypesOfMortgageLoans> typesOfMortgageLoans=typesOfMortgageLoansRepository.findAll();
		return typesOfMortgageLoans;
	}

	@Override
	public TypesOfMortgageLoans savetypesOfMortgageLoans(TypesOfMortgageLoans typesOfMortgageLoans) {
		TypesOfMortgageLoans typesOfMortgageLoan=typesOfMortgageLoansRepository.save(typesOfMortgageLoans);
		return typesOfMortgageLoan;
	}

	@Override
	public IncomeAndProperty saveIncomeAndProperty(IncomeAndProperty incomeAndProperty) {
		IncomeAndProperty saveIncomeAndProperty = incomeAndPropertyRepository.save(incomeAndProperty);
		return saveIncomeAndProperty;
	}

	@Override
	public PropertyDocument savePropertyDocument(PropertyDocument propertyDocument) {
		PropertyDocument savePropertyDocument = propertyDocumentRepository.save(propertyDocument);
		return savePropertyDocument;
	}
	
/////////////////******** Get details by id ****************/////////////////

	@Override
	public Customer getCustomerById(int customer_id) throws CustomerNotFoundException {
		Optional<Customer> optionalCustomer = customerRepository.findById(customer_id);
		if (optionalCustomer.isEmpty()) {
			throw new CustomerNotFoundException("Sorry! Customer not found with id" + customer_id);
		}
		return optionalCustomer.get();
	}

	@Override
	public Address getCustomerAddressById(int customer_id) throws CustomerNotFoundException{
		Optional<Address> optionalAddress = addressRepository.findById(customer_id);
		if(optionalAddress.isEmpty()) {
			throw new CustomerNotFoundException("Sorry! Customer Address not found with id" + customer_id);
			}
		return optionalAddress.get();
	}

	@Override
	public MortgageLoan getMortgageLoanById(int customer_id) throws CustomerNotFoundException {
		Optional<MortgageLoan> loan =mortgageLoanRepository.findById(customer_id);
		if(loan.isEmpty()) {
			throw new CustomerNotFoundException("Sorry! Customer not found with id" + customer_id);
		}
		return loan.get();
	}

	@Override
	public IncomeAndProperty getIncomeAndPropertyById(int customer_id) throws CustomerNotFoundException {
		Optional<IncomeAndProperty> income=incomeAndPropertyRepository.findById(customer_id);
		if(income.isEmpty()) {
			throw new CustomerNotFoundException("Sorry! Customer not found with id" + customer_id);
		}
		return income.get();
	}

	@Override
	public PropertyDocument getPropertyDocumentById(int customer_id) throws CustomerNotFoundException{
		Optional<PropertyDocument> property=propertyDocumentRepository.findById(customer_id);
		if(property.isEmpty()) {
			throw new CustomerNotFoundException("Sorry! Customer not found with id" + customer_id);
		}
		return property.get();
	}

	/////////////////******** update details ****************/////////////////
	
	@Override
	public Customer updateCustomer(Customer customer) throws CustomerNotFoundException {
		Optional<Customer> optionalCustomer = customerRepository.findById(customer.getCustomerId());

		if (optionalCustomer.isEmpty()) {

			throw new CustomerNotFoundException("Sorry! customer not found with id" + customer.getCustomerId());

		}

		Customer updatedCustomer = customerRepository.save(customer);
		return updatedCustomer;

	}

	@Override
	public Address updateCustomerAddress(Address address) throws CustomerNotFoundException{
		Optional<Address> optionalAddress = addressRepository.findById(address.getCustomerId());
		if(optionalAddress.isEmpty()) {
			throw new CustomerNotFoundException("Sorry! Customer Address not found with id" + address.getCustomerId());
			}
		Address updatedAddress = addressRepository.save(address);
		return updatedAddress;
	}

	@Override
	public MortgageLoan updateMortgageLoan(MortgageLoan mortgageLoan) throws CustomerNotFoundException {
		Optional<MortgageLoan> loan =mortgageLoanRepository.findById(mortgageLoan.getCustomer_id());
		if(loan.isEmpty()) {
			throw new CustomerNotFoundException("Sorry! Customer not found with id" + mortgageLoan.getCustomer_id());
		}
		MortgageLoan updatedMortgageLoan=mortgageLoanRepository.save(mortgageLoan);
		return updatedMortgageLoan;
	}

	@Override
	public IncomeAndProperty updateIncomeAndProperty(IncomeAndProperty incomeAndProperty) throws CustomerNotFoundException {
		Optional<IncomeAndProperty> income=incomeAndPropertyRepository.findById(incomeAndProperty.getCustomer_id());
		if(income.isEmpty()) {
			throw new CustomerNotFoundException("Sorry! Customer not found with id" + incomeAndProperty.getCustomer_id());
		}
		IncomeAndProperty updatedIncomeAndProperty=incomeAndPropertyRepository.save(incomeAndProperty);
		return updatedIncomeAndProperty;
	}
	@Override
	public PropertyDocument updatePropertyDocument(PropertyDocument propertyDocument) throws CustomerNotFoundException {
		Optional<PropertyDocument> property=propertyDocumentRepository.findById(propertyDocument.getCustomer_id());
		if(property.isEmpty()) {
			throw new CustomerNotFoundException("Sorry! Customer not found with id" + propertyDocument.getCustomer_id());
		}
		PropertyDocument updatedpropertyDocument=propertyDocumentRepository.save(propertyDocument);
		return updatedpropertyDocument;
	}

	@Override
	public void deleteCustomer(int customer_id) {
		Optional<Customer> optionalCustomer = customerRepository.findById(customer_id);

		if (optionalCustomer.isPresent()) {

			customerRepository.deleteById(customer_id);

		}

		else {
			throw new CustomerNotFoundException("sorry customer is not existing with id:" + customer_id);
		}
		

	}
	

     

}
