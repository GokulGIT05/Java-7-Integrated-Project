package com.gk7.thread1.methods;

public class Gk6ThreadInterrupt {

	public static void main(String[] args) {

		InterruptThreadDemo threadDemo = new InterruptThreadDemo();
		threadDemo.start();

		for (int i = 0; i < 10; i++) {
			System.out.println("Inside Main Method");
		}
		
		threadDemo.interrupt();

	}

}

class InterruptThreadDemo extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Inside run Method");
		}
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
			System.out.println("Child Thread is Interrupted: "+e.toString());
		}
	}
}