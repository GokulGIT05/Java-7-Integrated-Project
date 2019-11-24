package com.gk05.oops3.controlflow;

public class Gk1StaticControlFlow {
	
	static int i = 10;
	
	static {
		method1();
		System.out.println("First Static Block");
		System.out.println("******************");
	}
	
	public static void main(String[] args) {
		System.out.println("*******Main Method Start***********");
		method1();
		System.out.println("Inside Main Method");
		System.out.println("*******Main Method End***********");
	}
	
	public static void method1() {
		System.out.println("Inside method1");
		System.out.println("Value of j: "+j);
		System.out.println();
	}
	
	static {
		System.out.println("Second Static Block");
	}
	
	static int j =20;
}
