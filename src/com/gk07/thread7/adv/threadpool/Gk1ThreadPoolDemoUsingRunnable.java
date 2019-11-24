package com.gk07.thread7.adv.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

public class Gk1ThreadPoolDemoUsingRunnable {

	public static void main(String[] args) {

		ThreadPoolClass[] objArray = { new ThreadPoolClass("Gk1"), new ThreadPoolClass("Gk2"),
				new ThreadPoolClass("Gk3"), new ThreadPoolClass("Gk4"), new ThreadPoolClass("Gk5"),
				new ThreadPoolClass("Gk6") };
		
		// ThreadPool is otherwise called as Executor Framework.
		ExecutorService service = Executors.newFixedThreadPool(3);
		
		// Inorder to submit job individually, doing it by loop.
		
		for(ThreadPoolClass eachThreadPool : objArray) {
			service.submit(eachThreadPool);
		}
		
		// It is compulsory to close the thread.
		service.shutdown();
		
	}

}

class ThreadPoolClass implements Runnable {

	String name;
	static ReentrantLock lockObj = new ReentrantLock();

	public ThreadPoolClass(String name) {
		super();
		this.name = name;
	}

	@Override
	public void run() {
		lockObj.lock();
		System.out.println("Started by: "+Thread.currentThread().getName());
		for (int i = 0; i < 2; i++) {
			System.out.println("Inside Run Method: "+i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Ended by: "+Thread.currentThread().getName());
		lockObj.unlock();
	}

}