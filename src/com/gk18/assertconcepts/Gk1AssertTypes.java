package com.gk18.assertconcepts;

public class Gk1AssertTypes {

	public static void main(String[] args) {
		
		// To Enable assert, -ea has to give as vm arguments in Run Configuration.
		int valueToTest = 10;
		System.out.println("Programs Starts...");
		// Two Types.
		// 1. Simple Type.
		assert(valueToTest == 10); 
		System.out.println("Statement after Simple Assert");
		
		// 2.  Augmented Type.
		assert(valueToTest == 100) : "Augmented Test: The Value is not Equal";
		System.out.println("Satement after augmented assert");

	}

}
