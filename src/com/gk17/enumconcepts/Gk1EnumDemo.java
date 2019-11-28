package com.gk17.enumconcepts;

public class Gk1EnumDemo {

	public static void main(String[] args) {
		
		// First way of accessing.
		MyEnumExample referenceVar = MyEnumExample.Gk1;
		System.out.println(referenceVar);
		
		// Second Way. Directly Accessing.
		System.out.println(MyEnumExample.Gk3); // In enum toString() methods is overloaded.

	}

}

enum MyEnumExample{
	Gk1,Gk2,Gk3
}