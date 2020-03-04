package com.gk05.oops5.DiffwaysToCreateObject;

import java.io.Serializable;

public class SimpleTestClass implements Cloneable, Serializable {

	public void testMethod(String msg) {
		System.out.println("Test Method Called using: " + msg);
	}

	// No need to override below clone(). Due to eclipse problem, i have to override.
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}
