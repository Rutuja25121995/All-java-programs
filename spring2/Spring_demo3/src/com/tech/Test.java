package com.tech;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
		
		Employee emp=(Employee) ctx.getBean("e");
		System.out.println(emp.getId());
		System.out.println(emp.getName());
		System.out.println(emp.getAddress());
		System.out.println("-----------------------------");
		
		System.out.println(emp.getId());
		System.out.println(emp.getName());
		System.out.println(emp.getAddress().getCity());
		System.out.println(emp.getAddress().getPincode());

	}

}
