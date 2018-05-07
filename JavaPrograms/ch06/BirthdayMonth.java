package ch06;

import java.util.Scanner;

/*	FileName:  BirthdayMonth.java
	Creator:  Mr. Conrey
	Updated:   11/4/2013

	Goal:  To be able to use boolean variables and the String class
	methods length(), trim(), and compareTo() correctly.	

	Please follow the in-line Instructions.

	If you have an error on the line "Program Terminated", it is because you don't
	have a break statement somewhere inside the while(true) loop.
	Don't use the word return!
	
	NOTE:  THE LENGTH OF EMPTY STRING IS ZERO.
 */


public class BirthdayMonth
{
	public static void main (String[] args)
	{

		Scanner reader = new Scanner(System.in);
		String month;

		while (true)
		{
			System.out.println ("Press return without entering anything to Quit.");
			System.out.print ("Enter your birthday month and press return:  ");	
			month = reader.nextLine();

			// **********************************************************************
			// Part 1. INPUT CLEAN UP AND STOPPING THE WHILE(TRUE) LOOP.
			// Clean up the input stored in month and restore it in month.
			month = month.trim();

			// If the return key is pressed when asking for the month above without
			// entering any valid non-blank character, then break out of the while(true) loop.
			if (month.length() == 0) // if (month.compareTo("") == 0);
				break;

			System.out.println();

			// **********************************************************************

			// Part 2. TESTING INPUT TO PRINT WHAT MONTH A PERSON WAS BORN IN.
			// WRITE AN EXTENDED IF-ELSE STATEMENT WHERE EACH CONDITION CONTAINS ONLY
			// A SIMPLE BOOLEAN EXPRESSION.
			
			// In the first branch of the extended if statement, test to see if January
			// was entered from the keyboard using the correct String method.  If it was,
			// then output the string "You were born in January".  In the second branch,
			// test to see if February was entered from the keyboard, If it was,
			// then output the string "You were born in February". Follow this same approach
			// for all of the remaining branches printing out the appropriate month.
			// If one of the 12 months is not entered but some other word, then this segment
			// of code will do nothing.
			if (month.compareTo("January") == 0)
				System.out.println("You were born in January.");
			else if (month.compareTo("February") == 0)
				System.out.println("You were born in February.");
			else if (month.compareTo("March") == 0)
				System.out.println("You were born in March.");
			else if (month.compareTo("April") == 0)
				System.out.println("You were born in April.");
			else if (month.compareTo("May") == 0)
				System.out.println("You were born in May.");
			else if (month.compareTo("June") == 0)
				System.out.println("You were born in June.");
			else if (month.compareTo("July") == 0)
				System.out.println("You were born in July.");
			else if (month.compareTo("August") == 0)
				System.out.println("You were born in August.");
			else if (month.compareTo("September") == 0)
				System.out.println("You were born in September.");
			else if (month.compareTo("October") == 0)
				System.out.println("You were born in October.");
			else if (month.compareTo("November") == 0)
				System.out.println("You were born in November.");
			else if (month.compareTo("December") == 0)
				System.out.println("You were born in December.");
			

				


			// **********************************************************************

			// Part 3. TESTING TO SEE IF THE VALUE ENTERED FOR MONTH IS NOT REALLY A MONTH 
			// YOU MUST USE compareTo on this next segment, SO IF YOU WANT to see if two String 
			// values are NOT EQUAL THEN USE CODE SIMILAR TO (month.compareTo("January") != 0) .
			// Write a 12 part compound boolean expression that tests to see that the String value
			// entered for month above is NOT equal to any month of the year.
			// If none of the 12 months of the year were not entered then output the string
			// "The word you entered is not a month"  otherwise don't print anything.
			// In writing the condition for the if statement, WRITE ONLY 3 PARTS ON ONE LINE so
			// everything can be read on the screen. 
			
			if( (month.compareTo("January") != 0)    &&   (month.compareTo("February") != 0)   &&
				(month.compareTo("March") != 0)      &&   (month.compareTo("Aprin") != 0)      &&
				(month.compareTo("May") != 0)        &&   (month.compareTo("June") != 0)       &&
				(month.compareTo("July") != 0)       &&   (month.compareTo("August") != 0)     &&
				(month.compareTo("September") != 0)  &&   (month.compareTo("October") != 0)    &&
				(month.compareTo("November") != 0)   &&   (month.compareTo("December") != 0) )
				{
					System.out.print("The word you entered is not a month"); 
			    }
		

			
			
			
			
			
			System.out.println();

			// **********************************************************************

			// Part 4. FLIP FLOP OF PART 3. 
			// DeMorgan's Law:  !A  &&  !B    is equal to  ! (A || B)
			// Rewrite your completed boolean expression above using || instead of && 
			// while applying DeMorgan's Law.

			if(!((month.compareTo("January")  ==  0)    ||   (month.compareTo("February")  ==  0)   ||
				 (month.compareTo("March")  ==  0)      ||   (month.compareTo("Aprin")  ==  0)      ||
				 (month.compareTo("May")  ==  0)        ||   (month.compareTo("June")  ==  0)       ||
				 (month.compareTo("July")  ==  0)       ||   (month.compareTo("August")  ==  0)     ||
			  	 (month.compareTo("September")  ==  0)  ||   (month.compareTo("October")  ==  0)    ||
			  	 (month.compareTo("November")  ==  0)   ||   (month.compareTo("December")  ==  0)))
				{
					System.out.println("The word you entered is not a month"); 
				}
			
			
			
			
			
			System.out.println();	

			// **********************************************************************

			// Part 5.  FINDING THE SEASON THE MONTH IS IN.
			// In this part use only if statements that contain Compound Boolean Conditions!
			// Follow the in-line instructions below.
			
			// Use one line of code in an assignment statement to declare a boolean variable named spring. 
			// The right portion of the assignment statement will be a compound boolean expression
			// that tests to see if the value stored in month is either March, April or May.
			boolean spring = month.compareTo("March") == 0	||	month.compareTo("April") == 0	||
							 month.compareTo("May") == 0;
			

			// Use one line of code in an assignment statement to declare a boolean variable named summer. 
			// The right portion of the assignment statement will be a compound boolean expression
			// that tests to see if the value stored in month is either June, July, or August.
			boolean summer = month.compareTo("June") == 0	||	month.compareTo("July") == 0	||	
							 month.compareTo("August") == 0;
			

			// Use one line of code in an assignment statement to declare a boolean variable named fall. 
			// The right portion of the assignment statement will be a compound boolean expression
			// that tests to see if the value stored in month is either September, October, or November.
			boolean fall = month.compareTo("September") == 0	||	month.compareTo("October") == 0	||	
						   month.compareTo("November") == 0;
			

			// Use one line of code in an assignment statement to declare a boolean variable named winter. 
			// The right portion of the assignment statement will be a compound boolean expression
			// that tests to see if the value stored in month is either December, January, or February.
			boolean winter = month.compareTo("December") == 0	||	month.compareTo("January") == 0	||
							 month.compareTo("February") == 0;
			

			// **********************************************************************

			// Part 6. PRINTING THE SEASON THAT THE MONTH IS IN.	
			// Write an extended if statement that will print one of the following statements:
			//		"You were born in the spring."
			//		"You were born in the summer."
			//		"You were born in the fall."
			//		"You were born in the winter."
			//	    "The word entered does not have a season."
			// In writing the extended if statement, DO NOT HAVE A FINAL ELSE BRACH.  The first four
			// branches of the extended if should print the first four strings above and each of the
			// boolean conditions should have a single boolean variable as the condition.
			// The final else-if branch should test the spring, summer, fall, and winter boolean 
			// variables and see if they are all false, then print: "The word entered does not have a season."
			// DON'T USE == OR COMPARETO WHEN WRITING THE BOOLEAN CONDITIONS.  USE THE NOT OPERATOR ! AS
			// NEEDED.

			if (spring)
				System.out.println("You were born in the spring.");
			else if (summer)
				System.out.println("You were born in the summer.");
			else if (fall)
				System.out.println("You were born in the fall.");
			else if (winter)
				System.out.println("You were born in the wintr.");
			else if (! (spring || summer || fall || winter))
				System.out.println("The word entered does not have a season.");
			
			System.out.println();
			System.out.println();

		} // end while(true)

		System.out.println("Program Terminated.");

	} // end main
}










