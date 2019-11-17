package com.gk8.collection3.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Gk1HashSet {

	@SuppressWarnings({ "unused", "rawtypes", "unchecked" })
	public static void main(String[] args) {

		// Default Initial Capacity(16) and Default Fill ratio (0.75)
		
		// 1. Default Constructor
		Set hashSetObj1 = new HashSet<>();
		
		// 2. Constructor with Initial Capacity and Default Fill Ratio.
		Set hashSetObj2 = new HashSet(20);
		
		// 3. Constructor with Initial Capacity and Fill Ratio.
		Set hashSetObj3 = new HashSet(20,1);
		
		// 4. Converting Other Collection Object into Set
		List al= new ArrayList();
		al.add("1");
		al.add("2");
		al.add("3");
		al.add("1");
		System.out.println("ArrayList Val: "+al);
		Set hashSetObj4 = new HashSet(al);
		System.out.println("Hash Set Values: "+hashSetObj4);
		System.out.println(hashSetObj4.add("2"));
		hashSetObj4.add(null);
		System.out.println("Hash Set Values: "+hashSetObj4);
		
		// All the Collection Interface methods are available to hashset.
		
		

	}

}
