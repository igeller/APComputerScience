// FileName:  CircleCalculator.java

package ch03;

import java.util.Scanner;


public class CircleCalculator
{

	public static void main (String [] args)
	{	
		// Declare a Scanner variable reader and construct the Scanner
		// object that will read input from the keyboard.
		Scanner reader = new Scanner (System.in);

		// Prompt the user to enter the radius of a circle.
		System.out.println("Enter the radius of the circle: ");


		// read the radius value from the keyboard and store it in the
		// variable named radius.
		double radius = reader.nextDouble();

		// Call the calculateArea method and pass it the radius entered
		// from the keyboard and store the returned result in the double
		// variable named area.
		double area = calculateArea(radius);
		
		// Output the area of the circle to the screen.
		System.out.println("The area of the circle is " + area);
	
		//------------------------------------------------------------
		// Call the calculateCircumference method and pass it the radius entered
		// from the keyboard and store the returned result in the double
		// variable named circumference.
		double circumference = calculateCircumference(radius);

		// Output the circumference of the circle to the screen.
		System.out.println("The circumference of the circle is " + circumference);

		//------------------------------------------------------------

		// Call the calculateDiameter method and pass it the radius entered
		// from the keyboard and store the returned result in the double
		// variable named diameter.
		double diameter = calculateDiameter(radius);
		
		
		// Output the diameter of the circle to the screen.
		System.out.println("The diameter of the circle is " + diameter);
		

	} // end main method


	// Write the method calculateArea.  It returns a double value.
	// It receives one parameter named r of type double representing
	// the radius of a circle.  The method calculates the area of the
	// circle with the radius r and stores it in the variable area.
	// You must use a method of the Math class to calculate the r-squared.
	// Be sure and use the Math class constant PI in your calculation.
	// The method returns the area of the circle stored in the variable area.
	public static double calculateArea (double r)
	{
		// double area = 3.14159 * r * r;//
		
		double area = Math.PI * Math.pow(r, 2);
		return area;
	}	


	// Write the method calculateCircumference.  It returns a double value.
	// It receives one parameter named r of type double representing
	// the radius of a circle.  The method calculates the circumference of the
	// circle with the radius r and stores it in the variable circumference.
	// Be sure and use the Math class constant PI in your calculation.
	// The method returns the circumference of the circle stored in the variable
	// circumference.
	public static double calculateCircumference (double r)
	{
		double circumference = Math.PI * 2 * r;
		return circumference;
	}



	// Write the method calculateDiameter.  It returns a double value.
	// It receives one parameter named r of type double representing
	// the radius of a circle.  The method calculates the diameter of the
	// circle with the radius r and stores it in the variable diameter.
	// The method returns the diameter of the circle stored in the variable diameter.
	public static double calculateDiameter (double r)
	{
		double diameter = 2 * r;
		return diameter;
	}



}	// end of program.  Do NOT write code beyond this line!














