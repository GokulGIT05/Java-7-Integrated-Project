package com.gk16.internationalization;

import java.text.NumberFormat;
import java.util.Locale;

public class Gk3NumberFormatCurrency {

	public static void main(String[] args) {

		double currency = 1234.568;

		Locale India = new Locale("ta", "IN");
		NumberFormat nf1 = NumberFormat.getCurrencyInstance(India);
		System.out.println("Currency Format in India: " + nf1.format(currency));

		NumberFormat nf2 = NumberFormat.getCurrencyInstance(Locale.UK);
		System.out.println("Currency Format in UK: " + nf2.format(currency));

		NumberFormat nf3 = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println("Currency Format in Us: " + nf3.format(currency));

	}

}
