package com.deser;

import java.io.Serializable;

public class Address implements Serializable {
	
	private int aid;
	
	private String city;

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [aid=" + aid + ", city=" + city + "]";
	}
	
	

}
