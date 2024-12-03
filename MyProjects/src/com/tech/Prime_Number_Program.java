package com.tech;

import java.util.Scanner;

public class Prime_Number_Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int number =sc.nextInt();
		int flag=0;
		for(int i=2;i<=number;i++) {
			if(number %i==0) {
				System.out.println("the number is not prime");
				flag=1;
				break;
			}
			
		}
		if(flag==0) {
			
				System.out.println("the number is prime");
						
		}

	}

}
