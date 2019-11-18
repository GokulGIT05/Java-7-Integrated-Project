package com.gk8.collection4.map;

import java.util.Map;
import java.util.WeakHashMap;

public class Gk6WeakHashMap {

	public static void main(String[] args) throws InterruptedException {

		// The Only Difference is w.r.t Garbage Collector only.
		// Other Hashmap's dominates GC. But in the case of weakHashMap GC dominates
		
		Map<TempClassForWHM,String> weakHashObj = new WeakHashMap<TempClassForWHM,String>();		
		TempClassForWHM temp = new TempClassForWHM();
		
		weakHashObj.put(temp, "First");
		weakHashObj.put(temp, "Second");
		
		System.out.println("The Main Object is: "+weakHashObj);
		
		temp=null;
		
		System.out.println("After reference Object is null: "+weakHashObj);
		
		System.gc();
		Thread.sleep(1000); // For GC to execute finalize()
		
		System.out.println("After GC Called: "+weakHashObj);
		
		
	}

}

class TempClassForWHM{
	
	public String toString() {
		return "Demo String";
	}
	
	@Override
	public void finalize() {
		System.out.println("Before GC Call, this method will execute.");
	}
	
}