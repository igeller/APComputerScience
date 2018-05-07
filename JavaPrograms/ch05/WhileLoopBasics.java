// WhileLoopBasics.java
package ch05;

import java.util.Scanner;

public class WhileLoopBasics
{
	
	public static void main(String[] args) 
	{
		Scanner reader = new Scanner(System.in);
		
		// ***********************************************************
		
		// This loop will not run!  Study the code and discuss why
		// this is true with your neighbor.
		int a = 100;
		int b = 50;
		while (a < b)
		{
			a += b;
			System.out.println("If the loop runs this will be printed.");
		}
		System.out.println("The value of a is:  " + a);
		System.out.println("The value of b is:  " + b);
		System.out.println("The loop never runs!!! ");
		System.out.println();
		System.out.println();
		
		// *****************************************************
		
		// Write a loop that will compute the sum of the numbers 
		// from 5 to 10 inclusive.  Set up all the variables and
		// initialize them to correct values prior to the loop.
		int sum = 0;
		int cntr = 5;
		
		
		
		
		
		// ACTIVATE THE NEXT LINE OF CODE AFTER YOU WRITE THE LOOP ABOVE.
		// IT WILL BE EXECUTED AFTER THE LOOP IS OVER.
		//System.out.println("The sum of the numbers from 5 to 10 inclusive is:  " + sum);
		System.out.println();
		System.out.println();
		
		// ***********************************************************
		
		// Run the following code first and see the value of sum that is printed.
		// Next, activate the System.out.println statement in the loop to see
		// the value of sum printed every time the loop runs.
		// Next, modify the following code so that the value contained in
		// increment is still added to sum each time the loop runs,
		// but change increment to 10 and go from 0 to 1000 instead.
		// What is the final answer you get
		int startingValue = 10;
		int endingValue = 100;
		int increment = 7;
		sum = 0;
		cntr = startingValue;
		while(cntr <= endingValue) {
			sum += cntr;
			cntr += increment;
			//System.out.println("The sum is:  " + sum);
		}
		System.out.println("The sum is:  " + sum);
		System.out.println();
		System.out.println();
		
		// ***********************************************************
		
		// Write a count-down loop that will print the square (NOT the square root)
		// of all multiples of 3 between 30 and 3 inclusive.
		// The square of 30 should be printed first and the square of 3 last.
		int number = 30;
		
		
		
		
		
		
		
		System.out.println();
		System.out.println();
		
		// ***********************************************************
		
		// A Task-Controlled Loop continues until a task is completed.
		// Here the task is to identify the number that takes sum over
		// 1,000,000.  No code to write.  Just run the code and view
		// the number that takes the sum over 1,000,000.
		sum = 0;
		number = 0;
		while ( sum <= 1000000) {
			number++;
			sum += number;
		}
		System.out.println("The first value of number for which sum is over 1,000,000 is:  " + number);
		System.out.println();
		System.out.println();
		
		// ***********************************************************
		
		// Computing Factorial.  Study the code and then run the
		// program and see what value is printed for the factorial.
		// Next, activate the System.out.println statement in the loop
		// to see the value of product printed every time the loop runs.
		// There is no code to write.
		System.out.print("Enter a number greater than zero: ");
		number = reader.nextInt();
		int product = 1;
		int count = 1;
		while (count <= number) {
			product *= count;
			//System.out.println(product);
			count++;
		}
		System.out.println("The factorial of " + number + " is " + product);
		System.out.println();
		System.out.println();
		
		// ***********************************************************
		
		// The following is an example of a while(true) loop.
		// There is no code to write.  Study the code and then run the
		// program and enter the age and name of two or three persons.
		// Make sure you enter an age at some point below 0 and enter
		// an age above 120 to see the special output statement.
		// When you want to stop the loop, enter -1 for the age.  The
		// if statement that checks to see if age is equal to -1 will
		// execute the break statement.
			String name;
			int age;

			while(true)
			{				
				System.out.print("Enter the person's age or -1 to quit: ");
				age = reader.nextInt();
				
				if (age == -1)
						break;
				
				// consume the new line character from nextInt()
				reader.nextLine();	
				
				System.out.print("Enter the person's name: ");
				name = reader.nextLine();
			
				if(age < 0 || age > 120)
				{
					System.out.println();
					System.out.println("There is NO WAY you are alive " + name);
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
			
			// ***********************************************************
			
			// No code to write here.  Just study the code and discuss what
			// it does with your neighbor and then run the program and view
			// the output to confirm that the code does what the inline comments
			// say it will do.
			sum = 0;
			number = 1;
			while (sum <= 10)
			{
				number++;		
				// as the loop runs number will hold the values 2, 3, 4, and finally 5.
				System.out.println ("The current value of number is " + number);
				sum += number;	// as the loop runs sum will hold the values 2, 5, 9, 14
				System.out.println ("The current value of sum is " + sum);
				System.out.println();
			}
			System.out.println();
			System.out.println ("The last value of number is " + number);
			System.out.println();
			System.out.println("Program has terminated.");
			
	}// end of main

}
