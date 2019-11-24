package com.gk10.lang1;

public class Gk2HashCodeMethodDemo {

	public static void main(String[] args) {
		StudentHashCode obj1 = new StudentHashCode(10);
		StudentHashCode obj2 = new StudentHashCode(100);
		System.out.println(obj1);
		System.out.println(obj2);

	}

}

class StudentHashCode {
	Integer s;

	public StudentHashCode(Integer s) {
		super();
		this.s = s;
	}

	// Override
	@Override
	public int hashCode() {
		return s;

	}

	@Override
	public String toString() {
		return s + "";
	}

}