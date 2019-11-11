package com.gk7.thread;

public class Gk2ThreadDemoUsingRunnableInterface {

	public static void main(String[] args) {

		// 1. Creating an Object for the Implemented Class.
		ThreadDemoUsingInterface object = new ThreadDemoUsingInterface();
		
		// 2. Creating a Thread Object and Pass the Runnable Implemented object as
		// parameter
		Thread theThreadClass = new Thread(object);
		
		// 3. So, now thread is registered in thread scheduler.
		theThreadClass.start();

		for (int i = 0; i < 10; i++) {
			System.out.println("MainTHREAD - Value: " + i);
		}
		
		System.out.println("The Thread Name: "+Thread.currentThread().getName());
	}

}

class ThreadDemoUsingInterface implements Runnable {

	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {
			System.out.println("ThreadDemo - Value: " + i);
		}
		
		Thread.currentThread().setName("Gk Thread");
		System.out.println(Thread.currentThread().getName());
	}
}
