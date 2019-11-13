package com.gk7.thread7.adv.threadpool;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Gk2ThreadPoolDemoUsingCallable {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws InterruptedException, ExecutionException {

		CallableDemo[] objArrays = { new CallableDemo(1), new CallableDemo(2), new CallableDemo(3), new CallableDemo(4),
				new CallableDemo(5) };
		
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		
		for(CallableDemo callRef : objArrays) {
		//	Future<CallableDemo> theReturnVal = executorService.submit(callRef);
			Future theReturnVal = executorService.submit(callRef);
			System.out.println("Input val: "+callRef.numvalueFromObj+" ::: "+"OutputVal: "+theReturnVal.get());
		}
		
		// Mandatory to shutdown
		executorService.shutdown();

	}

}

class CallableDemo implements Callable {

	int numvalueFromObj;

	public CallableDemo(int numvalueFromObj) {
		super();
		this.numvalueFromObj = numvalueFromObj;
	}
	
	// IS CALLBLE IS LIKE SYNCHRONIZED ???
	
/*
	// Returning the values with adding 100.
	// First way
	@Override
	public Object call() throws Exception {
		int numValToReturn = numvalueFromObj + 100;
		return numValToReturn;
	}
	*/
	
	// Returning the values with adding 100.
		@Override
		public Object call() throws Exception {
			
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
			return numvalueFromObj+100;
		}

}
