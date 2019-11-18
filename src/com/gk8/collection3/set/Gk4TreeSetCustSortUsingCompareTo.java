package com.gk8.collection3.set;

import java.util.Comparator;
import java.util.TreeSet;

public class Gk4TreeSetCustSortUsingCompareTo {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		CustSortUsingCompareTo custSortObj = new CustSortUsingCompareTo();

		TreeSet treeSetObj = new TreeSet(custSortObj);
		treeSetObj.add(20);
		treeSetObj.add(40);
		treeSetObj.add(50);
		treeSetObj.add(10);

		System.out.println(treeSetObj);

	}

}

class CustSortUsingCompareTo implements Comparator<Integer> {

	@Override // (new, Old)
	public int compare(Integer o1, Integer o2) {

		// 1. Descending Order
		return o2.compareTo(o1);

		// 2. Ascending Order
		// return o1.compareTo(o2);

		// 3. Descending Order
		// return -o1.compareTo(o2);

		// 4. Ascending Order
		// return -o2.compareTo(o1);

		// 5. Insertion Order
		// return +1;

		// 6. Reverse of Insertion Orderr
		// return -1;

		// 7. Only First Element Will be inserted.
		// return 0;
	}

}