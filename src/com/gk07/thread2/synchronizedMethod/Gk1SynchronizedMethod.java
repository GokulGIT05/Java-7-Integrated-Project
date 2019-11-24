package com.gk07.thread2.synchronizedMethod;

public class Gk1SynchronizedMethod {

	public static void main(String[] args) {

		Display display = new Display();
		SynchronizeDemo demoObj1 = new SynchronizeDemo(display, "Gokul");
		SynchronizeDemo demoObj2 = new SynchronizeDemo(display, "Rahul");

		demoObj1.start();
		demoObj2.start();


	}
}

class SynchronizeDemo extends Thread {

	Display display;
	String name;

	public SynchronizeDemo(Display display, String name) {
		super();
		this.display = display;
		this.name = name;
	}

	@Override
	public void run() {

		System.out.println("Inside run Method");
		try {
			display.syncMethod(name);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

class Display {

	// This Method is Synchronized. so we will get regular output.
	public synchronized void syncMethod(String name) throws InterruptedException {

		for (int i = 0; i < 5; i++) {
			System.out.print("Good Morning: ");
			Thread.sleep(1000);
			System.out.println(name);
		}
		System.out.println("End of Thread");
	}
}
