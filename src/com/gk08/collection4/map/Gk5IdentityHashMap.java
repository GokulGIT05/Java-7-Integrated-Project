package com.gk08.collection4.map;

import java.util.IdentityHashMap;
import java.util.Map;

public class Gk5IdentityHashMap {

	public static void main(String[] args) {
		
		// Identity Hash Map uses "==" reference comparison for duplicate keys.
		Map<Integer, String> mapMainObj = new IdentityHashMap<Integer, String>();
		Integer i1= new Integer(10);
		Integer i2= new Integer(10);
		Integer i3=i2;
		mapMainObj.put(i1, "Gk1");
		mapMainObj.put(i2, "Gk2");
		mapMainObj.put(3, "Gk3");
		mapMainObj.put(i3, "Gk4"); // i3 Uses same reference type.

		System.out.println(mapMainObj);
	}

}
