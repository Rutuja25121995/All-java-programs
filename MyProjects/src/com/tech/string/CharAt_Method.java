package com.tech.string;

public class CharAt_Method {

	public static void main(String[] args) {
		String str = "welcome to java";
		String str1 = new String("hello java");
		System.out.println(str.charAt(1));
		System.out.println("------------------------------------");
		System.out.println(str1.charAt(0));
		System.out.println("------------------------------------");

		// System.out.println(str.codePointAt(0));// it returns unicode value of
		// perticular character

		String str2 = "Rutuja";
		String str3 = "rutuja";

		System.out.println(str2.compareTo(str3));// it returns difference of unicode value
		System.out.println("------------------------------------");

		System.out.println(str2.compareToIgnoreCase(str3));
		System.out.println("------------------------------------");

		System.out.println(str.concat(str3));
		System.out.println("------------------------------------");

		System.out.println(str.contains("to"));
		System.out.println("------------------------------------");

		System.out.println(str2.contentEquals(str3));// All content must be same
		System.out.println("------------------------------------");

		char[] chr = { 'h', 'e', 'l', 'l', 'o' };
		String mystr = "";
		mystr = mystr.copyValueOf(chr, 2, 3);
		System.out.println(mystr);
		System.out.println("------------------------------------");

		System.out.println(str.endsWith("java"));
		System.out.println("------------------------------------");

		System.out.println(str2.equals(str3));
		System.out.println("------------------------------------");

		System.out.println(str2.equalsIgnoreCase(str3));
		System.out.println("------------------------------------");


		String str4 = "hello %s %,d kb equals to % d bytes";
		String str5 = String.format(str4, "world", 1, 1024);
		System.out.println(str5);
		System.out.println("------------------------------------");

		char[] chr1 = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

		System.out.println(chr1);
		System.out.println("------------------------------------");

		String str6 = "hello wordl welcome";
		str6.getChars(6, 12, chr1, 4);// it starts from 7
		System.out.println(chr1);
		System.out.println("------------------------------------");
        int index=str.indexOf("to");//it will show 1st letter index of mentioned word
        System.out.println(index);
        System.out.println("------------------------------------");
        String str8="";
        
        System.out.println(str8.isEmpty());
        System.out.println("------------------------------------");
        
     
	}

}
