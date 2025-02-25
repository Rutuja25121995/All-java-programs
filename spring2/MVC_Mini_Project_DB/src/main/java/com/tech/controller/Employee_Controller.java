package com.tech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.tech.dto.Employee;
import com.tech.service.Employee_Service;

@Controller
public class Employee_Controller {

	public Employee_Controller() {
		System.out.println("inside Employee_Controller constructor");
	}

	@Autowired
	Employee_Service employee_service;

	@RequestMapping("/createemp")
	public ModelAndView createEmployee(@RequestParam("fname") String firstname, @RequestParam("lname") String lastname,
			@RequestParam("email") String email, @RequestParam("phone") String phone) {
		Employee emp = new Employee();
		emp.setFirstname(firstname);
		emp.setLastname(lastname);
		emp.setEmail(email);
		emp.setPhone(phone);
		boolean record = employee_service.createEmployee(emp);
		if (record) {
			ModelAndView mav = new ModelAndView("create_success");
			return mav;
		} else {
			ModelAndView mav = new ModelAndView("create_failure");
			return mav;
		}

	}
	@RequestMapping("/getAllEmployee")
	public ModelAndView getAllEmployee() {
		System.out.println("inside EmployeeController.getAllEmployee ");

		List<Employee> emplist = employee_service.getAllEmployee();

		ModelAndView mav = new ModelAndView("get-all-employee");
		mav.addObject("EMP_LIST", emplist);
		return mav;
	}
	@RequestMapping("deleteemp")
	public ModelAndView deleteEmployee(@RequestParam("id") int id) {

		System.out.println("inside EmployeeController. deleteEmployee-->" + id);
		employee_service.deleteEmployee(id);

		ModelAndView mav = new ModelAndView("get-all-employee");
		List<Employee> emplist = employee_service.getAllEmployee();
		mav.addObject("EMP_LIST", emplist);

		return mav;
	}
	@RequestMapping("/editemp")
	public ModelAndView editEmployee(@RequestParam("id") int id) {

		System.out.println("inside EmployeeController. editEmployee-->" + id);

		Employee empfromDB = employee_service.editEmployee(id);
		ModelAndView mav = new ModelAndView("edit-emp");
		mav.addObject("Existing_EMP_Data", empfromDB);
		return mav;

	}

	@RequestMapping(value = "/updateemp", method = RequestMethod.POST)
	public ModelAndView updateEmployee(@RequestParam("id1") int id, @RequestParam("fname1") String fname,
			@RequestParam("lname1") String lname, @RequestParam("email1") String email,
			@RequestParam("phone1") String phone) {
		System.out.println("inside EmployeeController.updateEmployee ");
		System.out.println(id);
		System.out.println(fname);
		System.out.println(lname);
		System.out.println(email);
		System.out.println(phone);

		Employee e = new Employee();
		e.setId(id);
		e.setFirstname(fname);
		e.setLastname(lname);
		e.setEmail(email);
		e.setPhone(phone);
		employee_service.updateEmployee(e);

		ModelAndView mav = new ModelAndView("get-all-employee");
		List<Employee> emplist = employee_service.getAllEmployee();
		mav.addObject("EMP_LIST", emplist);
		return mav;

	}

}
