package com.gk10.lang4.stringbuilder;

public class Gk1StringBuilderDemo {

	public static void main(String[] args) {

		// StringBuilder is not thread safe when compared to StringBuffer. Except this
		// there is no difference in methods and constructor
		StringBuilder strBuilder = new StringBuilder("Gokul123");
		System.out.println(strBuilder);
	}

}
