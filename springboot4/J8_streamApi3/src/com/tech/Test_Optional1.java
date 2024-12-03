package com.tech;

import java.util.Optional;

public class Test_Optional1 {

	public static void main(String[] args) {
		//String s="rutuja";
		String s = null;
		Optional<String> value=Optional.ofNullable(s);
		if(value.isPresent())
		{
			System.out.println("inside if block");			
		}else
		{
			System.out.println("inside else block");
		}
	}

}
