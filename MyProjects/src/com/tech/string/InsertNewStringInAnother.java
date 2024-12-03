package com.tech.string;

public class InsertNewStringInAnother {

	public static void main(String[] args) {
		// without using stringbuffer's insert()
//		String str1="hi my name Rutuja"; 
//		String str2="is";
//		String str3="";
//		int index=5;
//		for(int i=0;i<=str1.length()-1;i++) {
//			str3=str3+str1.charAt(i);
//			if(i==index) {
//				str3=str3+str2+" ";
//			}
//			
//		}System.out.println(str3);
		
		StringBuffer bfr=new StringBuffer("computer engineering");
		StringBuffer bfr1=new StringBuffer("science");
		System.out.println(bfr.insert(9,bfr1));
		
		
	
	}

}
