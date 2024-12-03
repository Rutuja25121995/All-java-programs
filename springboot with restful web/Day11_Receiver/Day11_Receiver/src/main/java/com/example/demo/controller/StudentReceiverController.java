package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class StudentReceiverController {

	StudentReceiverController() {
		System.out.println("inside StudentReceiverController cons");
	}

	@Autowired
	RestTemplate restTemplate;

	@RequestMapping("/getData")
	public String getData() {
		return "test-endpoint";
	}

	@RequestMapping("/receiver/getName")
	public String getName() {
		System.out.println("inside received getName()");
		// call this URL
		// http://localhost:9096/getName
		// url , method , input parameter , response class
		ResponseEntity<String> response=restTemplate.exchange("http://localhost:9096/getName", 
				HttpMethod.GET, null, String.class);
		System.out.println("response from producer -->" +response);
		return response.getBody().toString();
	}
	
	@RequestMapping("/receiver/getName1")
	public String getName1() {
		System.out.println("inside received getName1()");
		// call this URL
		// http://localhost:9096/getName
		// url , method , input parameter , response class
		ResponseEntity<String> response=restTemplate.exchange("http://localhost:9096/getName1", 
				HttpMethod.POST, null, String.class);
		System.out.println("response from producer1 -->" +response);
		return response.getBody().toString();
	}
	
	
	
}
