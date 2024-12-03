package com.tech;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Test_Serialization {

	public static void main(String[] args) {
		Student s1=new Student();
		s1.setId(1);
		s1.setName("rutuja");
		s1.setCollege("MGM");
		s1.setPhone(654655);
		try {
			FileOutputStream fos=new FileOutputStream("abc.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			
			oos.writeObject(s1);
			System.out.println(s1);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
