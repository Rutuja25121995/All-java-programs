package com.tech;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class File_Input_Stream {

	public static void main(String[] args) {
		try {
			System.out.println("111111111");
			FileInputStream fis = new FileInputStream("input.txt");
			System.out.println("222222222");
			int input = 0;
			int count = 0;
			while ((input = fis.read()) != -1) {
				System.out.print((char) input);
				count++;
			}
			System.out.println();
			System.out.println("count=" + count);

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

}
