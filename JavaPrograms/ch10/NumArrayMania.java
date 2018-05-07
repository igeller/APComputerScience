package ch10;

import java.util.Scanner;

/* 	Program:  NumArrayMania 1
 	Description:  This program gives the programmer experience with
 	writing methods that return arrays.
 */

public class NumArrayMania
{
	public static Scanner reader = new Scanner (System.in);

	public static void main (String[] args)
	{			
		// ************* PART 1.  AN ARRAY OF INTEGERS. ******************

		// Declare a standard array called nums that will hold integer values,
		// BUT DO NOT INSTANTIATE THE ARRAY!  We will use nums farther down.
		int [] nums;

		// No Code to write here.  This code prompts the user of the program to enter
		// the number of random integers that will be placed in an array and that
		// value is stored in the variable numOfInts.
		System.out.print("Enter the number of random integers you want in the array: ");
		int numOfInts = reader.nextInt();		

		// Stop and write the method getRandomNums below the main method, then
		// call the method getRandomNums and pass it the variable numOfInts from above.
		// This method will return an array that will be "caught" by the array variable nums.
		nums = getRandomNums(numOfInts);


		System.out.println("Here are the original values in the nums array:\n");
		// Stop and write the method named printNumbers below the main method
		// and then call it here passing it the array nums.
		printNumbers(nums);


		// STOP AND RUN THE PROGRAM HERE AND MAKE SURE IT WORKS
		// BEFORE CONTINUING TO WRITE CODE.
		System.out.println();
		System.out.println();

		// Stop and write the method named countTheNumberOfTens below the main method.
		// Declare the integer variable numberOfTens to catch the returned value and
		// then call countTheNumberOfTens here passing it the array nums.
		int numberOfTens = countTheNumberOfTens(nums);

		// Declare but DO NOT INSTANTIATE the integer array named tens.
		int [] tens;

		// Stop and write the method named getMultiplesOfTen below the main method, then
		// call it here and pass it the array nums and the variable numberOfTens from above.
		// This method will return an array that will be "caught" by the array variable tens.
		tens = getMultiplesOfTen (nums, numberOfTens);

		System.out.println("Here are the multiples of ten from the original array:\n");
		// Call the method printNumbers to print the array named tens.
		printNumbers(tens);


		// STOP AND RUN THE PROGRAM HERE AND MAKE SURE IT WORKS
		// BEFORE CONTINUING TO WRITE CODE.
		System.out.println();
		System.out.println();

		// ************* PART 2.  AN ARRAY OF DOUBLES  ******************************

		// Declare but DO NOT INSTANTIATE a standard array called floats that
		// will hold doubles values.
		double [] floats;

		// No Code to write here.  This code prompts the user of the program to enter
		// the number of random doubles that will be placed in an array and that
		// value is stored in the variable numOfFloats.
		System.out.print("Enter the number of random doubles you want in the array: ");
		int numOfFloats = reader.nextInt();	

		// Stop and write the method getRandomFloats below the main method, then
		// call it here and pass it the variable numOfFloats from above.  This method
		// will return an array that will be "caught" by the array variable floats.
		 floats = getRandomFloats(numOfFloats);

		System.out.println("Here are the original values in the floats array:\n");
		// Stop and write the method named printFloats below the main method
		// and then call it here passing it the array floats.
		printFloats(floats);


		// STOP AND RUN THE PROGRAM HERE AND MAKE SURE IT WORKS
		// BEFORE CONTINUING TO WRITE CODE.
		System.out.println();
		System.out.println();

		// Stop and write the method named findAverageFloat below the main method
		// and then call it here passing it the array floats.  Store the value
		// returned by the method in the floating-point variable named ave.
		double ave = findAverageFloat(floats);

		// Print out the average float value using the string: "The average float value is: "
		System.out.println("The average float value is: " + ave);


		// RUN THE PROGRAM NOW TO MAKE SURE THE LAST PART WORKS.
		System.out.println();
		System.out.println();

		System.out.println("Program Terminated!");
	} // end main


