package com.tech;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test_spring {

	public static void main(String[] args) {

		ApplicationContext cxt = new ClassPathXmlApplicationContext("beans.xml");

		Student s1 = (Student) cxt.getBean("s11");
		System.out.println(s1.getFname());
		System.out.println(s1.getLname());
		System.out.println("---------------------");
		Student s2=(Student) cxt.getBean("s22");
		System.out.println(s2.getFname());
		System.out.println(s2.getLname());
		System.out.println("---------------------");
		
		Student s3=(Student) cxt.getBean("s33");
		System.out.println(s3.getFname());
		System.out.println(s3.getLname());
		System.out.println("---------------------");
		
	}

}
