package com.gk08.collection7.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Gk4ConverionOfListToArray {

	public static void main(String[] args) {

		// 1. Converting From List<Integer> to Primitive int[] Value
		List<Integer> toArrayTest1 = new ArrayList<Integer>();
		toArrayTest1.add(1);
		toArrayTest1.add(2);
		System.out.println(toArrayTest1);

		int[] intArrayVal = new int[toArrayTest1.size()];

		for (int i = 0; i < toArrayTest1.size(); i++) {
			intArrayVal[i] = toArrayTest1.get(i);
		}

		// To Print Array.
		System.out.println(intArrayVal.toString());
		System.out.println(Arrays.toString(intArrayVal));
		System.out.println("******* To Print Array ***********");
		System.out.println();
		
		
		// 2. Convert List<Integer> to Integer[] wrapper Object
		Integer[] intArrayObj = toArrayTest1.toArray(new Integer[toArrayTest1.size()]);
		System.out.println(Arrays.toString(intArrayObj));
		
		// 2.1 If we using only toArray(), it will return only Object[]
		Object[] ObjArray = toArrayTest1.toArray();
		System.out.println(Arrays.toString(ObjArray));
		System.out.println("********Convert List<Integer> to Integer[] wrapper Object**********");
		System.out.println();
		// *********************************************************************************************
		
		// Below are simple Test
		List<String> listStr = Arrays.asList("1", "2");
		System.out.println(listStr);

		/*
		 * listStr.add("3"); // java.lang.UnsupportedOperationException
		 * System.out.println(listStr);
		 */

		List<String> listToArray = new ArrayList<String>();
		listToArray.add("ONE");
		listToArray.add("TWO");
		System.out.println(listToArray);

		// List to Array : Easiest Way
		// Object[] strArray1 = listToArray.toArray();

		String[] strArray1 = listToArray.toArray(new String[listToArray.size()]);

		List<Integer> intList = new ArrayList<Integer>();
		intList.add(1);
		intList.add(2);
		intList.add(3);

		// Below is the Only way to convert Integer Collection Object to int Primitive.

		int[] primitiveArray = new int[intList.size()];

		for (int i = 0; i < intList.size(); i++) {
			primitiveArray[i] = intList.get(i);
			System.out.println("CONVERSION");
		}

		for (int i : primitiveArray) {
			System.out.println(i);
		}
		System.out.println("******************");

		Integer[] easyConversion = intList.toArray(new Integer[intList.size()]);
		for (int i : easyConversion) {
			System.out.println(i);
		}

		System.out.println(Arrays.toString(easyConversion));
		System.out.println(listStr);

		System.out.println("*******************Below Are Test*********");

	}

}
