package ch07;
import java.util.Scanner;

/*
 * This program will use the following String methods:
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
 */

public class StringPracticeSheetKey
{
	public static void main(String[] args)
	{
		Scanner reader = new Scanner (System.in);	

		// For questions 1-17, given the following String variable declarations
		// and initializations, tell what values are returned by the following
		// methods calls.  

		String word1 = "thanksgiving";	String word2 = "basketball";		String word3 = "kentucky";
		String word4 = "cornhuskers";	String word5 = "louisville";		String word6 = "hilltoppers";
		String word7 = "bearcats";		String word8 = "senior retreat";	String word9 = "toppers";
		String word10 = "seniors";		String word11 = "senior";		String word12 = "hilly";


		System.out.println("The value returned by  word8.length() is " + word8.length());

		System.out.println();

		System.out.println("What value is returned by  word1.substring(1, 5)  is " + word1.substring(1, 5));

		System.out.println();

		System.out.println("The value returned by  word3.substring(0, 1)  is " + word3.substring(0, 1));

		System.out.println();

		System.out.println("The value returned by  word1.substring(6)  is " + word1.substring(6));

		System.out.println();

		System.out.println("The value returned by  word2.substring(1, 4)  is " + word2.substring(1, 4));

		System.out.println();

		System.out.println("The value returned by  word4.substring(0, 8)  is " + word4.substring(0, 8));

		System.out.println();

		System.out.println("The value returned by  word3.substring(4, 7)  is " + word3.substring(4, 7));

		System.out.println();

		System.out.println("The value returned by  word8.substring(9)  is " + word8.substring(9));

		System.out.println();

		System.out.println("The value returned by  word6.indexOf(word9)  is " + word6.indexOf(word9));

		System.out.println();

		System.out.println("The value returned by  word9.indexOf(word6)  is " + word9.indexOf(word6));

		System.out.println();

		System.out.println("The value returned by " + word5.indexOf("ville") + " is " + word5.indexOf("ville"));

		System.out.println();

		System.out.println("The value returned by  word8.indexOf(word10)  is " + word8.indexOf(word10));

		System.out.println();

		System.out.println("The value returned by  word8.indexOf(word11)  is " + word8.indexOf(word11));

		System.out.println();

		// Using Unicode (ASCII) values, tell what integer the method compareTo
		// will return.

		System.out.println("The value returned by word12.compareTo(word6) is " + word12.compareTo(word6));

		System.out.println();

		System.out.println("The value returned by word2.compareTo(word7) is " + word2.compareTo(word7));

		System.out.println();

		System.out.println("The value returned by word10.compareTo(word8) is " + word10.compareTo(word8));

		System.out.println();

		System.out.println("The value returned by word3.compareTo(word5) is " + word3.compareTo(word5));

		System.out.println();

		// Tell what String value is the result of the following String operations
		// that are concatenated together:

		System.out.print("The value returned by " + word7.substring(0, 1)  +  word7.substring(word7.length() - 1) + " is ");
		System.out.println(word7.substring(0, 1)  +  word7.substring(word7.length() - 1) );

		System.out.println();

		System.out.print("The value returned by  word2.substring(0, 6)  +  word4.substring(4) is ");
		System.out.println(word2.substring(0, 6)  +  word4.substring(4));

		System.out.println();

		System.out.println("The value returned by  word3.substring(0)  +  word7.substring(4, word7.length())  is ");
		System.out.println(word3.substring(0)  +  word7.substring(4, word7.length()));

		System.out.println();
		
		System.out.println("The value returned by  ");
		System.out.print("word4.substring(0, 4) + word12.substring(4) + word8.substring(0, 6) + word10.substring(6) is ");
		System.out.println(word4.substring(0, 4) + word12.substring(4) + word8.substring(0, 6) + word10.substring(6));

		System.out.println();	System.out.println();

		System.out.println("Program terminated.");
	}



} // end of StringMethodsMania