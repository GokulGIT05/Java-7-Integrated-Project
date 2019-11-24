package com.gk08.collection1.List;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Gk5LinkedListConstructors {

	@SuppressWarnings({ "rawtypes", "unused", "unchecked" })
	public static void main(String[] args) {

		// There are only two constructors are present in LinkedList.

		// 1. Default Constructor
		List linkedListObj = new LinkedList<>();

		// 2. To Convert Collection Object into ArrayList
		Set setVal = new HashSet<>();
		setVal.add("1");
		setVal.add("2");
		setVal.add("3");
		setVal.add("1");
		System.out.println(setVal);
		System.out.println("------");
		List setToList = new LinkedList<>(setVal);
		System.out.println(setToList);

	}

}
