package com.gk1.language.fundamentals2.variables;

public class Gk2InstanceVarDefaultValues {
	
	int x;
	double d;
	String s;
	char c;
	byte b;
	boolean boo;
	

	public static void main(String[] args) {
		Gk2InstanceVarDefaultValues test = new Gk2InstanceVarDefaultValues();
		System.out.println("int: "+test.x);
		System.out.println("double: "+test.d);
		System.out.println("String: "+test.s);
		System.out.println("char: "+test.c); // default value  is empty.
		System.out.println("Byte: "+test.b);
		System.out.println("Boolean: "+test.boo);
	}

}
