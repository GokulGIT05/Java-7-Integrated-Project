package com.gk11.fileIO;

import java.io.File;

public class Gk2FileClassMethods {

	public static void main(String[] args) {
		
		// 1. public String[] list()
		System.out.println("1. public String[] list()");
		File fileList = new File("C:\\EclipseWorkspace");
		String[] listOfFiles = fileList.list();
		System.out.println(listOfFiles.length);
		System.out.println("****************************************");
		
		// 2.  public boolean isFile() & 
		// 3.  public boolean isDirectory() 
		// To find Number of Files and Directories.
		int noOfFile = 0;
		int noOfDir = 0;
		for(String eachEntry : listOfFiles) {
			File fileTest = new File(fileList, eachEntry);
			if(fileTest.isFile()) {
				noOfFile++;
			}
			if(fileTest.isDirectory()) {
				noOfDir++;
			}
		}
		System.out.println("2.  public boolean isFile()");
		System.out.println("noOfFile: "+noOfFile);
		System.out.println("****************************************");
		System.out.println("3.  public boolean isDirectory() ");
		System.out.println("noOfDir : "+noOfDir);
		System.out.println("****************************************");
		
		File theFile = new File("FirstTest.txt");
		
		// 4. public long length()
		System.out.println("4. public long length()");
		System.out.println(theFile.length());
		System.out.println("****************************************");
		
		// 5. public boolean delete()
		System.out.println("5. public boolean delete()");
		System.out.println(theFile.delete());
		System.out.println("****************************************");
		
		// 6. public boolean exists()
		System.out.println("6. public boolean exists()");
		System.out.println(theFile.exists());
		System.out.println("****************************************");
	}

}




