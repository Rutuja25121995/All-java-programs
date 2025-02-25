package com.tech.dao;



import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tech.dto.Employee;

@Repository
public class Employee_Dao {

	public Employee_Dao() {
		System.out.println("inside Employee_Dao constructor");
	}

	@Autowired
	SessionFactory sessionFactory;
	public boolean createEmployee(Employee employee) {
		System.out.println("inside Employee_Dao.createEmployee()");
		Session session=sessionFactory.openSession();
		Transaction txn=session.beginTransaction();
		int employeeRecord=(int) session.save(employee);
		System.out.println("employee record from Employee_Dao.createEmployee "+employeeRecord);
		txn.commit();
		if(employeeRecord>0) {
			System.out.println("record inserted successfully");
		return true;
		}else {
			System.out.println("record not inserted successfully");
			return false;
		}
	}
	public List<Employee> getAllEmployee() {
		System.out.println("inside EmployeeDao.getAllEmployee -->");
		Session session=sessionFactory.openSession();
		
		Criteria cr=session.createCriteria(Employee.class);
		List<Employee> emplist=cr.list();
		System.out.println("emplist from DB -->" + emplist);
		
		return emplist;
	}
	public void deleteEmployee(int id )
	{
		System.out.println("inside EmployeeDao.deleteEmployee -->");
		Session session=sessionFactory.openSession();
		
		Employee employee= new Employee();
		employee.setId(id);
		session.delete(employee);
		session.beginTransaction().commit();
	}
	public Employee editEmployee(int id)
	{
		System.out.println("inside EmployeeDao.editEmployee -->");
		Session session=sessionFactory.openSession();
		
		Employee employee=session.get(Employee.class, id);
		
		System.out.println("employee in db for given id " + employee);
		
		return employee;
	}
	
	public void updateEmployee(Employee e)
	{
		System.out.println("inside EmployeeDao.editEmployee -->");
		Session session=sessionFactory.openSession();
		
		session.saveOrUpdate(e);
		
		session.beginTransaction().commit();
	}
	
}
