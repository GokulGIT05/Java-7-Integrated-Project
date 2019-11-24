package com.gk08.collection8.advconcepts;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Gk1ConcurrentModificationExceptionDemo {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		
		List<String> listRef = new ArrayList<String>();
		listRef.add("A");
		listRef.add("B");
		listRef.add("C");
		listRef.add("D");
		System.out.println("The Main List is: "+listRef);
		
		ListIterator itr = listRef.listIterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
			listRef.add("E"); // java.util.ConcurrentModificationException
		}
		
		

	}

}
