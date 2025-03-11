package com.abc;

public class Application {

	
	public static void main(String[] args) {
		
		
		/*
		 * int num = 200;
		 * 
		 * //Autoboxing Integer i = Integer.valueOf(num);
		 * 
		 * System.out.println(i+" "+num);
		 * 
		 * //instanceof System.out.println(i instanceof Integer); //
		 * System.out.println(num instanceof Integer);
		 * 
		 * Integer i2 = num;
		 */
		
		
		Integer I1 = new Integer(87);
		
		//unboxing
		int n = I1.intValue();
		
		System.out.println(n+" "+I1);
		
		int n1 = I1;
		
	}
}
