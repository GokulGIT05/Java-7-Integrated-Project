package com.gk09.innerclass;

public class Gk1NormalInnerClassDemo2 {

	// Accessing InnerClass method from Instance area of outer class method.
	public static void main(String[] args) {
		
		Gk1NormalInnerClassDemo2 outerClassObj = new Gk1NormalInnerClassDemo2();
		outerClassObj.outerClassInstanceMethod();

	}

	public void outerClassInstanceMethod() {
		// Its working because only by the outer class object we can access this method
		System.out.println("OuterClassInstance Method: "+this.getClass().getName());
		InnerClass2 innerObj = new InnerClass2();
		innerObj.innerClassMethod();
	}

	class InnerClass2 {

		public void innerClassMethod() {
			System.out.println("Inner Class Method: " + this.getClass().getName());
		}
	}

}
