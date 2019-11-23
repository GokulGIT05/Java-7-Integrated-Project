package com.gk9.innerclass;

public class Gk2MethodLocalInnerClass {

	// Rarely Used Inner Class
	public static void main(String[] args) {
		
		Gk2MethodLocalInnerClass mainObj = new Gk2MethodLocalInnerClass();
		mainObj.classInsideMethod();
	}
	
	public void classInsideMethod() {
		System.out.println("Inside Instance Method");
		// Class Inside Method
		class InnerClassMethod{
			public void methodInnerClass() {
				System.out.println("Inside Class within the method");
				System.out.println(this.getClass().getName());
				System.out.println(this.getClass().hashCode());
		
			}
		}
		
		InnerClassMethod obj1 = new InnerClassMethod();
		obj1.methodInnerClass();
		
		InnerClassMethod obj2 = new InnerClassMethod();
		obj2.methodInnerClass();
	}

}
