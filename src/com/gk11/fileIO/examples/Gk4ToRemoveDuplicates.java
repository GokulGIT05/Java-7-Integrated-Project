package com.gk11.fileIO.examples;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Gk4ToRemoveDuplicates {
	
	public static void main(String[] args) throws IOException {

		PrintWriter pw = new PrintWriter("RemovedDuplicates.txt");

		// I have only one file,  need to remove duplicates and saved it into new file.
		BufferedReader inputFile = new BufferedReader(new FileReader("InputToRemoveDuplicate.txt"));
		String eachMainLine = inputFile.readLine();

		while (eachMainLine != null) {
			boolean available = false;
			BufferedReader brOut = new BufferedReader(new FileReader("RemovedDuplicates.txt"));
			String target = brOut.readLine();

			while (target != null) {
				if (eachMainLine.equals(target)) {
					available = true;
					break;
				}
				target = brOut.readLine();
			}

			if (!available) {
				pw.println(eachMainLine);
				pw.flush();
			}
			eachMainLine=inputFile.readLine();
		}

		pw.close();
		inputFile.close();
		System.out.println("End of Main");
	}
	

}
