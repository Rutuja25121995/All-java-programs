package com.tech;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class test_save {

	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.setId(31);
		emp.setName("shweta");
		
		try {
			System.out.println("11111111111");
			FileOutputStream fos=new FileOutputStream("output.txt");
			System.out.println("22222222222");
				ObjectOutputStream oos=new ObjectOutputStream(fos);
				oos.writeObject(emp);
				System.out.println("33333333333");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
