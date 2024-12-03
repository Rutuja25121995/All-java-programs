package com.example.demo.exception;

public class StudetNotFound extends RuntimeException {
	
	public StudetNotFound() {
		super();
	}

	public StudetNotFound(String msg) {
		super(msg);
	}

}
