package com.tech.dao;

import org.springframework.stereotype.Repository;

@Repository
public class StudentDao {
	public StudentDao() {
		System.out.println("inside StudentDao cobstrutors ");
	}

	public void updateStudent() {
		System.out.println("inside StudentDao.updateStudent()");
	}
}
