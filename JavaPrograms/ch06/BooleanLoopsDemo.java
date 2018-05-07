package ch06;

import java.util.Scanner;
// FileName:  BooleanLoopsDemo.java

public class BooleanLoopsDemo
{
	public static void main (String[] args)
	{
		Scanner reader = new Scanner(System.in);

		// Part 1.  WORDS WITH 8 CHARACTERS.
		System.out.print("Let's find a word that has 8 letters in it ...");
		System.out.println();

		boolean done = false;
		while(!done)
		{
			System.out.print("Enter a word that you think has 8 letters: ");
			String word = reader.nextLine();

			if (word.length() == 8)
			{
				System.out.println("The word " + word + " has 8 letters in it. This loop is over.");
				done = true;
			}
			else
			{
				System.out.println("The word " + word + " does NOT have 8 letters in it.");
				System.out.println();
			}
		}


		System.out.println();		System.out.println();

		// ********************************************************************************


		// Part 2.  COMPUTER GUESSES THE NUMBER YOU ARE THINKING OF.
		// The user thinks of a number between 1 and 100 and the computer
		// will try to guess it.  Assuming that the user plays fairly and
		// doesn't change the number the computer is trying to guess, the
		// computer will guess the number at the midpoint of the interval
		// between 1 and 100 to start or between the most recent guess and
		// the largest or smallest possible number.  Initially,
		// the smallest number is 1 and the largest number is 100. The user's
		// replies get the computer to converge on the answer.
		// If the computer guesses a number that is too low, then the user
		// will "larger".  If it is too high, the user will type "smaller".
		// If the computer has guessed the number then the user types "correct".
		// The loop counts how many turns it takes for the computer to guess 
		// the number.  This small game is NESTED inside of another while loop
		// that uses the boolean variable quit to see if the user wants to play
		// the game again or quit.
		boolean quit = false;
		while (!quit)
		{
			System.out.println("Think of a number between 1 and 100 but don't tell me.");
			System.out.println();
			System.out.println("Enter \"ok\" when you have it.");
			String answer = reader.nextLine();
			System.out.println();

			int turn = 0;
			int low = 1, high = 100;
			done = false;
			while (!done)
			{
				turn++;
				int guess = (low + high) / 2;  // Compute midpoint
				System.out.println("My guess is " + guess);
				System.out.println("If your number is smaller, type \"smaller\'");
				System.out.println("If your number is greater, type \"larger\"");
				System.out.println("If I got it, type \"correct\"");
				System.out.print("Which one: ");
				answer = reader.nextLine();
				System.out.println();
				if (answer.compareTo("correct") == 0)
				{
					System.out.println("I've got it in " + turn + " turns!");
					done = true;
				}
				else if (answer.compareTo("smaller") == 0)
				{
					high = guess - 1;    // Reset largest number
					System.out.println("Man!  I thought that was it!  I'll guess lower.");
				}
				else if (answer.compareTo("larger") == 0)
				{
					low = guess + 1;     // Reset smallest number
					System.out.println("Man!  I thought that was it!  I'll guess higher.");
				}
				else
				{
					System.out.print("You must enter one of the three words:  ");
					System.out.println("smaller, larger, or correct");
				}
				System.out.println();
			}

			System.out.println();
			System.out.print("Enter \"quit\" to quit this game or \"no\" to continue:  ");
			answer = reader.nextLine();
			if (answer.compareTo("quit") == 0)
				quit = true;

			System.out.println();
		} // end of while (!quit)
		System.out.println();		System.out.println();
		System.out.println("Program Terminated");
		// **************************************************************************
	}
}
