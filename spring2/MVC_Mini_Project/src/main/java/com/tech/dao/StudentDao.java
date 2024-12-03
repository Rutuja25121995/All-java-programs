package com.tech.dao;

import org.springframework.stereotype.Repository;

@Repository
public class StudentDao {

	public StudentDao() {
		System.out.println("inside StudentDao controller");
	}

	public void updateStudent() {
		System.out.println("inside  StudentDao.updateStudent()");
	}

	public void getAll() {
		System.out.println("inside  StudentDao.getAll()");
	}
}
