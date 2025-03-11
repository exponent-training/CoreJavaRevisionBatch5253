package com.deser;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestParentChildSer {
	
	public static void serializeStudentObj(Student s) {
		try {
			FileOutputStream file1 = new FileOutputStream("student.txt");
			
			ObjectOutputStream objOut = new ObjectOutputStream(file1);
			
			objOut.writeObject(s);
			
			System.out.println("Success!!");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public static void deserializeStudentObj() {
		try {
			
			FileInputStream fileIn = new FileInputStream("student.txt");
			
			ObjectInputStream objIn = new ObjectInputStream(fileIn);
			
			Student derserStudent = (Student)objIn.readObject();
			
			System.out.println("---------Student details:---------------");
			System.out.println(derserStudent);
			
			System.out.println(derserStudent.cid+" "+derserStudent.collegename);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		
		Student s = new Student(3001, "PCCOE", 205, "ganesh", 84.6f);
		
		serializeStudentObj(s);
		
		deserializeStudentObj();
		
	}

}
