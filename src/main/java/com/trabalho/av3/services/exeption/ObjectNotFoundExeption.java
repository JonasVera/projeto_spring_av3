package com.trabalho.av3.services.exeption;

public class ObjectNotFoundExeption extends RuntimeException{
 
	private static final long serialVersionUID = 1L;

	
	public ObjectNotFoundExeption(String msg) {
		super(msg);
	}

	public ObjectNotFoundExeption(String msg, Throwable cause) {
		super(msg , cause);
	}
 
	
}
