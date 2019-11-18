package com.gk8.collection4.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class Gk4LinkedHashMap {

	public static void main(String[] args) {
		// Only Difference is insertion order is preserved
		Map<Integer, String> mapMainObj = new LinkedHashMap<Integer, String>();
		mapMainObj.put(1, "Gk1");
		mapMainObj.put(2, "Gk2");
		mapMainObj.put(3, "Gk3");
		
		System.out.println(mapMainObj);

	}

}
