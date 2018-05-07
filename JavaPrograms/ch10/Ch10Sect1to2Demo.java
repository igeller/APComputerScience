// Chapter 10 Section 1 - 3 Demo program

package ch10;

import java.util.Scanner;

public class Ch10Sect1to2Demo
{
	public static void main (String[] args)
	{
		// CODE FROM CHAPTER 10 SECTION 1 AND 3.

		// Declare and instantiate an array named tests
		// that can hold 10 integer test scores.
		int[] tests = new int [5];

		// Write a loop that will store 5 integer test scores from the keyboard
		// and store them in the array tests  
		// FROM SLIDE 30.
		Scanner reader = new Scanner (System.in);
		int x;
		for (int i = 0; i < tests.length; i++) 
		{
			System.out.print("Enter and integer and press return: ");
			x = reader.nextInt();
			tests[i] = x;
		}

		System.out.println();
		System.out.println();

		// Write a for loop to display all the test scores in the array separated
		// by two blank spaces.  
		// FROM SLIDE 32.
		System.out.print("Here are the numbers in the array:   ");
		for (int i = 0; i < tests.length; i++)
		{
			System.out.print(tests[i] + "  ");
		}

		System.out.println();
		System.out.println();


/*		// Look at how much code is necessary to do the same thing without an array:
		int numberOfTests = 0;
		System.out.print("Enter and integer and press return: ");
		int test1 = reader.nextInt();
		numberOfTests++;
		System.out.print("Enter and integer and press return: ");
		int test2 = reader.nextInt();
		numberOfTests++;
		System.out.print("Enter and integer and press return: ");
		int test3 = reader.nextInt();
		numberOfTests++;
		System.out.print("Enter and integer and press return: ");
		int test4 = reader.nextInt();
		numberOfTests++;
		System.out.print("Enter and integer and press return: ");
		int test5 = reader.nextInt();
		numberOfTests++;
		System.out.print("Enter and integer and press return: ");
		int test6 = reader.nextInt();
		numberOfTests++;
		System.out.print("Enter and integer and press return: ");
		int test7 = reader.nextInt();
		numberOfTests++;
		System.out.print("Enter and integer and press return: ");
		int test8 = reader.nextInt();
		numberOfTests++;
		System.out.print("Enter and integer and press return: ");
		int test9 = reader.nextInt();
		numberOfTests++;
		System.out.print("Enter and integer and press return: ");
		int test10 = reader.nextInt();
		numberOfTests++;

		System.out.print("Here are the numbers in the array:   "
		+ test1 + " " + test2 + " " + test3 + " " + test4 + " "
				+ test5 + " " + test6 + " " + test7 + " " + test8
				+ " " + test9 + " " + test10);

		// What if you had 50 test scores to enter?

		System.out.println();
		System.out.println();


*/		// NOW CALCULATE THE AVERAGE OF THE TEST SCORES BOTH WAYS.
		// CHAPTER 10 SECTION 3 ... SLIDE 39.

		int sum = 0;
		for (int i = 0; i < tests.length; i++) {
			sum += tests[i];
		}
		int average = sum / tests.length;
		System.out.println("The average is: " + average);

		System.out.println();
		System.out.println();

		//sum = test1 +  test2 +  test3 +  test4 +  test5 +  test6 +  test7 +  test8 +  test9 +  test10;
		//average = sum / numberOfTests;
		System.out.println("The average is: " + average);

		System.out.println();
		System.out.println();

		System.out.print("Here are the numbers in the array again:   ");
		for (int i = 0; i < tests.length; i++)
		{
			System.out.print(tests[i] + "  ");
		}

		// Swap the first two array elements
		// CODE LIKE THIS WAS DISCUSSED ON SLIDE 23.
		int temp = tests[0];
		tests[0] = tests[1];
		tests[1] = temp;

		System.out.println();
		System.out.println();

		System.out.print("Here are the numbers in the array after the SWAP:   ");
		for (int i = 0; i < tests.length; i++)
		{
			System.out.print(tests[i] + "  ");
		}

		System.out.println();
		System.out.println();

		// ACTIVATE THE FOLLOWING LINE OF CODE, RUN THE PROGRAM, AND THEN DEACTIVATE THE LINE AND GO ON.
		//System.out.println("Here is the element in the -1 index: " + tests[-1]);

		// ACTIVATE THE FOLLOWING LINE OF CODE, RUN THE PROGRAM, AND THEN DEACTIVATE THE LINE AND GO ON.
		//System.out.println("Here is the element in the -1 index: " + tests[10]);

		// ********************************************************************************************

		// ADDITIONAL DEMO CODE FOR DIFFERENT ARRAYS.
		
		// Declare and instantiate an array named nums
		// that can hold 5 floating-point values.
		double [] nums = new double [5];

		// Write a loop that will store 5 floating-point numbers from the keyboard
		// and store them in the array nums
		double y;
		for (int i = 0; i < nums.length; i++) 
		{
			System.out.print("Enter a floating-point value and press return: ");
			y = reader.nextDouble();
			nums[i] = y;
		}

		System.out.println();
		System.out.println();

		// Write a for loop to display all the numbers in the array separated
		// by two blank spaces.  
		System.out.print("Here are the numbers in the array:   ");
		for (int i = 0; i < nums.length; i++)
		{
			System.out.print(nums[i] + "  ");
		}

		System.out.println();
		System.out.println();
		reader.nextLine();

		// ********************************************************************************************

		// Declare and instantiate an array named names
		// that can hold 5 string values.
		String [] names = new String [5];

		// Write a loop that will store 5 string values from the keyboard
		// and store them in the array names
		String name;
		for (int i = 0; i < names.length; i++) 
		{
			System.out.print("Enter a name and press return: ");
			name = reader.nextLine();
			names[i] = name;
		}

		System.out.println();
		System.out.println();

		// Write a for loop to display all the names in the array separated
		// by two blank spaces.  
		System.out.print("Here are the names in the array:   ");
		for (int i = 0; i < names.length; i++)
		{
			System.out.print(names[i] + "  ");
		}

		System.out.println();
		System.out.println();
		System.out.println("Program Terminated.");
	}
}
