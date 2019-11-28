package com.gk11.fileIO;

import java.io.FileWriter;
import java.io.IOException;

public class Gk3FileWriterMethods {
	
	public static void main(String[] args) {

		try {
			FileWriter writeDemo = new FileWriter("fileWriterTest.txt",true); // It will Create a file
			writeDemo.write(100);
			writeDemo.write("\n");
			writeDemo.write("Testing String \n New Line Test");
			writeDemo.write("\n");
			char[] charTest= {'a','b','c'};
			writeDemo.write(charTest);
			writeDemo.flush(); // To Flush the Entire date to the file
			writeDemo.close();
			System.out.println("End Of Program:");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
