package com.gk5.oops2.polymorphism;

public class Gk3MethodOverridingTest1 {

	public static void main(String[] args) {

		// Method Overriding.
		ChildClass child = new ChildClass();
		child.test();

		ParentClass parent = new ParentClass();
		parent.test();

		// Parent Reference but Child Object
		ParentClass poly = new ChildClass();
		poly.test(); // Child Class . Because runtime polymorphism. Overriding
		poly.parentNormalMethod(); // Only Parent Class will be called
		System.out.println("*****************************");
		
		/*
		 * poly.childNormalMethod(); // The method childNormalMethod() is undefined for
		 * the type ParentClass
		 * 
		 */ 
		
		// Object Level Overriding.
		parent.objectLevelOverriding();
		child.objectLevelOverriding();
		poly.objectLevelOverriding();
		// Primitive is not possible in overriding.
		System.out.println("*****************************");
		
		
		// Modifer in Overridding. Rule: Only we can increase the scope, can't reduce the scope
		parent.modifierOverridding();
		child.modifierOverridding();
		poly.modifierOverridding();
		// Applicable modifiers are: default > protected > public
		
	}

}

class ParentClass {

	public /*static*/ void test() {
		System.out.println("Parent Class: Called");
	}

	public void parentNormalMethod() {
		System.out.println("Parent Class: Normal Method");
	}
	
	// Object can be override by its child class but vice versa not possible
	public Object objectLevelOverriding() {
		System.out.println("Parent Class:objectLevelOverriding ");
		return null;
	}
	
	protected void modifierOverridding() {
		System.out.println("Parent Class: modifierOverridding");
	}

}

class ChildClass extends ParentClass {

	@Override
	public /*static*/ void test() {
		System.out.println("Child Class Called");
	}

	public void childNormalMethod() {
		System.out.println("Child Class: Normal Method");
	}
	
	
	// Return Type is different. 
	public String objectLevelOverriding() {
		System.out.println("Child Class:objectLevelOverriding ");
		return "Co-Variant Return Types";
	}
	
	public void modifierOverridding() {
		System.out.println("Child Class: modifierOverridding");
	}
}
