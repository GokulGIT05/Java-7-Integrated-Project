package com.gk05.oops1.inheritance1.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Gk3MethodOverridingTest1 {

	public static void main(String[] args) {

		// Method Overriding.
		ChildClass child = new ChildClass();
		child.test();

		ParentClass parent = new ParentClass();
		parent.test();

		// Parent Reference but Child Object
		ParentClass poly = new ChildClass();

		// Modifer in Overridding. Rule: Only we can increase the scope, can't reduce
		// the scope
		parent.modifierOverridding();
		child.modifierOverridding();
		poly.modifierOverridding();
		// Applicable modifiers are: default > protected > public

		// private modifier not applicable.

		// Collections with respect to Inheritance. // Generics

	//    List<ParentClass> toTest = new ArrayList<ChildClass>(); // Ans:
		// https://stackoverflow.com/questions/5763750/why-we-cant-do-listparent-mylist-arraylistchild
		System.out.println("*****************************");
		System.out.println("*****************************");

		List<ChildClass> childList = new ArrayList<ChildClass>();
		childList.add(new ChildClass());

		List<? extends ParentClass> listObj = new ArrayList<ChildClass>(); // i Can't Add anyObject.
//		listObj.add(new ParentClass() );

		List<? extends ParentClass> parentList = childList;

		ParentClass temp = parentList.get(0);
		temp.parentNormalMethod();

		List<? super ParentClass> usingSuper = new ArrayList<Object>();
		usingSuper.add(new ParentClass());
		usingSuper.add(new ChildClass());

		System.out.println(usingSuper);

	}

}

class ParentClass {

	protected /* static */ void test() {
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

//	@Override
	public /* static */ void test() {
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
