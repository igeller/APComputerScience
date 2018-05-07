// FileName:  Ch3Sect1And2Demo.java
package ch03;

import java.util.Scanner;
// This Demo program contains code from the Chapter 3 Sections 1 & 2 Lectures.
// It verifies the concepts that are discussed in those two sections.
public class Ch3Sect1And2Demo
{
	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in);
		
		System.out.println("The value of Integer.MAX_VALUE (the upper bounds of int) is:  " + Integer.MAX_VALUE); 
		System.out.println("The value of Integer.MIN_VALUE (the lower bounds of int) is:  " + Integer.MIN_VALUE); 
		System.out.println(); 
		
		System.out.println("The value of Integer.MAX_VALUE + 1 is:  " + (Integer.MAX_VALUE + 1)); 
		System.out.println("The value of Integer.MIN_VALUE - 1 is:  " + (Integer.MIN_VALUE - 1)); 
		System.out.println(); 

		double z = 2000.345 * 500000000000000.2 * 6000000000000000.123;
		System.out.println("The answer to arithmetic expressions like ... z = 2000.345 * 500000000000000.2 * 6000000000000000.123"); 
		System.out.println("  end up being writen to the output window in scientific notation form unless you format it differently."); 
		System.out.println("The value of z is:  " + z); 
		
		System.out.print("Enter your name (a string):  ");
		String name = reader.nextLine();
		System.out.print("Enter your pet’s name (a string):  ");
		String pet = reader.nextLine();

		System.out.println(); 
		System.out.println("Name: " + name);
		System.out.println("Pet: " + pet);

		System.out.println(); 

		int len = name.length();
		System.out.println("Your name has " + len + " characters in it " + name); 



		System.out.println(); 

		String _my_Variable;   // can start with an underscore character
		double $Money = 300.12;  // can have a variable that starts with the $ sign.
		System.out.println("The value of $Money is:  " + $Money); 



		int p, n;
		double x, y;

		x = 45.7;
		p = (int) (x + 0.5);
		System.out.println("Rounding the positive floating point 45.7 gives:  " + p); 
		System.out.println(); 

		x = 45.2;
		p = (int) (x + 0.5);		
		System.out.println("Rounding the positive floating point 45.2 gives:  " + p); 			
		System.out.println(); 


		y = -22.4;
		n = (int) (y - 0.5);
		System.out.println("Rounding the negative floating point -22.4 gives:  " + n); 
		System.out.println(); 

		y = -22.8;
		n = (int) (y - 0.5);
		System.out.println("Rounding the negative floating point -22.8 gives:  " + n); 
		System.out.println(); 
		 	
		// Activate the following code and view the error by the last assignment statement i = d;
		// then deactivate the code to run the remainder of the program.
		/*
		double d;
		int  i;
		i = 45;		// OK, because we assign an int to an int 
		d = i;		// OK, because d is more inclusive than i. The value           			45.0 is stored in d. 
		i = d; 
		 */

		// Activate the following code and view the error by the  assignment  SALES_TAX_RATE = 3.14;
		// then deactivate the code to run the remainder of the program.
		/*	
		final double SALES_TAX_RATE =7.85;   // declaring SALES_TAX_RATE as a constant (final variable)
		SALES_TAX_RATE = 3.14;
		 */
			
		int i = (int) 3.14;  // i gets 3
		System.out.println("The value of (int) 3.14  is: " + i); 
		double d = (double) 5 / 4;
		System.out.println("The value of (double) 5 / 4  is: " + d); 	
		System.out.println(); 

	
		System.out.println(); 
		System.out.println("The value of (int) 99.93 is: " +  ((int) 99.93));
		System.out.println("The value of (double) 17 is: " +  ((double) 17));
		System.out.println("The value of (long) 10000000 is: " +  ((long) 10000000));
		System.out.println(); 

		int totalPoints = 167;
		int numOfTurns = 5;
		double ave1, ave2;
		ave1 = totalPoints / numOfTurns;
		ave2 = (double) totalPoints / numOfTurns;

		System.out.println("The value of totalPoints / numOfTurns is: " +  ave1);
		System.out.println(); 
		System.out.println("The value of (double) totalPoints / numOfTurns is: " +  ave2);
		System.out.println(); 

		String message;
		x = 20;
		y = 35;
		message = "Bill sold " + x + " and Sylvia sold " + y + " subscriptions.";
		System.out.println(message);
		System.out.println(); 		

		System.out.println("\"number \" + 3 + 4 concatenates to " + "number " + 3 + 4); 
		System.out.println("\"number \" + (3 + 4) concatenates to " + "number " + (3 + 4)); 
		System.out.println("\"number \" + 3 * 4 concatenates to " + "number " + 3 * 4); 
		System.out.print("3 + 4 + \"number\" concatenates to ");
		System.out.println(3 + 4 + " number"); 
		System.out.println(); 

		message = "As the train left the station, the conductor yelled, \"All aboard.\"";
		System.out.println(message); 
		System.out.println(); 

		System.out.println("C:\\\\Java\\\\Ch3.doc" + " prints as " + "C:\\Java\\Ch3.doc");

		System.out.println("Program Terminated."); 
	} // end main() method

} // end Ch3Sect1And2Demo.java
