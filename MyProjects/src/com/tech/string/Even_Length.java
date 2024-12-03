package com.tech.string;

public class Even_Length {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="rutuja";
		String []str1=str.split("");
		for(int i=0;i<=str.length()-1;i++) {
			if(i%2==0) {
				System.out.println(str1[i]+" ");
			}
		}

	}

}
