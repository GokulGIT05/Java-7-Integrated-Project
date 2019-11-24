package com.gk10.lang2.strings;

public class Gk1StringDemo {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		String s1= new String("HELLO");
		String s2= "HELLO";
		s1.concat("Gokul"); // Obj s created, bt no reference variable.
		System.out.println(s1);
		
		String s3= s1.concat("Rahul");
		System.out.println(s3);
		
		System.out.println("*******************");
		StringBuffer sb1 = new StringBuffer("Hello");
		sb1.append("GK");
		System.out.println(sb1);
		
	}

}