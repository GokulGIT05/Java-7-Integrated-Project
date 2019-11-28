package com.gk19.jvmarchitecture;

public class Gk3MethodsForHeapMemory {

	// Program to display heap memory statics:
	public static void main(String[] args) {

		Runtime runTimeObj = Runtime.getRuntime();

		System.out.println(runTimeObj.maxMemory() / (1024 * 1024) + " in MB");
		System.out.println(runTimeObj.totalMemory() / (1024 * 1024) + " in MB");
		System.out.println(runTimeObj.freeMemory() / (1024 * 1024) + " in MB");
		System.out.println("Consumed Memory: " + (runTimeObj.totalMemory() - runTimeObj.freeMemory()) / (1024 * 1024) + " in MB");

	}

}
