package com.gk07.thread6.adv.lock;

import java.util.concurrent.locks.ReentrantLock;

public class Gk2ReentrantLockOnSynchronizedDemo {

	// This is used to give demo, how reentrant lock replaces synchronized method.
	public static void main(String[] args) {

		DisplayThread display = new DisplayThread();
		
		// We are passing same display object to the different object.
		// if Different Display object means we might get irregular output.
		ReentrantLockDemo1 lockDemo1 = new ReentrantLockDemo1(display);
		ReentrantLockDemo1 lockDemo2 = new ReentrantLockDemo1(display);
		ReentrantLockDemo1 lockDemo3 = new ReentrantLockDemo1(display);

		Thread theThreadObj1 = new Thread(lockDemo1);
		Thread theThreadObj2 = new Thread(lockDemo2);
		Thread theThreadObj3 = new Thread(lockDemo3);

		theThreadObj1.start();
		theThreadObj2.start();
		theThreadObj3.start();

	}

}

class ReentrantLockDemo1 implements Runnable {

	DisplayThread toCallDisplayObj;

	public ReentrantLockDemo1(DisplayThread toCallDisplayObj) {
		super();
		this.toCallDisplayObj = toCallDisplayObj;
	}

	@Override
	public void run() {
		toCallDisplayObj.callingFromThreadRunMethod();
	}

}

class DisplayThread {
	ReentrantLock lockObj = new ReentrantLock();

	public void callingFromThreadRunMethod() {
		// To avoid Irregular Output.
		lockObj.lock();
		for (int i = 0; i <= 5; i++) {
			System.out.print("Good Morning: ");

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println("Gokul: " + i);
		}
		lockObj.unlock();

	}

}