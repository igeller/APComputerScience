package ch06;
/*
	FileName:  NestedForLoopMania.java

	This program gives you experience using nested loops to solve programming
	problems.  It also gives you more experience using the printf statement. 

	To remember how to use a printf statement, refer to the Chapter 5 PPT or
	the ForLoopMania program you wrote.
 */
public class NestedForLoopMania
{
	public static void main (String [] args)
	{	
		// Part 1.  Refer to the previous examples and write a nested for loop
		// structure that will print the following:
		/* 				
			    1    2    3    4    5    6
			    1    2    3    4    5    6
			    1    2    3    4    5    6
			    1    2    3    4    5    6
			    1    2    3    4    5    6
			    1    2    3    4    5    6
			    1    2    3    4    5    6
		 */

		for (int i = 1; i <= 6; i++)
		{
			for (int j = 1; j <= 6; j++)
			{	
				System.out.printf("%5d", j);
			}
			System.out.println("");
		}
		
		
		
		
		
		System.out.println();	System.out.println();
		
		// ******************************************************
		
		// Part 2.  Refer to the previous examples and write a nested for loop
		// structure that will print the following:
		/* 				
			    1    1    1    1    1    1    1    1
			    2    2    2    2    2    2    2    2
			    3    3    3    3    3    3    3    3
			    4    4    4    4    4    4    4    4
		 */
		
		for (int i = 1; i <= 4; i++)
		{
			for (int j = 1; j <= 8; j++)
			{
				System.out.printf("%5d", i);
			}
			System.out.println("");
		}
		
		
		
		

		System.out.println();	System.out.println();
		
		// ******************************************************

		// Part 3.  Write a nested for loop structure that will
		// print the following:
		/* 				
			    0    1    2    3    4    5
			    1    3    5    7    9   11
			    2    5    8   11   14   17
			    3    7   11   15   19   23
			    4    9   14   19   24   29
			    5   11   17   23   29   35
		 */

		System.out.println("THIS ONE IS OFF BY 1 --> uPPER LEFT SHOULD BE 0 AND BOTTOM RIGHT SHOULD BE 35");
		for (int i = 0; i <= 5; i++)
		{
			for (int j = 0; j <= 5; j++)
			{
				System.out.printf("%5d", (i + 1) * j + i);
			}
			

			System.out.println();
		}
		
		
		
		
		
		System.out.println();	System.out.println();
		
		// ******************************************************	
		
		// Part 4.  NO CODE TO WRITE. Run the program and view the output
		// for the following code of a "triangular" nested loop. This code
		// was originally given you in the Part 6 of the Chapter 6 Online
		// Lecture.  It will print the following:
		/* 
		 				
			*
			**
			***
			****
			
		 */

		for(int i = 1; i <= 4; i++)
		{
			for(int j = 1; j <= i; j++)
				System.out.print('*');
			System.out.println();
		}

		System.out.println();	System.out.println();
		
		// ******************************************************
	
		// Part 5.  Refer to the previous example and write a nested
		// for loop structure that will print the following:
		/*
		  				
			****
			***
			**
			*
			
		 */
		
		for (int i = 4; i >= 1; i--)
		{
			for (int j = 1; j <= i; j++)
			{
				System.out.print('*');
			}
			System.out.println();
		}

		
		
		
		
		System.out.println();	System.out.println();
		
		// ******************************************************	

		// Part 6. NO CODE TO WRITE. Run the program and view the output
		// for the following code of a "triangular" nested loop. This code
		// was originally given you in the Part 6 of the Chapter 6 Online
		// Lecture.  It will print the following:
		/* 	
		 			
			    *
			   ***
			  *****
			 *******
			
		 */

		for(int lines = 1; lines <= 4; lines++)
		{
			//  use a field width of 5 - lines depending on what lines is
			if (lines == 1)	
				System.out.printf("%4s", " ");
			else if (lines == 2)
				System.out.printf("%3s", " ");
			else if (lines == 3)
				System.out.printf("%2s", " ");
			else if (lines == 4)
				System.out.printf("%1s", " ");

			for(int stars = 1; stars <= 2 * lines - 1; stars++)
				System.out.print ('*');

			System.out.println();
		}
		
		// ******************************************************
		// Part 7.  Refer to the previous example and write a nested
		// for loop structure that will print the following:
		/* 	
		 			
			  *****
			   ***
			    *
			
		 */
		for (int lines = 3; lines >= 1; lines--)
		{
			if (lines == 1)	
				System.out.printf("%4s", " ");
			else if (lines == 2)
				System.out.printf("%3s", " ");
			else if (lines == 3)
				System.out.printf("%2s", " ");
			
			for (int stars = 1; stars <=  2 * lines - 1; stars++)
				System.out.print('*');
			
			System.out.println();
		}
		
		
		
		
		System.out.println();	System.out.println();
		
		// ******************************************************

/*
	Complete the code below which will output a Mulitplication Table
	of values up to Times 10 as seen below using nested for loops.
	The heading code prior to the outside loop is completed for you
	and the first line of code inside the outside loop is done.  You
	just need to complete the inner loop.  The columns in the table
	are 4 spaces wide.

	        Multiplication Table
             ------------------------
     (  Generated by nested for loops  )

        1   2   3   4   5   6   7   8   9  10
----|----------------------------------------
  1 |   1   2   3   4   5   6   7   8   9  10
  2 |   2   4   6   8  10  12  14  16  18  20
  3 |   3   6   9  12  15  18  21  24  27  30
  4 |   4   8  12  16  20  24  28  32  36  40
  5 |   5  10  15  20  25  30  35  40  45  50
  6 |   6  12  18  24  30  36  42  48  54  60
  7 |   7  14  21  28  35  42  49  56  63  70
  8 |   8  16  24  32  40  48  56  64  72  80
  9 |   9  18  27  36  45  54  63  72  81  90
 10 |  10  20  30  40  50  60  70  80  90 100
		 
*/
	
		System.out.printf("%32s%n", "Multiplication Table");

		System.out.printf("%32s%n", "--------------------");

		System.out.printf("%40s%n", "(  Generated by nested for loops  )");
		System.out.println();

		System.out.printf("%4s ", "");

		for (int i = 1; i <=10; i++)
			System.out.printf("%4d", i);

		System.out.println();
		System.out.println("----|----------------------------------------");

		for (int row = 1; row <= 10; ++row)
		{  
			// print first part of a row before the table
			System.out.printf("%2d %2s", row, "|");
			
			// Write the inner loop that will print the remainder of the row
			for (int i = 1; i <= 10; i++)
				System.out.printf("%4d", row*i);
			System.out.println();

		}  // end of each row 

		System.out.println();
		System.out.println();

	} // end main
}