package com.org.app.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.org.app.entity.Customer;
import com.org.app.impl.CreateCustomerImpl;
import com.org.app.utils.ResponseHandler;

@RestController
@Component
public class CoreController {
	
	@Autowired
	private CreateCustomerImpl ordersImpl;
	
	@RequestMapping(path = "/", method = RequestMethod.GET)
	public ResponseEntity<Object> sayHello() {
		Map<String, String> mp = new HashMap<>();
		mp.put("status", "Health Check OK");
		return ResponseHandler.prepareResponse(mp, "OK", HttpStatus.OK);
	}
	
	@RequestMapping(path = "/create/user/v1", method = RequestMethod.POST)
	public ResponseEntity<Object> createCustomer2(@RequestBody(required = true) Customer c) {
		Long id = ordersImpl.createCustomer(c);
		Map<String, Long> mp = new HashMap<>();
		mp.put("customerId", id);
		return ResponseHandler.prepareResponse(mp, "OK", HttpStatus.OK);
	}
	
	
}
