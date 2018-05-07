package ch09;

/* 
		Example 9.3: ConvertWithQuery.java

		Rewrite of ConvertWithQuery_9_1. java that contains try-catch statmetnes

		THIS IS A QUERY-CONTROLLED INPUT PROGRAM.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

import ch09.Thermometer;

public class ConvertWithQuery_9_3
{
	public static void main(String [] args) 
	{
		Scanner reader = new Scanner(System.in);
		Thermometer thermo = new Thermometer();
		String doItAgain = "y";             

		while (doItAgain.equals("y") || doItAgain.equals("Y"))
		{
			try
			{
				// Attempt statements that might throw exceptions
				System.out.print("\nEnter degrees Fahrenheit: ");
				double fahr = reader.nextDouble();
				thermo.setFahrenheit(fahr);	
				System.out.println("The equivalent in Celsius is " + thermo.getCelsius());
			}
			catch(InputMismatchException e)
			{
				// Execute this code if exception thrown
				System.out.println("Bad number format!  You did not input a number.");
			}
	
			reader.nextLine(); // consume newline character
			System.out.print("\nDo it again (y/n)? ");  
			doItAgain = reader.nextLine();
		}

		System.out.println("El Programmo Terminante!");
	}
}

