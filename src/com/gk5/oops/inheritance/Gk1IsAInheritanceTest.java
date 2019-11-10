package com.gk5.oops.inheritance;

public class Gk1IsAInheritanceTest {

	public static void main(String[] args) {

		Parent parentObj = new Parent();
		ChildClass1 child1Obj = new ChildClass1();

		// 1. By Using Parent Obj, we can call only parent method
		parentObj.parentMethod();
		System.out.println(parentObj.name);
		System.out.println("******************************");

		// 2. By Using Child Class Object, we can call both parent class method and
		// child class method.
		child1Obj.parentMethod();
		child1Obj.childMethod();
		System.out.println(child1Obj.name);
		System.out.println("******************************");

		// 3. Polymorphism
		Parent parentReferenceToHoldChildObj = new ChildClass1();
		System.out.println(parentReferenceToHoldChildObj.name);
		parentReferenceToHoldChildObj.parentMethod();
		// By using parentReferenceToHoldChildObj we can call only parent class methods
		System.out.println("******************************");
		
		/*
		// 4. Child Reference can't hold parent object.
		child1 childRefTryingToHoldParentObj = new Parent(); // Type mismatch: cannot convert from Parent to child1
		*/
		
		// 5. Multi-Level Inheritance 
		MultiLevelInheritanceTest multiLevelObj = new MultiLevelInheritanceTest();
		multiLevelObj.multiLevelInheritanceMethod();
		multiLevelObj.childMethod();
		multiLevelObj.parentMethod();
		System.out.println(multiLevelObj.name);
		System.out.println("*****************************");
		
		ChildClass1 middleObj = new MultiLevelInheritanceTest();
		middleObj.childMethod();
		middleObj.parentMethod();
		System.out.println(middleObj.name);
		
	}

}

class Parent {
	String name = "Gokul";

	public void parentMethod() {
		System.out.println("Parent Class: parentMethod() Called");
	}
}

class ChildClass1 extends Parent {

	public void childMethod() {
		System.out.println("child1 Class: childMethod() Called");
	}
}


class MultiLevelInheritanceTest extends ChildClass1 {

	public void multiLevelInheritanceMethod() {
		System.out.println("child1 Class: childMethod() Called");
	}
}







