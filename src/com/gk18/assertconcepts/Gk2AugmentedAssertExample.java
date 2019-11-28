package com.gk18.assertconcepts;

public class Gk2AugmentedAssertExample {

	public static void main(String[] args) {
		System.out.println("Program Starts.... ");
		int x = 100;
		assert (x == 1000) : m1();
//		assert (x == 1000):m2(); //Expression must return a value

		System.out.println(x);
		System.out.println("Program Ends");
	}

	public static int m1() {
		return 777;
	}

	public static void m2() {

	}

}
