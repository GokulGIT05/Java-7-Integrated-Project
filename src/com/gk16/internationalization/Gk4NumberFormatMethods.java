package com.gk16.internationalization;

import java.text.NumberFormat;

public class Gk4NumberFormatMethods {

	public static void main(String[] args) {
		
		// Getting the NumberFormat Object
		NumberFormat numFormat = NumberFormat.getInstance();

		// case 1:
		System.out.println("Method 1: setMaximumFractionDigits");
		numFormat.setMaximumFractionDigits(3);
		System.out.println(numFormat.format(123.456789));
		System.out.println(numFormat.format(123.4));
		System.out.println("*************************************");

		// case 2:
		System.out.println("Method 2: setMinimumFractionDigits");
		numFormat.setMinimumFractionDigits(3);
		System.out.println(numFormat.format(123.4567234));
		System.out.println(numFormat);
		System.out.println("*************************************");

		// case 3
		System.out.println("Method 3: setMaximumIntegerDigits");
		numFormat.setMaximumIntegerDigits(2);
		System.out.println(numFormat.format(12345.45));
		System.out.println(numFormat.format(1.245));
		System.out.println("*************************************");

		// case 4:
		System.out.println("Method 4: setMinimumIntegerDigits");
		numFormat.setMinimumIntegerDigits(3);
		System.out.println(numFormat.format(1.2344));
		System.out.println(numFormat.format(1234.23));
		System.out.println("*************************************");
	}

}
