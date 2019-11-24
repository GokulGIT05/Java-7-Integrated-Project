package com.gk05.oops2.polymorphism;

import java.util.Arrays;

public class Gk2MethodOverloadingTest2 {

	public static void main(String[] args) {
		Gk2MethodOverloadingTest2 test = new Gk2MethodOverloadingTest2();
		
		test.objectMethodOverload("Gokul");
		test.objectMethodOverload(Arrays.asList("Gk"));
		
		// Inhertied Method Call.
		Parent parent = new Parent();
		Child child = new Child();
		test.inheritanceOverload(parent);
		test.inheritanceOverload(child);
		
		// Child Reference can't hold parent object
	}
	
	public void objectMethodOverload(Object o) {
		System.out.println("Object Method");
	}
	
	public void objectMethodOverload(String str) {
		System.out.println("String Method: "+str);
	}
	
	public void inheritanceOverload(Parent parent) {
		System.out.println("Parent Method: "+parent);
	}
	
	// TO Test. Comment Below. Only Parent Method will be called	
	public void inheritanceOverload(Child Child) {
		System.out.println("Child Method: "+Child);
	}
	

}

// Inheritacce:
class Parent{
	
}

class Child extends Parent{
	
}