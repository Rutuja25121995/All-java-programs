package com.tech;

public class string_rev {
public static void main(String[] args) {
	String str="I LOVE JAVA PROGRAM VERY MUCH";
	String[] str1 =str.split(" ");
	for(int i=str1.length-1;i>=0;i--) {
		System.out.print(str1[i]+" ");
	}
		
	}
}

