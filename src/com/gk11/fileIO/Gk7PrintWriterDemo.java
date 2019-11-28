package com.gk11.fileIO;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Gk7PrintWriterDemo {
	
	public static void main(String[] args) throws FileNotFoundException {

		PrintWriter pw = new PrintWriter("PWTest.txt");
		pw.write(100);
		pw.print(100);
		pw.println("Test");
		pw.println(true);
		pw.println('C');

		// Recommended Always to Close
		pw.flush();
		pw.close();
		
		System.out.println("End of main");
	}

}
