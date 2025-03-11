package com.exception;

public class StudentFailException extends RuntimeException{

	StudentFailException(String errorMsg){
		super(errorMsg);
	}
}
