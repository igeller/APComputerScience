// Chapter 4 Section 1 Program
// FileName:  MathOps.java
// Complete the code in the main method based on the inline instructions.

package ch04;

import java.util.Scanner;


public class MathOps
{
	public static void main (String[] args){

		// Declare a Scanner variable named reader and instantiate a Scanner object
		Scanner reader = new Scanner (System.in);

		int a = 0;
		double b = 12.75;
		String s = "Hello ";

		System.out.println("The original value stored in a is:  " + a);
		System.out.println("The original value stored in b is:  " + b);
		System.out.println("The original value stored in s is:  " + s);
		System.out.println();

		// Part 1.  Extended Assignment, increment, and decrement operators.
		// YOU MUST USE THESE OPERATORS IN COMPLETING THE FOLLOWING CODE.
		
		// Use an extended assignment operator statement to add 10 to the value 
		// stored in a and store it back in a
		a+=10;

		// After writing the above line of code activate this output line.
		System.out.println("The value stored in a is:  " + a);

		// Use the decrement operator to decrease the value stored in a by one.
		a --;

		// After writing the above line of code activate this output line.
		System.out.println("The value stored in a is:  " + a);

		// Use an extended assignment operator statement to divide b by 4 and
		// store the result back in b
		b/=4;

		// After writing the above line of code activate this output line.
		System.out.println("The value stored in b is:  " + b);

		// Use the increment operator to increase the value stored in a by one
		b ++;

		// After writing the above line of code activate this output line.
		System.out.println("The value stored in a is:  " + a);

		// Use an extended assignment operator statement to concatenate "World"
		// to the value stored in s and store the result back in s
		s += "World";

		// After writing the above line of code activate this output line.
		System.out.println("The value stored in s is:  " + s);

		// Use an extended assignment operator statement to mod a by 3 and
		// store the result back in a
		a %= 3;

		// After writing the above line of code activate this output line.
		System.out.println("The value stored in a is:  " + a);

		// Use an extended assignment operator statement to multiply b by 4 and
		// store the result back in b
		b *= 4;

		// After writing the above line of code activate this output line.
		System.out.println("The value stored in b is:  " + b);

		// *********************************************************************************
		// Part 2.  Math Class Operations
		// YOU MUST CALL MATH CLASS METHODS WHEN APPLICABLE IN THIS CODE.

		// After the prompt, receive a negative integer from the keyboard and
		// store it in the variable negative1 (make sure you declare negative1)
		System.out.print("Enter a negative integer and press return:  ");
		int negative1= reader.nextInt();
		
		// After writing the above line of code activate this output line.
		System.out.println("The value stored in negative1 is:  " + negative1);

		// Use a Math class method to find the absolute value of the value stored 
		// in negative1 and assign it to the integer variable named positive1
		// (make sure you declare positive1)
		int positive1 = Math.abs(negative1);

		// After writing the above line of code activate this output line.
		System.out.println("The value stored in positive1 is:  " + positive1);

		// ---------------------------------------

		// After the prompt, receive a negative floating-point number from the keyboard and
		// store it in the variable negative2 (make sure you declare negative2)
		System.out.print("Enter a negative floating point number and press return:  ");
		double negative2 = reader.nextDouble();

		// After writing the above line of code activate this output line.
		System.out.println("The value stored in negative2 is:  " + negative2);

		// Use a Math class method to find the absolute value of the value stored 
		// in negative2 and assign it to the floating-point variable named positive2
		// (make sure you declare positive2)
		double positive2 = Math.abs(negative2);

		// After writing the above line of code activate this output line.
		System.out.println("The value stored in positive is:  " + positive2);

		// ---------------------------------------

		// After the prompt, receive a floating point value from the keyboard and store it in
		// the floating-point variable named base (make sure you declare base)
		System.out.print("Enter a floating point value for the base and press return:  ");
		double base = reader.nextDouble();

		// After the prompt, receive a double value from the keyboard and store it in
		// the floating-point variable exponent (make sure you declare exponent)
		System.out.print("Enter a floating point value for the exponent and press return:  ");
		double exponent = reader.nextDouble();

		// After writing the above line of code activate this output line.
		System.out.println("The value stored in base is:  " + base);

		// After writing the above line of code activate this output line.
		System.out.println("The value stored in exponent is:  " + exponent);

		// Use a Math class method to find the power value of base raised to
		// exponent and store it in the floating-point variable result
		// (make sure you declare result)
		double result = Math.pow(base, exponent);

		// After writing the above line of code activate this output line.
		System.out.println("The value stored in result is:  " + result);

		// ---------------------------------------

		// After the prompt, receive a floating-point value from the keyboard and store it in
		// the floating-point variable x (make sure you declare x)
		System.out.print("Enter a floating point value to find the square root of:  ");
		double x = reader.nextDouble();

		// Use a Math class method to find the square root of the value stored in x and
		// store the result in the floating-point variable y  (make sure you declare y)
		double y = Math.sqrt(x);

		// After writing the above line of code activate this output line.
		System.out.println("The value stored in y is:  " + y);

		// Output to the screen the value of the constant PI as defined in the
		// Math class along with the string "The value of PI is ".
		System.out.println("The value of PI is " + Math.PI);
		

		// *********************************************************************************
		// Part 3.  Generating Random Values with Math.random()
		// READ THE INSTRUCTIONS CAREFULLY.  YOU WILL ACTIVATE SOME LINES!!!

		// Generate a random floating point value in the range of 0.0 <= d1 < 1.0
		// where 0.0 is included but 1.0 is not.  Store it in the floating-point
		// variable d1 (make sure you declare d1).
		double d1 = Math.random();
		
		// After writing the above line of code activate the following output lines.
		System.out.print("The random value floating point value between 0.0 inclusive up to 1.0");
		System.out.println(" exclusive that is stored in d1 is:  " + d1);

		// Generate a random floating point value in the range of 0.0 <= d2 < 5.3
		// where 0.0 is included but 5.3 is not.  Store it in the floating-point
		// variable d2 (make sure you declare d2).
		double d2 = Math.random()* 5.3;
		
		// After writing the above line of code activate the following output lines.
		System.out.print("The random value floating point value between 0.0 inclusive up to 5.3");
		System.out.println(" exclusive that is stored in d2 is:  " + d2);


		// Generate a random floating point value in the range of 0 <= d3 < 100.0
		// where 0.0 is included but 100.0 is not.  Store it in the floating-point
		// variable d3 (make sure you declare d3).
		double d3 = Math.random() * 100.0;
		
		// After writing the above line of code activate the following output lines.
		System.out.print("The random value floating point value between 0.0 inclusive up to 100.0");
		System.out.println(" exclusive that is stored in d3 is:  " + d3);


		// Generate a random floating point value in the range of 13.4 <= d4 < 25.9
		// where 13.4 is included but 25.9 is not.  Store it in the floating-point
		// variable d4 (make sure you declare d4).
		double d4 = Math.random() * 12.5 + 13.4;
		
		// After writing the above line of code activate the following output lines.
		System.out.print("The random value floating point value between 13.4 inclusive up to 25.9");
		System.out.println(" exclusive that is stored in d4 is:  " + d4);

		// ---------------------------------------

		// Generate a random integer value in the range of 0 <= i1 <= 100
		// where both 0 and 100 can be generated.  Store it in the integer
		// variable i1 (make sure you declare i1).
		int i1 = (int) (Math.random() * 100);
		
		// After writing the above line of code activate the following output lines.
		System.out.print("The random value integer value between 0 and 100 inclusive");
		System.out.println(" that is stored in i1 is:  " + i1);

		// Generate a random integer value in the range of 1 <= i2 <= 100
		// where both 1 and 100 can be generated.  Store it in the integer
		// variable i2 (make sure you declare i2).
		int i2 = (int) (Math.random() * 99) + 1;
		
		// After writing the above line of code activate the following output lines.
		System.out.print("The random value integer value between 1 and 100 inclusive");
		System.out.println(" that is stored in i2 is:  " + i2);

		// Generate a random integer value in the range of 23 <= i3 <= 78
		// where both 23 and 78 can be generated.  Store it in the integer
		// variable i3 (make sure you declare i3).
		int i3 = (int) (Math.random() * 55) + 23;
		
		// After writing the above line of code activate the following output lines.
		System.out.print("The random value integer value between 23 and 78 inclusive");
		System.out.println(" that is stored in i3 is:  " + i3);

		System.out.println("\nProgram Terminated!");

	} // end of main
}






