package com.gk8.collection2.cursors;

import java.util.Enumeration;
import java.util.Vector;

public class Gk1EnumerationCursorDemo {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {

		Vector vectorObj = new Vector<>();
		
		for (int i = 0; i < 10; i++) {
			vectorObj.addElement(i); // instead of add, need to use addElement
		}

		System.out.println(vectorObj);
		Enumeration enumCursor = vectorObj.elements(); // We can use Enumeration only for Vector Elements.

		// Use While Loop for iterating
		while (enumCursor.hasMoreElements()) {   
			System.out.println("Vector Value is: " +enumCursor.nextElement() );
		}
		
		System.out.println("Implementation Class: "+enumCursor.getClass().getName());
		// DisAdv: No Remove Operation and only 2 Methods are there. Legacy
		// Applicable only to vector Object. Not a universal Cursor.
	}
}