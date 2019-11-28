package com.gk11.fileIO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Gk5BufferedWriterDemo {

	public static void main(String[] args) throws IOException {

		FileWriter fw=new FileWriter("BW.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		
		bw.write("Welcome");
		bw.newLine();
		bw.write("to");
		bw.newLine();
		bw.write("FILE IO");
		bw.flush();
		bw.close();
		System.out.println("End");
		
	}


}
