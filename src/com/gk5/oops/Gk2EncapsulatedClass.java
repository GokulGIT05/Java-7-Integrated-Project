package com.gk5.oops;

// Encapsulation
public class Gk2EncapsulatedClass {

	// Data Hiding.
	private String name;
	private int age;

	// Abstraction
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Gk2EncapsulatedClass [name=" + name + ", age=" + age + "]";
	}

}
