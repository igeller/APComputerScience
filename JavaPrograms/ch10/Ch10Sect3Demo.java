// Chapter 10 Section 1 - 3 Demo program

package ch10;

import java.util.Scanner;

public class Ch10Sect3Demo
{
	public static void main (String[] args)
	{
		// VARIATION OF CODE FROM CHAPTER 10 SECTION 3 ... SLIDES 31
		// THIS CODE STORES RANDOM INTEGERS IN THE EVEN INDEX MEMORY LOCATIONS,
		// BUT STORES -5 IN ALL ODD INDEX MEMORY LOCATIONS.

		int [ ] nums = new int [20];

		for ( int i = 0; i < nums.length; i ++)		{
			if (i % 2 == 0)				nums[i] = (int) (Math.random() * 1000) + 1;
			else
				nums[i] = -5;		}
		System.out.println("Here are the 20 random integers all on one line.");
		for ( int i = 0; i < nums.length; i ++)   // note the use of < not <=
		{
			System.out.print (nums[i] + "  ");   // use print not println
		}

		System.out.println();
		System.out.println();

		System.out.println("Here are the 20 random integers one per line.");
		for ( int i = 0; i < nums.length; i ++)     
		{
			System.out.printf("%6d%n", nums[i]);
		}

		System.out.println();
		System.out.println();

		System.out.println("Here are the 20 random integers all on one line using a printf.");
		for ( int i = 0; i < nums.length; i ++)     
		{
			System.out.printf("%5d", nums[i]);   // don't include %n
		}
		System.out.println();  
		System.out.println();  

		System.out.println("Here are the 20 random integers printed in reverse all on one line.");
		for ( int i = nums.length - 1; i >= 0 ; i --)
		{
			System.out.print (nums[i] + "  ");
		}

		System.out.println();  
		System.out.println(); 

		System.out.println("Here are the 20 random integers printed 5 per line with a printf.");
		int count = 1;
		for ( int i = 0; i < nums.length; i ++)     
		{
			System.out.printf("%6d", nums[i]);
			if (count % 5 == 0)
				System.out.println();  // start a new line
			count++;
		}

		System.out.println();  
		System.out.println(); 

		System.out.println("Here are the 20 random integers in reverse order one per line:" );
		for ( int i = nums.length - 1; i >= 0 ; i--)
		{
			System.out.printf("%6d%n", nums[i]);
		}

		System.out.println();  
		System.out.println(); 

		boolean found = false;
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter an integer to search for: ");
		int x = reader.nextInt();
		for ( int i = 0; i < nums.length; i ++)
		{
			if (nums[i] == x)     // use == if the array holds primitives
			{
				found = true;
				break;
			}
		}
		if (found)
			System.out.println("Found!");
		else
			System.out.println("NOT Found!");

		System.out.println();
		System.out.println();

		int loc = -1;
		System.out.print("Enter an integer to search for: ");
		x = reader.nextInt();
		for ( int i = 0; i < nums.length; i ++)
		{
			if (nums[i] == x)     // use == if the array holds primitives
			{
				loc = i;
				break;
			}
		}
		if (loc == -1)
			System.out.println("NOT Found!");
		else
			System.out.println("Found at index " + loc);

		System.out.println();
		System.out.println();


		System.out.print("Enter an integer to to see how many times it is in the array: ");
		x = reader.nextInt();
		count = 0;

		for ( int i = 0; i < nums.length; i ++)
		{
			if (nums[i] == x)     // use == if the array holds primitives
				count++;
		}

		System.out.println( x + " occurs " + count + " times!");



		System.out.println();
		System.out.println();

		// The values in one array can be copied to another array using a loop:

		double [ ] abc = new double [10];   // an array is constructed for abc

		for ( int i = 0; i < abc.length; i ++)
			abc [i] = Math.random() * 10;
		
		for ( int i = 0; i < abc.length; i ++)
			System.out.println(abc [i] + "  ");

		double [ ] xyz = new double [10];   // an array is constructed for xyz

		for (int i = 0; i < 10; i ++)
			xyz [i] = abc [i];  // each value in abc is being copied to xyz.

		for ( int i = 0; i < xyz.length; i ++)
			System.out.println(xyz [i] + "  ");
		
		// We can destroy all of the values in the array abc by using:
		abc = null;

		// Activate the following lines
		for ( int i = 0; i < abc.length; i ++)
			abc [i] = Math.random() * 10;

		System.out.println("Program Terminated.");
	}
}
