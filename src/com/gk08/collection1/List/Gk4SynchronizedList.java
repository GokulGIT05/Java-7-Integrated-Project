package com.gk08.collection1.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Gk4SynchronizedList {

	public static void main(String[] args) {
		ListThreadSafeDemo thread1= new ListThreadSafeDemo();
		ListThreadSafeDemo thread2= new ListThreadSafeDemo();
		ListThreadSafeDemo thread3= new ListThreadSafeDemo();
		thread1.start();
		thread2.start();
		thread3.start();
		
	}

}

class ListThreadSafeDemo extends Thread {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void run() {
		List arrayListMainObj = new ArrayList<>();
		List threadSafe = Collections.synchronizedList(arrayListMainObj);
		threadSafe.add("GkString");
		threadSafe.add("TVL");
		for (int i = 0; i < 3; i++) {
			System.out.println("Initial ArrayList Object: " + threadSafe);
			System.out.println(Thread.currentThread().getName());
			System.out.println("************************");
		}
	}
}