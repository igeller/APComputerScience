package ch09;

// Example 9.7: Display a table of names and salaries using the
// two text files names.txt and salaries.txt.  Scanner objects
// are used to read the data from the two files.

import java.io.*;
import java.util.Scanner;

public class DisplayTable_9_7
{
	public static void main(String[] args) throws IOException
	{
		// The names.txt file and the salaries.txt files have the same
		// number of data items.
		
		// Set up a Scanner object to read from the file names.txt
		Scanner namesFileReader = new Scanner(new File("ch09/names.txt"));
		
		// Set up another Scanner object to read from the file salaries.txt
		Scanner salaryFileReader = new Scanner(new File("ch09/salaries.txt"));
		
		// Print a heading for the output
		System.out.printf("%-16s%12s%n", "NAME", "SALARY");

		// Run a loop that read that will "LOOP OVER THE FILES" and
		// read the data from both files.  Each time the loop runs
		// a name will be read from the names.txt file and one salary
		// from the salaries.txt file.
		while (namesFileReader.hasNext())
		{
			// Read one name from the names file and store it.
			String name = namesFileReader.nextLine();
			
			// Read one salary from the salaries file and store it.
			double salary = salaryFileReader.nextDouble();
			
			// Method 1 using printf to print the name and salary.
			//System.out.printf("%-16s%,12.2f%n", name, salary);
			
			// Method 2 using String.format to print the name and salary.
			// DEACTIVATE THE ABOVE PRINTF STATEMENT AND ACTIVATE THE NEXT 2 LINES.
			String s = String.format("%-16s%,12.2f%n", name, salary);
			System.out.print(s);
		}      
	}
}
