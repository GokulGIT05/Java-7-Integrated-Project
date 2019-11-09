package com.gk2.operators.otheroperators;

public class Gk4ShortCircuitTypeCasting {

	public static void main(String[] args) {
		
		// Short-Ciruit ( &&, || )
		int x =3;
		
		if( (++x < 2) && /*&*/ ((10/0) > 2) ) {
			System.out.println("Null Pointer Exception Avoided");
		}
		
		// Second Parameter is optional,  if first condition itself failed then it won't execute the second condition
		System.out.println("End of Short-Circuit");
		System.out.println("-------------------------------------------");
		
		byte b =97;
		int i = b;
		System.out.println("Implicit TypeCasting: "+i);
		
		char c =(char)i; // Developer Has to perform explicitly
		System.out.println("Explicit TypeCasting: "+c);
		
		
	}
	
}
