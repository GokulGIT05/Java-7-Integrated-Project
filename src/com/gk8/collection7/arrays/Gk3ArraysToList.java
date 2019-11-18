package com.gk8.collection7.arrays;

import java.util.Arrays;
import java.util.List;

public class Gk3ArraysToList {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {

		String[] arrayStr = { "A", "B", "C" };

		List listReference = Arrays.asList(arrayStr);
		System.out.println("This List View of Array Object: " + listReference);
		System.out.println("*******************************");

		// listReference.add("D"); // java.lang.UnsupportedOperationException

		// Replaced in 1 Index, this will reflect in arrays too.
		listReference.set(1, "Z");

		for (String localStr : arrayStr) {
			System.out.println(localStr);
		}
		
		

	}

}
