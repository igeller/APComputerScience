package ch10;
/* 	Program:  EnhancedForLoopMania 1
	Chapter 10 Section 8
	Description:  This program gives the programmer experience with
	writing enhanced for loops.

	Concepts studied:
		1) declaring standard arrays using the new operator.
		2) writing enhanced for loops.
		3) processing lists of objects
		4) writing methods that return arrays.
*/

public class EnhancedForLoopMania1
{
	public static void main (String[] args)
	{			
		// ************* PART 1.  AN ARRAY OF INTEGERS. ******************

		// Declare and instantiate a standard array called nums that
		// will hold 100 integer values.  DO NOT USE AN INITIALIZER LIST!!!	
		int [] nums = new int [100];

		// Write a loop that will store random integers between -100 and 100
		// inclusive in nums.   DO NOT USE AN ENHANCED FOR LOOP!
		for (int i = 0; i < nums.length; i++)
		{
			nums[i] = (int)((Math.random()*201)-100);
		}
		

		// Stop and write the method named printNumbers below the main method
		// and then call it here passing it the array nums.
		System.out.println("Here is the entire nums array...\n");
		printNumbers(nums);	

		System.out.println();
		System.out.println();

		// Stop and write the method named printMultiplesOfFive below the main
		// method and then call it here passing it the array nums.
		System.out.println("Here are the multiples of 5 ...\n");
		printMultiplesOfFive(nums);

		System.out.println();
		System.out.println();

		// Declare but don't instantiate the integer array named threes.
		int [] threes;

		// Stop and write the method named countTheNumberOfThrees below
		// the main method.  Declare the integer variable numberOfThrees
		// and then call it here passing it the array nums.  The return
		// value of the method will be "caught" by numberOfThrees.
		// Use an assignment statement when calling the method.
		int numberOfThrees = countTheNumberOfThrees(nums);

		// Stop and write the method named getMultiplesOfThree below the
		// main method and then call it here passing it the array nums and
		// numberOfThrees.  This method will return a new array that will be
		// "caught" by threes. Use an assignment statement when calling the method.
		threes = getMultiplesOfThree(nums, numberOfThrees);

		// Call the method printNumbers and pass it the array threes.
		System.out.println("Here are the multiples of 3 ...\n");
		printNumbers(threes);
		

		System.out.println();
		System.out.println();
		
		// ************* PART 2.  AN ARRAY OF DOUBLES  ******************************

		// Declare and instantiate a standard array called floats that will hold 25
		// floating point values.	DO NOT USE AN INITIALIZER LIST!!!	
		double [] floats = new double [25];

		// Write a loop that will store random floating point values between
		// 100.0 inclusive and 1000.0 exclusive in every memory location of floats.
		// DO NOT USE AN ENHANCED FOR LOOP!
		for (int i = 0; i < floats.length; i++)
			floats[i] = Math.random()*900.0 + 100.0;

		// Stop and write the method named printFloats below the main method
		// and then call it here passing it the array floats.
		System.out.println("Here are the random floating-point values ...\n");
		printFloats(floats);

		System.out.println();
		System.out.println();

		// Stop and write the method named findLowestFloat below the main method
		// and then call it here passing it the array floats.  Store the value
		// returned by the method in the floating-point variable named lowest.
		double lowest = findLowestFloat(floats);

		// Print out the value of lowest including this string: "The lowest float is: "
		System.out.println("The lowest float is: " + lowest);

		System.out.println();
		System.out.println();

		// Stop and write the method named findHighestFloat below the main method
		// and then call it here passing it the array floats.  Store the value
		// returned by the method in the floating-point variable named highest.
		double highest = findHighestFloat(floats);

		// Print out the value of highest including this string: "The highest float is: "
		System.out.println("The highest float is: " + highest);

		System.out.println();
		System.out.println();

		System.out.println("Program Terminated!");
	} // end main


