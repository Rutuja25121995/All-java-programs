package com.tech;

public class test1 {

	public static void main(String[] args) {
		Student s1 = new Student();
		Thread t1 = new Thread(s1);
		t1.setName("thread_1");
		t1.start();
		
		Student s2 = new Student();
		Thread t2 = new Thread(s2);
		t1.setName("thread_2");
		t2.start();
	}

}
