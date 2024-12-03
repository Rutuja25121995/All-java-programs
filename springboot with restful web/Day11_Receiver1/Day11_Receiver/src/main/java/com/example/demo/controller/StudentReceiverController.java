package com.example.demo.controller;

import java.net.ConnectException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

@RestController
public class StudentReceiverController {
	@Value("${base_url}")
	 String base_url;
	
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
		
		String finalurl =base_url+"/getName";
		System.out.println("final url is -->" +finalurl);
		ResponseEntity<String> response = restTemplate.exchange(finalurl, HttpMethod.GET, null,
				String.class);
		System.out.println("response from producer -->" + response);
		return response.getBody().toString();
	}

	@RequestMapping("/receiver/getName1")
	public String getName1() {
		System.out.println("inside received getName1()");
		// call this URL
		// http://localhost:9096/getName
		// url , method , input parameter , response class
		ResponseEntity<String> response = restTemplate.exchange("http://localhost:9096/getName1", HttpMethod.POST, null,
				String.class);
		System.out.println("response from producer1 -->" + response);
		return response.getBody().toString();
	}

	@GetMapping("/receiver/getAllStudent")
	public StudentReceiverResponse getAllStudents() {
		System.out.println("inside received getAllStudents()");

		try {
			ResponseEntity<List<Student>> response = restTemplate.exchange("http://localhost:9096/getAllStudent",
					HttpMethod.GET, null, new ParameterizedTypeReference<List<Student>>() {
					});
			System.out.println("response from producer1 statuscode-->" + response.getStatusCodeValue());
			System.out.println("response from producer1 getBody-->" + response.getBody());

			StudentReceiverResponse studentReceiverResponse = new StudentReceiverResponse();
			studentReceiverResponse.setStatuscode(response.getStatusCodeValue());
			studentReceiverResponse.setStatusMessage("OK");
			studentReceiverResponse.setStdlist(response.getBody());

			return studentReceiverResponse;
		} catch (HttpClientErrorException ex) {
			System.out.println("inside HttpClientErrorException block -->" + ex.getMessage());
			System.out.println("status code -->" + ex.getStatusCode());
			System.out.println("status msg--->" + ex.getStatusText());
			StudentReceiverResponse studentReceiverResponse = new StudentReceiverResponse();
			studentReceiverResponse.setStatuscode(ex.getStatusCode().value());
			studentReceiverResponse.setStatusMessage("NOK");
			studentReceiverResponse.setStdlist(null);
			return studentReceiverResponse;
		} catch (Exception e) {
			System.out.println("inside exception block -->" + e.getMessage());
			StudentReceiverResponse studentReceiverResponse = new StudentReceiverResponse();
			studentReceiverResponse.setStatuscode(500);
			studentReceiverResponse.setStatusMessage("NOK");
			studentReceiverResponse.setStdlist(null);
			return studentReceiverResponse;
		}

	}

}
