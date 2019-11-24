package com.gk08.collection8.advconcepts;

import java.util.concurrent.CopyOnWriteArraySet;

public class Gk6CopyOnWriteArraySet {

	public static void main(String[] args) {

		// No Specific methods are available. Need to Use Collection and Set interface
		// methods.
		CopyOnWriteArraySet<String> mainSetObj = new CopyOnWriteArraySet<String>();
		mainSetObj.add("A");
		mainSetObj.add("C");
		mainSetObj.add("B");
		mainSetObj.add("D");

		System.out.println(mainSetObj);

	}
}
