package com.gk04.examples;

public class Gk2AbstractClassContructors {

	public static void main(String[] args) {

		// Only Child Class Object is created. Parent Abstract class constructor is used
		// to initialize the parent class instance varaibles for child class object
		ChildClassForDemo childObj = new ChildClassForDemo("Gokul", 26, "TVL", "TN", "IT", "Software Developer");
		System.out.println(childObj);

	}

}

abstract class ParentAbstractClass {

	String name;
	int age;
	String district;
	String state;

	public ParentAbstractClass(String name, int age, String district, String state) {
		super();
		this.name = name;
		this.age = age;
		this.district = district;
		this.state = state;
	}
}

class ChildClassForDemo extends ParentAbstractClass {

	String occupation;
	String role;

	public ChildClassForDemo(String name, int age, String district, String state, String occupation, String role) {
		super(name, age, district, state);
		this.occupation = occupation;
		this.role = role;
	}

	@Override
	public String toString() {
		return "ChildClassForDemo [occupation=" + occupation + ", role=" + role + ", name=" + name + ", age=" + age
				+ ", district=" + district + ", state=" + state + "]";
	}

}