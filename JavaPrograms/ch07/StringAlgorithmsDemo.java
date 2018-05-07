package ch07;

import java.util.Scanner;

public class StringAlgorithmsDemo
{
	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in);

		String name = "Kentucky Country Day School";

		printCharactersForward(name);

		System.out.println();
		System.out.println();

		printCharactersReverse(name);

		System.out.println();
		System.out.println();

		System.out.print("Enter a word, phrase, or sentence:  ");
		String str = reader.nextLine();
		System.out.print("Enter a letter to find out how many times it occurs:  ");
		String letter = reader.nextLine();
		int letterCount = countLetter(str, letter);
		System.out.println("The letter occurs " + letterCount + " times.");
		
		System.out.println();
		System.out.println();

		String password = "J1a2v3a4";
		String copy = copyString(password);
		System.out.println("The copy of the password is " + copy);
		
		System.out.println();
		System.out.println();

		System.out.print("Enter a sentence that ends in a  \".\"  and press return: ");
		String sentence = reader.nextLine();
		printWordsOfSentence (sentence);

		System.out.println();
		System.out.println();

		findPositionsOfY(name);
		System.out.println();
		System.out.println();

		System.out.println(); System.out.println();
		System.out.println("Program Terminated.");
	} // end of main method


	// Accesses each character of a string one by one and print each character
	// on a separate line.
	public static void printCharactersForward (String str)
	{
		for (int i = 0; i < str.length(); i++)
		{
			String ch = str.substring(i, i+1);
			//System.out.println("The character at position " + i + " is " + ch);
			System.out.println(ch);
		}
	}


	// Accesses each character of a string one by one from the end of the string
	// to the beginning of the string and print all characters on the same line.
	public static void printCharactersReverse (String str)
	{
		for (int i = str.length() - 1; i >= 0; i--)
		{
			String ch = str.substring(i, i+1);
			//System.out.println("The character at position " + i + " is " + ch);
			System.out.print(ch);
		}
	}


	// Write the method countLetter that counts the number of
	// times that a letter occurs in a String str.  The method
	// receives two parameters both of type String.  One is named
	// str and the other is named letter.  The method returns the
	// number of times letter occurs in str.
	public static int countLetter (String str, String letter)
	{
		int count = 0;
		for(int i = 0; i < str.length(); i++)
		{
			String character = str.substring(i, i+1);
			if (character.compareTo(letter) == 0)
				count++;
		}
		return count;
	}


	// Write the method copyString that builds and returns a copy of a
	// String that is made by copying the original String character by
	// character.  The method receives a String parameter named str and
	// returns a String value in the String variable named copy.
	// Declare the String variable copy inside the method and initialize
	// it to empty string.  DO NOT USE an assignment statement to create
	// an alias.  The method must use a loop and access each character
	// one by one using the method substring.
	public static String copyString(String str)
	{
		String copy = "";
		for (int i = 0; i < str.length(); i++)
		{
			String letter = str.substring(i, i+1);
			copy += letter;
		}
		return copy;
	}


	// This method extracts each word of the sentence one by one and prints
	// each word on a separate line.
	public static void printWordsOfSentence (String sentence)
	{
		String word = "";
		while (sentence.length() > 0)
		{
			// First, get the position of the period that ends the sentence.
			int lastCharacterOfSentence = sentence.indexOf(".");

			// Find the position of the first blank space from the first of
			// the sentence.
			int posOfNextBlank = sentence.indexOf(" ");

			// If there is a blank space, then execute the if branch,
			// otherwise, execute the else branch if there is no blank space.
			if (posOfNextBlank != -1)
			{
				// Store the first word in the current value of sentence
				// into word.  This is the characters from the start of
				// sentence up to the first blank in sentence.
				word = sentence.substring(0, posOfNextBlank);

				// Chop the word off the front of the sentence and re-store
				// the remainder of the sentence in the variable sentence.
				sentence = sentence.substring(posOfNextBlank + 1);
			}
			else
			{
				// If no blank space is found and -1 is returned, then we must
				// be at the end of the sentence, so store the final characters
				// of the sentence in word and then reset sentence to empty string
				// so that loop will end.
				word = sentence.substring(0, lastCharacterOfSentence);
				sentence = "";
			}
			// every time the loop runs print the word that is obtained during
			// that iteration of the loop.
			System.out.println(word);

		} // end of while loop

	} // end of printWordsOfSentence method


	public static void findPositionsOfY (String str)
	{
		System.out.println("Finding the y positions in the string: " + str);
		int positionOfLastY = 0;  // will hold the last position of "y" or 0 to start
		int cntr = 0; // tracks what iteration of loop the algorithm is on
		while(true)								// str holds Kentucky Country Day School
		{
			int posOfNextY = str.indexOf("y");
			cntr++;
			if (posOfNextY == -1)
				break; // END METHOD IMMEDIATELY
			else
			{
				if (cntr == 1) // this branch executed when finding the first y
					positionOfLastY += posOfNextY;
				else // this branch executes when finding all other y's
					positionOfLastY += (posOfNextY + 1);
			}
			// Print the position of a "y"
			System.out.println("Position of \"y\" in string is " + positionOfLastY);

			// Get the remainder of the string after the "y" that was just found and
			// save it so the part before the "y" is chopped off.
			str = str.substring(posOfNextY + 1);
		}
	} // end of findPositionsOfY method

} // end of class









