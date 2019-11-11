package com.gk7.thread1.methods;

public class Gk3ThreadJoinMethod {

	public static void main(String[] args) {

		JoinThreadDemo joinObj = new JoinThreadDemo();
		Thread joinThread = new Thread(joinObj);
		joinThread.start();
		System.out.println("This is Main Thread");
		
		try {
			// Main Thread Calls this. So till Child Completes, main has to wait
			joinThread.join(); // Throws InterruptedExceptioin
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
		
		// Main Thread Executeafter ci
		for (int i = 0; i < 10; i++) {
			System.out.println("Inside Main Method");
		}
	}
}

class JoinThreadDemo implements Runnable {

	@Override
	public void run() {
		System.out.println("This is Child Thread");
		for (int i = 0; i < 10; i++) {
			System.out.println("Inside Run() Method: ");
		}
	}
}
