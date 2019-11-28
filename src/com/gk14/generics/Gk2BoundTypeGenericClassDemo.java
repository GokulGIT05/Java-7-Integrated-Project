package com.gk14.generics;

public class Gk2BoundTypeGenericClassDemo {

	public static void main(String[] args) {

		NumberGen<Integer> theInt = new NumberGen<Integer>(10);
		theInt.showInstanceVars();

//		NumberGen<String> theObj1=new NumberGen<String>(10);
		/*
		 * Bound mismatch: The type String is not a valid substitute for the bounded
		 * parameter <T extends Number> of the type NumberGen<T>
		 */
	}
}

class NumberGen<T extends Number> {

	T obj;

	public NumberGen(T obj) {
		super();
		this.obj = obj;
	}

	public void showInstanceVars() {
		System.out.println("The Values: " + obj);
	}
}