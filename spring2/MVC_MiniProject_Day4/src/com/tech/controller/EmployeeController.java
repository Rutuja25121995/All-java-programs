package com.tech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.tech.dto.Employee;
import com.tech.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;

	public EmployeeController() {
		System.out.println("inside EmployeeController cons");
	}

	@RequestMapping(value = "/createEmp", method = RequestMethod.POST)
	public ModelAndView createEmp(@RequestParam("fname") String fname, @RequestParam("lname") String lname,
			@RequestParam("email") String email, @RequestParam("phone") String phone) {
		System.out.println("inside EmployeeController.createEmp ");

		System.out.println(fname);
		System.out.println(lname);
		System.out.println(email);
		System.out.println(phone);

		Employee employee = new Employee();
		employee.setFname(fname);
		employee.setLname(lname);
		employee.setEmail(email);
		employee.setPhone(phone);

		boolean recordsinsrted = employeeService.createEmployee(employee);

		if (recordsinsrted) {
			System.out.println("EmployeeController:-records inserted successfully ");
			ModelAndView mav = new ModelAndView("create-emp-success");
			// mav.addObject(", attributeValue)
			return mav;
		} else {
			System.out.println("EmployeeController:-records inserted successfully ");
			ModelAndView mav = new ModelAndView("create-emp-failure");
			return mav;
		}
	}

	@RequestMapping("/getAllEmployee")
	public ModelAndView getAllEmployee() {
		System.out.println("inside EmployeeController.getAllEmployee ");

		List<Employee> emplist = employeeService.getAllEmployee();

		ModelAndView mav = new ModelAndView("get-all-employee");
		mav.addObject("EMP_LIST", emplist);
		return mav;
	}

	@RequestMapping("deleteemp")
	public ModelAndView deleteEmployee(@RequestParam("id") int id) {

		System.out.println("inside EmployeeController. deleteEmployee-->" + id);
		employeeService.deleteEmployee(id);

		ModelAndView mav = new ModelAndView("get-all-employee");
		List<Employee> emplist = employeeService.getAllEmployee();
		mav.addObject("EMP_LIST", emplist);

		return mav;
	}

	@RequestMapping("/editemp")
	public ModelAndView editEmployee(@RequestParam("id") int id) {

		System.out.println("inside EmployeeController. editEmployee-->" + id);

		Employee empfromDB = employeeService.editEmployee(id);
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
		e.setFname(fname);
		e.setLname(lname);
		e.setEmail(email);
		e.setPhone(phone);
		employeeService.updateEmployee(e);

		ModelAndView mav = new ModelAndView("get-all-employee");
		List<Employee> emplist = employeeService.getAllEmployee();
		mav.addObject("EMP_LIST", emplist);
		return mav;

	}

}
