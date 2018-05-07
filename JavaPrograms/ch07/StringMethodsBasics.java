package ch07;

import java.util.Scanner;

/*
 * This program allows the user to learn how to implement
 * the following String methods.
 * 
 * The first set of methods you must know how to use on the AP Exam.
 * 
 * 		int length() ... finds the number of characters of the string
 * 
 * 		String substring(int beginIndex, int endIndex) ... returns the string 
 * 				from beginIndex up to endIndex - 1 (not including endIndex)
 * 
 * 		String substring(int beginIndex) ... returns the string from beginIndex through
 * 								the end of the string.
 * 
 * 		int indexOf(String s)  ... the value returned is the starting index
 * 				of the substring s you are looking for or -1 if it doesn't exist
 * 
 * 		int compareTo(String s) .. returns 0 if the strings are equal;
 * 				returns a negative value if the reciever string is less than the parameter string;
 * 				returns a positive value if the receiver string is greater than the parameter string.
 *		
 *	These are additional String methods that are nice to know how to use:
 * 
 * 		boolean equals(String aString) ... returns true if the contents of the two stings are equal
 * 
 * 		boolean equalsIgnoreCase(String aString) ... ignore the case in comparing the contents
 * 								of two strings
 * 
 * 		String toLowerCase() ...  returns a new string with all characters converted to lower case
 * 
 * 		String toUpperCase() ... returns a new string with all characters converted to upper case
 * 
 */

