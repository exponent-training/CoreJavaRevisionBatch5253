package com.exception;

public class Demo2 {
	
	public static void main(String[] args) {
		
		try {
			System.out.println("try block");
			int a = 100/0;
		} catch (NumberFormatException e) {
			try {
				int[] array = {56,100};
				System.out.println(array[4]);
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
		
		System.out.println("main method");
	}

}
