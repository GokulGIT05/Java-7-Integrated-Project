package com.gk9.innerclass;

public class Gk1NormalInnerClassDemo3 {

	// Accessing InnerClass method from other classes.
	public static void main(String[] args) {
		
		// OuterClass Object.
		Gk1NormalInnerClassDemo2 outerClassObj = new Gk1NormalInnerClassDemo2();
		// InnerClass Object Creation
		Gk1NormalInnerClassDemo2.InnerClass2 innerObj = outerClassObj.new InnerClass2();
		// Calling the instance Method of inner class
		innerObj.innerClassMethod();

	}

}
