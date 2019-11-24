package com.gk08.collection8.advconcepts;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class Gk3ConcurrentHashMapDemo extends Thread {

	static ConcurrentHashMap<Integer, String> mapMainObj = new ConcurrentHashMap<Integer, String>();
// 	static HashMap<Integer, String> mapMainObj = new HashMap<Integer, String>();

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		mapMainObj.put(1, "One");
		mapMainObj.putIfAbsent(2, "Two");

		Gk3ConcurrentHashMapDemo mainThreadObj = new Gk3ConcurrentHashMapDemo();
		mainThreadObj.start(); // Child thread Starts

		for (Map.Entry localRef : mapMainObj.entrySet()) {

			System.out.println("Key: " + localRef.getKey() + "|| Value: " + localRef.getValue());
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		// Other Way of Iterating.
		Set entrySetVal = mapMainObj.keySet();
		Iterator itr = entrySetVal.iterator();

		while (itr.hasNext()) {
			Integer key = (Integer) itr.next();
			System.out.println("The Key is: " + key);
		}
	}

	@Override
	public void run() {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Child Thread is Updaing the Concurrent HashMap Object");
		mapMainObj.put(3, "Three");

	}

}
