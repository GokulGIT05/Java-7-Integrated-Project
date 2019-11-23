package com.gk9.innerclass;

public class Gk1NormalInnerClassDemo {

	public static void main(String[] args) {

		// InnerClassDemo i = new InnerClassDemo(); // Creating InnerClass Object is not
		// possible
		// Accessing Inner Class Methods

		System.out.println("First way of Declaration");
		// Step 1. Create a outer class object
		Gk1NormalInnerClassDemo outerClassObj = new Gk1NormalInnerClassDemo();
		// Step 2: Create inner class object by using outer.inner reference variable.
		Gk1NormalInnerClassDemo.InnerClassDemo innerClassObj = outerClassObj.new InnerClassDemo();
		// Step 3. Call the innerClass using the reference Variable.
		innerClassObj.innerClassMethod();
		System.out.println("*****************************************************");

		System.out.println("Second way of Declaration");
		Gk1NormalInnerClassDemo.InnerClassDemo secondObj = new Gk1NormalInnerClassDemo().new InnerClassDemo();
		secondObj.innerClassMethod();
		System.out.println("*****************************************************");

		System.out.println("Third way of Declaration");
		// without reference variable
		new Gk1NormalInnerClassDemo().new InnerClassDemo().innerClassMethod();

	}

	class InnerClassDemo {
		// Inside Inner Class, we can't declare static methods.

		public void innerClassMethod() {
			System.out.println("Inner Class Name: " + this.getClass().getName());
		}
	}

}
