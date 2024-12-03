package com.tech.myprograms;

public class RightTriangleStarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         for(int i=4;i>=1;i--) {
        	 for(int j=1;j<i;j++) {
        		 System.out.print(" ");
        	 }
        	 for(int k=4;k>=i;k--) {
        	 System.out.print("*");
        	 }
        	 System.out.println();
         }
	}

}
