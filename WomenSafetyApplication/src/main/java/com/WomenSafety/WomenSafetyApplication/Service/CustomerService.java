package com.WomenSafety.WomenSafetyApplication.Service;

import java.util.List;

import com.WomenSafety.WomenSafetyApplication.Entity.Customer;

public interface CustomerService {
	
	Customer createCustomer(Customer customer);
	Customer getCustomerById(int id);
	void deleteCustomer(int id);
	Customer updateCustomer(Customer customer);
	List<Customer> getAllCustomer();

}
