package com.gk6.exceptionhandling;

public class Gk2ThrowKeyword {

	public static void main(String[] args) {
		
		try {
			int i = 10/0;
		}catch (Exception e) {
			e.printStackTrace();
			throw new ArithmeticException("Checking throw keyword");		}
		
		
	}

}
