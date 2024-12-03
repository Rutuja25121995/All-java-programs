package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.StudentDao;
import com.example.demo.dto.Student;

@Service
public class StudentService {
	@Autowired
	StudentDao studentDao;

	public Student createStudent(Student student) {
		System.out.println("inside StudentService.StudentService-->" + student);
		Student std = studentDao.save(student);
		System.out.println("student saved in db ");

		return std;
	}

	public Iterable<Student> getAllStudent() {
		System.out.println("inside StudentService.getAllStudent-->");
		Iterable<Student> stdListFromDB = studentDao.findAll();
		System.out.println("Response from db is -> " + stdListFromDB);
		return stdListFromDB;
	}

	// public void deleteStudent(int id)
	// {
	// System.out.println("inside StudentService.deleteStudent-->" + id);
	// Student entity = new Student();
	// entity.setId(id);
	// studentDao.delete(entity);
	//
	// }

	public String deleteStudent1(int id) {
		System.out.println("inside StudentService.deleteStudent-->" + id);

		Student recordsFromDB = studentDao.findOne(id);
		System.out.println("records present in id-->" + recordsFromDB);
		if (recordsFromDB != null) {
			Student entity = new Student();
			entity.setId(id);
			studentDao.delete(entity);
			 return "Student deleted for id="+id ;
		} else {
            return "Student not deleted as id="+id +"is not present in DB";
		}

		
	}

	// read the id from ui
	// check id is present in db or not
	// if id is present then delete success
	// else failure

}
