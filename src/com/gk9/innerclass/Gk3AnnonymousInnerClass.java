package com.gk9.innerclass;

public class Gk3AnnonymousInnerClass {

	public static void main(String[] args) {

		// There are three ways. Only way is written here,

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
