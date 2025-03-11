package com.abc;

public final class Student {

	
	private final int rollno;
	private final String aadharno;
	private final String pancardno;
	
	public Student(int rollno, String aadharno, String pancardno) {
		super();
		this.rollno = rollno;
		this.aadharno = aadharno;
		this.pancardno = pancardno;
	}

	public int getRollno() {
		return rollno;
	}

	public String getAadharno() {
		return aadharno;
	}

	public String getPancardno() {
		return pancardno;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", aadharno=" + aadharno + ", pancardno=" + pancardno + "]";
	}
	
	
}
