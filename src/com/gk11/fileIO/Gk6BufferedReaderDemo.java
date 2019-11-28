package com.gk11.fileIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Gk6BufferedReaderDemo {

	public static void main(String[] args) throws IOException {

		FileReader fReader = new FileReader("BW.txt");
		BufferedReader bReader = new BufferedReader(fReader);

		String eachLine = bReader.readLine();

		while (eachLine != null) {
			System.out.println(eachLine);
			eachLine = bReader.readLine();
		}
		bReader.close();
	}

}
