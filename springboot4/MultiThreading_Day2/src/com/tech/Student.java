package com.tech;

public class Student extends Thread {

	@Override
	public void run() {
		System.out.println("inside Run method");

		for (int i = 0; i < 5; ++i) {
			System.out.println(Thread.currentThread() + "the value of i is -->" + i);
		}
	}
}
