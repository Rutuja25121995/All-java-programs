package com.tech;

public class Student {
	private String fname;
	private String lname;
	
	public Student() {
		System.out.println("inside zero parameter constructor");
	}

	public Student(String fname) {
		
		System.out.println("inside one parameter constructor");
	
		this.fname = fname;
	}

	public Student(String fname, String lname) {
		
		System.out.println("inside two parameters constructor");
		
		this.fname = fname;
		this.lname = lname;
	}

	@Override
	public String toString() {
		return "Student [fname=" + fname + ", lname=" + lname + "]";
	}
	

}
