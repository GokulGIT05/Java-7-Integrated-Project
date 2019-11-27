package com.gk11.fileIO;

import java.io.File;
import java.io.IOException;

public class Gk1FileConstructor {

	public static void main(String[] args) throws IOException {

		// 1. Default Constructor.
		File theFile = new File("FirstTest.txt");
		System.out.println(theFile.exists());
		// To Create a file.
		theFile.createNewFile();
		System.out.println(theFile.exists());
		System.out.println("********************************");

		// 2. Constructor with directory.
		File theDir = new File("Directory");
		System.out.println(theDir.exists());
		theDir.mkdir();
		System.out.println(theDir.exists());
		System.out.println("********************************");

		// 3. To Create file inside a directory constructors.
		File theFileDir = new File(theDir,"InsideDirFile.txt");
		theFileDir.createNewFile();
		System.out.println(theFileDir.exists());
		System.out.println("********************************");
		
		// 3.1 OtherWay 
		// If NewDirectory is not present it will throw Exception
		File theFileDir2 = new File("NewDirectory","NewFileInside.txt");
		theFileDir2.createNewFile();
		System.out.println(theFileDir2.exists());
		System.out.println("********************************");
		
		
	}

}
