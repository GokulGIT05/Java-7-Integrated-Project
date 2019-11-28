package com.gk15.garbagecollector;

public class Gk5FinalizeMethodDemo4 {

	static int count = 0;

	public static void main(String[] args) throws Exception {

		for (int i = 0; i <= 1000000; i++) {
			Gk5FinalizeMethodDemo4 d = new Gk5FinalizeMethodDemo4();
			d = null;
		}
	}

	@Override
	public void finalize() {
		System.out.println("GC Calls this  Method: " + ++count);
	}
}
