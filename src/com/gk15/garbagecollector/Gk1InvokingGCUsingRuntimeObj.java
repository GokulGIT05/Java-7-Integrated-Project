package com.gk15.garbagecollector;

import java.util.Date;

public class Gk1InvokingGCUsingRuntimeObj {

	public static void main(String[] args) {

		Runtime runtimeObj = Runtime.getRuntime();
		System.out.println("Total Memory Used: " + runtimeObj.totalMemory());
		System.out.println("Available Free Memory: " + runtimeObj.freeMemory());

		for (int i = 0; i <= 10000; i++) {
			Date dateObj = new Date();
			dateObj = null;
		}

		System.out.println("Total Memory Used: " + runtimeObj.freeMemory());
		runtimeObj.gc(); // Calling GC
		System.out.println("Available Free Memory: " + runtimeObj.freeMemory());
		System.out.println("End of Main");
	}

}
