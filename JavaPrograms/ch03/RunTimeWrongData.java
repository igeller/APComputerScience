// FileName:  RunTimeWrongData.java

// This program demonstrates that Java throws a
// java.util.InputMismatchException
// because the wrong type of data was not received from the keyboard.

// Run this program and enter the word "Java"
// and view the error message in the console window.
// Next, run this program and enter the value 23.87
// and view the error message in the console window.

package ch03;

import java.util.Scanner;

public class RunTimeWrongData
{
	public static void main (String [] args)
	{
		Scanner reader = new Scanner (System.in);
		System.out.print("Enter an integer: ");
		int i = reader.nextInt();
		System.out.println ("The value of i is  " + i);
	}
}
