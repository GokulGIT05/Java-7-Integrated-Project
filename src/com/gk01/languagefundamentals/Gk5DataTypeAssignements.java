package com.gk01.languagefundamentals;

public class Gk5DataTypeAssignements {

	public static void main(String[] args) {

		// 1.
		byte byteType = 105;
		System.out.println("Byte: " + byteType);
		System.out.println("**************************");

		// 2.
		short shortType = byteType;
		System.out.println("short: " + shortType);
		System.out.println("**************************");

		/*
		 * char c1 = b; char c2 = s;
		 */

		// 3. char
		char charType = 'a';
		System.out.println("char: " + charType);
		
		// Type Casting is needed.
		char charTypeFromByte = (char) byteType;
		System.out.println("charTypeFromByte: " + charTypeFromByte);
		
		char charTypeFromShort = (char) shortType;
		System.out.println("charTypeFromShort: " + charTypeFromShort);
		System.out.println("**************************");

		// 4. int
		int intTypeFromByte = byteType;
		System.out.println("intTypeFromByte: " + intTypeFromByte);

		int intTypeFromShort = shortType;
		System.out.println("intTypeFromShort: " + intTypeFromShort);

		int intTypeFromChar = charType;
		System.out.println("intTypeFromChar: " + intTypeFromChar);

		int intType = 500;
		System.out.println("intType: " + intType);

		System.out.println("**************************");

		long longTypeFromByte = byteType;
		System.out.println("longTypeFromByte: " + longTypeFromByte);

		long longFromShort = shortType;
		System.out.println("longFromShort: " + longFromShort);

		long longFromChar = charType;
		System.out.println("longFromChar: " + longFromChar);

		long longFromInt = intType;
		System.out.println("longFromInt: " + longFromInt);

		long longType = 100l;
		System.out.println("longType: " + longType);

		long longTypeFromFloat = (long) 10.0f;  // Need TypeCasting - widening & narrowing Concept
		System.out.println("longTypeFromFloat: PLP " + longTypeFromFloat);

		System.out.println("**************************");

		float floatfromByte = byteType;
		System.out.println("floatfromByte: " + floatfromByte);
		
		float floatFromShort = shortType;
		System.out.println("floatFromShort: " + floatFromShort);
		
		float floatFromChar = charType;
		System.out.println("floatFromChar: " + floatFromChar);
		
		float floatFromInt = intType;
		System.out.println("floatFromInt: " + floatFromInt);
		
		float floatFromLong = longType;
		System.out.println("floatFromLong: " + floatFromLong);
		
		float floatType = 125.05f;
		System.out.println("floatType: " + floatType);
		
		System.out.println("**************************");
		
		double doubleFromByte = byteType;
		System.out.println("doubleFromByte: " + doubleFromByte);
		
		double doubleFromShort = shortType;
		System.out.println("doubleFromShort: " + doubleFromShort);
		
		double doubleFromChar = charType;
		System.out.println("doubleFromChar: " + doubleFromChar);
		
		double doubleFromInt = intType;
		System.out.println("doubleFromInt: " + doubleFromInt);
		
		double doubleFromLong = longType;
		System.out.println("doubleFromLong: " + doubleFromLong);
		
		double doubleFromFloat = floatType;
		System.out.println("doubleFromFloat: " + doubleFromFloat);
		
		double doubleType = 10.00;
		System.out.println("doubleType: " + doubleType);
		
	}
}
