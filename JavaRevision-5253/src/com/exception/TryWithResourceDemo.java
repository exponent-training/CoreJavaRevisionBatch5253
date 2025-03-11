package com.exception;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class TryWithResourceDemo {
	
	public static void main(String[] args) {
		try(FileOutputStream file1 = new FileOutputStream("file1.txt"); FileInputStream fileIn = new FileInputStream("file1.txt")) {
			
			String str = "java is programming language..";
			byte[] array = str.getBytes();
			
			file1.write(array);
			System.out.println("success!!");
			
			fileIn.read();
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
