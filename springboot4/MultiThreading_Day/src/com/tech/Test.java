package com.tech;

public class Test {

	public static void main(String[] args) {

		Student s = new Student();
		Thread t1 = new Thread(s);
		t1.setName("thread1");
		t1.start();
		//t1.run();
		
		Thread t2 = new Thread(s);
		t1.setName("thread2");
	 t2.start();
		//t2.run();
	}

}
