package com.tech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tech.dao.EmployeeDao;
import com.tech.dto.Employee;

@Service
public class EmployeeService {
	@Autowired
	EmployeeDao employeeDao;
	public EmployeeService() {
		System.out.println("inside LoginService constructor");
	}

	
	public boolean createEmployee(Employee employee)
	{
		System.out.println("inside EmployeeService.createEmployee()" +employee);
		boolean recordsInserted=employeeDao.createEmployee(employee );
		
		if(recordsInserted)
		{
			return true;
			
		}else
		{
			return false;			
		}
	}
	
	
	public List<Employee> getAllEmployee()
	{
		System.out.println("inside EmployeeService.getAllEmployee()");
		List<Employee> emplist1=employeeDao.getAllEmployee();
		
		return emplist1;
	}
	
	
	public void deleteEmployee(int id)
	{
		System.out.println("inside EmployeeService.deleteEmployee()");
		employeeDao.deleteEmployee(id);
	}
	
	
	public Employee editEmployee(int id)
	{
		System.out.println("inside EmployeeService.editEmployee()");
	Employee emp=employeeDao.editEmployee(id);
	return emp;
	}
	
	public void updateEmployee(Employee e)
	{
		System.out.println("inside EmployeeService.updateEmployee()");
		employeeDao.updateEmployee(e);
	}
}








