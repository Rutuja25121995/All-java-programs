package com.tech;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("----------employee info----------");
	
		Employee employee1=(Employee)ctx.getBean("emp1");
		System.out.println(employee1.getId());
		System.out.println(employee1.getName());
		System.out.println(employee1.getCompany());
		
		System.out.println("---------------------------------");
		
		Employee employee2=(Employee) ctx.getBean("emp2");
		System.out.println(employee2.getId());
		System.out.println(employee2.getName());
		System.out.println(employee2.getCompany());
		
		System.out.println("--------student info------------");
		
		Student student=(Student) ctx.getBean("s1");
		System.out.println(student.getId());
		System.out.println(student.getName());
		System.out.println(student.getEmail());
	}

}
