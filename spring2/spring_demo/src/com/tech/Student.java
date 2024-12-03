package com.tech;

public class Student {
	private String fname;
	private String lname;

	public Student() {
		System.out.println("inside constructor");
	}

	public Student(String fname, String lname) {
		super();
		this.fname = fname;
		this.lname = lname;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		System.out.println("inside setFname");
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	

}
