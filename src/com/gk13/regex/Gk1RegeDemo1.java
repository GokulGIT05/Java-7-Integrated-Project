package com.gk13.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Gk1RegeDemo1 {

	public static void main(String[] args) {

		// 1. Creating a Pattern Object. Compiled Version of Regex.
		Pattern thePattern = Pattern.compile("22");
		
		String str1 = "122328922";
		
		Matcher matcher = thePattern.matcher(str1);
		
		// Methods in Matcher class
		while(matcher.find()) {
			int indexStart = matcher.start();
			int lastIndexPlus1 = matcher.end();
			String group = matcher.group();
			System.out.println("indexStart: "+indexStart);
			System.out.println("lastIndexPlus1: "+lastIndexPlus1);
			System.out.println("group: "+group);
			System.out.println("************************************");
		}
		
		
	}

}
