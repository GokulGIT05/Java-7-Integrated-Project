package com.gk06.exceptionhandling;

public class Gk3ThrowsKeyword {

	public static void main(String[] args) throws InterruptedException {
		
		doStuff();
	}

	private static void doStuff() throws InterruptedException {
		// TODO Auto-generated method stub
		doMoreStuff();
	}

	private static void doMoreStuff() throws InterruptedException {
		
		Thread.sleep(1000);
		System.out.println("End");
	}

}
