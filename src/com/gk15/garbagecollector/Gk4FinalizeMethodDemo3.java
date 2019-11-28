package com.gk15.garbagecollector;

public class Gk4FinalizeMethodDemo3 {

	static Gk4FinalizeMethodDemo3 sObj = null;

	public static void main(String[] args) throws Exception {

		Gk4FinalizeMethodDemo3 demo = new Gk4FinalizeMethodDemo3();
		System.out.println(demo.hashCode());
		demo = null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(sObj.hashCode());
		sObj = null;
		Thread.sleep(5000);
		System.out.println("Inside Main Method");

	}

	@Override
	public void finalize() {
		System.out.println("GC Calls this  Method");
		sObj = this;
	}
}
