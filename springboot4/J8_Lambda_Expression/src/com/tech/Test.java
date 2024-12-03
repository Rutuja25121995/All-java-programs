package com.tech;

public class Test {
	public static void main(String[] args) {

		Multiplication m1=new Multiplication1();
		m1.multi();
		
		System.out.println("-------------------");
		Multiplication m2=()->{
			System.out.println("inside Multiplication1 multi()")	;
		};
		m2.multi();
		
		System.out.println("-------------------");
		Substraction s1=(int a,int b)->{
			System.out.println("Substraction using two parameter-->"+(a-b));
		};
		s1.sub(20, 10);
		
		System.out.println("-------------------");
		Addition a1=(int a2,int b2,int c2)->{
			System.out.println("addition using three parameters-->"+(a2+b2+c2));
		};
		a1.addition(10, 20, 30);
		
}
}