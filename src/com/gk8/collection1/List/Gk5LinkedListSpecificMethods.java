package com.gk8.collection1.List;

import java.util.LinkedList;

public class Gk5LinkedListSpecificMethods {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {

		// Linked List is Child interface of List, so 12+8 = 20 Methods of Collection
		// Interface and List interface methods are applicable for LinkedList.

		// List linkedListMainObj = new LinkedList<>();
		LinkedList linkedListMainObj = new LinkedList<>();
		linkedListMainObj.add("GkString");
		linkedListMainObj.add("TVL");
		linkedListMainObj.add(27);
		linkedListMainObj.add(36);
		linkedListMainObj.add("TVL");
		linkedListMainObj.add(99);
		linkedListMainObj.add(null);
		linkedListMainObj.add("TVL");
		System.out.println("Initial LinkedList Object: " + linkedListMainObj);
		System.out.println("***********************************************");

		// Linked List has its specific 6 methods.
		// In order to call linked list specific methods we need to have LinkedList type
		// reference variable.
		// Its because, we cannot call child methods by using parent reference variable.
		
		// 1. void addFirst(object o);
		linkedListMainObj.addFirst("First");
		System.out.println("1. void addFirst(object o): ");
		System.out.println("linkedListMainObj is: "+linkedListMainObj);
		System.out.println("***********************************************");
		
		// 2. void addLast(Object o)
		linkedListMainObj.addLast("Last");
		System.out.println("1. void addLast(object o): ");
		System.out.println("linkedListMainObj is: "+linkedListMainObj);
		System.out.println("***********************************************");
		
		// 3. Object getFirst()
		Object getFirstRef= linkedListMainObj.getFirst();
		System.out.println("3. Object getFirst(): "+getFirstRef);
		System.out.println("***********************************************");
		
		// 4. Object getLast()
		Object getLastRef = linkedListMainObj.getLast();
		System.out.println("4. Object getLast(): "+getLastRef);
		System.out.println("***********************************************");
		
		// 5. Object removeFirst()
		Object remFirst = linkedListMainObj.removeFirst();
		System.out.println("5. Object removeFirst(): "+remFirst);
		System.out.println("linkedListMainObj is: "+linkedListMainObj);
		System.out.println("***********************************************");
		
		// 6. Object removeLast()
		Object remLast = linkedListMainObj.removeLast();
		System.out.println("6. Object removeLast(): "+remLast);
		System.out.println("linkedListMainObj is: "+linkedListMainObj);
		System.out.println("***********************************************");
		
	}
}







