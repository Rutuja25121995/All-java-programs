package com.tech.myprograms;

import java.util.Scanner;

public class Prime_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         System.out.println("enter a number");
         int number=sc.nextInt();
         int flag=0;
         
         for(int i=2;i<=number;i++) {
        	 flag=0;
        	 for(int j=2;j<i;j++) {
        		 if(i%j==0) {
        			 flag=1;
        			 break;
        		 }
        	 }
         }
         if(flag==0) {
        	 System.out.println("given number is prime number");
        	 
         }else {
        	 System.out.println("the given number is not prime number");
         }
	}

}
