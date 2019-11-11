package com.gk5.oops2.polymorphism;

public class Gk1MethodOverloadingTest1 {

	public static void main(String[] args) {
		// Overloading taken care by compiler
		Gk1MethodOverloadingTest1 obj = new Gk1MethodOverloadingTest1();
		obj.methodOverLoad();
		obj.methodOverLoad(5);
		byte b=3;
		obj.methodOverLoad(b); // Automatic Promotion
		obj.methodOverLoad(10.0f);
		obj.methodOverLoad(5.0);
		
		// Var-arg
		obj.methodOverLoad(100);
		obj.methodOverLoad(100,200,300);
		

	}

	public void methodOverLoad() {
		System.out.println("No-Arg Method");
	}

	public void methodOverLoad(int a) {
		System.out.println("int a : " + a);
	}
	
	/*public void methodOverLoad(float a) {
		System.out.println("float a : " + a);
	}*/
	
	public void methodOverLoad(double a) {
		System.out.println("double a : " + a);
	}
	
	// var-arg
	public void methodOverLoad(int... a) {
		
		System.out.println("int... a: Array Size: " + a.length);
	}
	

}
