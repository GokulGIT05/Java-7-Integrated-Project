package com.gk08.collection3.set;

import java.util.Comparator;
import java.util.TreeSet;

public class Gk4TreeSetCustomizedSortingDemo1 {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		
		// Customized Sorting By Reverse Order.
		CustomizedSortingDemo custSortObj = new CustomizedSortingDemo();
		
		TreeSet treeSetObj = new TreeSet(custSortObj);
		treeSetObj.add(20);
		treeSetObj.add(40);
		treeSetObj.add(50);
		treeSetObj.add(10);
		
		System.out.println(treeSetObj);
		

	}

}

class CustomizedSortingDemo implements Comparator<Integer> { // Herre i give type.

	@Override
	public int compare(Integer o1, Integer o2) {
		// Reverse Order
		if (o1 < o2) {
			return +1;
		}
		if (o1 > 02) {
			return -1;
		}
		return 0;
	}

}