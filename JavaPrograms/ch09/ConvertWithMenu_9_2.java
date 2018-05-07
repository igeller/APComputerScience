package ch09;

/* Example 9.2: ConvertWithMenu.java
A menu-driven temperature conversion program that converts from
Fahrenheit to Celsius and vice versa.

THIS IS A MENU-CONTROLLED INPUT PROGRAM.
 */

import java.util.Scanner;

public class ConvertWithMenu_9_2 
{
	public static void main (String [] args) 
	{
		Scanner reader = new Scanner(System.in);
		Thermometer thermo = new Thermometer();
		String menu;           // The multiline menu
		int menuOption;        // The user's menu selection

		//Build the menu string
		menu = "\n1) Convert from Fahrenheit to Celsius"
					+ "\n2) Convert from Celsius to Fahrenheit"
					+ "\n3) Quit"
					+ "\nEnter your option: ";

		
		menuOption = 4;				// prime the loop to start
		while (menuOption != 3)
		{
			//Display the menu and get the user's option
			System.out.print(menu);
			menuOption = reader.nextInt();
			System.out.println ();

			//Determine which menu option has been selected
			if (menuOption == 1)   			// Convert from Fahrenheit to Celsius
			{        
				System.out.print("Enter degrees Fahrenheit: ");
				double fahr = reader.nextDouble();
				thermo.setFahrenheit(fahr);
				System.out.println ("The equivalent in Celsius is " + thermo.getCelsius());
			}
			else if (menuOption == 2)   		// Convert from Celsius to Fahrenheit
			{  
				System.out.print("Enter degrees Celsius: ");
				double celsius = reader.nextDouble();
				thermo.setCelsius(celsius);
				System.out.println ("The equivalent in Fahrenheit is " + thermo.getFahrenheit());
			}
			else if (menuOption == 3)  		
				System.out.println("Goodbye!");		// ends loop
			else
				System.out.println ("Invalid option");	// Invalid option; re-enter choice
		}
		
		System.out.println("El Programmo Terminante!");
	}
}
