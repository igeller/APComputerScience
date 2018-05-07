package ch04;
// Chapter 4 Section 4 Programming Exercises
// FileName:  ExtendedIfOps.java
public class ExtendedIfOps 
{
	public static void main (String[] args)
	{		
		// PART 1. EXTENDED IF STATEMENT WITH SIMPLE BOOLEAN EXPRESSIONS.

		// Generate a random integer value in the range of 1 to 5 inclusive
		// and store it in the integer variable named randomMathOp.
		int randomMathOp = (int) (Math.random()*4)+1;

		// Finish the next line of code so that the value of randomMathOp is printed.
		System.out.println("The number of the random math operation is: " + randomMathOp);

		// Generate a random integer value in the range
		// of 1 to 1000 inclusive and store it
		// in the integer variable named num.
		int num = (int)(Math.random()*999) + 1;

		// Finish the next line of code so that the value of num is printed.
		System.out.println("The random integer between 1 and 1000 inclusive is: " + num );

		// Call the method processRandomMathOp an pass it the variables named
		// randomMathOp and num.
		processRandomMathOp (randomMathOp, num);

		System.out.println();
		System.out.println();

		// **************************************************************

		// PART 2. USE ONLY AN EXTENDED IF STATEMENT THAT HAS
		// COMPOUND BOOLEAN EXPRESSIONS IN THIS PART OF THE PROGAM!!! 

		// Generate a random floating-point value in the range of -30 inclusive to 150
		// exclusive and store it in the floating-point variable named temp.
		double temp = (Math.random()*180) - 30;

		// Finish the next line of code so that the value of temp is printed.
		System.out.println("The random temperature is: " + temp);

		// Call the method processTemperature an pass it the variable named temp.
		processTemperature (temp);

	} // end of main


	//    READ ALL OF THE FOLLOWING INSTRUCTIONS BELOW BEFORE COMPLETING
	// 			ANY CODE INSIDE THE processRandomMathOp METHOD BELOW!!!
	//
	// 			WRITE ALL CODE AT THE END OF THESE INSTRUCTIONS!!
	//						(NOT INSIDE THESE INSTRUCTIONS)
	//
	// WHEN YOU WRITE THE EXTENDED IF STATEMENT IN THE METHOD BELOW
	// MAKE SURE THAT THE FINAL BRANCH IS AN ELSE BRANCH.  USE ONLY AN
	// EXTENDED IF STATEMENT THAT HAS SIMPLE BOOLEAN EXPRESSIONS.
	// --------------------------------------------------------------------
	// In branch one of the extended if statement, process the variable
	// randomMathOp in the following way ....
	// If the value of randomMathOp is 1,
	// then the square root of num will be stored in result and then
	// result will be printed using the statement:
	// System.out.println("The square root of num is: " + result);
	// YOU MUST USE Math.sqrt TO CALCULATE THE SQUARE ROOT.
	// --------------------------------------------------------------------
	// In branch two of the extended if statement, process the variable
	// randomMathOp in the following way ....
	// If the value of randomMathOp is 2,
	// then the square of num will be stored in result and then
	// result will be printed using the statement:
	// System.out.println("The square of num is: " + result);
	// YOU MUST USE Math.pow TO CALCULATE THE SQUARE.
	// --------------------------------------------------------------------
	// In branch three of the extended if statement, process the variable
	// randomMathOp in the following way ....
	// If the value of randomMathOp is 3,
	// then the cube of num will be stored in result and then
	// result will be printed using the statement:
	// System.out.println("The cube of num is: " + result);
	// YOU MUST USE Math.pow TO CALCULATE THE CUBE.
	// --------------------------------------------------------------------
	// In branch four of the extended if statement, process the variable
	// randomMathOp in the following way ....
	// If the value of randomMathOp is 4,
	// then a random integer between 1 and num be generated and stored 
	// in result and then result will be printed using the statement:
	// System.out.println("The random integer between 1 and " + num + " is: " + result);
	// YOU MUST USE Math.random TO GENERATE THE RANDOM VALUE.
	// -----------------------------------------------------------------------
	// In branch five of the extended if statement, (the else branch)
	// process the variable randomMathOp in the following way ....
	// If the value of randomMathOp is 5, the else branch will be executed
	// and then the square root of (num squared plus num squared) will be 
	// calculated (YOU MUST USE Math.pow AND Math.sqrt IN ALL CALCULATIONS.)
	// and stored in result and then result will be printed using the statement:
	// System.out.println("The square root of num squared plus num squared is: " + result);
	//
	public static void processRandomMathOp (int randomMathOp, int num)
	{
		// Declare the floating-point variable result to be used to hold
		// the value of any calculation in this method.  You can initialize
		// it to 0.0.  Once you declare result DO NOT REDECLARE IT!
		double result = 0.0;
		
		if (randomMathOp == 1.0)
			{
			result = Math.sqrt(num);
			System.out.println("The square root of num is: " + result);
			}
		else if (randomMathOp == 2.0)
		{
			result = Math.pow(num, 2);
			System.out.println("The square of num is: " + result);
		}
		else if (randomMathOp == 3.0)
		{
			result = Math.pow(num, 3);
			System.out.println("The cube of num is: " + result);
		}
		else if (randomMathOp == 4.0)
		{
			result = (int)(Math.random()*num)+1;
			System.out.println("The random integer between 1 and " + num + " is: " + result);
		}
		else
		{
			result = Math.sqrt((Math.pow(num, 2)) + num);
			System.out.println("The square root of num squared plus num squared is: " + result);
		}
		
		
		
		

	}


	// Complete the following method so that the value in the parameter temp
	// is processed by an EXTENDED IF STATEMENT WITH COMPOUND BOOLEAN EXPRESSIONS.
	public static void processTemperature(double temp)
	{
		// Write an EXTENDED IF STATEMENT that has a compound boolean
		// expression for each condition that will test temp to see
		// if it is in one of the following ranges ....
		// Note how each range is identified:
		// 		temp >= -30.0		and 		<   0.0 		....  "Very Cold"
		// 		temp >=   0.0  		and 		<= 30.0		....  "Cold"
		// 		temp >   30.0  		and 		<  60.0	 	....  "Cool"
		// 		temp >=  60.0  		and 		<  90.0	 	....  "Warm"
		// 		temp >=  90.0	  	and 		< 120.0	 	....  "Hot"
		// 		temp >= 120.0  		and 		< 150.0 		....  "Very Hot"

		// WHEN YOU WRITE THE EXTENDED IF STATEMENT DO NOT HAVE AN
		// ENDING ELSE BRANCH.  THE LAST BRANCH SHOULD BE AN ELSE IF.
		// Inside each branch of the extended if print the appropriate
		// output statement like "The temperature is Very Cold."
		if (temp >= -30.0 && temp< 0.0)
			System.out.println("The temperature is Very Cold.");
		else if (temp >= 0.0 && temp<=30.0)
			System.out.print("The temperature is Cold.");
		else if (temp>30.0 && temp<60.0)
			System.out.println("The temperature is Cool.");
		else if (temp>=60.0 && temp<90.0)
			System.out.print("The temperature is Warm.");
		else if (temp>=90.0 && temp<120.0)
			System.out.println("The temperature is Hot.");
		else if (temp>=120.0 && temp<150.0)
			System.out.println("The temperature is Very Hot.");
		
		
		

		
		
		
		
	} // end of processTemperature method
	
} // end of ExtendedIfOps class.










