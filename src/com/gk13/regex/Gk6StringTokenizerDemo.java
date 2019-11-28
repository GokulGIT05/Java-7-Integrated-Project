package com.gk13.regex;

import java.util.StringTokenizer;

public class Gk6StringTokenizerDemo {

	public static void main(String[] args) {
		
		// Default Token is space.
		StringTokenizer strTokenObj1 = new StringTokenizer("Gokul Soft Soln");
		
		while(strTokenObj1.hasMoreTokens()) {
			System.out.println(strTokenObj1.nextToken());
		}

		System.out.println("************************");
		
		StringTokenizer strTokenObj2 = new StringTokenizer("28-11-2018","-");
		while(strTokenObj2.hasMoreTokens()) {
			System.out.println(strTokenObj2.nextToken());
		}
		
	}

}
