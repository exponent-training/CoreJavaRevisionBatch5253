package com.deser;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Test {

	public static void main(String[] args) {

		Account a = new Account(101, "jay", "pune");

		try {
			FileOutputStream fileOut = new FileOutputStream("account.txt");

			ObjectOutputStream out = new ObjectOutputStream(fileOut);

			out.writeObject(a);

			System.out.println("success!!");
		} catch (Exception e) {

			System.out.println(e);
		}
	}

}
