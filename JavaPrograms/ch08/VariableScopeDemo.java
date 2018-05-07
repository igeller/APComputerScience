package ch08;

import java.util.Scanner;

// FileName:  VariableScopeDemo.java

//	Confirming the output of the Chapter 6 Section 6 Lecture Examples


public class VariableScopeDemo
{
	public static void main (String [] args)
	{
		Scanner reader = new Scanner(System.in);


		// Part 1.  What is wrong with this code?
		// Study the code here and decide what is wrong, then
		// activate the code by removing the  /* and */  and mouse
		// over the compile error.  Then modify the code so it compiles
		// and is correct.
	
		
		int y = 0;
		System.out.print("Enter the value of x: ");
		int x = reader.nextInt();
		if (x > 0)
		{
			System.out.print("Enter the value of y: ");
			y = reader.nextInt();		
		}
		int product = x * y; //***the scope of y --> it is not able to be reached here TO FIX declare & initialize y above
		System.out.println("The value of x times y is " + product);
		

		System.out.println();
		System.out.println();
		// ****************************************************************

		// Part 2.  What is wrong with this code?
		// Study the code here and decide what is wrong, then
		// activate the code by removing the  /* and */  and mouse
		// over the compile error.  Then modify the code so it compiles
		// and is correct.
	
		int sum = 0;
		int cntr = 0;
		boolean done = false;		
		while (! done)
		{
			//int sum = 0;
			//int cntr = 0;
			int num = (int) (Math.random() * 101) + 100;

			if (num % 2  == 1)
			{
				sum += num;
				cntr++;
			}
			
			if (cntr == 10)
			{
				done = true;
			}

		} // end of while(!done) loop
		System.out.println("The sum of the 10 odd integers is " + sum); // sum is declared w/in the while not done so cannot get to it outside
		

		System.out.println();
		System.out.println();
		// ****************************************************************

		// Part 3.  Here is the usual way of declaring loop variables
		// like i and j.  When they are declared in the loop headers,
		// they can only be used inside the loop - inside the curly
		// braces of the loop -- not outside the loop.  Activate the
		// two println statements after the loop to see that the variables
		// are "out of scope" as we say in programming.  Deactivate these
		// two lines with // after you have viewed the messages from mousing
		// over the compile errors.  Then see the next nested loop structure.
		
		for (int i = 1; i <= 4; i++) 
		{
			for (int j = 1; j <= 5; j++)
			{
				System.out.printf("%5d", j);
			}
			System.out.println();
		}
		//System.out.println("The final value of i is " + i);
		//System.out.println("The final value of j is " + j);


		// It is possible and sometimes necessary to declare the loop
		// control variables prior to the loop just in case they need
		// to be used after the loop.  Activate both lines after the 
		// loop.  You will see that there is still one compile error,
		// because even thought the variable i is initialized in the 
		// outside loop header to one, Java thinks that the inner loop
		// might not possibly have initialized the inner loop control
		// variable j.  One way around this is to go ahead and initialize
		// i and j to valid values outside the loop and then let the
		// loop headers re-initialize them to 1 before they start. Try
		// this by changing int i;  and int j;  to int i = 0 and int j = 0;

		int i = 0;
		int j = 0;
		for (i = 1; i <= 4; i++) 
		{
			for (j = 1; j <= 5; j++)
			{
				System.out.printf("%5d", j);
			}
			System.out.println();
		}
		System.out.println("The final value of i is " + i);
		System.out.println("The final value of j is " + j);


		System.out.println();
		System.out.println("Program Terminated.");

	} // end main
}