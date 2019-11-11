package com.gk2.operators.misc;

public class Gk5AssignmentConditionNew {

	public static void main(String[] args) {

		// Assignment Operator
		int a, b, c, d;
		a = b = c = d = 5; // Chained Assignment
		System.out.println("" + a + b + c + d + ""); // 5555
		System.out.println(a + b + c + d + ""); // 20

		/*
		 * int a1=b1=c1=d1=5; // Not Possible at declaration.
		 */
		System.out.println("*******************");
		
		// Compound Assignment
		int num =5;
		num += 5; // Assignment mix with other operator.
		System.out.println(num);
		System.out.println("*******************");
		
		// Conditional Operator or Ternary Operator.
		int condition;
		condition = ((10>5)?55:100);
		System.out.println(condition);
		
		// Nested Condition Operator
		int cond1 = ( ( 10 < 5) ? 55 : (5 > 10) ? 100:200);
		System.out.println(cond1);
		
		Thread t = new Thread();
		// new operator is used to create an object.
	}
	
	

}
