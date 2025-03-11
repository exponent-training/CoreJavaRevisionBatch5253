package com.abc;

public class TestFinal {
	public static void main(String[] args) {

		final Student s = new Student(21, "7890 5643 1122", "ASDFG3456T");
		
		//s= new Student(112, "78", "hj45");

		System.out.println(s.getRollno() + " " + s.getAadharno() + " " + s.getPancardno());

		System.out.println(s);
	}
}
