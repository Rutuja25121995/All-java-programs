package com.tech;

public class Student implements Runnable {

	@Override
	public void run() {
		System.out.println("inside run method");
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread() + "the value of i is -->" + i);
		}
		
	}

	
	

}
