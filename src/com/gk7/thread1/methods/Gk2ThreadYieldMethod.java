package com.gk7.thread1.methods;

public class Gk2ThreadYieldMethod {

	public static void main(String[] args) {

		ThreadPreventDemo runThread = new ThreadPreventDemo();
		Thread threadObj = new Thread(runThread);
		threadObj.start();

		for (int i = 0; i < 10; i++) {
			System.out.println("Inside MAIN Method");
		}
	}

}

class ThreadPreventDemo implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Inside Thread Class Run() Method");
			// 1. yield() Method.
			Thread.yield(); // It will allow other thread to complete first
		}
	}

}