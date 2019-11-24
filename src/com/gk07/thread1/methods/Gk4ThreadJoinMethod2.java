package com.gk07.thread1.methods;

public class Gk4ThreadJoinMethod2 {

	// To Run Main Thread First and Child Thread Second
	public static void main(String[] args) {

		JoinThreadDemo1.mainThread = Thread.currentThread(); 
		
		JoinThreadDemo1 joinObj = new JoinThreadDemo1();
		Thread joinThread = new Thread(joinObj);
		joinThread.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Inside Main Method");
		}
	}
}

class JoinThreadDemo1 implements Runnable {
	
	public static Thread mainThread = null;
	
	@Override
	public void run() {
		
		try {
			mainThread.join();  // child thread calls this join on mainThread
			// First Main Method will execute
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		for (int i = 0; i < 10; i++) {
			System.out.println("Inside Run() Method: ");
		}
	}
}
