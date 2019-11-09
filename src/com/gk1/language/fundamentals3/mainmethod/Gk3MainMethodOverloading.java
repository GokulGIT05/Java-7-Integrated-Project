package com.gk1.language.fundamentals3.mainmethod;

public class Gk3MainMethodOverloading {

	public static void main(String[] args) {
		System.out.println("Main Method- JVM Called: ");
		main(2);
	}
	
	// Method Overloading
	public static void main(int args) {
		System.out.println("Inside int main Method");
	}

}
