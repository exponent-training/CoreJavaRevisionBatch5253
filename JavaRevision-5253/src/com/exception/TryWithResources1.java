package com.exception;

import java.io.FileOutputStream;
import java.io.IOException;

public class TryWithResources1 {
	
	public static void main(String[] args) throws IOException {
		FileOutputStream file2 = new FileOutputStream("file2.txt");
		try {
			
			String str = "java is secured language..";
			byte[] array = str.getBytes();
			
			file2.write(array);
			System.out.println("success!!");
			
		} catch (IOException e) {
			System.out.println(e);
		}
		finally {
			file2.close();
			System.out.println("finally block invoked..");
		}
	}


}
