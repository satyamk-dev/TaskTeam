package com.banking.exception;

@SuppressWarnings("serial")
public class InvalidInputException extends Exception{
	public InvalidInputException(String msg) {
		super(msg);
	}
}
