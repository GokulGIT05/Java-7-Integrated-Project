package com.gk01.languagefundamentals1.arrays;

public class Gk2ArrayCreation {
	
	public static void main(String[] args) {
		
		// Every array in java is an object.
		// Those classes are available in java.lang package and it's not available to programmers.
		int[] i1 =new int[3];
		System.out.println(i1.getClass().getName());
		
		int[][] i2 =new int[3][3];
		System.out.println(i2.getClass().getName());
		System.out.println("****************************************");
		
		double[] d1 = new double[3];
		System.out.println(d1.getClass().getName());
		
		double[][] d2 = new double[3][3];
		System.out.println(d2.getClass().getName());
		System.out.println("****************************************");
		
		char[] c1 = new char[3];
		System.out.println(c1.getClass().getName());
		
		char[][] c2 = new char[3][3];
		System.out.println(c2.getClass().getName());
		System.out.println("****************************************");
		
		
		float[] f1=new float[3];
		System.out.println(f1.getClass().getName());
		
		float[][] f2 = new float[3][3];
		System.out.println(f2.getClass().getName());
		System.out.println("****************************************");
		
		boolean[] b1=new boolean[3];
		System.out.println(b1.getClass().getName());
		
		boolean[][] b2 = new boolean[3][3];
		System.out.println(b2.getClass().getName());
		System.out.println("****************************************");
		
		// Auto - assignment will happen based on low to high data types
		char character='a';
		int[] charint=new int[character];
		System.out.println(charint.length);
		System.out.println("****************************************");
		
		System.out.println("Array Creation by using only base.");
		int[][] twoDim1= new int[2][];
		twoDim1[0] = new int[2];
		twoDim1[1] = new int[1];
		System.out.println(twoDim1);
		System.out.println("****************************************");
		
		// Checking the internal Implementation
		int[][] twoDim2=new int[2][];
		System.out.println("We will get null: "+twoDim2[1]);
		twoDim2[0] = new int[2];
		// Assigning Values
		twoDim2[0][0] = 0;
		twoDim2[0][1] = 1;
		System.out.println("twoDim2[0][0] :"+twoDim2[0][0]);
		System.out.println("twoDim2[0][1] : "+twoDim2[0][1]);
		System.out.println("twoDim2[1] :"+twoDim2[1]); // Null Pointer Has to throw because we didnt initialize the indexed 1.
		
		
		
	}
}
