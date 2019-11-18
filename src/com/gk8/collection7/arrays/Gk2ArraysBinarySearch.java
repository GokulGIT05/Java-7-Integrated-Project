package com.gk8.collection7.arrays;

import java.util.Arrays;


public class Gk2ArraysBinarySearch {

	public static void main(String[] args) {

		int[] primitiveArray = { 4, 2, 7, 3, 9, 10, 3 };
		// To do binary Search compulsory we need to sort arrays.
		Arrays.sort(primitiveArray);

		// Arrays We can't print directly
		for (int localArray : primitiveArray) {
			System.out.println(localArray);
		}

		// 1. Binary Search Primitive
		int indexPrimitive1 = Arrays.binarySearch(primitiveArray, 7);
		System.out.println("The index of 7 is: " + indexPrimitive1);
		int indexPrimitive2 = Arrays.binarySearch(primitiveArray, 100);
		System.out.println("The Insertion Point of 100 is: " + indexPrimitive2);
		System.out.println("********************************************");

		// 2. Binary Search Object.
		String[] dnsoArray = { "Z", "F", "A", "T" };
		Arrays.sort(dnsoArray);
		for (String localStr : dnsoArray) {
			System.out.println(localStr);
		}

		int indexObject1 = Arrays.binarySearch(dnsoArray, "F");
		System.out.println("Index of F is: " + indexObject1);
		int indexObject2 = Arrays.binarySearch(dnsoArray, "X");
		System.out.println("Insertion Point of X: " + indexObject2);
		System.out.println("**************************");

		// 3. Binary Search using Comparator.
		String[] customSortArray = { "Z", "F", "A", "T" };
		Arrays.sort(customSortArray, new ArrayCustomComparator());
		for (String localStr : customSortArray) {
			System.out.println(localStr);
		}

		// To Find Index, need to pass the same custom comparator used in sorting in
		// binary search method
		int indexUsingComparator = Arrays.binarySearch(customSortArray, "F", new ArrayCustomComparator());
		System.out.println("The indexUsingComparator for F is: "+indexUsingComparator);
		int indexUsingComparator1 = Arrays.binarySearch(customSortArray, "X", new ArrayCustomComparator());
		System.out.println("The Insertion Point for X is: "+indexUsingComparator1);
		System.out.println("**************************");
	}

}
