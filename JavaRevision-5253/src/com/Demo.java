package com;

public class Demo {
	
	public static void main(String[] args) {
		
		String s = new String("abc");
		
		System.out.println(s.getClass().getName());
		
		Demo d = new Demo();
		
		System.out.println(d.getClass().getName());
		
		System.out.println(d.getClass().getSimpleName());
		
		System.out.println(d.getClass().getClassLoader());
		
		System.out.println(s.getClass().getClassLoader());
		
		System.out.println("Demo obj= "+d);
		
		System.out.println(d.hashCode());
	}

}
