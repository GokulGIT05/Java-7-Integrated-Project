package com.gk13.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Gk4RegexQuantifiers {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		String inputStrint ="abaabbaaabbb";
		
		String quantifierStr1 = "a";
		
		String quantifierStr2 = "a+"; // Atleast One
		
		String quantifierStr3 = "a*"; // Any number of'a' including zero.
		
		String quantifierStr4 ="a?"; // Atmost one 'a'.
		
		Pattern patterObj = Pattern.compile(quantifierStr4);
		Matcher matcherObj = patterObj.matcher(inputStrint);
		
		while (matcherObj.find()) {
			System.out.println("Index: " + matcherObj.start() + " ::::: SearchString: " + matcherObj.group());
		}

		System.out.println("End Of Main");
	}

}
