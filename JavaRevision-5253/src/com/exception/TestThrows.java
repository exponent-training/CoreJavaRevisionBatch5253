package com.exception;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestThrows {
	
	public void m1() throws IOException, NullPointerException {
		
		/*
		 * FileWriter fw = new FileWriter("mytest.txt"); BufferedWriter bwr = new
		 * BufferedWriter(fw);
		 * 
		 * bwr.write("Welcome to javarevision session!!");
		 */
		
		String s = null;
		System.out.println(s.toLowerCase());
		
		FileReader fr = new FileReader("mytest.txt");
		
		BufferedReader bwr = new BufferedReader(fr);
		bwr.read();
		
		bwr.close();
	}
	
	public void m2() throws IOException {
		m1();
	}
	
	public static void main(String[] args){
		TestThrows t = new TestThrows();
		try {
			t.m2();
		} catch (IOException e) {
			System.out.println(e);
		}catch (NullPointerException e) {
			System.out.println(e);
		}
		System.out.println("success!!");
	}

}
