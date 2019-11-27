package com.gk10.lang6.cloneobjects;

public class Gk1CloneDemo implements Cloneable {

	int a = 10;
	int b = 20;

	public static void main(String[] args) throws CloneNotSupportedException {

		/*
		 * CloneDemoClass mainObj = new CloneDemoClass(); CloneDemoClass clobeObj =
		 * (CloneDemoClass) mainObj.clone(); // Not Working
		 */
		Gk1CloneDemo mainObj = new Gk1CloneDemo();
		Gk1CloneDemo cloneObj = (Gk1CloneDemo) mainObj.clone();
		
		cloneObj.a=100;
		cloneObj.b=200;
		
		System.out.println(mainObj.a+" : "+mainObj.b);
		System.out.println(cloneObj.a+" : "+cloneObj.b);
	}

}

class CloneDemoClass implements Cloneable {

	public int i = 10;
	public int j = 20;
}