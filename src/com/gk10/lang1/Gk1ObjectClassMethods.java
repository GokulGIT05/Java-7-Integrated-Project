package com.gk10.lang1;

public class Gk1ObjectClassMethods extends Object {

	public static void main(String[] args) {

		Object obj = new Object();
		System.out.println(obj);
		
		
		
	}

	// Below methods are there in Object Class.
	// Thread class methods are final.
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
}
