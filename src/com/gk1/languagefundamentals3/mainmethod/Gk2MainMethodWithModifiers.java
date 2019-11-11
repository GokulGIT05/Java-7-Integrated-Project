package com.gk1.languagefundamentals3.mainmethod;

public class Gk2MainMethodWithModifiers {

	// 1.
	
	/*public static void main(String[] args) {
		System.out.println("Normal Main Method");
	}*/
	
	// 2. Using final modifier
	/*public static final void main(String[] args) {
		System.out.println("Using final modifier");
	}*/
	
	// 3. Using Synchronized
	/*public static synchronized void main(String[] args) {
		System.out.println("Using final modifier");
	}*/
	
	// 4. Using strictfp modifier
	/*public static strictfp void main(String[] args) {
		System.out.println("Using strictfp modifier");
	}*/
	
	// 5. Consolidate full allowed methods.
	public static synchronized final strictfp void main(String[] args) {
		System.out.println("Only 3 extra modifiers are allowed.");
		System.out.println("Order of modifiers are not important");
	}
	
}
