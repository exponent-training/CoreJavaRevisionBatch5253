package com;

public class School {

	public School() {
		System.out.println("School default constructor");
	}

	public School(String schoolname) {
		this();
		System.out.println("School parameterised constructor: " + schoolname);
	}

}
