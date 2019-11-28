package com.gk11.fileIO.examples;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Gk1ToMergeTwoFiles {

	// Write a program to merge a data from two file into a third file.
	public static void main(String[] args) throws IOException {

		PrintWriter pw = new PrintWriter("MergedFile.txt");

		// Reading from File1
		BufferedReader bReader = new BufferedReader(new FileReader("File1.txt"));
		String eachLine = bReader.readLine();
		while (eachLine != null) {
			pw.println(eachLine);
			eachLine = bReader.readLine();
		}
		bReader.close();

		// Reading from File2
		bReader = new BufferedReader(new FileReader("File2.txt"));
		eachLine = bReader.readLine();
		while (eachLine != null) {
			pw.println(eachLine);
			eachLine = bReader.readLine();
		}
		bReader.close();

		pw.flush();
		pw.close();

	}

}
