package com.deser;

public class Student extends College{
	
	 int rollno;
	
	 String sname;
	
	 float marks;
	
	Student(int cid, String collegename, int rollno,String sname,float marks){
		
		super(cid, collegename);
		
		this.rollno = rollno;
		this.sname = sname;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", sname=" + sname + ", marks=" + marks + "]";
	}
	
	

}
