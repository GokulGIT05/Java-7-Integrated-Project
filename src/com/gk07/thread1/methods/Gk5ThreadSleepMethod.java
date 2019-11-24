package com.gk07.thread1.methods;

public class Gk5ThreadSleepMethod {

	public static void main(String[] args) {

		SleepThread sleepObj = new SleepThread();
		Thread threadObj = new Thread(sleepObj);
		threadObj.start();

		try {
			Thread.sleep(1000);
			// Main Thread is sleeping. so Child Thread (Run) will execute first
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for (int i = 0; i < 10; i++) {
			System.out.println("Inside Main Method");
		}
	}

}

class SleepThread implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Inside Run() Method: ");
		}
	}

}