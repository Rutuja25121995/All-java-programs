package com.tech.array;

import java.util.Arrays;

public class second_largest_no {

	public static void main(String[] args) {
		int[] arr= {10,20,10,30,20};
		Arrays.sort(arr);
		
		System.out.println(arr[arr.length-3]);

	}

}
