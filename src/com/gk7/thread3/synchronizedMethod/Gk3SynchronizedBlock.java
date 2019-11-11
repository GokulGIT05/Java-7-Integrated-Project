package com.gk7.thread3.synchronizedMethod;

public class Gk3SynchronizedBlock {

	public static void main(String[] args) {

		Display2 display = new Display2();
		SynchronizeDemo3 demoObj1 = new SynchronizeDemo3(display, "Gokul");
		SynchronizeDemo3 demoObj2 = new SynchronizeDemo3(display, "Rahul");

		demoObj1.start();
		demoObj2.start();


	}
}

class SynchronizeDemo3 extends Thread {

	Display2 display;
	String name;

	public SynchronizeDemo3(Display2 display, String name) {
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

class Display2 {

	public void syncMethod(String name) throws InterruptedException {
		
		for(int i=0; i<50;i++) {
			// Assume Read Operation
			System.out.println(i);
		}
		
		// Synchronized Block
		synchronized (this) {
			for (int i = 0; i < 5; i++) {
				System.out.print("Good Morning: ");
				Thread.sleep(1000);
				System.out.println(name);
			}
		}
		
		System.out.println("End of Thread");
	}
}
