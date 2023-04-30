package com.org.app.utils;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ResponseHandler {
	
	public static ResponseEntity<Object> prepareResponse(Object obj, String msg, HttpStatus status) {
		Map<String, Object> map = new HashMap<>();
		map.put("data", obj);
		map.put("msg", msg);
		return new ResponseEntity<Object>(map, status);
	}

}
