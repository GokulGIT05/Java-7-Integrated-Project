package com.gk01.languagefundamentals1.arrays;

public class Gk4ArrayLengthAndAnnonymous {

	public static void main(String[] args) {
		
		// length vs Length()
		int[] num = {1,2,3,4,5};
		System.out.println(num.length); // Length is an variable
		
		String s = "Gokul";
		System.out.println(s.length()); // Length is a Method.
		
		// Anonymous Array will be used to call only one time.
		String str = arrayMethod(new int[] {1,2});
		System.out.println(str);
		
		// Both num1 and num 2 are valid
		int[] num1= {1,2}; 
		int[] num2=new int[] {1,2}; // no more Anonymous Array
		System.out.println(num1+" & "+num2);
		
	}

	private static String arrayMethod(int[] is) {
		return "Annoymous Array Called";
	}

}
