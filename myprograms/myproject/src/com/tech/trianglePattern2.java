package com.tech;

public class trianglePattern2 {

	public static void main(String[] args) {
		
		for(int i=1;i<=4;i++) {
			
			for(int j=1;j<i;j++) {
				System.out.print(" ");
			}
			
			for(int k=i;k<=4;k++) {
				System.out.print("*");
			}
			
			
			System.out.println();
		}

	}

}
