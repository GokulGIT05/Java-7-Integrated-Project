package com.gk1.languagefundamentals1.arrays;

public class Gk3ArrayCreatingInSingleLine {

	public static void main(String[] args) {

		// One Dimensional Array:
		int[] oneDim = { 1, 2, 3, 4, 5 };
		printOneDimArray(oneDim);

		System.out.println("\n\n******************");
		
		int[][] twoDim = { { 1, 2 }, { 4, 5, 6 } };
		printTwoDimArray(twoDim);
		
		/*
		// It should in the same line
		int[] experiment;
		experiment = {1,2,3,4}; // Error: Array constants can only be used in initializers
		*/
	}

	private static void printOneDimArray(int[] oneDim) {
		for (int eachVal : oneDim) {
			System.out.print(eachVal + ", ");
		}
	}

	private static void printTwoDimArray(int[][] twoDim) {
		
		for(int[] oneDimVal: twoDim) {
			// oneDimVal value will be = {1,2} & {4,5,6}
			for(int eachVal: oneDimVal) {
				System.out.println(eachVal);
			}
			System.out.println("Array Set Over");
		}
	}
}
