package com.gk08.collection7.arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Gk1ArraysClassSortMethods {

	public static void main(String[] args) {
		
		int[] primitiveArray = {4,2,7,3,9,10,3};
		
		// 1. For Every Primitive, we can sort using Arrays Class Sort Method
		System.out.println("After Sort:Primtive Type ");
		Arrays.sort(primitiveArray);
		
		// Arrays We can't print directly
		for(int localArray : primitiveArray) {
			System.out.println(localArray);
		}
		System.out.println("**************************");
		
		// 2. Arrays Sort, Default Natural Sorting Order.
		System.out.println("Arrays Sort, Default Natural Sorting Order");
		String[] dnsoArray = {"Z","F","A","T"};
		Arrays.sort(dnsoArray);
		for(String localStr: dnsoArray) {
			System.out.println(localStr);
		}
		System.out.println("**************************");
		
		// 3. Arrays Sort Customized Sorting Order
		System.out.println("Arrays Sort Customized Sorting Order");
		String[] customSortArray = {"Z","F","A","T"};
		Arrays.sort(customSortArray,new ArrayCustomComparator());
		for(String localStr: customSortArray) {
			System.out.println(localStr);
		}
		System.out.println("**************************");
	}

}

class ArrayCustomComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		// Reverse Order
		return o2.compareTo(o1);
	}
	
}