public class StringMethodsBasics
{
	public static void main(String[] args)
	{
		int from = 0;
		int to = 0;
		Scanner reader = new Scanner(System.in);
		String ans = "y";
		String s = "supercalifragilisticespealidocious";	
		System.out.println();

		// *******************************************************************************
		// Part 1.  USING THE ONE AND TWO PARAMETER substring METHODS.

		ans = "n"; //n to deactiviate and y to activate
		while(ans.compareTo("y") == 0)
		{
			// Activate the following line of code and finish it to call the substring method
			// that returns the number of characters in the String s.
			System.out.println("The length of " + s + " is " + s.length());
			System.out.println();	
			System.out.println("Part 1:  Retrieving the substring from one index to another index.");
			System.out.println("YOU WILL ENTER THE STARTING AND STOPPING POINT.");
			System.out.print("Enter the starting place of the substring (an integer): ");
			from = reader.nextInt();
			System.out.print("Enter the ending place of the substring (an integer): ");
			to = reader.nextInt();
			// Activate the following line of code and finish it to call the substring method using two
			// parameters.  Look at the preceding lines above to know what to pass this method.
			System.out.println("The substring of " + s + " is " + s.substring(from, to));

			System.out.println();
			System.out.print("Part 2:  Retrieving the substring from initial index");
			System.out.print(" to the end of the string");
			System.out.println("YOU WILL ENTER ONLY THE STARTING POINT.");
			System.out.print("Enter the starting place of the substring (an integer): ");
			from = reader.nextInt();
			// Activate the following line of code and finish it to call the one parameter substring
			// method.  Look at the preceding lines above to know what to pass this method.
			System.out.println("The substring of " + s + " is " + s.substring(from));
			System.out.println();
			
			// Activate the following line to demonstrate a special circumstance of calling substring:
			//System.out.println("The method call:  s.substring(5, 5) returns: " + s.substring(5, 5));
			
			reader.nextLine();		// consume new line character
			System.out.print("Run it again? (y/n): ");
			ans = reader.nextLine();
			System.out.println();
		}

		// *******************************************************************************
		// PART 2.  USING THE indexOf METHOD.

		ans = "n";
		while(ans.compareTo("y") == 0)
		{
			System.out.println("The string is " + s);
			System.out.println();
			System.out.println();
			System.out.println("Enter one of the following:  ice, lid, super, rag, us, doc, fragil");
			System.out.print("Enter the substring you wish to search for: ");
			String sub = reader.nextLine();
			// Activate the following line of code and finish it to call the indexOf method using
			// one parameter.  Look at the preceding lines above to know what to pass this method.
			System.out.println("The starting index that the substring " + sub + " occurs in " 
					+ s + " is " + s.indexOf(sub));

			System.out.println();
			System.out.print("Run it again? (y/n): ");
			ans = reader.nextLine();
			System.out.println();
		}

		// *******************************************************************************
		// PART 3.  USING THE compareTo METHOD.

		ans = "n";
		while(ans.compareTo("y") == 0)
		{
			System.out.print("Let's try a test for the order of two strings");
			System.out.println("using the compareTo method ...");
			System.out.print("Enter the first string value for the equality test: ");
			String s1 = reader.nextLine();
			System.out.print("Enter the second string value for the equality test: ");
			String s2 = reader.nextLine();
			// Activate the following lines of code and finish the if and else if conditions
			// to compare s1 and s2 using the compareTo method for the three possible outcomes
			// of that method based on the println statements below.
			if (s1.compareTo(s2) > 0)
				System.out.println("The string " + s1 + " comes after " + s2);
			else if (s1.compareTo(s2) < 0)
				System.out.println("The string " + s1 + " comes before " + s2);
			else if (s1.compareTo(s2) == 0)
				System.out.println("The strings " + s1 + " and " + s2 + " are EQUAL.");

			System.out.println();
			System.out.print("Run it again? (y/n): ");
			ans = reader.nextLine();
			System.out.println();
		}

		// *******************************************************************************
		// PART 4.  USING THE equals METHOD.

		ans = "n";
		while(ans.compareTo("y") == 0)
		{
			System.out.println("Let's try a test for string equality using the equals method ...");
			System.out.print("Enter the string value JAVA: ");
			String s1 = reader.nextLine();
			System.out.print("Enter the string value java: ");
			String s2 = reader.nextLine();
			// Activate the following section of code (if-else) and finish the if condition
			// and test the equality of s1 and s2 using the equals method
			if (s1.equals(s2))
				System.out.println("The strings " + s1 + " and " + s2 + " are EQUAL.");
			else
				System.out.println("The strings " + s1 + " and " + s2 + " are NOT EQUAL.");

			System.out.println();
			System.out.print("Run it again? (y/n): ");
			ans = reader.nextLine();
			System.out.println();
		}

		// *******************************************************************************
		// PART 5.  USING THE equalsIgnoreCase METHOD.

		ans = "n";
		while(ans.compareTo("y") == 0)
		{
			System.out.println("Let's try a test for string equality using the equalsIgnoreCase method ...");
			System.out.print("Enter the string value JAVA: ");
			String s1 = reader.nextLine();
			System.out.print("Enter the string value java: ");
			String s2 = reader.nextLine();
			// Activate the following line of code and finish the if condition and test the equality using
			// of s1 and s2 using the equalsIgnoreCase method
			if (s1.equalsIgnoreCase(s2))
				System.out.println("The strings " + s1 + " and " + s2 + " are EQUAL.");
			else
				System.out.println("The strings " + s1 + " and " + s2 + " are NOT EQUAL.");

			System.out.println();
			System.out.print("Run it again? (y/n): ");
			ans = reader.nextLine();
			System.out.println();
		}

		// *******************************************************************************
		// PART 6.  USING THE toLowerCase METHOD.

		ans = "n";
		while(ans.compareTo("y") == 0)
		{
			System.out.print("Enter a string value with at least one capital letter to convert to lower case: ");
			String s1 = reader.nextLine();
			System.out.println("Your string is " + s1);
			System.out.println();
			System.out.println("Converting to lower case ...");
			System.out.println("String variables are immutable.");
			System.out.println("So the variable will re-reference itself to the new value. ");
			// write the assignment statement that will convert s1 to all lower case and return 
			// a String value that can be restored in s1.
			 s1 = s1.toLowerCase();

			System.out.println("The string in lower case form is " + s1);
			System.out.println();
			System.out.print("Run it again? (y/n): ");
			ans = reader.nextLine();
			System.out.println();
		}

		// *******************************************************************************
		// PART 7.  USING THE toUpperCase METHOD.

		ans = "y";
		while(ans.compareTo("y") == 0)
		{
			System.out.print("Enter a string value with at least one lower case letter ");
			System.out.print(" to convert to upper case: ");
			String s1 = reader.nextLine();
			System.out.println("Your string is " + s1);
			System.out.println();
			System.out.println("Converting to upper case ...");
			System.out.println("String variables are immutable.");
			System.out.println("So the variable will rereference itself to the new value. ");		

			// write the assignment statement that will convert s1 to all upper case and return 
			// a String value  that can be restored in s1.			
			s1 = s1.toUpperCase();

			System.out.println("The string in upper case form is " + s1);
			System.out.println();
			System.out.print("Run it again? (y/n): ");
			ans = reader.nextLine();
			System.out.println();
		}

		System.out.println("Program terminated.");
	}

}
