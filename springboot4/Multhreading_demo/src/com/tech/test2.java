package com.tech;

public class test2 {

	public static void main(String[] args) {
		Student s1=new Student();
		Thread t1=new Thread(s1);
		t1.start();
		t1.start();

	}

}
