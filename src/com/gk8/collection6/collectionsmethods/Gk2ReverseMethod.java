package com.gk8.collection6.collectionsmethods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Gk2ReverseMethod {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		
		List<Integer> listObj = new ArrayList<Integer>();
		listObj.add(13);
		listObj.add(3);
		listObj.add(43);
		listObj.add(23);
		listObj.add(13);
		System.out.println("Main Object" + listObj);
		
		Collections.reverse(listObj);
		
		System.out.println("After Reverse: "+listObj);
		System.out.println("****************************************");
		
		ReverseComparator revobj = new ReverseComparator();
		// Ascending Order
		Comparator reverseComp = Collections.reverseOrder(revobj);
		Collections.sort(listObj, reverseComp);
		System.out.println("After Reverse Order: "+listObj);
	}

}


class ReverseComparator implements Comparator<Integer>{

	// Descending Order
	@Override
	public int compare(Integer o1, Integer o2) {
		return o2.compareTo(o1);
	}
}