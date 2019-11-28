package com.gk16.internationalization;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class Gk2NumberFormat {

	public static void main(String[] args) throws ParseException {

		double d = 1234.568;
		// Number Format is an abstract class. By using static methods only we will
		// create object of Number Format.
		NumberFormat nf = NumberFormat.getInstance(Locale.ITALY);
		// 1. Method
		String str = nf.format(d);
		System.out.println("Italy Number Format: " + str);

		// 2. Locale String to Number Format in java
		Number strToNumformat = nf.parse(str);
		System.out.println(strToNumformat);
	}

}
