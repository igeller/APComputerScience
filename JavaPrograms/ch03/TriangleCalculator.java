package ch03.StudentFiles;

// FileName:  TriangleCalculator.java


import java.util.Scanner;

public class TriangleCalculator
{

	public static void main (String [] args)
	{	
		// Declare a Scanner variable reader and construct the Scanner
		// object that will read input from the keyboard.


		String answer = "y";
		while (answer.equals("y"))
		{

			// Prompt the user to enter the base of a right triangle.


			// read the base value from the keyboard and store it in the
			// floating-point variable named base.


			// Prompt the user to enter the height of a right triangle.


			// read the height value from the keyboard and store it in the
			// floating-point variable named height.


			//------------------------------------------------------------

			// Call the calculateArea method and pass it both the base
			// and the height. Store the returned result in the double
			// variable named area.


			// Output the area of the right triangle to the screen.


			//------------------------------------------------------------

			// Call the calculateHypotenuse method and pass it both the base
			// and the height. Store the returned result in the double
			// variable named hypotenuse.


			// Output the hypotenuse of the right triangle to the screen.


			//------------------------------------------------------------

			// Call the calculatePerimeter method and pass it the base,
			// the height, and the hypotenuse of the right triangle.
			// Store the returned result in the double variable named perimeter.


			// Output the perimeter of the right triangle to the screen.


			// Call the randomHypotenuse method.  There is nothing to pass it.
			// Store the value returned by the method in the double variable randHypot.


			// Output the random hypotenuse of the right triangle to the screen.

			// Ask the user whether they want to run the program again
			reader.nextLine(); // consume the new line character
			System.out.println();
			System.out.print("Type \"y\" to run the program again or any other letter to quit: ");
			answer = reader.nextLine();
			System.out.println();
		} // end of while true loop

		System.out.println("Program Terminated!");
	} // end main method


	// Write the method calculateArea.  It returns a double value.
	// It receives two parameters.  One named b of type double representing
	// the base of the right triangle.  A second one named h of type double
	// representing the height of the right triangle.  The method calculates
	// the area of the right triangle and stores it in the variable area.
	// The method returns the area of the right triangle.





	// Write the method calculateHypotenuse.  It returns a double value.
	// It receives two parameters.  One named x of type double representing
	// the base of the right triangle.  A second one named y of type double
	// representing the height of the right triangle.  The method calculates
	// the hypotenuse of the right triangle and stores it in the variable h.
	// You must use the Math class methods Math.sqrt() and Math.pow() in your
	// calculation.  The method returns the hypotenuse of the right triangle.



	// Write the method calculatePerimeter.  It returns a double value.
	// It receives three parameters.  One named x of type double representing
	// the base of the right triangle.  A second one named y of type double
	// representing the height of the right triangle.  A third one named h of
	// type double representing the hypotenuse of the right triangle.
	// The method calculates the perimeter of the right triangle and stores it
	// in the variable p.  The method returns the perimeter of the right triangle.



	// Write the method randomHypotenuse.  It returns a double value.
	// It receives no parameters. This method generates two random integer values
	/// for the two legs of a right triangle and then uses those two leg values to
	// calculate the hypotenuse of the associated right triangle.  The method will
	// also print the values of the two legs of the triangle.  The method will then
	// store the result in the variable hypotenuse and then return the value stored
	// in the variable hypotenuse.  For the range of int values use 1 <= leg <= 100.


	// generate a random integer between 1 and 100 inclusive for leg1
	
	// generate a random integer between 1 and 100 inclusive for leg2
	
	// Use those two legs to calculate the hypotenuse

}	// end of program.  Do NOT write code beyond this line!



























