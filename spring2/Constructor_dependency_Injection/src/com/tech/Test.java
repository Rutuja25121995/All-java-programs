package com.tech;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		Student s1 = (Student) ctx.getBean("s");
		System.out.println(s1);

		System.out.println("--------------------------");

		Student s2 = (Student) ctx.getBean("s11");
		System.out.println(s2);

		System.out.println("--------------------------");

		Student s3 = (Student) ctx.getBean("s22");
		System.out.println(s3);
	}
}
