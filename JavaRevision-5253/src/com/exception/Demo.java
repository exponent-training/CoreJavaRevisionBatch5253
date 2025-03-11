package com.exception;

public class Demo {
	
	public static void main(String[] args) {
		
		try {
			System.out.println("try block-1");
			
			try {
				String s = null;
				System.out.println(s.toLowerCase());
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("nested try catch block1");
			}
			
			try {
				System.out.println("try block-2");
				int[] array = {5,12,19,34};
				int n = array[2]/0;
				
			} catch (NumberFormatException e) {
				System.out.println("nested try catch block2");
			}
		}catch (Exception e) {
			System.out.println("Outer try catch block1");
		}
		
		System.out.println("main method..");
	}

}