	// Write the method getRandomNums that receives one integer parameter named number.
	// It returns an array of integers. This method needs to declare and instantiate
	// an array of integers of size number and then fill it with random integers between
	// 1 and 100 inclusive, and then finally return the array.
	public static int [] getRandomNums(int number)
	{
		int [] array = new int [number];
		for (int i = 0; i  < number ; i++)
		{
			array[i] = (int)((Math.random()*100) + 1);
		}
		return array;
	}






	// Write the method countTheNumberOfTens that receives an integer array named nums.
	// It returns an integer that represents the number of multiple of tens that are in
	// the array. So this method is simply counting the number of multiples of tens in
	// nums and returning that number.
	public static int countTheNumberOfTens(int [] nums)
	{
		int numOfTens = 0;
		
		for (int i = 0; i < nums.length; i++)
		{
			if (nums[i] % 10 ==0)
				numOfTens++;
		}
		
		return numOfTens;
	}





	// Write the method getMultiplesOfTen that receives two parameters.  The first
	// parameter is an array of integers named nums and the second parameter is an
	// integer named numberOfTens.  This method returns an array of integers.
	// This method needs to declare and instantiate an array of integers named tens
	// of size numberOfTens and then fill it with only the random integers in nums
	// that are multiples of ten.  Once the array tens is filled with the multiples
	// of ten then the array should be returned.
	public static int [] getMultiplesOfTen (int [] nums, int numberOfTens)
	{
		int [] tens = new int [numberOfTens];
		int index = 0;
		
		for (int i = 0; i < nums.length; i++)
		{
			if (nums[i] % 10 == 0)
			{	
				tens [index] = nums[i];
				index++;
			}
			
			
		}
		
		return tens;
	}






	// Write the method printNumbers.  It does not return a value.
	// It receives one parameter an array of integers named nums.
	// The method will print all of the numbers to the screen right-justified
	// in a field width of 7 using a printf statement.  However, it should
	// print only 10 numbers per line.  Use a local variable like count and
	// initialize it to 1.  Every time you print a value in the array then
	// increment count by 1.  But if count is evenly divisible by 10 then
	// make it start a new line using %n.  Hint:  You need an if-else with
	// a printf statement in each branch.  One with a %n and one without a %n.
	// See the online Chapter 10 Lecture for an example.
	public static void printNumbers (int [] nums)
	{
		int count;
		for (count = 0; count < nums.length; count++)
		{
			if (count % 10 == 0 && count !=0)
				System.out.printf("%n%7s", nums[count]);
			else
				System.out.printf("%7s", nums[count]);		
		}
	}







	// Write the method getRandomFloats that receives one integer parameter
	// named number.  It returns an array of floating-point values. This method
	// needs to declare and instantiate an array of floating-point values of
	// size number and then fill it with random floating-point values between
	// -20.0 inclusive and 20.0 exclusive. The method will then finally return the array.
	public static double[] getRandomFloats (int number)
	{
		double [] floatingPointValues = new double [number];
		
		for (int i = 0; i < number; i++)
		{
			floatingPointValues[i] = (Math.random()*40)- 20;
		}
		return floatingPointValues;
	}









	// Write the method printFloats.  It does not return a value.
	// It receives one parameter an array of doubles named floats.
	// The method will print all of the values in floats, five per line,
	// using a printf statement right-justified with a field width of 20
	// and a precision of 10.
	public static void printFloats(double[] floats)
	{
		for (int i = 0; i < floats.length; i++)
		{
			
			if (i%5 ==0)
				System.out.printf("%n%20.10f", floats[i]);
			else
				System.out.printf("%20.10f", floats[i]);

			
		}
		
	}








	// Write the method findAverageFloat.  It returns a floating-point value.
	// It receives one parameter an array of doubles named floats.  The
	// method will calculate the average of all the values stored in the
	// array floats and return that value.
	public static double findAverageFloat (double [] floats)
	{
		double average = 0;
		double num = 0;
		
		for (int i = 0; i < floats.length; i++ )
		{
			num += floats[i];
		}
		
		average = num/ floats.length;
			
		return average;
	}











} // end NumArrayMania











