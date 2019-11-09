package com.gk2.operators.otheroperators;

public class Gk3InstanceOfBitWise {

	public static void main(String[] args) {
		
		// instanceof
		Thread th = new Thread();
		System.out.println(th instanceof Thread);
		System.out.println(th instanceof Runnable);
		System.out.println("---------------------------");
		
		// BitWise operator (&,|,^)
		boolean b1 = false;
		boolean b2 = true;
		boolean b3 = true;
		System.out.println(b1&b2);
		System.out.println("---------------------------");
		
		// Using Integer in BitWise operator
		System.out.println(4&5);
		System.out.println(4|5);
		System.out.println(4^5);
		System.out.println("---------------------------");
		
		// Bitwise compliment operator
		System.out.println(~4);
		System.out.println("---------------------------");
		
		// Boolean Compliment Operator
		System.out.println(!b3);
		
	}

}
