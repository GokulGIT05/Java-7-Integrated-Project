package com.gk8.collection1.List;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Gk2ListInterfaceMethodsUsingAL {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {

		// List Interface 8 Methods.
		List arrayListMainObj = new ArrayList<>();
		arrayListMainObj.add("GkString");
		arrayListMainObj.add("TVL");
		arrayListMainObj.add(27);
		arrayListMainObj.add(36);
		arrayListMainObj.add(99);
		arrayListMainObj.add("TVL");
		System.out.println("Initial ArrayList Object: " + arrayListMainObj);
		System.out.println("***********************************************");

		// 1. void add(int index, Object element);
		arrayListMainObj.add(1, "Bang"); // Index in ArrayList Starts from 0
		System.out.println("1. void add(int index, Object element): " + arrayListMainObj);
		System.out.println("***********************************************");

		// 2. boolean addAll(int index, Collections elements);
		List addAllObj = new ArrayList<>();
		addAllObj.add("Rk1");
		addAllObj.add("Rk2");
		addAllObj.add("TVL");
		arrayListMainObj.addAll(3, addAllObj);
		System.out.println("2. boolean addAll(int index, Collections elements): " + arrayListMainObj);
		System.out.println("***********************************************");

		// 3. Object get(int index);
		Object fromList = arrayListMainObj.get(1);
		System.out.println("3. Object get(int index): " + fromList);
		System.out.println("***********************************************");

		// 4. Object remove(int index)
		// Remove methods present in Collection interface too. But it will take object
		// as argument and returns boolean.
		Object removedVal = arrayListMainObj.remove(1);
		System.out.println("4. Object remove(int index): "+removedVal);
		System.out.println("After Removed MainList is: "+arrayListMainObj);
		System.out.println("***********************************************");
		
		// 5. Object set(int index, Object newVal) 
		// Replace old value with new one and returns old value.
		Object replacedVal = arrayListMainObj.set(0, "GkReplaced");
		System.out.println("5. Object set(int index, Object newVal): "+replacedVal);
		System.out.println("After set MainList is: "+arrayListMainObj);
		System.out.println("***********************************************");
		
		// 6. int indexOf(Object o)
		int indexOfFirstOccurence = arrayListMainObj.indexOf("TVL");
		System.out.println("6. int indexOf(Object o): "+indexOfFirstOccurence);
		System.out.println("***********************************************");
		
		// 7. int lastIndexOf(Object o)
		int lastIndexOfObject = arrayListMainObj.lastIndexOf("TVL");
		System.out.println("7. int lastIndexOf(Object o): "+lastIndexOfObject);
		System.out.println("***********************************************");
		
		// 8. ListIterator listIterator();
		ListIterator listItr = arrayListMainObj.listIterator();
		System.out.println("8. ListIterator listIterator()");
		while (listItr.hasNext()) {
			Object object = (Object) listItr.next();
			System.out.print(object+" ");
		}
		
	}

}
