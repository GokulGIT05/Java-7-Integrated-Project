package com.gk7.thread3.synchronizedMethod;

public class Gk2SynchronizedMethod2 {

	public static void main(String[] args) {

		SynchronizeDemo1 threadObj1 = new SynchronizeDemo1("Gokul");
		SynchronizeDemo1 threadObj2 = new SynchronizeDemo1("Rahul");

		threadObj1.start();
		threadObj2.start();

	}
}

class SynchronizeDemo1 extends Thread {

	String name;

	public SynchronizeDemo1(String name) {
		super();
		this.name = name;
	}

	@Override
	public void run() {

		syncMethodDemo(name);
	}

	// This will give irregular output. Because threads are operating in different
	// Object
	private synchronized void syncMethodDemo(String name) {

		for (int i = 0; i < 10; i++) {

			System.out.print("Good Morning: ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println(name);
		}
	}

}
