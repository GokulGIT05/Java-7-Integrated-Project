package com.gk13.regex;

import java.util.regex.Pattern;

public class Gk5RegexSplitMethods {

	public static void main(String[] args) {

		String toSplit = "Gokul Software Solutions";

		Pattern patternObj = Pattern.compile("S"); 
		String[] strArray = patternObj.split(toSplit);

		for (String eachStr : strArray) {
			System.out.println(eachStr);
		}

		System.out.println("************************");

		String[] strSplit = toSplit.split("\\s");
		for (String eachStr : strSplit) {
			System.out.println(eachStr);
		}
		
		// Both Split() will work like same.

	}

}
