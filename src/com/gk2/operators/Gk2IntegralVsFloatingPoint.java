package com.gk2.operators;

public class Gk2IntegralVsFloatingPoint {

	public static void main(String[] args) {
		
		System.out.println("Double: "+10.0/0); // Infinity
		System.out.println("Negative Double: "+-10.0/0); // Infinity
		
		System.out.println("Integer: "+10/0); // Run time exception
		
	}
	

}
