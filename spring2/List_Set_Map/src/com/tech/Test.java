package com.tech;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
	
	Employee emp1=(Employee) ctx.getBean("e");
	System.out.println(emp1.getName());
	System.out.println(emp1.getCity());
	System.out.println(emp1.getEmail());
	System.out.println(emp1.getCourse());

	}

}
