package com.gk7.thread1;

public class Gk1ThreadDemoUsingThreadClass {

	public static void main(String[] args) {

		// Creating an object for the class which extends thread.
		ThreadDemo testObj = new ThreadDemo();
		
		testObj.start(); // STARTING THREAD

		/*
		 * testObj.run(); // Calls like a normal method
		 */

		for (int i = 0; i < 10; i++) {
			System.out.println("MainTHREAD - Value: " + i);
		}

		/*
		 * testObj.start(); // Illegal State Exception. If we tryin to restart the same
		 * thread.
		 */
	}

}

class ThreadDemo extends Thread {

	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {
			System.out.println("ThreadDemo - Value: " + i);
		}

	}

}