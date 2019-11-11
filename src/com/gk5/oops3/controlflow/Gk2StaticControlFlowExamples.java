package com.gk5.oops3.controlflow;

public class Gk2StaticControlFlowExamples {

	static {
		// Can't perform direct read from static blocks before declaration
//		System.out.println(x); // Unresolved compilation problem: 
		m1();
	}
	
//	static int x = 10;
	
	public static void main(String[] args) {
		System.out.println("Inside Gk2StaticControlFlowExamples: main");
		m1();
	}

	public static void m1() {
		System.out.println(x);
	}
	
	static int x = 10;
}
