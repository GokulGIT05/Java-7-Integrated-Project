package com.gk07.thread3.interthreadcommunication;

public class Gk1WaitNotifyTest {

	public static void main(String[] args) throws InterruptedException {

		InterThread threadObj = new InterThread();
		threadObj.start();

		Thread.sleep(1000); // Throws IE.

		synchronized (threadObj) {

			 threadObj.wait(); // till same object call notify, this won't execute.
			for (int i = 0; i < 10; i++) {
				System.out.println("Wait is Over!!!");
			}
		}

	}

}

class InterThread extends Thread {

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
				this.notify(); // notify waiting thread on this object

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
