package com.gk17.enumconcepts;

public class Gk2EnumMethods {

	public static void main(String[] args) {

		// This Methods Implicitly provides by enum keyword.

		// 1. values()
		EnumMethodDemo[] enumvalues = EnumMethodDemo.values();
		System.out.println(enumvalues.length);

		// 2. ordinal() - Order of constants. starts from 0.
		for (EnumMethodDemo eachEnum : enumvalues) {
			System.out.println("The Value is: " + eachEnum + " : The Ordinal Value: " + eachEnum.ordinal());
		}
	}

}

enum EnumMethodDemo {
	GK, Gk3, Gk5;
}