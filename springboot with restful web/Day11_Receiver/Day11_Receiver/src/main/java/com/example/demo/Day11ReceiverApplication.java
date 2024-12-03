package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Day11ReceiverApplication {

	public static void main(String[] args) {
		SpringApplication.run(Day11ReceiverApplication.class, args);
	}

	// this is used to create bean for RestTemplate
	@Bean
	public RestTemplate restTemplate() {
	    return new RestTemplate();
	}
}
