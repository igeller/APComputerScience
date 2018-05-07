package ch04;
// Chapter 4 Section 2 Programming Exercises
// FileName:  IfOps.java
public class IfElseOps
{
	public static void main (String[] args)
	{		
		// Generate a random integer value in the range of 400 to 999
		// and store it in the whole number variable named x.
		int x = (int)(Math.random() * 599) + 400;

		// PART 1.  USE ONLY IF STATEMENTS IN THIS SECTION!!!

		// Write an IF STATEMENT that will test x to see if it is
		// greater than 700.  If it is then output the statement ...
		// "The random integer is larger than 700".
		if (x > 700)
		{
			System.out.println("The random integer is larger than 700");
		}


		// Write an IF STATEMENT that will test x to see if it is smaller
		// than or equal to 500.  If it is then output the statement ... 
		// "The random integer is smaller than or equal to 500".
		if (500 >= x)
		{
			System.out.println("The random integer is smaller than or equal to 500");
		}
		
		
		
		// WE WON'T PRINT ANYTHING IF THE RANDOM NUMBER IS BETWEEN 500 AND 700.
		

		System.out.println();

		// Write an output statement to print the random value stored in x.
		System.out.println("The random Value stored in x is " + x);

		System.out.println();
		System.out.println();

		// PART 2.  USE ONLY IF-ELSE STATEMENTS IN THIS SECTION WHERE INSTRUCTED.

		// Generate a random floating-point value
		// in the range of 50.0 to 125.0 (not including 125.0)
		// and store it in the floating-point variable named y.
		double y = Math.random() * 75;

		// Write an IF-ELSE STATEMENT that will test y and print
		// out whether it is less than 100.0 or whether it is greater
		// than or equal to 100.0.  Print either the output statement ...
		// "The random value is less than 100.0"  OR
		// "The random value is greater than or equal to 100.0"
		// There are two possible ways to write your if condition.
		if (y < 100.0)
		{
			System.out.println("The random value is less than 100.0");
		}
		else 
		{
			System.out.println("The random value is greater than or equal to 100.0");
		}
		// Finally, output the value stored in y with the message
		// "The random value stored in y is "
		System.out.println("The random vale stored in y is " + y);

		// Generate a random floating-point value
		// in the range of 10.0 to 30.0 (not including 30.0)
		// and store it in the floating-point variable named z.
		double z  = Math.random() * 20;

		// Write an IF-ELSE STATEMENT that will test Z and print
		// out whether it is greater than or equal to 20.0 or
		// whether it is smaller than 20.0.  If it is greater than
		// or equal to 20.0 then output the statement ... 
		// "The random value is greater than or equal to 20.0"
		// otherwise output the statement
		// "The random value is less than 20.0"
		// There are two possible ways to write your if condition.
		if (z >= 20.0)
		{
			System.out.println("The random value is greater than or equal to 20.0");
		}
		else
		{
			System.out.println("The random value is less than 20.0");
		}

		// Finally, output the value stored in z with the message
		// "The random value stored in z is "
		System.out.println("The random value stored in z is " + z);

		System.out.println();
		System.out.println();

		// PART 3.  PROCESSING TWO RANDOM VALUES WITH A METHOD.
		
		// Generate a random integer value in the range of 1 to 50 inclusive
		// and store it in the whole number variable named a.
		int a = (int)(Math.random()*49) + 1;

		// Generate a random integer value in the range of 1 to 50 inclusive
		// and store it in the whole number variable named b.
		int b = (int)(Math.random()*49) + 1;

		// Stop and write the processNumbers method below and then call it here
		// passing it both a and b.
		processNumbers (a, b);
		
	} // end of main

	
	// READ ALL OF THE FOLLOWING CAREFULLY BEFORE STARTING TO CODE THIS METHOD.
	// Write the method processNumbers that receives two integer parameters
	// named num1 and num2.  The method should first immediately print the value
	// of num1 and num2 on separate lines along with the messages:
	//	"The value of num1 is "
	// "The value of num2 is ".
	
	// NEXT, USE AN IF-ELSE STATEMENT TO PROCESS THE FOLLOWING:
	
	// If num1 IS GREATER THAN OR EQUAL TO num2, then the method should print:
	// "No calculation, because num1 is greater than or equal to num2."  AND THEN
	// THE METHOD SHOULD END WITHOUT DOING ANYTHING ELSE.  OTHERWISE .....
	// IF THE VALUE OF num1 IS LESS THAN num2, then the method should print the
	// result of 50 times num1 along with the message:  "50 times num1 is "
	// and on another line print the result of num2 squared along
	// with the message:  "the square of num2 is ".
	// Finally, use a nested if-else statement inside of one of the branches you
	// write to print ONLY ONE of the following messages:
	//		"50 times num1 is greater than the square of num2"  or
	// 		"50 times num1 is less than or equal to the square of num2".
	public static void processNumbers (int num1, int num2)
	{
		System.out.println("The value of num1 is " + num1);
		System.out.println("The value of num2 is " + num2);
		
		if (num1 >= num2)
			System.out.println("No clculation, because num1 is greater than or equal to num2.");
		else 
			{
			double num1Times50 = num1 * 50.0;
			System.out.println("50 times num1 is " + num1Times50);
			
			double num2Sq = (double)Math.pow(num2, 2);
			System.out.println("the square of num2 is " + num2Sq);
			
			if (num1Times50 > num2Sq)
				System.out.println("50 times num1 is greater than the square of num2");
			else 
				System.out.println("50 times num1 is less than or equal to the square of num2");
			}
		
	}
	
	// Here are three sample runs of the method with the output:
	//
	//	The value of num1 is 8
	//	The value of num2 is 12
	//	50 times num1 is 400.0
	//	the square of num2 is 144.0
	//	50 times num1 is greater than the square of num2
	//
	//	The value of num1 is 8
	//	The value of num2 is 27
	//	50 times num1 is 400.0
	//	the square of num2 is 729.0
	//	50 times num1 is less than or equal to the square of num2
	//
	//	The value of num1 is 37
	//	The value of num2 is 6
	//	No calculation, because num1 is greater than or equal to num2.

	
	
	
	
	
	
	
	
	
}





