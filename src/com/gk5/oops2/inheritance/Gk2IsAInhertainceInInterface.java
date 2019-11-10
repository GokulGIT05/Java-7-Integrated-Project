package com.gk5.oops2.inheritance;


public class Gk2IsAInhertainceInInterface {

	public static void main(String[] args) {
		InterfaceInheritanceTest test = new InterfaceInheritanceTest();
		test.parentInterfaceMethod();
		test.childInterface1();
		test.childInterface2();
	}

}


class InterfaceInheritanceTest implements ChildInterface2{

	@Override
	public void parentInterfaceMethod() {
		System.out.println("ParentInterface.parentInterfaceMethod()");
	}

	@Override
	public void childInterface1() {
		System.out.println("Common Implementation for both: ChildInterface1.childInterface1() And ChildInterface2.childInterface1()");
		System.out.println("If return type should be match for common implementation");
	}

	@Override
	public void childInterface2() {
		
		System.out.println("ChildInterface2.childInterface2()");
		
	}

	
}

interface ParentInterface{
	
	public abstract void parentInterfaceMethod();
	
}

interface ChildInterface1 extends ParentInterface{
	
	public abstract void childInterface1();
}

interface ChildInterface2 extends ChildInterface1{
	
	/*
	// Return type must be same. Otherwise in-compatible type error will get.
	public abstract int childInterface1();
	*/
	
	public abstract void childInterface1();
	public abstract void childInterface2();
}
