package com.tech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tech.dao.LoginDao;
import com.tech.dao.StudentDao;

@Service
public class StudentService {

	public StudentService() {
		System.out.println("inside StudentService controller ");
	}

	@Autowired
	LoginDao loginDao;

	@Autowired
	StudentDao studentDao;
	//StudentDao studentDao1;

	public void getALL() {
		System.out.println("inside StudentService.getALL() ");
		loginDao.getALl();
	}

	public void updateStudent() {
		System.out.println("inside StudentService.updateStudent() ");
		studentDao.updateStudent();
	}
}
