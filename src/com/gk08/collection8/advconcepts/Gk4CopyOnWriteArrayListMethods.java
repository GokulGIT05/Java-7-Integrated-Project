package com.gk08.collection8.advconcepts;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Gk4CopyOnWriteArrayListMethods {

	public static void main(String[] args) {

		CopyOnWriteArrayList<String> mainListObj = new CopyOnWriteArrayList<String>();
		mainListObj.add("A");
		mainListObj.add("B");
		System.out.println("The Main List is: " + mainListObj);
		System.out.println("***************************************");

		// Only Two Specific Methods.
		// 1. boolean addIfAbsent(Object o);
		System.out.println("1. boolean addIfAbsent(Object o)");
		mainListObj.addIfAbsent("A");
		mainListObj.addIfAbsent("C");
		System.out.println("The Main List is: " + mainListObj);
		System.out.println("***************************************");

		// 2. int addAllAbsent(Collection c) -> Return number of added Objects
		System.out.println("2. int addAllAbsent(Collection c)");
		List<String> normalAl = new ArrayList<String>();
		normalAl.add("A");
		normalAl.add("D");

		int numOfObjectAdded = mainListObj.addAllAbsent(normalAl);
		System.out.println("numOfObjectAdded: " + numOfObjectAdded);
		System.out.println("The Main List is: " + mainListObj);
		System.out.println("***************************************");

		// Iterator .remove method is not present in CopyOnWriteArrayList
		
		Iterator<String> itr = mainListObj.iterator();
		while (itr.hasNext()) {
			String val = itr.next();
			if (val.equals("A")) {
				itr.remove(); // java.lang.UnsupportedOperationException
			}

		}

	}

}
