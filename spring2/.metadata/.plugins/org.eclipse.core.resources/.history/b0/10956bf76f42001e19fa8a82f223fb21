package com.tech;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
		Registration reg=ctx.getBean("studentName",Registration.class);
		System.out.println(reg.getStudentDetails());

	}

}
