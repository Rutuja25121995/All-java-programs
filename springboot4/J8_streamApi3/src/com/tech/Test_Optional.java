package com.tech;

import java.util.Optional;

public class Test_Optional {

	public static void main(String[] args) {
		Student s1 = new Student(1, "rutuja", "rutuja@gmail.com");
		//Student s1  = null; 
		Optional<Student> value=Optional.ofNullable(s1);
		
		//System.out.println(value.filter(s->s.getId()==11).orElse(new Student()));
		
		System.out.println(value.filter(s->s.getId()==11).orElseThrow(()->new ArithmeticException("records not found.... ")));
		

	}

}
