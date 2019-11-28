package com.gk15.garbagecollector;

public class Gk3FinalizeMethodDemo2 {

	public static void main(String[] args) {

		Gk3FinalizeMethodDemo2 demo = new Gk3FinalizeMethodDemo2();
		demo.finalize();
		demo.finalize();
		demo.finalize();
		demo = null;

		System.gc();
		System.out.println("Inside Main Method");

	}

	@Override
	public void finalize() {
		System.out.println("GC Calls this  Method");
	}
}
