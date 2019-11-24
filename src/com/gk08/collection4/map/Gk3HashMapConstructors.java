package com.gk08.collection4.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Gk3HashMapConstructors {

	@SuppressWarnings({ "rawtypes", "unused", "unchecked" })
	public static void main(String[] args) {
		
		// 1. Default Constructor
		Map mapObj1 = new HashMap();
		
		// 2. Constructor with initial Capacity..
		Map mapObj2 = new HashMap(20);
		
		
		// 3. Constructor with initial capacity and float fill ratio.
		Map mapObj3 = new HashMap(20,1.0f);
		
		// 4. Convert to HashMap from Other Map Obj
		Map linkedHashMapObj = new LinkedHashMap<>();
		linkedHashMapObj.put(1, "Gk1");
		
		Map mapObj4 = new HashMap<>(linkedHashMapObj);
		System.out.println(mapObj4);
		
	}
}
