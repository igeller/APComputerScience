package ch06;

// FileName:  NestedForLoopBasics.java
// Confirming the output of the Chapter 6 Section 6 Worksheet
// And experimenting with Nested For Loops.

public class NestedForLoopBasics
{
	public static void main (String [] args)
	{
		// Worksheet Question #1.
		for ( int i = 1; i <= 3; i++)
		{
			for ( int j = 1; j <= 3; j++)
			{
				System.out.printf("%3d", j);
			}
		}

		System.out.println();
		System.out.println();

		// Worksheet Question #2.
		for ( int i = 1; i <= 3; i++)
		{
			for ( int j = 1; j <= 3; j++)
			{
				System.out.printf("%3d", j);
			}
			System.out.println();
		}

		System.out.println();
		System.out.println();

		// Worksheet Question #3.
		for ( int i = 1; i <= 5; i++)
		{
			for ( int j = 1; j <= 3; j++)
			{
				System.out.printf("%3d", i - j);
			}
			System.out.println();
		}

		System.out.println();
		System.out.println();

		// Worksheet Question #4.
		for ( int i = 1; i <= 3; i++)
		{
			for ( int j = 4; j <= 7; j++)
			{
				System.out.printf("%3d", j);
			}
			System.out.println();
		}


		System.out.println();
		System.out.println();


		
		
		// Worksheet Question #5.
		for ( int i = 1; i <= 3; i++)
		{
			for ( int j = 1; j <= i * 2; j++)
			{
				System.out.printf("%3d", j);
			}
			System.out.println();
		}


		System.out.println();
		System.out.println();
		
		// CREATE YOUR OWN NESTED FOR LOOP TO PRINT ANY DESIGN YOU WANT
		// THAT USES THE * CHARACTER.  THE OUTER AND INNER LOOPS CAN RUN
		// AS MANY TIMES AS YOU WANT WITHIN REASON.
		
		for (int i = 1; i <= 4; i++ )
		{
			for (int j = 3; j <= i*3; j++)
			{
				System.out.printf("%4d", j);
			}
			System.out.println();
		}
		

		 

		System.out.println();
		System.out.println("Program Terminated.");

	} // end main
}
