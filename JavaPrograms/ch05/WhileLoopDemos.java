// AP Computer Science
// WhileLoopDemos.java
package ch05;

import java.util.Scanner;

public class WhileLoopDemos
{
	public static void main(String[] args) 
	{
		Scanner reader = new Scanner(System.in);

		// **********************************************************************

		// Write a while loop that computes the sum of the integers from
		// 1 to 100 and then prints the sum after the loop is over.
		int sum = 0;
		int cntr = 1;
		while(cntr <= 100)
		{
			sum += cntr;
			cntr++;
		}
		System.out.println("The sum of the integers from 1 to 100 is:  " + sum);
		

		System.out.println();
		System.out.println();

		// *********************************************************************** 
		
		// Write a while loop that computes the sum of the integers from 51 to 100
		// and then prints the sum after the loop is over.
		// NOTE:  WE CAN REUSE THE VARIABLES SUM AND CNTR BY JUST
		// REINITILIZING THEM WITHOUT REDECLARING THEM.
		sum = 0;
		cntr = 51;
		while(cntr <= 100)
		{
			sum += cntr;
			cntr++;
		}
		System.out.println("The sum of the integers from 51 to 100 is:  " + sum);
		System.out.println();
		System.out.println();
		
		// ***********************************************************
		
		// Write a while loop that computes the sum of the integers from 51 to 150
		// and then prints the sum after the loop is over.
		sum = 0;
		cntr = 51;
		while(cntr <= 150)
		{
			sum += cntr;
			cntr++;
		}
		System.out.println("The sum of the integers from 51 to 150 is:  " + sum);
		System.out.println();
		System.out.println();

		// ***********************************************************
			
		// Write a count-down while loop that sums the numbers from 1 to 100 inclusive
		// in REVERSE order by adding them like this 100 + 99 + .... + 2 + 1
		// and then print the sum out after the loop is over.
		sum = 0;
		cntr = 100;
		while(cntr >= 1)
		{
			sum += cntr;
			cntr--;
		}
		System.out.println("The Reverse sum of the integers from 100 to 1 is:  " + sum);
		System.out.println();
		System.out.println();
		
		// ***********************************************************
		
		// Write a count-down while loop that sums the numbers from 51 to 100 inclusive
		// // in REVERSE order by adding them like this 100 + 99 + .... + 52 + 51
		// and then print the sum out after the loop is over.
		sum = 0;
		cntr = 100;
		while(cntr >= 51)
		{
			sum += cntr;
			cntr--;
		}
		System.out.println("The Reverse sum of the integers from 100 to 51 is:  " + sum);
		System.out.println();
		System.out.println();
		
		// ***********************************************************
		
		// Write a count-down while loop that finds and prints the square roots
		// of the multiples of 5 from 25 down to 10 inclusive.
		System.out.println("Count down loop using while(number >= 10)");
		int number = 25;
		while (number >= 10)
		{
			System.out.println("The square root of " + number + " is " + Math.sqrt(number));
			number -= 5;		// number = number - 5
		}
		System.out.println();
		System.out.println();

		// ***********************************************************
		
		// Write a count-down while loop that finds and prints the square roots
		// of the multiples of 5 from 25 down to 10 exclusive.
		System.out.println("Count down loop using while(number > 10)");
		number = 25;
		while (number > 10)
		{
			System.out.println("The square root of " + number + " is " + Math.sqrt(number));
			number -= 5;		// number = number - 5
		}
		System.out.println();
		System.out.println();

		// ***********************************************************
		
		// A loop can execute until some task is accomplished.
		// This code seeks to find the value of number once sum
		// is greater than 1,000,000.
		sum = 0;
		number = 0;
		while ( sum <= 1000000)
		{
		number++;
		sum += number;
		}
		System.out.print("The first value of number for which");
		System.out.println(" sum is over 1,000,000 is: " + number);

		System.out.println();
		System.out.println();

		// ***********************************************************		
		
		// Generate a random integer between -5 and 5 inclusive and
		// store it in x.  If x is positive find the square root of all
		// values between 1 and x and print them out, otherwise do nothing. 
		// Note: if the value stored in x is between -5 and 0 inclusive,
		// the loop will NOT run at all.
		
		int x = (int) (Math.random() * 11 ) - 5;
		while (x > 0) 
		{
			double root = Math.sqrt(x);
			System.out.println("The square root of x is " + root);
			x--;
		}

		System.out.println();
		System.out.println();

		// ***********************************************************	

		System.out.println("The following code prints whether each integer ");
		System.out.println("between 1 and 10 is even or odd.");
		cntr = 1; 
		while (cntr <= 10)
		{
			if (cntr % 2 == 0)
				 System.out.println(cntr + " is even");
			else
				System.out.println(cntr + " is odd");
			cntr++;
		}
		
		System.out.println();
		System.out.println();
		
		// ***********************************************************
		
		// Write a while loop that will print 10 random integers in the range
		// from 25 to 75 inclusive.  The loop should print each random
		// integer as it is generated inside the loop.
		cntr = 1;
		while (cntr <= 10)
		{
			x = (int) (Math.random() * 51) + 25;
			System.out.println("The random integer is " + x); 
			cntr++;
		}
		System.out.println();
		System.out.println();

		// ***********************************************************
		
		// Write a while loop that will run 5 times and allow the user to enter
		// a vocabulary word from the keyboard each time the loop runs. The word
		// will be printed after it is received from the keyboard.
		cntr = 1;
		while (cntr <= 5)
		{
			System.out.print("Enter a vocab word and press return: ");
			String word = reader.nextLine();
			System.out.println();
			System.out.println("Vocab Word number " + cntr + " is: " + word);
			System.out.println();
			cntr++;
		}
		System.out.println("Done with Vocab Words!");
		System.out.println();
		System.out.println();
	

		// ***********************************************************
		
		// Why does the following loop never run?
		int a = 100;
		int b = 50;
		while (a < b)
		{
			System.out.println("This will print if the loop runs!");
			a += b;	
		}
		System.out.println("The value of a is:  " + a);
		System.out.println("The value of b is:  " + b);
		System.out.println("The loop never runs!!! ");
		System.out.println();
		System.out.println();
		
		// ***********************************************************
		
		System.out.print("Now we will find the sum of all integers between ");
		System.out.println("a starting value and an ending value.");
		System.out.println();
		System.out.print("Enter a starting value: ");
		int startingValue = reader.nextInt();
		System.out.print("Enter an ending value greater than starting value: ");
		int endingValue = reader.nextInt();
		sum = 0;
		cntr = startingValue;
		while (cntr <= endingValue)
		{
			 sum += cntr ;
			 cntr++;
		}
		System.out.print("The sum of the integers between " + startingValue);
		System.out.println(" and "+ endingValue + " is " + sum);
		System.out.println();
		System.out.println();

		// ***********************************************************		
		
		// Write a while (true) loop that will let the user of the program enter
		// a person's age from the keyboard or -1 to end the loop.  If -1 is entered
		// the loop will end immediately without the age being printed by employing
		// a break statement.  If the age is not -1, then the user will be prompted
		// to enter the person's name.  If the age of the person is between 0 and 120
		// inclusive, then both the name and the age of the person will be printed out,
		// otherwise if the age is outside of that range, then the message
		// "There is NO WAY you are alive!!!"  will be printed.  An if-else statement
		// inside the loop needs to be used to print the various messages.
		String name;
		int age;

		while(true)
		{				
			System.out.print("Enter the person's age or -1 to quit: ");
			age = reader.nextInt();

			if (age == -1)
				break;

			reader.nextLine();	// consume the new line character from nextInt()

			System.out.print("Enter the person's name: ");
			name = reader.nextLine();

			if(age < 0 || age > 120)
			{
				System.out.println();
				System.out.println("There is NO WAY you are alive!!!");
				System.out.println();
			}	
			else
			{
				System.out.println();
				System.out.println("The name of the person is: " + name);
				System.out.println("The age of the person is: " + age);
				System.out.println();
			}

		} // end of while(true) loop	

		
		System.out.println();
		System.out.println();		
		System.out.println("Program has terminated.");

	}// end of main

}
