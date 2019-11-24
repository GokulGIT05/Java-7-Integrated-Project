package com.gk07.thread8.adv.threadlocal;

public class Gk1ThreadLocalDemo {

	public static void main(String[] args) {

		ThreadLocal<String> localThreadVal = new ThreadLocal<String>();
		System.out.println(localThreadVal.get());
		localThreadVal.set("Gokul");
		System.out.println(localThreadVal.get());
		localThreadVal.remove();
		System.out.println(localThreadVal.get());
		System.out.println("*********************************");
		
		// Override default Value
		ThreadLocal<Integer> localIntThreadVal = new ThreadLocal<Integer>() {
			protected Integer initialValue() {
		        return 12345;
		    }
		};
		
		System.out.println(localIntThreadVal.get());
		localIntThreadVal.set(100);
		System.out.println(localIntThreadVal.get());
		localIntThreadVal.remove();
		System.out.println(localIntThreadVal.get());
	}
}
