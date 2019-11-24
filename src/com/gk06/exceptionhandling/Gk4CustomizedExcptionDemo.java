package com.gk06.exceptionhandling;

public class Gk4CustomizedExcptionDemo {

	public static void main(String[] args) {
		int age= 11;
		System.out.println("Main Method");
		if(age > 10) {
			throw new GokulExcpetion("Hi Custom Exception");
		}
	}
}

class GokulExcpetion extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	GokulExcpetion(String message){
	super(message);
	}
	
}
