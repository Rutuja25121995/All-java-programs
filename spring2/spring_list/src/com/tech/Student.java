package com.tech;

import java.util.List;

public class Student {

	private String name;

	private List<String> phone_no;

	public Student() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getPhone_no() {
		return phone_no;
	}

	public void setPhone_no(List<String> phone_no) {
		this.phone_no = phone_no;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", phone_no=" + phone_no + "]";
	}

}
