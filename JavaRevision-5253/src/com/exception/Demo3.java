package com.exception;

public class Demo3 {
	
	public static void main(String[] args) {
		
		try {
			String s = "html";
			System.exit(2);
			System.out.println(s.charAt(2));
		} catch (ArithmeticException e) {
			System.out.println(e);
		}finally {
			System.out.println("finally block always executes..");
		}
		System.out.println("main method");
	}

}
