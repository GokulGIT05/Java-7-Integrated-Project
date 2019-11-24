package com.gk08.collection8.advconcepts;

import java.util.concurrent.CopyOnWriteArrayList;

public class Gk5CopyOnWriteALThreadDemo extends Thread {

	static CopyOnWriteArrayList<String> MainCopyOnWAL = new CopyOnWriteArrayList<String>();
//	static ArrayList<String> MainCopyOnWAL = new ArrayList<String>();

	public static void main(String[] args) {
		
		MainCopyOnWAL.add("A");
		MainCopyOnWAL.add("B");

		Gk5CopyOnWriteALThreadDemo mainThreadObj = new Gk5CopyOnWriteALThreadDemo();
		mainThreadObj.start(); // Child thread Starts

		for (String localRef : MainCopyOnWAL) {
			System.out.println("Main Thread: The Value is: " + localRef);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
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
		MainCopyOnWAL.add("C");
	}

}
