package com.gk2.operators.otheroperators;

public class Gk2RelationalOperators {
	
	public static void main(String[] args) {
		// .equals vs "=="
		
		String s1 = new String("Gk1");
		String s2 = new String("Gk1");
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		String s3 = s1;
		System.out.println(s3==s1);
		
		String s4=null;
		System.out.println(null==s4);
		System.out.println(null == s3);
	}

}
