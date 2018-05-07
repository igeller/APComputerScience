package ch02;

import java.util.Scanner;

// File:  QuartsToLiterConverter.java

/* INSTRUCTIONS:

Write the code for a program that first asks for the users
favorite soda.  What kind of a variable should it be stored in?

Next, you should ask for the number of quarts of soda and convert
the quarts to liters. What type of variables should be used for
this? (We want an exact result.)

Next, you should ask for the number of liters of soda and convert
the liters to quarts. What type of variables should be used for
this? (We want an exact result.)

Use the following conversion factors in your calculations:

		1 Quart is equivalent to 0.9463529 Liter.

		1 Liter is equivalent to 1.0566888 Quarts.

Here is a sample run of the program.  You should get these results if 4.0 and 2.0 are entered

	Enter the name of your favorite soda:  Raspberry Cola

	Enter the number of quarts:  4.0
	4.0 quarts of Raspberry Cola is equivalent to 3.7854116 liters.

	Enter the number of liters:  2.0
	2.0 liters of Raspberry Cola is equivalent to 2.1133776 quarts.

	Program Terminated.
*/
public class QuartsToLiterConverter
{
	public static void main (String[] args)
	{
		// WRITE YOUR CODE BELOW THIS LINE AND THE LINE SEEN BELOW.
		
		Scanner reader = new Scanner (System.in);
		
		double quart;
		double liter;

								
		
		System.out.print("Enter the name of your favorite soda: ")	;
		//STORE THE ANSWER? LETS SEE
		String Favorite_soda;
		Favorite_soda = reader.nextLine();

	
		
		System.out.println();
		System.out.println();
				
		
		System.out.print("Enter the number of quarts: ");
		quart = reader.nextDouble();
		
		liter = quart * 0.9463529;

		System.out.print(quart + " quarts of " + Favorite_soda +  " is equivalent to " + liter + " liters.");
		
		
		System.out.println();
		System.out.println();
		System.out.println();

		
		System.out.print("Enter the number of liters: ");
		liter = reader.nextDouble();
		
		quart = liter * 1.0566888;
		
		System.out.print(liter + " liters of " + Favorite_soda + " is equivalent to " + quart + " quarts.");
		
		
		System.out.println();
		System.out.println();
		System.out.println();

		
		System.out.print("Program has terminated.");
	} // end of main method
}















