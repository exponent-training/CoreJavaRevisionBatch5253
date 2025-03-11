package com.deser;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Test1 {

	public static void main(String[] args) {
		
		try {
			FileInputStream fileIn = new FileInputStream("account.txt");
			
			ObjectInputStream in = new ObjectInputStream(fileIn);
			
			Account accObj = (Account)in.readObject();
			
			System.out.println(accObj);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
}
