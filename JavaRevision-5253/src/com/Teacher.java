package com;

public class Teacher extends School {
	
	public Teacher() {
		super("GIIS");
		System.out.println("Teacher default constructor");
	}
	
	public Teacher(int i) {
		this('B', true);
		System.out.println("Teacher single constructor");
	}
	
	public Teacher(char ch, boolean flag) {
		this();
		System.out.println("Teacher 2args constructor");
	}
	
	public static void main(String[] args) {
		Teacher t = new Teacher(100);
	}

}
