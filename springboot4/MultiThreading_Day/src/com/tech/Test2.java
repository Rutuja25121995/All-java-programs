package com.tech;

public class Test2 {

	public static void main(String[] args) {

		Student s = new Student();
		Thread t1 = new Thread(s);
		t1.setName("thread1");
		t1.start();
		System.out.println("2nd start");
		//t1.start();
	
		
	}

}
