package ch06;

import java.util.Scanner;

// FileName:  NestedForLoopsDemo.java

//	Confirming the output of the Chapter 6 Section 6 Lecture Examples


public class NestedForLoopsDemo
{
	public static void main (String [] args)
	{
		// Chapter 6 Section 6 Code Example #1.
		for (int i = 1; i <= 4; i++) 
		{
			for (int j = 1; j <= 5; j++)
			{
				System.out.printf("%5d", j);
			}
			System.out.println();
		}


		System.out.println();
		System.out.println();

		// Chapter 6 Section 6 Code Example #2.
		for (int i = 1; i <= 6; i++) 
		{
			for (int j = 1; j <= 3; j++)
			{
				System.out.printf("%5d", i);
			}
			System.out.println();
		}


		System.out.println();
		System.out.println();

		// Chapter 6 Section 6 Code Example #3.
		for (int i = 1; i <= 5; i++) 
		{
			for (int j = 1; j <= 8; j++)
			{
				System.out.printf("%5d", i + j);
			}
			System.out.println();
		}


		System.out.println();
		System.out.println();

		// Chapter 6 Section 6 Code Example #4.
		for (int i = 1; i <= 4; i++) 
		{
			for (int j = 1; j <= 3; j++)
			{
				System.out.printf("%5d", 2 * i + j);
			}
			System.out.println();
		}


		System.out.println();
		System.out.println();

		// Chapter 6 Section 6 Code Example #5.
		for (int i = 1; i <= 4; i++) 
		{
			for (int j = 1; j <= i; j++)
			{
				System.out.print('*');    
			}
			System.out.println();
		}



		System.out.println();
		System.out.println();
		
		// Chapter 6 Section 6 Code Example #6.
		for(int lines = 1; lines <= 4; lines++)
		{
			//  use a field width of 5 - lines to right justify a blank space 
			if (lines == 1)
				System.out.printf("%4s", " ");   // 5 - 1 = 4 
			else if (lines == 2)
				System.out.printf("%3s", " ");   // 5 - 2 = 3 
			else if (lines == 3)
				System.out.printf("%2s", " ");   // 5 - 3 = 2 
			else if (lines == 4)
				System.out.printf("%1s", " ");   // 5 - 4 = 1 

			for(int stars = 1; stars <= 2 * lines - 1; stars++)
				System.out.print ('*');

			System.out.println();
		}

		
		System.out.println();
		System.out.println();
		
		// Chapter 6 Section 6 Code Example #6.
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter a positive integer: ");
		int n = reader.nextInt();
		for (int divisor = 1; divisor < n; divisor++)
		{
		     if ( n % divisor == 0)
			System.out.println("A divisor of " + n + " is " + divisor);
		}


		System.out.println();
		System.out.println("Program Terminated.");

	} // end main
}