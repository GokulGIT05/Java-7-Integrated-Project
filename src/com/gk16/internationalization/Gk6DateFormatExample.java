package com.gk16.internationalization;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Gk6DateFormatExample {

	// Write a program to display the current system date in all possible styles of US form ?
	public static void main(String[] args) {
		
		DateFormat df= DateFormat.getDateInstance(0, Locale.US);
		String dateStr = df.format(new Date());
		System.out.println(dateStr);
		System.out.println("--- or----");
		System.out.println("Full Form: "+DateFormat.getDateInstance(0, Locale.US).format(new Date()));
		System.out.println("*************************************");
		System.out.println("Long Form: "+DateFormat.getDateInstance(1, Locale.US).format(new Date()));
		System.out.println("*************************************");
		System.out.println("Medium Form: "+DateFormat.getDateInstance(2, Locale.US).format(new Date()));
		System.out.println("*************************************");
		System.out.println("Short Form: "+DateFormat.getDateInstance(3, Locale.US).format(new Date()));
		System.out.println("*************************************");
		System.out.println("Default Form: "+DateFormat.getInstance().format(new Date()));
		
		
		
	}

}
