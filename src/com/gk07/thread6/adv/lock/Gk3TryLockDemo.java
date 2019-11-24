package com.gk07.thread6.adv.lock;

import java.util.concurrent.locks.ReentrantLock;

public class Gk3TryLockDemo {

	public static void main(String[] args) {
		TryLockDemo thread1= new TryLockDemo("TryLockThread1");
		TryLockDemo thread2= new TryLockDemo("TryLockThread2");
		thread1.start();
		thread2.start();
		
	}
}

class TryLockDemo extends Thread {

	// Only one copy will be created, even we are creating multiple object for the same thread.
	// Need to Understand More, why really we need static
	static ReentrantLock lockObj = new ReentrantLock();

	// Default Constructor
	public TryLockDemo() {
		
	}
	
	public TryLockDemo(String string) {
		super(string);
		// Passing the String to Thread Class Constructor
	}
	
	@Override
	public void run() {

		if (lockObj.tryLock()) {
			for (int i = 1; i < 5; i++) {
				System.out.print("Good Morning: ");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Gokul: " + i);
			}
			lockObj.unlock();
		} else {
			System.out.println("Thread didnt get the Lock");
			System.out.println("Thread Name: "+Thread.currentThread().getName());
		}
	}
}