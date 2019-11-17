package com.gk1.languagefundamentals2.variables;

public class Gk3LocalVarTest {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		int local1 = 0; // Compulsory local variable should be initialized.
		System.out.println(local1);
		
		final int local2 =10;
		
//		private int local3 =20;   // Illegal modifier for parameter local3; only final is permitted
		
		String s = "12";
		int local4=0;
		if(s.length() < 3) {
			local4 = 100;
		}
		System.out.println(local4); // Without initializing, above condition will have comp problem.
	
	}

}
