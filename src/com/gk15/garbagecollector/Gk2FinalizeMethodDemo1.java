package com.gk15.garbagecollector;

public class Gk2FinalizeMethodDemo1 {

public static void main(String[] args) {
		
		String s = new String("Gk1");
		s = null;
		
		Gk2FinalizeMethodDemo1 demo=new Gk2FinalizeMethodDemo1();
		demo=null;
		
		System.gc();
		System.out.println("Inside Main Method");
		
	}
	
	@Override
	public void finalize() {
		System.out.println("GC Calls this  Method");
	}

}
