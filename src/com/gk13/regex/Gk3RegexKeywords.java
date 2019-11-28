package com.gk13.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Gk3RegexKeywords {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		String inputString = "@3do an!&8 b49=2";
		
		String keywordsStr1 = "\\s"; // to Find Space in String.
		
		String keywordsStr2 = "\\S"; // Except Space.
		
		String keywordsStr3 = "\\d"; // Only Numbers
		
		String keywordsStr4 = "\\D"; // Except Numbers
		
		String keywordsStr5 = "\\w"; // It is equivalent to [A-Za-z0-9]
		
		String keywordsStr6 = "\\W"; // It is equivalent to [^A-Za-z0-9]
		
		String keywordsStr7 = "."; // Any Character. Mostly used with some other keywords
		
		Pattern patternObj = Pattern.compile(keywordsStr7);
		Matcher matcherObj = patternObj.matcher(inputString);

		while (matcherObj.find()) {
			System.out.println("Index: " + matcherObj.start() + " ::::: SearchString: " + matcherObj.group());
		}

		System.out.println("End Of Main");

	}

}
