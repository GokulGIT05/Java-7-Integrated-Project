package com.gk8.collection2.cursors;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Gk2IteratorCursorDemo {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		// List collectionObj = Arrays.asList("1","2","3"); // Should not use like this
		// for itr.remove.

		List collectionObj = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			collectionObj.add(i);
		}

		Iterator itr = collectionObj.iterator();

		while (itr.hasNext()) {
			Integer val = (Integer) itr.next();
			if (val % 2 == 0) {
				itr.remove(); // While using remove, we shouldn't use Arrays.asList type.
			} else
				System.out.println(val);

		} // End of While Loop.

		System.out.println("Afert Iterator: " + collectionObj);
		System.out.println("Implementation Class: "+itr.getClass().getName());
	}
}
