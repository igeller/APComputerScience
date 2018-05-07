package ch04;

import java.util.Scanner;

public class Ch4Sect1And2Demo
{

	public static void main(String[] args)
	{
		// CHAPTER 4 SECTION 1 CODING EXAMPLES
		// CHAPTER 4 SECTION 1 CODING EXAMPLES
		// CHAPTER 4 SECTION 1 CODING EXAMPLES

		// generate a random double in the range of 0.0 inclusive to 1.0 exclusive.
		double h = Math.random(); 

		// output the random double
		System.out.println("The random double is: " + h);

		// generate a random double in the range of 1.0 to 100.9999999 
		h = Math.random() * 100 + 1; 

		System.out.println("The random double is: " + h);

		System.out.println();

		// generate a random int in the range of 0 inclusive to 5 inclusive
		int r = (int) (Math.random() * 6);

		System.out.println("The random int is: " + r);

		// generate a random int in the range of  -600 to 1000
		r = (int) (Math.random() * 1601) - 00;

		System.out.println("The random int is: " + r);

		System.out.println();
		// ***********************************************************
		int x = 10;
		System.out.println("The initial value of x is: " + x);

		x += 5;		// equivalent to x = x + 5;	   x now holds 15
		System.out.println("The value of x after the line x += 5 is: " + x);

		x -= 3;		// equivalent to x = x - 3;		x now holds 12
		System.out.println("The value of x after the line x -= 3 is: " + x);

		x *= 2;		// equivalent to x = x * 2;		x now holds 24
		System.out.println("The value of x after the line x *= 2 is: " + x);

		x /= 4;		// equivalent to x = x / 4;		x now holds 6
		System.out.println("The value of x after the line x /= 4 is: " + x);

		x %= 5;		// equivalent to x = x % 5;	x now holds 1
		System.out.println("The value of x after the line x %= 5 is: " + x);


		String str = "Java";
		System.out.println("The initial value of str is: " + str);

		str += " Rules!";  // equivalent to str = str + � Rules�;   str holds �Java Rules�
		System.out.println("The value of str is currently: " + str);
		System.out.println();

		// ---------------------------------------------------------

		// The Increment operator is ++
		// It increases the value of an int or double variable by 1.

		// The Decrement operator is --
		// It decreases the value of an int or double variable by 1.

		// The following code shows you how to use ++ and -- 

		x = 10; 
		System.out.println("The initial value of x is: " + x);

		x++;       // equivalent to x = x + 1; or x += 1;    x now holds 11
		System.out.println("The value of x after the line x++ is: " + x);

		int y = 20;
		System.out.println("The initial value of y is: " + y);

		y--;	        // equivalent to y = y - 1; or y -= 1;	   y now holds 19
		System.out.println("The value of y after the line y-- is: " + y);

		double w= 7.8;
		System.out.println("The initial value of w is: " + w);

		w++;      // equivalent to w = w + 1; or w += 1; w now holds 8.8
		System.out.println("The value of w after the line w++ is: " + w);

		double z = 14.3;
		System.out.println("The initial value of z is: " + z);

		z--;	        // equivalent to z = z - 1; or z -= 1;	   z now holds 13.3
		System.out.println("The value of z after the line z-- is: " + z);

		System.out.println();

		// -------------------------------------------------------------------

		// CHAPTER 4 SECTION 2 CODING EXAMPLES
		// CHAPTER 4 SECTION 2 CODING EXAMPLES
		// CHAPTER 4 SECTION 2 CODING EXAMPLES

		int a = 3, b = 7, c = 10, d = -20;
		if (a < b)		// for the values above it evaluates to true
			System.out.println("a < b is true");
		if (a <= b)		// for the values above it evaluates to true
			System.out.println("a <= b is true");
		if (a == b)		// for the values above it evaluates to true
			System.out.println("if a had been equal to b then this would print");
		if (a != b)		// for the values above it evaluates to true
			System.out.println("if a is NOT equal to b then this will print");
		if (a - b > c + d)		// for the values above it evaluates to true
			System.out.println("a - b > c + d  is true");

		System.out.println();

		// ----------------------------------------------------------------
		Scanner reader = new Scanner (System.in);

		System.out.print ("Enter an integer: ");

		int num = reader.nextInt();

		if (num % 5 == 0) 
		{
			System.out.println(num + " is evenly divisible by 5");
		}

		System.out.println();
		// -----------------------------------------------------------------
		/*
		Here is code that will calculate a salesperson�s pay.
		It will double a salesperson�s commission from 10% to 20%,
		if sales are over $2,000.00:
		 */
		double commission = 0.10;  // regular commission is 10%

		System.out.print("Enter the person's sales for the month: ");
		double sales = reader.nextDouble();

		if (sales > 2000.00)
			commission *= 2;

		double pay = sales * commission;
		System.out.println("Your pay is: " + pay);

		System.out.println();

		// --------------------------------------------------------------

		/*
		If a worker is paid $8.50 per hour for all hours up to and including
		40 hours per week, but is paid a time and a half wage of $12.75 per hour
		for any hours over 40 hours per week, then the person�s pay could be
		calculated using the following:
		 */
		System.out.print("Enter the number of hours worked this week: ");
		double hoursWorked = reader.nextDouble();

		pay = hoursWorked * 8.50; //already declared as a double

		if (hoursWorked > 40)
		{
			double overTimeHours = hoursWorked - 40;
			pay += overTimeHours * 4.25;
		}

		System.out.println("The employee's pay is: " + pay);

		// -------------------------------------------------------------




		System.out.println();
		System.out.println("Program has ended!");

	} // end of main method

}
