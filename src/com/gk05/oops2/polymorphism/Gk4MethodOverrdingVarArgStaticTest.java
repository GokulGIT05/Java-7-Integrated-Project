package com.gk05.oops2.polymorphism;

public class Gk4MethodOverrdingVarArgStaticTest {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {

		// 1. Method Hiding. Applicable for only static methods
		ParentClass1 parent = new ParentClass1();
		ChildClass1 child = new ChildClass1();
		ParentClass1 poly = new ChildClass1();

		ParentClass1.methodHidDemo();
		ChildClass1.methodHidDemo();
		poly.methodHidDemo(); // its bcoz compiler is responsible for static methods. Compile time

		// var-arg overriding
		parent.varArgDemo(1,2,3);
		child.varArgDemo(2,3);
		poly.varArgDemo(1);
	}

}

class ParentClass1 {

	// Method Hiding not overriding
	public static void methodHidDemo() {
		System.out.println("ParentClass1 : parentMethod()");
	}
	
	public void varArgDemo(int... a) {
		System.out.println("ParentClass1: varArgDemo() ");
	}
}

class ChildClass1 extends ParentClass1 {

/*	@Override*/
	public static void methodHidDemo() {
		System.out.println("ChildClass1 : parentMethod()");
	}
	
	@Override
	public void varArgDemo(int... a) {
		System.out.println("ChildClass1: varArgDemo() ");
	}
	
}
