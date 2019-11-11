package com.gk1.languagefundamentals3.mainmethod;

//Different ways of modification to Main Method.
public class Gk1MainMethodDemo {
	
	// 1. First way
	/*public static void main(String[] args) {
		
		System.out.println("Main Method Executed Succesfully");

	}*/
	
	// 2. Second way
		/*static public void main(String[] args) {
		System.out.println("Order of Modifier are not Important");
	}*/
	
	// 3. Third Way
	/*public static void main(String[] gk) {
		System.out.println("arguement name is not important");
	}*/

	// 4. Fourth Day
	/*public static void main(String []gk) {
		System.out.println("Array[] can be with reference variable");
	}*/
	
	// 5. Fifth Way
	public static void main(String... args) {
		System.out.println("Var-Arg Method");
	}
}
