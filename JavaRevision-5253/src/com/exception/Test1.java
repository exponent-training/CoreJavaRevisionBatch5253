package com.exception;

public class Test1 {

	static float marks = 33.5f;

	public void m1() {

		if (marks >= 35) {
			System.out.println("Student is passed with percentage = " + marks + "%");
		} else {
			throw new ArithmeticException("Student is fail, please try next year!!");
		}
	}

	public static void checkResulrt() {
		if (marks >= 35) {
			System.out.println("Student is passed with percentage = " + marks + "%");
		} else {
			throw new StudentFailException("Student is fail, please try next year!!");
		}
	}

	public static void main(String[] args) {
		try {
			checkResulrt();
		} catch (StudentFailException e) {
			System.out.println(e);
		}
	}
}