package com.tech;

import java.util.Scanner;

public class Print_Prime_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a number");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		int flag =0;
		for (int i = 2; i <= number; i++) {
			flag=0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					flag=1;
					break;
				}
				
			}
			if(flag==0) {
				System.out.println(i +" ");
			}
		}
	}

}
