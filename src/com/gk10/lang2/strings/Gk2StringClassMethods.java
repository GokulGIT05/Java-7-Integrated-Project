package com.gk10.lang2.strings;

public class Gk2StringClassMethods {

	public static void main(String[] ars) {

		// 13 Methods are there in String Class.
		String strMainObj = "01234567";

		// 1. public char charAt(int index)
		System.out.println("1. public char charAt(int index)");
		char c1 = strMainObj.charAt(0);
		// char c2 = str.charAt(10);
		char c3 = strMainObj.charAt(5);
		System.out.println(c1);
		// System.out.println(c2);
		System.out.println(c3);
		System.out.println("********************");

		// 2. public String concat(String str)
		System.out.println("2. public String concat(String str)");
		String strConcat = strMainObj.concat("89");
		System.out.println(strConcat);
		System.out.println("********************");

		// 3. public boolean equals(Object anObject)
		System.out.println("3. public boolean equals(Object anObject)");
		boolean isEqual = strMainObj.equals("1234567");
		boolean isEqual1 = strMainObj.equals("123456789");
		System.out.println(isEqual);
		System.out.println(isEqual1);
		System.out.println("********************");

		// 4. public boolean equalsIgnoreCase(String anotherString)
		System.out.println("4. public boolean equalsIgnoreCase(String anotherString)");
		String s1 = "gokul";
		String s2 = "GOKul";
		boolean isEqualIgnoreCase = s1.equalsIgnoreCase(s2);
		System.out.println(isEqualIgnoreCase);
		System.out.println("********************");

		// 5. public String substring(int beginIndex)
		System.out.println("5. public String substring(int beginIndex)");
		String subStr1 = strMainObj.substring(2);
		System.out.println(subStr1);
		System.out.println("********************");

		// 6. public String substring(int beginIndex, int endIndex)
		System.out.println("6. public String substring(int beginIndex, int endIndex)");
		String subStr2 = strMainObj.substring(1, 3);
		System.out.println(subStr2);
		System.out.println("********************");

		// 7. public int length()
		System.out.println("7. public int length()");
		int lengthOfMainStr = strMainObj.length();
		System.out.println(lengthOfMainStr);
		System.out.println("********************");

		// 8. public String replace(CharSequence target, CharSequence replacement)
		System.out.println("8. public String replace(CharSequence target, CharSequence replacement)");
		String replaceStrDemo1 = "1122333444";
		String afterReplace = replaceStrDemo1.replace("4", "9");
		System.out.println(afterReplace);
		System.out.println("********************");

		// 9. public String toUpperCase()
		System.out.println("9. public String toUpperCase()");
		String toChangeUpper = "abcdef";
		String resultToChangeUpper = toChangeUpper.toUpperCase();
		System.out.println(resultToChangeUpper);
		System.out.println("********************");

		// 10. public String toLowerCase()
		System.out.println("10. public String toLowerCase()");
		String toChangeLowerCase = "ABCDEF";
		String resultToChangeLowerCase = toChangeLowerCase.toLowerCase();
		System.out.println(resultToChangeLowerCase);
		System.out.println("********************");

		// 11. public String trim()
		System.out.println("11. public String trim() ");
		String toTrim = " 1234 ";
		String resultToTrim = toTrim.trim();
		System.out.println(resultToTrim);
		System.out.println("********************");

		// 12. public int indexOf(char ch)
		System.out.println("12. public int indexOf(char ch)");
		int indexOfSearchChar = strMainObj.indexOf('3');
		System.out.println(indexOfSearchChar);
		System.out.println("***************************");

		// 13. public int lastIndexOf(char ch)
		System.out.println("13. public int lastIndexOf(char ch)");
		String lastIndexChar = "1231231231";
		int lastIndexOfCharInString = lastIndexChar.lastIndexOf('1');
		System.out.println(lastIndexOfCharInString);
	}

}
