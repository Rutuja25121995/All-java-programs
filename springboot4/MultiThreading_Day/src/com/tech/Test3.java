package com.tech;

public class Test3 {

	public static void main(String[] args) {

		Student s = new Student();
		Thread t1 = new Thread(s);
		t1.setName("thread1");
		t1.start();

		Thread t2 = new Thread(s);
		t1.setName("thread2");
		t2.start();

	}

}
