package com.tech;

public class Pattern4 {

	public static void main(String[] args) {
		//    1
		//   2 2
		//  3 3 3
        // 4 4 4 4
		
		for(int i=1;i<=4;i++) {
			for(int j=i;j<4;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

}
