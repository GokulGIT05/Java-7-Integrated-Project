package com.gk08.collection6.collectionsmethods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Gk1BinarySearch {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		
		List listObj = new ArrayList<Integer>();
		listObj.add(13);
		listObj.add(3);
		listObj.add(43);
		listObj.add(23);
		listObj.add(13);
		System.out.println("Before Sorting: "+listObj);
		
		System.out.println("False Result: "+Collections.binarySearch(listObj, 23));
		// 1. sort Method
		Collections.sort(listObj);
		System.out.println("After Sort: "+listObj);
		
		// 2. Search Method After Sorting.
		// To Use Binary Search compulsory sorting should be done
		int index = Collections.binarySearch(listObj, 23);
		System.out.println("Index of search string: "+index);
		System.out.println("****************************");
		
		// 3. Searching using customized sorting.
		BinarySearchComparator obj = new BinarySearchComparator();
		Collections.sort(listObj, obj);
		System.out.println("After Custom Sort: "+listObj);
		int index1 = Collections.binarySearch(listObj, 23, obj);
		System.out.println("Index of search string: "+index1);
		int index2 = Collections.binarySearch(listObj, 10, obj);  // Not Found Value.
		System.out.println("Insertion Point of search string: "+index2);
		
	}

}

class BinarySearchComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		return o2.compareTo(o1);
	}

	
}
