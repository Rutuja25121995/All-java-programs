package com.tech;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tech.service.StudentService;

@Controller
public class StudentController {

	public StudentController() {
		System.out.println("inside StudentController controller");
	}

	@Autowired
	StudentService studentService;

	@RequestMapping("/update")
	public String updateStduent() {
		studentService.updateStudent();
		return "student_update";

	}

	@RequestMapping("/getall")
	public String getAll() {
		studentService.getAll();
		return "student_getall";

	}

}
