package com.gk7.thread4.daemonThread;

public class Gk1DeamonThreadDemo {

	public static void main(String[] args) {

		DaemonThread threadObj = new DaemonThread();
		threadObj.setDaemon(true);
		threadObj.start();

		for (int i = 0; i < 2; i++) {
			System.out.println("Main Thread Calls This");
		}
		System.out.println("Nature of child Thread is: "+threadObj.isDaemon());
		
		// Main Thread Completes here. So child thread wont be executed because it daemon thread.
		// Once main thread or last non-dameon threads are completed then daemon threads will be destoryed.
	}

}

class DaemonThread extends Thread {

	public void run() {

		try {

			for (int i = 0; i < 25; i++) {
				System.out.println("Priting Value in run(): " + i);
				Thread.sleep(10000); // Checked Exception. Throws IE
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}