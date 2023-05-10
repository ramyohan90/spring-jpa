package com.org.app.impl;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.app.dao.CustomerDao;
import com.org.app.entity.Customer;
import com.org.app.service.CreateCustomerService;

@Service
public class CreateCustomerImpl implements CreateCustomerService{
	
	@Autowired
	private CustomerDao customerDao;

	@Override
	public Customer createCustomer(Customer c) {
		
		c.setCreateDate(LocalDateTime.now());
		if (c.getAddress() != null) {
			c.getAddress().setCreateDate(LocalDateTime.now());	
		}
		return this.customerDao.save(c);
	}

	@Override
	public Optional<List<Customer>> getCustomers() {
		// TODO Auto-generated method stub
		return Optional.ofNullable(this.customerDao.findAll());
	}

}
