package com.org.app.service;

import java.util.List;
import java.util.Optional;

import com.org.app.entity.Customer;

public interface CreateCustomerService {
	
	Customer createCustomer(Customer c);
	
	Optional<List<Customer>> getCustomers();
}
