package com;

public class StringClassMethods {
	
	public static void main(String[] args) {
		
		String s1 = new String("pune");
		String s2 = s1.intern();
		String s3 = "pune";
		
		System.out.println(s1==s2);
		System.out.println(s3==s2);
		
		String st = s1.substring(2);
		System.out.println(st);
		
		String s4 = "javarevision";
		System.out.println(s4.substring(3, 8));
		
		StringBuffer sb = new StringBuffer("python");
		sb.append("Program");
		System.out.println(sb);
	}

}
