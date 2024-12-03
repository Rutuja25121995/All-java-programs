package com.tech.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tech.dto.Employee;

@Repository
public class EmployeeDao {
	
	@Autowired
	SessionFactory sessionFactory;
	
	public EmployeeDao() {
		System.out.println("inside LoginDao constructor");
	}
	
	
	public boolean createEmployee(Employee employee)
	{
		System.out.println("inside EmployeeDao.createEmployee -->" +employee);
		
		Session session=sessionFactory.openSession();
		int recordinserted=(int) session.save(employee);
		session.beginTransaction().commit();
		if(recordinserted>0)
		{
			System.out.println("records inserted successfully for id -->" +recordinserted);
			return true;
		}else
		{
			System.out.println("records inserted unsuccessfully for id -->" +recordinserted);
			return false;
		}
		
		
	}
	
	
	
	public List<Employee> getAllEmployee()
	{
		System.out.println("inside EmployeeDao.getAllEmployee -->");
		Session session=sessionFactory.openSession();
		//select * from Employee 
		
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
