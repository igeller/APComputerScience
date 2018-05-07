// FileName:  Ch3Sect4Demo.java
// This program demonstrates the problematic order of input statements
// when asking for both numeric and string input as discussed in the
// Chapter 3 Section 4 Lecture.

package ch03;

import java.util.Scanner;

public class Ch3Sect4Demo
{
	public static void main(String[] args)
	{
		// Any object variable like reader can be declared and given a default value of null
		// (instead of constructing an object for the variable to refer to).  Usually this is
		// not done because we don't want to wait to construct the object later, because it 
		// could cause a program to throw an NullPointerException.  We can see this happen by
		// running this program with the following code:
		//Scanner reader = null;	// Scanner object not instantiated using new Scanner(System.in)
		Scanner reader = new Scanner(System.in);
		
/*
		// The next line throws a NULLPointerException if reader refers to null instead of an object.		
		System.out.print("Enter your name (a string):  ");
		String name = reader.nextLine();
		
		// After running the above code, fix the Scanner reader line above so the
		// program will run correctly.
		
		// **************************************************************************
		
		System.out.print("Enter your age (an integer):  ");
		int age = reader.nextInt();
		
		System.out.print("Enter your weight (a double):  ");
		double weight = reader.nextDouble();
		
		System.out.print("Greetings " + name + ".\n" + "You are " + age + ".\n" + "Your weight " + weight + ".\n");
*/
		
		// After constructing the Scanner object correctly, the above code has no problem
		// with input and the info is printed as expected. The reason is the statements
		// happen to be in the right order with the nextLine() statement occurring first.
		
		// COMMENT OUT THE ABOVE THREE PROMPTS AND INPUT LINES AND THEN ACTIVATE
		// THE NEXT SECTION OF CODE THAT HAS AN INCORRECT ORDER OF INPUT STATEMENTS.
		// RUN THE PROGRAM AND SEE WHAT HAPPENS.
		

		System.out.print("Enter your age (an integer):  ");
		int age = reader.nextInt();
		
		System.out.print("Enter your weight (a double):  ");
		double weight = reader.nextDouble();
		
		reader.nextLine();
		
		System.out.print("Enter your name (a string):  ");
		String name = reader.nextLine();
		
		System.out.print("Greetings " + name + ".\n" +
								"You are " + age + ".\n" +
								"You weigh " + weight + ".\n");
		

		// After running the code for this section, add the line reader.nextLine() to 
		// consume the new line character in the correct place.
	
	

		} // end main
} // end Ch3Sect4Demo
