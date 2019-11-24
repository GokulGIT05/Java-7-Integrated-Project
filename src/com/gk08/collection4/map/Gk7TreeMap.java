package com.gk08.collection4.map;

import java.util.Comparator;
import java.util.TreeMap;

public class Gk7TreeMap {

	public static void main(String[] args) {
		
		// 1. Default Natural Sorting Order.
		TreeMap<String, String> treeMapObj = new TreeMap<>();
		treeMapObj.put("1", "A");
		treeMapObj.put("3", "C");
		treeMapObj.put("5", "E");
		treeMapObj.put("4", "D");
		treeMapObj.put("2", "B");
		// Alphabetical Order.
		System.out.println("The TreeMap Values are Using DNSO: "+treeMapObj);
		
		
		// 2. Customized Sorting Order.
		CustomizedSortingTreeMap comparatorObj = new CustomizedSortingTreeMap();
		TreeMap<String, String> treeMapObjUsingComparator = new TreeMap<>(comparatorObj);
		treeMapObjUsingComparator.put("1", "A");
		treeMapObjUsingComparator.put("3", "C");
		treeMapObjUsingComparator.put("5", "E");
		treeMapObjUsingComparator.put("4", "D");
		treeMapObjUsingComparator.put("2", "B");
		// Reverse Order
		System.out.println("The TreeMap Values are Using Comparator: "+treeMapObjUsingComparator);
	}

}

class CustomizedSortingTreeMap implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		return o2.compareTo(o1);
	}
	
	
}
