package com.gk09.innerclass;

public class Gk4StaticInnerClass {

	public static void main(String[] args) {
		
		InnerStaticClass obj = new InnerStaticClass();
		obj.method();
		
	}
	
	static class InnerStaticClass{
		
		public void method() {
			System.out.println("InnerStaticClass.method()");
		}
		
		public static void main(String[] args) {
			System.out.println("Inside Static Method");
		}
	}

}
