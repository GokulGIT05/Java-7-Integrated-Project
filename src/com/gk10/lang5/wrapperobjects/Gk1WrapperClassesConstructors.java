package com.gk10.lang5.wrapperobjects;

public class Gk1WrapperClassesConstructors {

	public static void main(String[] args) {
		
		Integer i1 = new Integer(10);
		System.out.println(i1);
		Integer i2 = new Integer("20");
		System.out.println(i2);
		
	/*	Integer i3 = new Integer("TEN");
	//	System.out.println(i3);  // java.lang.NumberFormatException
		*/
		System.out.println("**************************");

		// Only one Constructor
		Character c1 =new Character('c');
		System.out.println(c1);
		System.out.println("**************************");
		
		Boolean b1 = new Boolean(true);
		System.out.println(b1);
		
		Boolean b2 = new Boolean(false);
		System.out.println(b2);
		
		Boolean b3 = new Boolean("true");
		System.out.println(b3);

		Boolean b4 = new Boolean("TRUE");
		System.out.println(b4);
		
		Boolean b5 = new Boolean("TrUe");
		System.out.println(b5);
		
		Boolean b6 = new Boolean("Gokul");
		System.out.println(b6);
		System.out.println("**************************");		
		
	}
	

}
