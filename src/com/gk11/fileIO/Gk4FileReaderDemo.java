package com.gk11.fileIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Gk4FileReaderDemo {

	public static void main(String[] args) {
		try {

			File theFile = new File("fileReaderTest.txt");
			FileReader fReader = new FileReader(theFile);
			// Need to do Type Casting.
			char[] eachChar = new char[(int) theFile.length()]; // Creating a char array.
			// public int read(char cbuf[]) throws IOException
			System.out.println(fReader.read(eachChar)); // Passinf Char[], read method will load the data.
			for (char each : eachChar) {
				System.out.println(each);
			}
			fReader.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
