package com.gk10.lang3.stringbuffer;

public class Gk2StringBufferMethods {

	public static void main(String[] args) {

		StringBuffer mainStringBufferObj = new StringBuffer("0123");
		String s1 = mainStringBufferObj.toString();
		System.out.println(s1);
		System.out.println("***********************************");
		
		// 12 Methods.

		// 1. public synchronized int length()
		System.out.println("1. public synchronized int length()");
		int lengthOfString = mainStringBufferObj.length();
		System.out.println("lengthOfString: " + lengthOfString);
		System.out.println("***********************************");

		// 2. public synchronized int capacity()
		int capacityOfStringBuffer = mainStringBufferObj.capacity();
		System.out.println("capacityOfStringBuffer: " + capacityOfStringBuffer);
		System.out.println("***********************************");

		// 3. public synchronized char charAt(int index)
		System.out.println("3. public synchronized char charAt(int index)");
		char characterFromMainObj = mainStringBufferObj.charAt(1);
		System.out.println("characterFromMainObj: " + characterFromMainObj);
		System.out.println("***********************************");

		// 4. public synchronized void setCharAt(int index, char ch)
		System.out.println("4. public synchronized void setCharAt(int index, char ch)");
		mainStringBufferObj.setCharAt(1, 'A');
		System.out.println(mainStringBufferObj);
		System.out.println("***********************************");

		// 5. public synchronized StringBuffer append(String str)
		System.out.println("5. public synchronized StringBuffer append(String str)");
		StringBuffer sb = mainStringBufferObj.append("abc");
		System.out.println(sb == mainStringBufferObj);
		System.out.println(mainStringBufferObj);
		// It has Overloaded Methods Also...
		mainStringBufferObj.append(10.0f);
		mainStringBufferObj.append(true);
		mainStringBufferObj.append(11.0);
		System.out.println(mainStringBufferObj);
		System.out.println("***********************************");

		// 6. public synchronized StringBuffer insert(int offset, String str)
		System.out.println("6. public synchronized StringBuffer insert(int offset, String str)");
		mainStringBufferObj.insert(2, "GOKUL"); // Same like append(), it has overloaded Methods.
		System.out.println(mainStringBufferObj);
		System.out.println("***********************************");

		// 7. public synchronized StringBuffer delete(int start, int end)
		System.out.println("7. public synchronized StringBuffer delete(int start, int end)");
		StringBuffer afterDelete = mainStringBufferObj.delete(1, 5);
		System.out.println(afterDelete == mainStringBufferObj);
		System.out.println(afterDelete);
		System.out.println("***********************************");

		// 8. public synchronized StringBuffer deleteCharAt(int index)
		System.out.println("8. public synchronized StringBuffer deleteCharAt(int index)");
		mainStringBufferObj.deleteCharAt(1);
		System.out.println(mainStringBufferObj);
		System.out.println("***********************************");

		// 9. public synchronized StringBuffer reverse()
		System.out.println("9. public synchronized StringBuffer reverse()");
		mainStringBufferObj = mainStringBufferObj.reverse();
		System.out.println(mainStringBufferObj);
		System.out.println("***********************************");

		// 10. public synchronized void setLength(int newLength)
		System.out.println("10. public synchronized void setLength(int newLength)");
		mainStringBufferObj.setLength(7);
		System.out.println(mainStringBufferObj);
		System.out.println("***********************************");

		// 11. public synchronized void ensureCapacity(int minimumCapacity)
		System.out.println("Before: " + mainStringBufferObj.capacity());
		mainStringBufferObj.ensureCapacity(100);
		System.out.println("Before: " + mainStringBufferObj.capacity());
		System.out.println("***********************************");

		// 12. public synchronized void trimToSize()
		System.out.println("12. public synchronized void trimToSize()");
		mainStringBufferObj.trimToSize();
		System.out.println("Capacity: " + mainStringBufferObj.capacity());
		System.out.println("***********************************");

	}
}
