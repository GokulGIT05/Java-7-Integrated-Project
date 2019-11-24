package com.gk08.collection1.List;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Gk3ArrayListConstructors {

	@SuppressWarnings({ "unused", "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		// There are 3 Constructors are in ArrayList Class.
		
		// 1. Default Constructor
		List defaultConstructor = new ArrayList<>();
		
		
		// 2. To Define Initial Capacity
		List alWithInitialCapacity = new ArrayList<>(25); // Initial Capacity is 25.
		// To find the initial capacity for ArrayList, we need to use Reflection API concepts.
		// Link: https://www.javacodeexamples.com/java-arraylist-capacity/1016
		
		
		// 3. To Convert Collection Object into ArrayList
		Set setVal = new HashSet<>();
		setVal.add("1");
		setVal.add("2");
		setVal.add("3");
		setVal.add("1");
		System.out.println(setVal);
		System.out.println("------");
		
		List setToList = new ArrayList<>(setVal);
		System.out.println(setToList);
		
	}
}







