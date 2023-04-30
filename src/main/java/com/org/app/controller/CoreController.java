package com.org.app.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.org.app.entity.Customer;
import com.org.app.impl.CreateCustomerImpl;

@RestController
@Component
public class CoreController {
	
	@Autowired
	private CreateCustomerImpl ordersImpl;
	
	@RequestMapping(path = "/", method = RequestMethod.GET)
	public String sayHello() {
		return "Health Check OK!";
	}
	
	@RequestMapping(path = "/create/user/v1", method = RequestMethod.POST)
	public String createCustomer1(@RequestBody(required = true)Map<String, Customer> reqBody) {
		ordersImpl.createCustomer1(reqBody.get("data"));
		return "Hello";
	}
	
	@RequestMapping(path = "/create/user/v2", method = RequestMethod.POST)
	public String createCustomer2(@RequestBody(required = true) Customer c) {
		ordersImpl.createCustomer1(c);
		return "Hello 1";
	}
	
	
}
