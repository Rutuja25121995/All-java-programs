package com.example.demo.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class RecordsNotFoundException {

	@ExceptionHandler(value = RuntimeException.class)
	public StudetNotFound exception(StudetNotFound exception) {
		System.out.println("inside exception class");
		return new StudetNotFound();
	}
}
