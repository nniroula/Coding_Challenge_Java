package basics;
import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

// For input file: /Users/nabinniroula/Desktop/hundredDaysCoding/src/basics/evenNumbers.txt OR
// src/basics/evenNumbers.txt
// Use two backslash characters in windows machine -> c:\\home\\nabinFolder\\nabin.txt

/*
 * For File handling in java, use the following:
 * Scanner class for input and output
 * File class
 * argument for scanner object should be file object
 * close all the files
 * you can terminate a method with throws FileNotFoundException if exception occurs
 * 
 * File class, PrintWriter class are available in java.io package
 */


public class FileHandling {
	// given input file is evenNumbers.txt
	// create outEvens.txt and put output there
	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("File Handling in Java...");
		
		Scanner sc = new Scanner(System.in);
		// get input and //save this file name 
		System.out.print("Enter your input file name: ");
		String inputFileName = sc.next();
		System.out.println(inputFileName);
		
		// get output file name from user and save this file name
		System.out.print("Enter your output file name: ");
		String outputFileName = sc.next();
		System.out.println();
		System.out.println(outputFileName);
		
		// pass those file names to the File and PrintWriter objects
		//File inputFile = new File(inputFileName);                  // File for reading input file
		
		// String fileName = "/Users/nabinniroula/Desktop/hundredDaysCoding/src/basics/evenNumbers.txt";
		File inputFile = new File(inputFileName);
		//PrintWriter outputFile = new PrintWriter(outputFileName);  // PrintWriter for writing to file
//		PrintWriter outputFile = new PrintWriter("output.txt");
		PrintWriter outputFile = new PrintWriter(outputFileName);
		
		// pass input file to scanner object
//		Scanner fileIn = new Scanner(inputFile);
		Scanner fileIn = new Scanner(inputFile);
//		int val = fileIn.nextInt();
//		System.out.println(val);
		
	
		// Read input from file and write it to output file 
		System.out.println(fileIn.hasNextInt());
		while(fileIn.hasNextInt()) {
			int number = fileIn.nextInt();
			System.out.println(number);
			outputFile.printf("%d\n", number);
			//outputFile.print(number);	
		}
		//outputFile.printf("Total is %d", total);
		
		// close all files
		fileIn.close();
		outputFile.close();
		sc.close();
	}
}
