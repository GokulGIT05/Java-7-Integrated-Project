package com.gk8.collection3.set;

import java.util.TreeSet;

public class Gk3TreeSetDNSO {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {

		TreeSet treeSetObj = new TreeSet<>();
		treeSetObj.add(5);
		treeSetObj.add(15);
		treeSetObj.add(25);
		treeSetObj.add(35);
		treeSetObj.add(45);
		treeSetObj.add(55);
		treeSetObj.add(5); // Duplicate Object
		treeSetObj.add(65);
// 		treeSetObj.add("Heterogeneous"); // heterogeneous elements are not possible.

		System.out.println(treeSetObj);

		// TreeSet internally Calls compareTo() method in java.lang package for Default
		// Natural Sorting order.

		System.out.println("A".compareTo("Z")); // -25 So "A" has to come before "Z"
		System.out.println("Z".compareTo("A")); // +25 So "Z" has to come after "A"
		System.out.println("A".compareTo("A")); // 0 Both Objects are Equals
		// CompareTo Present in java.lang used to sort based on Default Natural sorting
		// order.

	}

}
