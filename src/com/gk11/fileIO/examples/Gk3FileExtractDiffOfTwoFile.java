package com.gk11.fileIO.examples;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Gk3FileExtractDiffOfTwoFile {

//	Write a program to perform file extraction operation
	public static void main(String[] args) throws IOException {

		PrintWriter pw = new PrintWriter("Output.txt");
		BufferedReader br1 = new BufferedReader(new FileReader("Input.txt"));
		String eachLineInput = br1.readLine();

		while (eachLineInput != null) {
			boolean available = false;
			BufferedReader br2 = new BufferedReader(new FileReader("Delete.txt"));
			String eachLineDelete = br1.readLine();

			while (eachLineDelete != null) {
				if (eachLineInput.equals(eachLineDelete)) {
					available = true;
					break;
				}
				eachLineDelete = br2.readLine();
			}

			if (available == false) {
				pw.println(eachLineInput);
			}
			eachLineInput = br1.readLine();
			br2.close();
		}

		pw.flush();
		br1.close();
		pw.close();
		
		System.out.println("End of Main");
	}

}
