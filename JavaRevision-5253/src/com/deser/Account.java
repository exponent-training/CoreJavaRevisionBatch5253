package com.deser;

import java.io.Serializable;

public class Account implements Serializable{
	
	private int id;
	
	private String name;
	
	private String address;
	
	private int age;

	public Account(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

	
	

}
