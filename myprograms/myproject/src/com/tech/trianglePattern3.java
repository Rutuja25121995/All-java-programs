package com.tech;

public class trianglePattern3 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
			System.out.print("*");
		}
			System.out.println();

		}
		for(int l=1;l<=5;l++) {
			for(int k=4;k>=l;k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
