package com.gk5.oops3.controlflow;

public class Gk3StaticControlFlow_IS_A_Relation extends ParentClassStaticControlFlow{

	static int i =30;
	
	static {
		System.out.println("****Start of Child*****");
		childMethod();
		System.out.println("Parent First Static Block");
	}

	public static void main(String[] args) {
		System.out.println("**********Start of Main***********");
		childMethod();
		System.out.println("Inside Main Method");
		System.out.println("**********End of Main***********");
	}
	
	private static void childMethod() {
		System.out.println("The Value of j in Child: "+j);
	}
	
	static {
		System.out.println("Parent Second Static Block");
	}
	
	static int j=40;
}

class ParentClassStaticControlFlow{
	
	static int i =10;
	
	static {
		parentMethod();
		System.out.println("Parent First Static Block");
	}

	public static void main(String[] args) {
		System.out.println("**********Start of Main***********");
		parentMethod();
		System.out.println("Inside Main Method");
		System.out.println("**********End of Main***********");
	}
	
	private static void parentMethod() {
		System.out.println("The Value of j in Parent: "+j);
	}
	
	static {
		System.out.println("Parent Second Static Block");
	}
	
	static int j=20;
}
