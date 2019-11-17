package com.gk1.languagefundamentals2.variables;

public class Gk2StaticVarTest {

	static int int1;
	static int int2 = 10;
	static String s = "GkStatic";
	int instanceVar = 100;

	@SuppressWarnings("static-access")
	public static void main(String[] args) {

		System.out.println("Default Value: " + int1);
		System.out.println("Direcly Using: " + int2);

		Gk2StaticVarTest obj1 = new Gk2StaticVarTest();
		System.out.println("Using Object Reference: " + obj1.int2); // Not Recommended

		obj1.int1 = 111111; // OverLoading the static value
		obj1.instanceVar = 25555555;
		System.out.println("Object Values: " + obj1.int1 + " :: Class level: " + int1);
		System.out.println("Using Class as reference: " + Gk2StaticVarTest.int1);
		System.out.println("Instance var: " + obj1.instanceVar);

		Gk2StaticVarTest obj2 = new Gk2StaticVarTest();
		System.out.println("Object1: " + obj1.int1 + " :: Object2: " + obj2.int1);
		// Hence once we assign a value to static variable it will be same, because it
		// stored in class level

		System.out.println("obj2: " + obj2.int1 + " ## " + "Default value will be reassigned for instance var: "
				+ obj2.instanceVar);
		
	}

}
