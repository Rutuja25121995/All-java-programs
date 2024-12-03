package com.tech;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
	private String name;
	private List<String> city;
	private Set<String> email;
	private Map<Integer, String> course;
	
	public Employee() {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getCity() {
		return city;
	}
	public void setCity(List<String> city) {
		this.city = city;
	}
	public Set<String> getEmail() {
		return email;
	}
	public void setEmail(Set<String> email) {
		this.email = email;
	}
	public Map<Integer, String> getCourse() {
		return course;
	}
	public void setCourse(Map<Integer, String> course) {
		this.course = course;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", city=" + city + ", email=" + email + ", course=" + course + "]";
	}

	
}
