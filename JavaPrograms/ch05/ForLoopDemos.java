// ForLoopDemos.java
package ch05;
import java.util.Scanner;

public class ForLoopDemos
{
	public static void main(String[] args) 
	{
		Scanner reader = new Scanner(System.in);

		// ***********************************************************

		// Write a for loop that computes the sum of the integers from 1 to 100
		// and then prints the sum after the loop is over.
		int sum = 0;	

		for(int cntr = 1; cntr <= 100; cntr++)
		{
			sum += cntr;
		}

		System.out.println("The sum of the integers from 1 to 100 is:  " + sum);
		System.out.println();
		System.out.println();

		// ***********************************************************

		// Write a for loop that computes the sum of the integers from 51 to 100
		// and then prints the sum after the loop is over.
		// NOTE:  WE CAN REUSE THE VARIABLES SUM AND CNTR BY JUST
		// REINITILIZING THEM WITHOUT REDECLARING THEM.
		sum = 0;

		for(int cntr = 51; cntr <= 100; cntr++)
		{
			sum += cntr;
		}

		System.out.println("The sum of the integers from 51 to 100 is:  " + sum);
		System.out.println();
		System.out.println();

		// ***********************************************************

		// Write a for loop that computes the sum of the integers from 51 to 150
		// and then prints the sum after the loop is over.
		sum = 0;

		for(int cntr = 51; cntr <= 150; cntr++)
		{
			sum += cntr;
		}

		System.out.println("The sum of the integers from 51 to 150 is:  " + sum);
		System.out.println();
		System.out.println();

		// ***********************************************************

		// Write a for loop that will print 100 random integers in the range
		// from 1 to 300 inclusive.  The loop should print each random
		// integer as it is generated inside the loop, but print only 5
		// random integers per line.

		System.out.println("Here are the 100 random integers 5 per line.\n"); 
		for(int cntr = 1; cntr <= 100; cntr++)
		{
			int x = (int) (Math.random() * 300) + 1;
			System.out.printf("%7d", x);
			if (cntr % 5 == 0)
				System.out.println(); 	
		}

		System.out.println();
		System.out.println();
		
		// ***********************************************************


		// Write a count-down for loop that sums the numbers from 1 to 100 inclusive
		// in REVERSE order by adding them like this 100 + 99 + .... + 2 + 1
		// and then print the sum out after the loop is over.
		sum = 0;

		for(int cntr = 100; cntr >= 1; cntr--)
		{
			sum += cntr;
		}

		System.out.println("The Reverse sum of the integers from 100 to 1 is:  " + sum);
		System.out.println();
		System.out.println();

		// ***********************************************************

		// Write a count-down for loop that sums the numbers from 51 to 100 inclusive
		// // in REVERSE order by adding them like this 100 + 99 + .... + 52 + 51
		// and then print the sum out after the loop is over.
		sum = 0;

		for(int cntr = 100; cntr >= 51; cntr--)
		{
			sum += cntr;
		}

		System.out.println("The Reverse sum of the integers from 100 to 51 is:  " + sum);
		System.out.println();
		System.out.println();

		// ***********************************************************

		// Write a count-down for loop that finds and prints the square roots
		// of the multiples of 5 from 25 down to 10 inclusive.
		System.out.println("Count down for loop using number >= 10 ...");

		for (int number = 25; number >= 10; number -= 5)
		{
			System.out.printf("The square root of%5d is%10.6f%n", number, Math.sqrt(number));
			//System.out.println("The square root of " + number + " is " + Math.sqrt(number));
		}

		System.out.println();
		System.out.println();

		// ***********************************************************

		double number;
		double sum2 = 0;
		System.out.print("How long is the list? ");
		int count = reader.nextInt();
		for (int i = 1; i <= count; i++)
		{
			System.out.print("Enter a positive number:  ");
			number = reader.nextDouble();
			sum2 += number;
		}
		System.out.println("The sum of the numbers entered from the keyboard is:  " + sum2);
		System.out.println();
		System.out.println();

		// ***********************************************************

		// Write a for loop that will run 5 times and allow the user to enter
		// a vocabulary word from the keyboard each time the loop runs. The word
		// will be printed after it is received from the keyboard along with how
		// many characters are in the word.

		reader.nextLine();
		String word = "";  // initialized to empty string
		for (int i = 1; i <= 5; i++)
		{
			System.out.print("Enter a vocab word:  ");
			word = reader.nextLine();
			System.out.print("The number of characters in " +  word + " is ");
			System.out.println( word.length() );
		}

		System.out.println();		System.out.println();

		// ***********************************************************

		// Why does the following for loop never run?

		int b = 50;
		int a;
		for(a = 100; a < b; a++)
		{
			System.out.println("This will print if the loop runs!");
			a += b;	
		}
		System.out.println("The value of a is:  " + a);
		System.out.println("The value of b is:  " + b);
		System.out.println("The for loop never runs!!! ");
		
		System.out.println();		System.out.println();

		// ***********************************************************
		
		// A for loop that never ends is also called an infinite loop.
		// Here is an example of a for loop that starts but never ends.
		// Can you tell why?  ACTIVATE THIS LOOP AND RERUN THE PROGRAM.
		// After running this code, then deactivate it and activate the
		// next section below this one.
	/*
		int d = 50;
		for(int c = 1; c != 300; c += 2)
		{
		   d += 100;
		}
		System.out.println("The value of d is " + d);
	*/
		
		System.out.println();		System.out.println();

		// ***********************************************************
		
		// The expected output of the following loop is:
		
		// 0.0	0.1	0.2	0.3	0.4	0.5	0.6	0.7	0.8	0.9	1.0
		
		// However, because numbers that are declared as double have 
		// about 18 digits of precision, the rounding effect with 
		// certain numbers can lead to unexpected errors.  Numbers
		// that are repeating or non-terminating decimals must be truncated 
		// at some point because they must be represented in binary
		// by the computer.
		
		// CAUTION:  THE FOLLOWING CODE PRODUCES AN INFINITE LOOP!!!
		// IT PRODUCES AN INFINITE LOOP BECAUSE SOME VALUES CANNOT BE
		// REPRESENTED EXACTLY BECAUSE THE PRECISION OF DOUBLES ONLY
		// GOES TO 18 DECIMAL PLACES.  THIS CAN CAUSE PROBLEMS WHEN 
		// JAVA TRIES TO REPRESENT A VALUE LIKE 1/3.  AT SOME POINT
		// THE VALUE SUBSTITUED FOR 1/3 MUST BE TRUNCATED.
		// BE PREPARED TO STOP IT BY CLICKING THE RED TERMINATION SQUARE
		// IN THE CONSOLE WINDOW TITLE BAR. CAN YOU TELL WHY?
	
		for (double x = 0.0; x != 2.0; x+= 0.1)
		{
			System.out.println(x + " ");
		}
		
		
/*		
		// THE FOLLOWING CODE DOES NOT PRODUCE AN INFINITE LOOP!
		// BUT IT SHOWS THE RESULTS OF LIMITED PRECISION.
		// ACTIVATE THIS CODE TO RUN IT AND SEE HOW THE PRECISION
	    // OF SOME DOUBLE VALUES IS NOT EXACT.
		for (double x = 0.0; x <= 2.0; x+= 0.1)
		{
			System.out.println(x + " ");
		}
*/
		System.out.println();
		System.out.println();
		System.out.println("Program has terminated.");

	}// end of main

}