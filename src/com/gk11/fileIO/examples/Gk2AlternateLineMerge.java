package com.gk11.fileIO.examples;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Gk2AlternateLineMerge {

	// Write a program to merge a data from two file into a third file.?
	public static void main(String[] args) throws IOException {
		PrintWriter pw = new PrintWriter("MergerFileAlter.txt");
		BufferedReader br1 = new BufferedReader(new FileReader("File1.txt"));
		BufferedReader br2 = new BufferedReader(new FileReader("File2.txt"));

		String lineFromBr1 = br1.readLine();
		String lineFromBr2 = br2.readLine();

		while (lineFromBr1 != null || lineFromBr2 != null) {

			if (lineFromBr1 != null) {
				pw.println(lineFromBr1);
				lineFromBr1 = br1.readLine();
			}

			if (lineFromBr2 != null) {
				pw.println(lineFromBr2);
				lineFromBr2 = br2.readLine();
			}
		}

		pw.flush();
		// Closing PW
		br1.close();
		br2.close();
		pw.close();
	}

}
