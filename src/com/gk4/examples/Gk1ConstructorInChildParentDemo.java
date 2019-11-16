package com.gk4.examples;

public class Gk1ConstructorInChildParentDemo {

	public static void main(String[] args) {
		
		ChildDemo testObj = new ChildDemo("Gk1");
		System.out.println("In Main Methodd:" +testObj.name);

	}

}

// If we are not having Default Constructor in Parent Class, then extending child class also should not contain default Constructor. 

class ParentDemo {

	String name;

	public ParentDemo(String name) {
		super();
		this.name = name;
		System.out.println(this.hashCode());
		System.out.println("ParentClass: "+name);
	}
}

class ChildDemo extends ParentDemo {
//  Implicit super constructor ParentDemo() is undefined for default constructor. Must define an explicit constructor

	public ChildDemo(String name) {
		super(name);
		System.out.println(this.hashCode());
	}
}