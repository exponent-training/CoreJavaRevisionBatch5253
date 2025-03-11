package com.deser;

import java.io.Serializable;

public class College implements Serializable {
	
	 int cid;
	
	 String collegename;

	public College(int cid, String collegename) {
		//super();
		this.cid = cid;
		this.collegename = collegename;
	}

	@Override
	public String toString() {
		return "College [cid=" + cid + ", collegename=" + collegename + "]";
	}
	
	

}
