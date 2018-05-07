package ch10;

import java.util.Scanner;

// Program:  InitializerListMania
// Program Description:  This program will declare and construct
//		numerous initializer lists containing different values.

// Concepts studied:

//			initializer list declaration and construction
//			writing methods and calling them


public class InitializerListMania
{
	public static void main (String[] args)
	{		
		Scanner reader = new Scanner (System.in);
		
		// Declare and instantiate a standard array called parties
		// USING AN INITIALIZER LIST that can hold the names of these
		// political parties:  Communist, Constitution, Democrat,
		// Libertarian, Republican, Socialist, and Tea
		String [] parties = {"Communist", "Constitution", "Democrat", "Libertarian",
				"Republican", "Socialist", "Tea"};
		
		// Declare and instantiate a standard array called percents
		// USING AN INITIALIZER LIST that will hold the following values
		//       2.5, 4.8, 3.7, 5.3, 1.4, 8.7, 6.2, 7.9
		double [] percents = {2.5, 4.8, 3.7, 5.3, 1.4, 8.7, 6.2, 7.9};
		
		// Declare and instantiate a standard array called nums
		// USING AN INITIALIZER LIST that will hold the following int values:
		// 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20
		int [] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
			
		System.out.println();
		System.out.println();
		
		// Stop and write the method named printPartiesForward below the main method
		// and then call it here passing it the array parties.
		System.out.println("Here are the parties printed in forward order: ");
		System.out.println();
		printPartiesForward(parties);
		
		System.out.println();
		System.out.println();
		
		// Stop and write the method named printPartiesReverse below the main method
		// and then call it here passing it the array parties.
		System.out.println("Here are the parties printed in reverse order: ");
		System.out.println();
		printPartiesReverse(parties);
		
		System.out.println();
		System.out.println();
		
		// Stop and write the method named printCParties below the main method
		// and then call it here passing it the array parties.
		System.out.println("Here are only the \"C\" parties: ");
		System.out.println();
		printCParties(parties);
		
		System.out.println();
		System.out.println();
		
		// The following two lines are given you.
		System.out.print("Enter a party to compare: ");
		String party = reader.nextLine();
		
		// Stop and write the method named compareAndPrintParties below the main method
		// and then call it here passing it the array parties and party.
		System.out.println("Here are the parties that lexicographically come before the one entered:");
		System.out.println();
		compareAndPrintParties(parties, party);
		
		System.out.println();
		System.out.println();
		
		// Stop and write the method named printPercents below the main method
		// and then call it here passing it the array percents.
		printPercents(percents);
				
		System.out.println();
		System.out.println();
		
		
		// Stop and write the method named findLowestPercent below the main method
		// and then call it here passing it the array percents.  Store the value
		// returned by the method in the floating-point variable named lowest.
		double lowest = findLowestPercent(percents);
		
		// Print out the value lowest including this string: "The lowest percent is: "
		System.out.println("The lowest percent is: " + lowest);
		
		System.out.println();
		System.out.println();
		
		// Stop and write the method named findHighestPercent below the main method
		// and then call it here passing it the array percents.  Store the value
		// returned by the method in the floating-point variable named highest.
		double highest = findHighestPercent(percents);
		
		// Print out the value highest including this string: "The highest percent is: "
		System.out.print("The highest percent is: " + highest);
		
		System.out.println();
		System.out.println();
		
		// Stop and write the method named printNumbers below the main method
		// and then call it here passing it the array nums.
		printNumbers(nums);
		
		System.out.println();
		System.out.println();
		
		// Stop and write the method named replaceMultiplesOfFour below the main method
		// and then call it here passing it the array nums.
		replaceMultiplesOfFour(nums);
		
		// Call the method printNumbers passing it the array nums.
		printNumbers(nums);
		
		System.out.println();
		System.out.println();
		
		System.out.println("Program Terminated!");
	} // end of main method - DO NOT DELETE THIS CURLY BRACE

	
	// Write the method printPartiesForward.  It does not return a value.
	// It receives one parameter  ... the parties array.  The method will
	// contain a loop that will print all of the parties one per line
	// using AN ENHANCED FOR LOOP.
	public static void printPartiesForward (String [] parties)
	{
		for (String element: parties)
		{
			System.out.println(element);
		}
	}
	
	

	
	// Write the method printPartiesReverse.  It does not return a value.
	// It receives one parameter  ... the parties array.  The method will
	// contain a loop that will print all of the parties one per line in
	// REVERSE ORDER.  DO NOT USE AN ENHANCED FOR LOOP.
	public static void printPartiesReverse (String [] parties)
	{
		for (int i = 1; i <= parties.length; i++)
			System.out.println(parties[parties.length-i]);
	}

	
	
	
	// Write the method printCParties.  It does not return a value.
	// It receives one parameter  ... the parties array.  The method will
	// contain a loop that will print only the parties that begin with the
	// letter "C" ... one per line in forward order.  You will need to call
	// one of the String methods to check to see if a party begins with a "C".
	// Review the String PPT on line to know which one to use.
	// USE AN ENHANCED FOR LOOP IN THIS METHOD.
	public static void printCParties (String [] parties)
	{
		for (String element: parties)
		{
			if (element.substring(0,1).compareTo("C") == 0)
				System.out.println(element);
				
		}
	}
	
	
	
	
	// Write the method compareAndPrintParties.  It does not return a value.
	// It receives two parameters  ... the parties array and a string parameter
	// named party that holds the value entered from the keyboard in main. The
	// method will contain a loop that will print only the parties that are
	// lexicograhically less than the party entered from the keyboard.  They
	// should be printed one per line in forward order.  You need to use the
	// String compareTo method to make word comparisons inside this method.
	// Example:  if "Republican" is entered from the keyboard then the program
	// output would be:
	//
	//		Communist
	//		Constitution
	//		Democrat
	//		Libertarian
	// USE AN ENHANCED FOR LOOP IN THIS METHOD.
	public static void compareAndPrintParties(String [] parties, String party)
	{
		for (String element: parties)
		{
			if (element.compareTo(party) < 0)
			{
				System.out.println(element);
			}
			//else 
		}
	}
	
	
	
