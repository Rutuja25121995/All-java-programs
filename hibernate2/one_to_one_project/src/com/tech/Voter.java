package com.tech;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
@Entity
@Table(name = "VOTER")
public class Voter {
	@Id
	@GeneratedValue
	@Column
	@PrimaryKeyJoinColumn
	private int id;
	@Column
	private String name;
	@Column
	private int age;
	
	@OneToOne(targetEntity = Vote.class)
	private Vote vote;

	public Voter() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Voter(int id, String name, int age, Vote vote) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.vote = vote;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Vote getVote() {
		return vote;
	}

	public void setVote(Vote vote) {
		this.vote = vote;
	}

	@Override
	public String toString() {
		return "Voter [id=" + id + ", name=" + name + ", age=" + age + ", vote=" + vote + "]";
	}

}
