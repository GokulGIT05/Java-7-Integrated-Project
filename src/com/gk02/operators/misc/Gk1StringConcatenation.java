package com.gk02.operators.misc;

public class Gk1StringConcatenation {

	public static void main(String[] args) {
		String str = "Gk";
		int a =1;
		int b= 2;
		int c =3;
		
		// If any integer append with string then by default it became string.
		System.out.println(str+a+b+2);
		System.out.println(b+c);
		System.out.println("******************");
		System.out.println();
		
		String str1 = str+a;
		System.out.println(str1);
		
		/*// Below Statement is not possible
		int d = str+a; */
	}

}
