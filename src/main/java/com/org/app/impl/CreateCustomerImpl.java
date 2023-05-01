package com.org.app.impl;

import java.time.LocalDateTime;

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
	public Long createCustomer(Customer c) {
		
		c.setCreateDate(LocalDateTime.now());
		c.getAddress().setCreateDate(LocalDateTime.now());
		Customer result = this.customerDao.save(c);
		if (result == null) {
			return null;
		}
		return result.getCustomerid();
	}

}
