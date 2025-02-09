package com.tech;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="create_student")
public class create_student {
	@Id
	@GeneratedValue
	@Column
	private int id;
	@Column
	private String firstname;
	@Column
	private String lastname;
	@Column
	private String email;
	
	public create_student() {
		
	}
	public create_student(int id, String firstname, String lastname, String email) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "create_student [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email
				+ "]";
	}
	

}
