package com.tech;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;


public class test_read {

	public static void main(String[] args) {
		
		try {
			FileInputStream fis=new FileInputStream("output.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			
				Employee emp=(Employee) ois.readObject();
			System.out.println(emp.getId());
			System.out.println(emp.getName());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