	// Write the method printPercents.  It does not return a value.
	// It receives one parameter  ... the percents array.  The method will
	// contain a loop that will print all of the percents on one line
	// with two spaces between each percent using AN ENHANCED FOR LOOP.
	public static void printPercents (double [] percents)
	{
		for (double element: percents)
		{
			System.out.print(element + "  ");
		}
	}
	
	
	
	
	// Write the method findLowestPercent.  It returns a floating-point value.
	// It receives one parameter  ... the percents array.  The method will
	// contain a loop that will go through the entire array and inspect each
	// value and find the lowest percent. The method will NOT print anything.
	// It will return the lowest value found in the array.
	// USE AN ENHANCED FOR LOOP IN THIS METHOD.
	public static double findLowestPercent(double [] percents)
	{
		double lowest = percents[0];
		for (double element: percents)
		{
			if (element < lowest)
				lowest = element;
		}
		return lowest;
	}
	 
	
	
	
	
	// Write the method findHighestPercent.  It returns a floating-point value.
	// It receives one parameter  ... the percents array.  The method will
	// contain a loop that will go through the entire array and inspect each
	// value and find the highest percent. The method will NOT print anything.
	// It will return the highest value found in the array.
	// USE AN ENHANCED FOR LOOP IN THIS METHOD.
	public static double findHighestPercent(double [] percents)
	{
		double highest = percents[0];
		for (double element: percents)
		{
			if (element > highest)
				highest = element;
		}
		return highest;
	}
	
	
	
	
	// Write the method printNumbers.  It does not return a value.
	// It receives one parameter  ... the nums array.  The method will
	// contain a loop that will print all of the numbers on one line
	// with two spaces between each number using AN ENHANCED FOR LOOP.
	public static void printNumbers (int []nums)
	{
		for (int element: nums)
		{
			System.out.print(element + "  ");
		}
	}
	
	
	
	
	
	
	// Write the method replaceMultiplesOfFour.  It does not return a value.
	// It receives one parameter  ... the nums array.  The method will
	// contain a loop that will replace all multiples of four with the number
	// zero. This method will NOT print any numbers.
	// DO NOT USE AN ENHANCED FOR LOOP IN THIS METHOD.
	public static void replaceMultiplesOfFour (int [] nums)
	{
		for (int i = 0; i < nums.length; i++)
		{
			if (nums[i] % 4 == 0)
				nums[i] = 0;
		}
	}
	
	
	
	
} // end of InitializerListMania - DO NOT DELETE THIS CURLY BRACE
