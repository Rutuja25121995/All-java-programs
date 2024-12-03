package com.tech;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		Student s1=(Student)ctx.getBean("s");
		System.out.println(s1.getName());
		System.out.println(s1.getAddress().getCity());
	}

}
