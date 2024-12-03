package com.tech.string;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "nitin";
		String str1 = "";
		char[] ch = str.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--) {
			str1 = str1 + ch[i];
		}
		System.out.println(str1);
		if (str.equals(str1)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("not Palindrome");
		}
	}
}
