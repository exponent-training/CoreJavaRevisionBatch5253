package com.exception;

public class Demo1 {
	
	public static void main(String[] args) {
		
		try {
			System.out.println("try catch block1");
			int n = 50/0;
			System.out.println("n= "+n);
			try {
				String str = "32W";
				Integer i = Integer.parseInt(str);
				System.out.println("i="+i);
				try {
					String s = "pune";
					
					System.out.println(s.charAt(8));
				} catch (ArithmeticException e) {
					System.out.println("nested try catch block1");
				}
			} catch (ArithmeticException e) {
				System.out.println("nested try catch block2");// TODO: handle exception
			}
		}catch (RuntimeException e) {
			System.out.println("Runtime try catch block");
		} 
		catch (Exception e) {
			System.out.println("Outer try catch block");
		}
		System.out.println("main method");
	}

}
