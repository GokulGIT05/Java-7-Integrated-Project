package com.gk8.collection4.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;


import java.util.Set;

public class Gk2MapEntryMethodsAndLoopUsingHashMap {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		
		// 3 Specific Methods for Entry Object
		Map<Integer, String> mapMainObj = new HashMap<Integer, String>();
		mapMainObj.put(1, "Gk1");
		mapMainObj.put(2, "Gk2");
		mapMainObj.put(3, "Gk3");
		System.out.println("The Main Map Object: " + mapMainObj);
		System.out.println("*****************************************");
		
		// Step 1: To Access entry Object, need to convert into set.
		Set setVal = mapMainObj.entrySet();
		
		// Step 2: Set to  Iterator Object
		Iterator itr = setVal.iterator();
		
		while(itr.hasNext()) {
			Map.Entry<Integer, String> entryObj = (Entry<Integer, String>) itr.next();
			
			// 1. Object getKey()
			Object key = entryObj.getKey();
			System.out.println("1. Object getKey(): "+key);
			
			// 2. Object getValue()
			Object value = entryObj.getValue();
			System.out.println("2. Object getValue(): "+value);
			
			// 3. Object setValue(Object newValue)
			Object updateVal = entryObj.setValue("RK1");
			System.out.println("3. Object setValue(Object newValue): "+updateVal);
			System.out.println("*****************************************************");
		}
		
		System.out.println("The Main Map Object: " + mapMainObj);
		
		System.out.println("**********Using For Loop******************");
		
		for(Map.Entry<Integer, String> eachEntry : mapMainObj.entrySet()) {
			
			System.out.println("Key: "+eachEntry.getKey() +", Value: "+eachEntry.getValue());
		}
		
	}

}
