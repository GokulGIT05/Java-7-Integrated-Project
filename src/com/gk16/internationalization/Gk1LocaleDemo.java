package com.gk16.internationalization;

import java.util.Locale;

public class Gk1LocaleDemo {

	public static void main(String[] args) {
		Locale l1 = Locale.getDefault();
		System.out.println(l1.getLanguage() + " .... " + l1.getCountry());
		System.out.println(l1.getDisplayLanguage() + " ... " + l1.getDisplayCountry());
		System.out.println("*****************************************************");

		Locale l2 = new Locale("ta", "India");
		Locale.setDefault(l2);
		System.out.println(l2.getLanguage() + " .... " + l2.getCountry());
		System.out.println(l2.getDisplayLanguage() + " ... " + l2.getDisplayCountry());
		System.out.println("*****************************************************");

		String[] isoLangList = Locale.getISOLanguages();
		;
		for (String eachISO : isoLangList) {
			System.out.print(eachISO + " / ");
		}
		System.out.println("\n The Total Languages are: " + isoLangList.length);
		System.out.println("*****************************************************");

		String[] isoCountries = Locale.getISOCountries();
		for (String eachCountry : isoCountries) {
			System.out.print(eachCountry + " : ");
		}
		System.out.println("\n The Total Countries are: " + isoCountries.length);
		System.out.println("*****************************************************");
		
		Locale[] localeList =Locale.getAvailableLocales();
		for(Locale eachLocale: localeList) {
			System.out.print(eachLocale+" : ");
		}
		System.out.println("\n The total locale: "+localeList.length);
		System.out.println("*****************************************************");
		
	}

}
