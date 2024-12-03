package com.tech.myprograms;

import java.util.Scanner;

public class Fibonacci_Series {
	public void getFibonacci(int num1, int num2, int num3) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		System.out.print(num1 + " " + num2 + " ");
		for (int i = 0; i <= n; i++) {
			num3 = num1 + num2;
			System.out.print(num3 + " ");
			num1 = num2;
			num2 = num3;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 0,1,1,2,3,5,8....
		Fibonacci_Series fs = new Fibonacci_Series();
		int num1 = 0;
		int num2 = 1;
		int num3 = 0;
		fs.getFibonacci(num1, num2, num3);

	}

}
