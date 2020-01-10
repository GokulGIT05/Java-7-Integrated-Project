package com.gk09.innerclass;

public class Gk3AnnonymousInnerClass {

	public static void main(String[] args) {

		// There are three ways. Only way is written here,

		// 1. Anonymous Inner Class that extends a class
		// 2. Anonymous Inner Class that implements an interface
		// 3. Anonymous Inner Class that defined inside method argument.

		// Below Example is for Anonymous Inner Class that implements an interface
		Runnable threadObj = new Runnable() {

			@Override
			public void run() {

				for (int i = 0; i < 10; i++) {
					System.out.println("Annonumous Inner Class");
				}

			}
		};

		Thread thread = new Thread(threadObj);
		thread.start();

		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread Class");
		}

	}

}
