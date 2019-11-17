package com.gk8.collection3.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class Gk2LinkedHashSet {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		// Child of Hash Set. except insertion order is preserved everything is same as
		// hashset.

		Set linkedHashSetObj = new LinkedHashSet<>();
		linkedHashSetObj.add("First");
		linkedHashSetObj.add("Second");
		linkedHashSetObj.add("Third");
		linkedHashSetObj.add("4");
		linkedHashSetObj.add("ZZZZ");
		linkedHashSetObj.add("true");

		System.out.println("The Values are inserted as per inserion order: " + linkedHashSetObj);

	}

}
