package com.gk08.collection8.advconcepts;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Gk2ConcurrentMapMethods {

	public static void main(String[] args) {

		// There are 3 Methods Present in ConcurrentMap Interface.
		Map<Integer, String> mainMapObj = new ConcurrentHashMap<Integer, String>();
		mainMapObj.put(1, "One");
		mainMapObj.put(2, "Two");
		mainMapObj.put(3, "Three");

		// 1. Object putIfAbsent(Object key,Object Value)
		System.out.println("1. Object putIfAbsent(Object key,Object Value)");
		Object returnOldVal = mainMapObj.putIfAbsent(2, "TwoTwo");
		System.out.println(returnOldVal);
		System.out.println("Main Map Object: " + mainMapObj);

		// Adding new Value so return null.
		Object returnVal = mainMapObj.putIfAbsent(4, "Four");
		System.out.println(returnVal); // Returns null
		System.out.println("Main Map Object: " + mainMapObj);
		System.out.println("*************************************");

		// 2. boolean remove(Object key, Object Value)
		// Remove only both key and value as a pair.
		System.out.println("2. boolean remove(Object key, Object Value)");
		boolean isRemoved = mainMapObj.remove(4, "Four");
		System.out.println(isRemoved);

		boolean isRemoved2 = mainMapObj.remove(2, "2"); // Value is different, so won't execute
		System.out.println(isRemoved2);
		System.out.println("Main Map Object: " + mainMapObj);
		System.out.println("*************************************");
		
		
		// 3. boolean replace(Object key, Object oldValue, Object newValue)
		System.out.println("3. boolean replace(Object key, Object oldValue, Object newValue)");
		boolean isReplaced = mainMapObj.replace(1, "One", "First");
		System.out.println(isReplaced);
		
		boolean isReplaced2 = mainMapObj.replace(3, "tHREE", "Third"); // Value is not matched.
		System.out.println(isReplaced2);
		
		System.out.println("Main Map Object: " + mainMapObj);
		System.out.println("*************************************");
		
		
	}

}
