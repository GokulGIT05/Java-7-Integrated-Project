package com.gk16.internationalization;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Gk7DateTimeFormat {

	public static void main(String[] args) {

		// DateFormat.getDateTimeInstance
		DateFormat df = DateFormat.getDateTimeInstance(0, 0, Locale.US);
		String dateStr = df.format(new Date());
		System.out.println(dateStr);
		System.out.println("--- or----");
		System.out.println("Full Form: " + DateFormat.getDateTimeInstance(0, 0, Locale.US).format(new Date()));
		System.out.println("*************************************");
		System.out.println("Long Form: " + DateFormat.getDateTimeInstance(1, 1, Locale.US).format(new Date()));
		System.out.println("*************************************");
		System.out.println("Medium Form: " + DateFormat.getDateTimeInstance(2, 2, Locale.US).format(new Date()));
		System.out.println("*************************************");
		System.out.println("Short Form: " + DateFormat.getDateTimeInstance(3, 3, Locale.US).format(new Date()));
		System.out.println("*************************************");
		System.out.println("Default Form: " + DateFormat.getDateTimeInstance().format(new Date()));

	}

}
