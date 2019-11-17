package com.gk8.collection2.cursors;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Gk3ListIteratorDemo {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		// Most PowerFull Cursor. It has 9 Methods, we can add and update values.
		// Bi-directional.

		List collectionObj = new ArrayList<>();

		for (int i = 100; i < 110; i++) {
			collectionObj.add(i);
		}
		// Index Starts from 0.
		// It is child interface it Iterator. So 3 Methods are applicable here also.
		
		ListIterator listItrForward = collectionObj.listIterator();
		
		// A. Forward Directions
		// 1. boolean hasNext()
		while (listItrForward.hasNext()) {
			
			// 2. Object next()
			Integer intVal = (Integer) listItrForward.next();
			System.out.println("next() Val: " + intVal);
			
			// 3. int nextIndex
			int nextIndexVal = listItrForward.nextIndex();
			System.out.println("nextIndex(): " + nextIndexVal);
		}
		System.out.println("*********End of Forward Direction*************");

		// Need to use the object which for forward direction. Then only it will work

		// B. Previous Directions.
		// 4. boolean hasPrevious()
		while (listItrForward.hasPrevious()) {
			
			// 5. Object next()
			Integer intVal = (Integer) listItrForward.previous();
			System.out.println("previous() Val: " + intVal);
			
			// 6. int nextIndex
			int prevIndexVal = listItrForward.previousIndex();
			System.out.println("previousIndex(): " + prevIndexVal);
		}
		System.out.println("**********End of Previous Direction************");

		// C. Other Methods.

		// Already Previous Operation on object is performed. So hasNext Will execute,
		// Otherwise it wont execute.Because we are using the same object.

		while (listItrForward.hasNext()) {

			// System.out.println("Inside hasNext");
			Integer intVal = (Integer) listItrForward.next();
			System.out.print(intVal);

			if (intVal == 105) {
				// 7. void remove().
				listItrForward.remove();
			}

			if (intVal == 102) {
				// 8. void add(Object o)
				listItrForward.add(222);
			}

			if (intVal == 107) {
				// 9. void set(Object o) -> To Update
				listItrForward.set(7777);
			}

		}
		System.out.println("\nCollection Final Value: " + collectionObj);
		System.out.println("Implementation Class: " + listItrForward.getClass().getName());

	}

}
