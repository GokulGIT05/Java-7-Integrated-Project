package com.gk1.language.fundamentals3.mainmethod;

public class Gk6MainMethodUsingStaticBlock {

	static {
		System.out.println("Static Block will execute before main method");
	}
	
	public static void main(String[] args) {
		System.out.println("Main Method executed");
	}

}