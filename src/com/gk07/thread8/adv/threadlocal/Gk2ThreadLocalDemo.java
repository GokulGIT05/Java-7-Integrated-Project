package com.gk07.thread8.adv.threadlocal;

public class Gk2ThreadLocalDemo {

	public static void main(String[] args) {
		ThreadLocalDemo demoObj1 = new ThreadLocalDemo();
		ThreadLocalDemo demoObj2 = new ThreadLocalDemo();
		ThreadLocalDemo demoObj3 = new ThreadLocalDemo();
		demoObj1.start();
		demoObj2.start();
		demoObj3.start();
	}

}

class ThreadLocalDemo extends Thread{
	
	static Integer i =0;
	
	static ThreadLocal<Integer> thelocalVal = new ThreadLocal<Integer>() {
		@Override
		public Integer initialValue() {
			return  ++i;
		}
	};
	
	@Override
	public void run() {
		System.out.println("The Value of i is: "+i);
		System.out.println("Thread Local values is: "+thelocalVal.get());
	}
	
	
}