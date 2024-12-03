package com.tech;

public class Student implements Registration{
	private String name;
	private String college;

	
	@Override
	public String getStudentDetails(String name) {
		this.name=name;
		return this.name;
		}
	

}
