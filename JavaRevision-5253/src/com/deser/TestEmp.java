package com.deser;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestEmp {

	public static void serializeStudentObj(Employee s) {
		try {
			FileOutputStream file1 = new FileOutputStream("emp.txt");

			ObjectOutputStream objOut = new ObjectOutputStream(file1);

			objOut.writeObject(s);

			System.out.println("Success!!");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void deserializeStudentObj() {
		try {

			FileInputStream fileIn = new FileInputStream("emp.txt");

			ObjectInputStream objIn = new ObjectInputStream(fileIn);

			Employee emp = (Employee) objIn.readObject();

			System.out.println("---------Student details:---------------");
			System.out.println(emp);

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {

		Address add = new Address();
		add.setAid(101);

		add.setCity("pune");
		Employee e = new Employee();

		e.setEid(1001);
		e.setEname("raaj");
		e.setAddress(add);
		serializeStudentObj(e);

		deserializeStudentObj();

	}
}
