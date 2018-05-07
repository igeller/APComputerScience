package ch07;
import java.util.Scanner;

/*
THIS PROGRAM WILL USE ONLY THE FOLLOWING STRING METHODS:

int length() ... finds the number of characters of the string

String substring(int beginIndex, int endIndex) ... returns the string 
			from beginIndex up to endIndex - 1 (not including endIndex)

String substring(int beginIndex) ... returns the string from beginIndex 
 								      through the end of the string.

int indexOf(String s)  ... the value returned is the starting index
		of the substring s you are looking for or -1 if it doesn't exist

int compareTo(String s) ...
	returns 0 if the strings are equal;
	returns a negative value if the receiver string is less than the parameter string;
	returns a positive value if the receiver string is greater than the parameter string.
 */

public class SubstringMania2
{
	public static void main(String[] args)
	{
		Scanner reader = new Scanner (System.in);	


		// Part 5. STOP AND WRITE THE deleteCharacter METHOD AT THE END OF THIS FILE.
		// The next 6 lines of code are complete so the method can be called and the
		// operation tested.
		System.out.println("Now we will remove all occurences of a particular character from a string. ");	
		System.out.print("First, enter a string that is a few words or a sentence: ");
		String input = reader.nextLine();
		System.out.print("Now, enter a character you wish to delete from the string: ");
		String charToDelete = reader.nextLine();
		// ACTIVATE THE NEXT LINE WHEN YOU GET TO THIS PART.
		String result = deleteCharacter (input, charToDelete);
		System.out.println("The new string with the character deleted is: " + result);

		System.out.println();

		// *******************************************************************************


		// Part 6. Write the code that will count the number of words in a sentence,
		// knowing that a blank space follows any word in the sentence and the sentence
		// ends with one of the following punctuation symbols  ".", "?", "!".
		// You can do this by inspecting each character in sentence to see if it is a
		// blank space, ".", "?", or "!".
		// Assume that the sentence ends in one of the above punctuation symbols and
		// NOT a blank space.  The initial code is done for you.
		// Use only the length, substring and compareTo methods in your code.
		// Credit will not be given for the use of any other String methods.

		System.out.print("Enter a sentence that ends with a \".\", \"?\", or \"!\" : ");
		String sentence = reader.nextLine();
		System.out.println();
		int wordCount = 0;

		for (int i = 0; i <= sentence.length()-1; i++)
		{
			String character = sentence.substring(i, i+1);
			if (character.compareTo(" ") == 0 || 	character.compareTo(".") == 0 ||
				character.compareTo("!") == 0 ||	character.compareTo("?") == 0)
			{
				wordCount++;
			}
				
		}
		System.out.println("in the sentence \"" + sentence + "\" there are " + wordCount + " words");




		System.out.println();	System.out.println();

		System.out.println("Program terminated.");
	}

	// Write the method deleteCharacter that receives two parameters of type String
	// with names of input and ch.  The parameter input can hold any word, sentence,
	// or paragraph.  The parameter ch contains the character that will be removed from
	// input.  All occurrences of ch in the String input will be removed.  This will be
	// done through copying non-ch characters to a new String since Strings are immutable.
	// This method will return a String value that is a copy of the original String input
	// but minus all occurrences of the character ch.
	// Sample output:
	/*
	Enter a string of a few words or a sentence and press return: Java Rules! KCD Bearcats Rule!
	Enter a character in the string you entered that you wish to delete: a
	The new string with the character deleted is: Jv Rules!  KCD Bercts Rule!
	 */

	public static String deleteCharacter(String input, String ch)
	{
		String output = "";
		for (int i = 0; i <= input.length()- 1; i++)
		{ 
			String letter = input.substring(i, i+1);
			if (letter.compareTo(ch) != 0)
				output += letter;
		}
		return output;
	}







} // end of StringMethodsMania