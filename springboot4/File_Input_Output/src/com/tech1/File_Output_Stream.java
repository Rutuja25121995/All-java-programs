package com.tech1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class File_Output_Stream {

	public static void main(String[] args) {
		try {
			System.out.println("1111111");
			FileOutputStream fos=new FileOutputStream("output.txt");
			System.out.println("2222222");
			String name="hello developers";
			byte[] bytes=name.getBytes();
			System.out.println(bytes);
			
				fos.write(bytes);
			 
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

}