	// Write the method printNumbers.  It does not return a value.
	// It receives one parameter  ... the nums array.  The method will
	// contain AN ENHNACED FOR LOOP that will print the numbers 10 per line
	// with each integer printed in a field width of 7.
	// YOU MUST USE AN ENHNACED FOR LOOP IN THIS METHOD!
	public static void printNumbers (int [] nums)
	{
		int position = 1;
		for(int element: nums)
		{
			System.out.printf("%7s", element);
			
			if (position % 10 == 0)
				System.out.printf("%n", element);
			position++;
		}
		
	}

	

	// Write the method printMultiplesOfFive.  It does not return a value.
	// It receives one parameter  ... the nums array.  The method will
	// contain AN ENHNACED FOR LOOP that will print all of the multiples
	//  of five on one line with two spaces between each number.
	// YOU MUST USE AN ENHNACED FOR LOOP IN THIS METHOD!
	public static void printMultiplesOfFive(int [] nums)
	{
		for (int element: nums)
		{
			if (element %5 == 0 && element != 0)
				System.out.print(element + "  ");
		}
	}
	
	


	// Write the method countTheNumberOfThrees that receives the integer array
	// named nums.  It returns an integer that represents the number of multiple
	// of threes that are in the array. So this method is simply counting the number
	// of multiples of threes in nums and returning that number.
	// YOU MUST USE ENHNACED FOR LOOPS IN THIS METHOD!
	public static int countTheNumberOfThrees (int [] nums)
	{
		int num3s = 0;
		for(int element: nums)
		{
			if (element % 3 == 0 && element != 0)
				num3s++;
		}
		return num3s;
	}
	
	
	
	
	
	// Write the method getMultiplesOfThree that receives two parameters.
	// The first parameter is an array of integers named nums and the
	// second parameter is an integer named numberOfThrees.  This method
	// returns an array of integers.  This method needs to declare and
	// instantiate an array of integers named threes of size numberOfThrees
	// and then fill it with only the random integers in nums that are
	// multiples of three.  Once the array threes is filled with the multiples
	// of three then the array should be returned.
	// YOU MUST USE ENHNACED FOR LOOPS IN THIS METHOD!
	public static int[] getMultiplesOfThree (int [] nums, int numberOfThrees)
	{
		int [] threes = new int [numberOfThrees];
		int index = 0;
		for (int element: nums)
		{
			if (element % 3 == 0 && element != 0)
			{
				threes[index] = element;
				index++;
			}
				
		}
		return threes;
	}
	
	
	


	// Write the method printFloats.  It does not return a value.
	// It receives one parameter  ... the floats array.  The method will
	// contain an enhanced for loop that will print five float values per line
	// using a printf statement with a field width of 13 and a precision of 5.
	// You may want to use the variable count in printing five floats per line.
	// YOU MUST USE AN ENHNACED FOR LOOP IN THIS METHOD!
	public static void printFloats(double [] floats)
	{
		int index = 1;
		
		for (double element: floats)
		{
			System.out.printf("%13.5f", element);
			
			if (index % 5 == 0)
				System.out.println();
			index++;
		}
	}

	
	
	

	// Write the method findLowestFloat.  It returns a floating-point value.
	// It receives one parameter  ... the floats array.  The method will
	// contain an enhanced for loop that will go through the entire array and
	// inspect each value and find the lowest float. The method will NOT print
	// anything.  It will return the lowest value found in the array.
	// YOU MUST USE AN ENHNACED FOR LOOP IN THIS METHOD!
	public static double findLowestFloat (double [] floats)
	{
		double lowest = floats[0];
		for(double element: floats)
		{
			if (lowest > element)
				lowest = element;
		}
		return lowest;
	}
	
	
	


	// Write the method findHighestFloat.  It returns a floating-point value.
	// It receives one parameter  ... the floats array.  The method will
	// contain an enhanced for loop that will go through the entire array and
	// inspect each value and find the highest float. The method will NOT print
	// anything.  It will return the highest value found in the array.
	// YOU MUST USE AN ENHNACED FOR LOOP IN THIS METHOD!
	public static double findHighestFloat (double [] floats)
	{
		double highest = floats[0];
		for(double element: floats)
		{
			if (highest < element)
				highest = element;
		}
		return highest;
	}


	
	
	
	
} // end EnhancedForLoopMania1


