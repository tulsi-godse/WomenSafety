package com.WomenSafety.WomenSafetyApplication.ServiceImplimentation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.WomenSafety.WomenSafetyApplication.Entity.Customer;
import com.WomenSafety.WomenSafetyApplication.Repository.CustomerRepo;
import com.WomenSafety.WomenSafetyApplication.Service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	CustomerRepo customerRepo;

	@Override
	public Customer createCustomer(Customer customer) {
		Customer cus = customerRepo.save(customer);
		return cus;
	}

	@Override
	public Customer getCustomerById(int id) {
		Optional<Customer> cus = customerRepo.findById(id);
		
		if (cus.isPresent()) {
			return cus.get();
			}
		return null;
	}

	@Override
	public void deleteCustomer(int id) {
		customerRepo.deleteById(id);	
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		Customer existingCustomer = customerRepo.findById(customer.getCid()).get();
		existingCustomer.setName(customer.getName());
		existingCustomer.setNumber(customer.getNumber());
		existingCustomer.setEmail(customer.getEmail());
		existingCustomer.setAddress(customer.getAddress());
		
		Customer updateCustomer = customerRepo.save(existingCustomer);
		return updateCustomer;
	}

	@Override
	public List<Customer> getAllCustomer() {
		
		return customerRepo.findAll();	
	}	
}
