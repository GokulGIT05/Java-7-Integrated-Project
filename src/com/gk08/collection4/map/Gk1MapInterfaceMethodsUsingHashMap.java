package com.gk08.collection4.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Gk1MapInterfaceMethodsUsingHashMap {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {

		// Map mapObj = new HashMap();
		Map<Integer, String> mapMainObj = new HashMap<Integer, String>();
		mapMainObj.put(1, "Gk1");
		mapMainObj.put(2, "Gk2");
		mapMainObj.put(3, "Gk3");
		mapMainObj.put(3, "Gk4"); // Duplicate Key.
		mapMainObj.put(4, null);
		mapMainObj.put(5, null);
		mapMainObj.put(null, null);
		mapMainObj.put(null, "Gk4");
		mapMainObj.put(null, "Gk5");
		System.out.println("The Main Map Object: " + mapMainObj);
		System.out.println("*****************************************");

		// Map 8 Methods

		// 1. Object put(Object key, Object value)
		Object returnValue = mapMainObj.put(10, "Key-Value");
		System.out.println("1. Object put(Object key, Object value): " + returnValue);
		System.out.println("The Main Map Object: " + mapMainObj);
		// If key is already present, then return old value and update the new value
		Object returnOldVal = mapMainObj.put(10, "New Value");
		System.out.println("1. Object put(Object key, Object value):returnOldVal: " + returnOldVal);
		System.out.println("The Main Map Object: " + mapMainObj);
		System.out.println("*****************************************");

		// 2. void putAll(Map m)
		Map<Integer, String> putAllObj = new LinkedHashMap<>();
		putAllObj.put(11, "LinkedHashMap1");
		putAllObj.put(12, "LinkedHashMap2");
		putAllObj.put(13, "LinkedHashMap3");

		mapMainObj.putAll(putAllObj);
		System.out.println("2. void putAll(Map m)");
		System.out.println("The Main Map Object: " + mapMainObj);
		// To Test with Key variation.
		Map<String, Integer> keyDiffTest = new HashMap<>();
		keyDiffTest.put("PuttAllTest1", 1);
		// mapMainObj.putAll(keyDiffTest); // CE: The method putAll(Map<? extends
		// Integer,? extends String>) in the type
		// Map<Integer,String> is not applicable for the arguments (Map<String,Integer>)
		System.out.println("*****************************************");

		// 3. Object get(Object key);
		Object returnNullVal = mapMainObj.get(5);
		Object returnVal = mapMainObj.get(2);
		System.out.println("3. Object get(Object key): " + returnNullVal);
		System.out.println("3. Object get(Object key): " + returnVal);
		System.out.println("*****************************************");

		// 4. Object remove(Object key);
		Object removedVal = mapMainObj.remove(2);
		System.out.println("4. Removed Value is: " + removedVal);
		System.out.println("The Main Map Object: " + mapMainObj);
		System.out.println("*****************************************");

		// 5. boolean containsKey(Object key).
		boolean is3KKey = mapMainObj.containsKey(3);
		System.out.println("5. boolean containsKey(Object key): is3KKey: " + is3KKey);
		boolean is55Key = mapMainObj.containsKey(55);
		System.out.println("5. boolean containsKey(Object key): is55Key: " + is55Key);
		System.out.println("*****************************************");

		// 6. boolean isEmpty()
		boolean emptyCheck = mapMainObj.isEmpty();
		System.out.println("6. boolean isEmpty(): " + emptyCheck);
		System.out.println("*****************************************");

		// 7. int size()
		int sizeOfMapObj = mapMainObj.size();
		System.out.println("7. int size(): " + sizeOfMapObj);
		System.out.println("*****************************************");

		// 8. void clear()
		mapMainObj.clear();
		System.out.println("8. void clear(): ");
		System.out.println("*****************************************");
		
		// Loading Values again.
		mapMainObj.put(1, "Gk1");
		mapMainObj.put(2, "Gk2");
		mapMainObj.put(3, "Gk3");
		mapMainObj.put(3, "Gk4");
		System.out.println("The Main Map Object: " + mapMainObj);
		
		System.out.println("*** COLLECTION VIEW OF MAPS ***");
		// 9. Set keySet()
		Set keySetFromMap = mapMainObj.keySet();
		System.out.println("9. Set keySet(): "+keySetFromMap);
		System.out.println("*****************************************");
		
		// 10. Collection values()
		Collection mapValues = mapMainObj.values();
		System.out.println("10. Collection values(): "+mapValues);
		System.out.println("*****************************************");
		
		// 11. Set entrySet();
		Set entrySetKeyVal = mapMainObj.entrySet();
		System.out.println("11. Set entrySet(): "+entrySetKeyVal);
				
	}

}
