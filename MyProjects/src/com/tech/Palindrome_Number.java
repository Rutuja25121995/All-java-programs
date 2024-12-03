package com.tech;

public class Palindrome_Number {

	public static void main(String[] args) {
		int number = 12321;
		int remainder = 0;
		int result = 0;
		while (number > 0) {
			remainder = number % 10;
			result = result * 10 + remainder;
			number = number / 10;

		}
		number = 12321;
		if (result == number) {
			System.out.println("the given number is palindrome number");
		} else {
			System.out.println("not palindrome");
		}
	}
}
