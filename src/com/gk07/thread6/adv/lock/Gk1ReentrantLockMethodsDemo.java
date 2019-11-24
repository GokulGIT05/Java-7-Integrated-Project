package com.gk07.thread6.adv.lock;

import java.util.concurrent.locks.ReentrantLock;

public class Gk1ReentrantLockMethodsDemo {

	public static void main(String[] args) {
		
		ReentrantLock lockObj = new ReentrantLock();
		lockObj.lock();
		lockObj.lock();
		
		// Different Methods.
		System.out.println("lockObj.isLocked(): "+ lockObj.isLocked());
		System.out.println("lockObj.isHeldByCurrentThread(): "+lockObj.isHeldByCurrentThread());
		System.out.println("lockObj.getQueueLength(): "+ lockObj.getQueueLength());
		System.out.println("lockObj.getHoldCount(): "+lockObj.getHoldCount());
		lockObj.unlock();
		System.out.println("lockObj.getHoldCount(): "+lockObj.getHoldCount());
		lockObj.unlock();
		System.out.println("lockObj.getHoldCount(): "+lockObj.getHoldCount());
		System.out.println("lockObj.isLocked(): "+ lockObj.isLocked());
		System.out.println("lockObj.isFair(): "+lockObj.isFair());
	}

}
