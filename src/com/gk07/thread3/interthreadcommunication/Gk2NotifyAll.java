package com.gk07.thread3.interthreadcommunication;

public class Gk2NotifyAll {

	public static void main(String[] args) throws InterruptedException {

		InterThread1 threadObj1 = new InterThread1();
		InterThread1 threadObj2 = new InterThread1();
		threadObj1.start();
		threadObj2.start();
		Thread.sleep(1000); // Throws IE.

		synchronized (threadObj2) {

			threadObj2.wait(); // threadObj1 call notifyAll. so this thread will start execute
			for (int i = 0; i < 10; i++) {
				System.out.println("Wait is Over!!!");
			}
		}
		
		

	}

}

class InterThread1 extends Thread {

	@Override
	public void run() {

		// this -> Means which object has call this it owns lock.
		synchronized (this) {
			for (int i = 0; i <= 25; i++) {
				System.out.println("Simply Printing values i: " + i);
			}

			try {
				Thread.sleep(10000); // throw IE
				for (int i = 0; i < 5; i++) {
					System.out.println("After Sleep: " + i);
				}
				// Need to enclose in synchronized Area
				this.notifyAll(); // notifyAll -> waiting thread on this object

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
