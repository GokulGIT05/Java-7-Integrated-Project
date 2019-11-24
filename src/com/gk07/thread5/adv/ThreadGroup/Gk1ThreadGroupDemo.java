package com.gk07.thread5.adv.ThreadGroup;

public class Gk1ThreadGroupDemo {

	public static void main(String[] args) {

		ThreadGroup tg = new ThreadGroup("tgGroup");
		Thread t1 = new Thread(tg, "Child Thread1");
		Thread t2 = new Thread(tg, "Child Thread2");
		Thread t3 = new Thread(tg, "Child Thread3");

		tg.setMaxPriority(3);

		Thread t4 = new Thread(tg, "Thread4");

		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		System.out.println(t3.getPriority());
		System.out.println(t4.getPriority());

	}
}
