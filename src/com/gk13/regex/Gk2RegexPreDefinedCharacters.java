package com.gk13.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Gk2RegexPreDefinedCharacters {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		String inputString = "@3doan!&8b49=2";

		String searchStr1 = "[abc]"; // either a or b or c

		String searchStr2 = "[^abc]"; // Except a or b or c

		String searchStr3 = "[a-z]"; // Only Smaller Case Alphabets

		String searchStr4 = "[0-9]"; // Only Numbers

		String searchStr5 = "[A-Za-z0-9]"; // Only Alpha numeric

		String searchStr6 = "[^A-Za-z0-9]"; // Excepts Alpha numeric

		Pattern patternObj = Pattern.compile(searchStr6);
		Matcher matcherObj = patternObj.matcher(inputString);

		while (matcherObj.find()) {
			System.out.println("Index: " + matcherObj.start() + " ::::: SearchString: " + matcherObj.group());
		}

		System.out.println("End Of Main");
	}

}
