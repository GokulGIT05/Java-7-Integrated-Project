package com.gk7.thread8.adv.threadlocal;

public class Gk3InheritableThreadLocalDemo {

	public static void main(String[] args) {

		ParentThreadClass parentThread = new ParentThreadClass();
		parentThread.start();

	}
}

class ParentThreadClass extends Thread {

	/*
	 * // Case: 1 static InheritableThreadLocal localThreadVal = new
	 * InheritableThreadLocal() { public Object childValue(Object parent) { return
	 * "CHILD - THREAD"; } };
	 */

	/*
	 * // Case: 2 static ThreadLocal localThreadVal = new ThreadLocal();
	 */

	// Case 3: Child Default Values is not overriden.
	@SuppressWarnings("rawtypes")
	static InheritableThreadLocal localThreadVal = new InheritableThreadLocal();

	@SuppressWarnings("unchecked")
	public void run() {
		localThreadVal.set("PARENT - THREAD");
		System.out.println(localThreadVal.get());
		ChildThreadClass newObj = new ChildThreadClass();
		newObj.start(); // Starting a new Obj from thread Class.
	}

}

class ChildThreadClass extends Thread {

	public void run() {
		System.out.println(ParentThreadClass.localThreadVal.get());
	}
}