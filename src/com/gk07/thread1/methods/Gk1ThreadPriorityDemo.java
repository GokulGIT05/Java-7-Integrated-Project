package com.gk07.thread1.methods;

public class Gk1ThreadPriorityDemo {

	public static void main(String[] args) {

		ThreadDemo obj = new ThreadDemo();
		// Setting Thread Priority
		obj.setPriority(1);
		obj.start();

		System.out.println("Thread in Main Method: Name: " + Thread.currentThread().getName());
		for (int i = 0; i < 10; i++) {
			// setPriority for Thread
			Thread.currentThread().setPriority(10);

			System.out.println("Thread is Inside MAIN Method");

		}

		System.out.println("****************");
		System.out.println("Thread Class Priorty Methods");
		System.out.println("Thread.MAX_PRIORITY: " + Thread.MAX_PRIORITY);
		System.out.println("Thread.MIN_PRIORITY: " + Thread.MIN_PRIORITY);
		System.out.println("Thread.NORM_PRIORITY: " + Thread.NORM_PRIORITY);
		System.out.println("****************");
	}
}

class ThreadDemo extends Thread {

	@Override
	public void run() {

		System.out.println("Thread in ThreadClass run() method Name: " + Thread.currentThread().getName());
//		Thread.currentThread().setPriority(1);
		for (int i = 0; i < 10; i++) {
			System.out.println("Inside Thread Run Method");
		}

	}
}