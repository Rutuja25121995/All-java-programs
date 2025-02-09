package com.tech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tech.dao.Employee_Dao;
import com.tech.dto.Employee;

@Service
public class Employee_Service {

	public Employee_Service() {
		System.out.println("inside Employee_Service constructor");
	}
	
	@Autowired
	Employee_Dao employee_dao;
	public boolean createEmployee(Employee employee) {
		System.out.println("inside Employee_Service.createEmployee()");
		boolean emprecord=employee_dao.createEmployee(employee);
		if(emprecord==true) {
		return true;
		}else {
			return false;
		}
	}
	public List<Employee> getAllEmployee()
	{
		System.out.println("inside EmployeeService.getAllEmployee()");
		List<Employee> emplist1=employee_dao.getAllEmployee();
		
		return emplist1;
	}

	public void deleteEmployee(int id)
	{
		System.out.println("inside EmployeeService.deleteEmployee()");
		employee_dao.deleteEmployee(id);
	}
	public Employee editEmployee(int id)
	{
		System.out.println("inside EmployeeService.editEmployee()");
	Employee emp=employee_dao.editEmployee(id);
	return emp;
	}
	
	public void updateEmployee(Employee e)
	{
		System.out.println("inside EmployeeService.updateEmployee()");
		employee_dao.updateEmployee(e);
	}
}
