package com.gk16.internationalization;

import java.text.DateFormat;
import java.util.Date;

public class Gk5DateFormat {

	public static void main(String[] args) {
		
		DateFormat df1 = DateFormat.getInstance();
		System.out.println(df1.format(new Date()));
		System.out.println("********************************");
		
		DateFormat df2 = DateFormat.getDateInstance();
		System.out.println(df2.format(new Date()));
		System.out.println("********************************");

		DateFormat df3 = DateFormat.getDateInstance(0);
		System.out.println(df3.format(new Date()));
		System.out.println("********************************");
		
		DateFormat df4 = DateFormat.getDateInstance(1);
		System.out.println(df4.format(new Date()));
		System.out.println("********************************");
		
		DateFormat df5 = DateFormat.getDateInstance(2);
		System.out.println(df5.format(new Date()));
		System.out.println("********************************");
		
		DateFormat df6 = DateFormat.getDateInstance(3);
		System.out.println(df6.format(new Date()));

		/*
		 * DateFormat df7 =DateFormat.getDateInstance(4); // Illegal date style 4
		 * System.out.println(df7.format(new Date()));
		 */

	}

}
