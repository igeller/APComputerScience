package ch03;

import java.util.Scanner;

/* FileName:  RectangleCalculator.java

This program is similar to the format of CircleCalculator and allows
the user to calculate the area, perimeter and diagonal length of a rectangle.
You must use Math.pow() when calculating the square of a value.
*/

public class RectangleCalculator
{
	public static void main (String [] args)
	{	
		// Declare a Scanner variable reader and construct the Scanner
		// object that will read input from the keyboard.
		Scanner reader = new Scanner (System.in);

		// Prompt the user to enter the width of a rectangle.
		System.out.print("Enter the width of a rectangle: ");
		
		// read the floating point width value from the keyboard
		// and store it in the variable named width.
		double width = reader.nextDouble();
		
		// Prompt the user to enter the height of a rectangle.
		System.out.print("Enter the height of a rectangle: ");
		
		// read the floating point height value from the keyboard
		// and store it in the variable named height.
		double height = reader.nextDouble();
		
		//  STOP AND WRITE THE calculateArea METHOD AT THE BOTTOM OF THIS FILE.
		
		// Call the calculateArea method and pass it the width and height
		// previously entered from the keyboard.  Store the returned result
		// in the floating point variable named area.
		calculateArea (width, height);
		double area = calculateArea (width, height);
		
		//  STOP AND WRITE THE printArea METHOD AT THE BOTTOM OF THIS FILE.
		
		// Call the method printArea and pass it the area of the square
		// so that it can be printed.  This is a void method call.
		 printArea (area);
		 
		// STOP AND RUN THE PROGRAM AND MAKE SURE IT WORKS CORRECTLY AND
		// GIVES CORRECT OUTPUT.
		
		
		//------------------------------------------------------------
		
		//  STOP AND WRITE THE calculatePerimeter METHOD AT THE BOTTOM OF THIS FILE.
		
		// Call the calculatePerimeter method and pass it the width and height
		// entered previously from the keyboard.  Store the returned result in
		// floating-point variable named perimeter.
		calculatePerimeter (width, height);
		double perimeter = calculatePerimeter (width, height);
		
		// Output the perimeter of the rectangle to the screen.
		System.out.println("The perimeter of the rectangle is: " + perimeter);
		
		
		// STOP AND RUN THE PROGRAM AND MAKE SURE IT WORKS CORRECTLY AND
		// GIVES CORRECT OUTPUT.
				
		//------------------------------------------------------------
		
		//  STOP AND WRITE THE calculateDiagonal METHOD AT THE BOTTOM OF THIS FILE.		

		
		// Call the calculateDiagonal method and pass it the width and height
		// entered previously from the keyboard.  Store the returned result in
		// floating-point variable named diagonal.
		calculateDiagonal (width, height);
		double diagonal = calculateDiagonal (width, height);
		
		
		// Output the diagonal of the rectangle to the screen.
		System.out.println("The length of the diagonal of the rectangle is: " + diagonal);
		
		
		// STOP AND RUN THE PROGRAM AND MAKE SURE IT WORKS CORRECTLY AND
		// GIVES CORRECT OUTPUT.
		
		
		System.out.println();
		System.out.println("Program has terminated.");
	} // end main method
	

	// Write the method calculateArea.  It returns a floating-point value.
	// It receives two floating point parameters named width and height.
	// The method calculates the area of the rectangle and stores it in
	// the variable area.  The method returns the area of the rectangle
	// stored in the variable area.
	public static double calculateArea (double width, double height){
		Double area = width * height;
		return area;
	}
	
	
	
	
	// Write the printArea method.  It is a void method.
	// It receives one parameter named area of type double representing
	// the area of a rectangle.  The method simply prints the area of the
	// rectangle and does no other work.
	public static void printArea (double area){
		System.out.println("The area of the rectange is: " + area);
	}
	
	
	

	// Write the method calculatePerimeter.  It returns a floating-point value.
	// It receives two floating point parameters named width and height.
	// The method calculates the perimeter of the rectangle and stores it in
	// the variable perimeter.  The method returns the perimeter of the square
	// stored in the variable perimeter.
	public static double calculatePerimeter (double width, double height){
		double perimeter = (width * 2) + (height * 2);
		return perimeter;
	}
	
	
	

	// Write the method calculateDiagonal.  It returns a floating-point value.
	// It receives two floating point parameters named width and height.
	// The method calculates the length of the diagonal of the rectangle and
	// stores it in the variable diagonal.  The method returns the length of
	// the diagonal stored in the variable diagonal.  You must use Math.pow()
	// and Math.sqrt when calculating the diagonal of the rectangle.
	public static double calculateDiagonal (double width, double height){
		double diagonal = Math.sqrt(Math.pow(width, 2)+ Math.pow(height, 2));
		return diagonal;
	}
	
	
	
	

}	// end of program.  Do NOT write code beyond this line!


