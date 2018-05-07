// FileName:  FriendsList.java
// Chapter 10 Program #2
package ch10;

import java.util.Scanner;

import javax.print.DocFlavor.READER;

public class FriendsList
{		
	public static void main (String[] args)
	{
		// Declare an integer variable named friendCount and initialize it to zero.
		// This variable will track the logical size of the friends array.
		int friendCount = 0; 

		// Declare and instantiate an array of String called friends of
		// physical size 10.
		String [] friends = new String [10];

		// Stop and write the method getFriends and then call it here,
		// passing it the friends array.  The method will fill the array
		// friends with up to 10 friends and return it.  Assign the returned
		// value to the variable friendCount.
		friendCount = getFriends(friends);

		// Print out the number of friends in the variable friendCount along
		// with the message:  "The number of friends in the array is "
		System.out.println("\nThe number of friends in the array is " + friendCount);

		// Stop and write the method printFriends and then call it here,
		// passing it the friends array and friendCount.  (The method needs
		// to know the logical size of friends so it can print only the valid
		// data in the array friends.)
		printFriends(friends, friendCount);


		// STOP AND RUN THE PROGRAM HERE AND MAKE SURE IT WORKS
		// BEFORE CONTINUING TO WRITE CODE.
		System.out.println();		System.out.println();

		// Stop and write the method displayAllArrayElements and then
		// call it here passing it the friends array.  It will NOT use
		// the logical size of the array, but rather print all of the
		// elements in the array whether they are valid or invalid.
		displayAllArrayElements(friends);
		System.out.println();



		// STOP AND RUN THE PROGRAM HERE AND MAKE SURE IT WORKS
		// BEFORE CONTINUING TO WRITE CODE.

		// Stop and write the getShortNames method and then call it here
		// passing it the friends array and the logical size of friends.
		// Store the value returned by the method in the String array
		// variable named shortNames.
		String [] shortNames = getShortNames(friends, friendCount);
				




		// Call the method displayAllArrayElements and pass it the String
		// array named shortNames so they can be printed.
		displayAllArrayElements(shortNames);


		// STOP AND RUN THE PROGRAM HERE AND MAKE SURE IT WORKS
		// BEFORE CONTINUING TO WRITE CODE.
		System.out.println();		System.out.println();

		System.out.print("Friends with short names: ");
		// Stop and write the method printOnlyValidStrings and then call it
		// here and pass it the shortNames array.  This is a void method
		// call with only the one parameter.
		printOnlyValidStrings(shortNames);


		// RUN THE PROGRAM NOW TO MAKE SURE THE LAST PART WORKS.
	} // end main


	// Write the method getFriends. This method receives one parameter,
	// an array of strings named friends that is empty.  The method lets
	// the user enter the names of friends (up to 10) using a loop and 
	// places the names in the array friends.  After each iteration of the
	// loop, the user is queried to see if there is another friend to be entered.
	// This method should declare and use a local integer variable named
	// friendCount which will track the logical size of the array friends,
	// so that every time a friend is entered the logical size is incremented
	// by one.  This method will return the logical size of the array friends.
	// Since you are reading names from the keyboard, make sure you declare a
	// local Scanner variable to read the names.  You must use a while loop in
	// this method.  The while loop header will check two conditions to see if
	// it runs each time:
	//		1)  a check to make sure the array friends is not full
	//		2)  a check to see if the user wants to enter another friend
	// See Chapter 10 Section 7 to review how to write a loop that queries.
	// Use the following line to prompt the user at the bottom of the loop:
	// System.out.println("Enter another friend? (yes = y   and no = n) :  ");
	public static int getFriends(String [] friends)
	{
		Scanner reader = new Scanner (System.in);
		int friendCount = 0;
		String answer = "y";
		
		while(friendCount < friends.length && answer.compareTo("y") == 0)
		{
			//ask for first name and store it in friends at index friend count
			System.out.print("Enter a friend: ");
			friends[friendCount] = reader.nextLine();
			
			//ask the user if tey want to enter another firnd
			System.out.print("Enter another friend? (yes = y and no = n): ");
			answer = reader.nextLine();
			
			//increment friendcount by 1
			friendCount++;

		}
		
		
		return friendCount;
	}











	// Write the method printFriends.  It is a void method and receives
	// two parameters, an array of strings named friends and an integer
	// parameter named friendCount.  This method displays only the friends
	// in the valid part of the friends array.  The parameter friendCount
	// holds the logical size of the array friends.  This method prints the
	// friends all on one line using a printf statement and including the message:
	//     "Friend List: "
	// The printf statement should use a field width of 10 to print each friend.
	public static void printFriends(String [] friends, int friendCount)
	{
		System.out.print("Friend List: ");
		for (int i = 0; i < friendCount; i++)
			System.out.printf("%10s", friends[i]);
	}











	// Write the method displayAllArrayElements.  It is a void method
	// and receives one parameter, an array of strings named friends.
	// This method displays the entire contents of the friends array,
	// including the invalid portion of the array. It prints the friends all
	// on one line using a printf statement following the message:
	// "Friend List: ".
	// The printf statement should use a field width of 10 to print each friend.
	public static void displayAllArrayElements (String [] friends)
	{
		System.out.print("Friend List: ");
		for (int i = 0; i < friends.length; i++)
			System.out.printf("%10s", friends[i]);
	}







	// Write the method getShortNames.  It receives two parameters.
	// One is the array of String values named friends that is partially full.
	// The second parameter named friendCount that contains the logical size of
	// friends.  This method returns a list of all of the names in friends
	// that have less than 6 characters. The new list is named shortNames.
	// When the new list is returned it may or may not be full.	
	public static String[] getShortNames(String [] friends, int friendCount)
	{
		String [] shortNames = new String [friendCount];
		int index = 0;
		
		for (int i = 0; i < friendCount; i++)
		{
			if (friends[i].length() < 6)
			{
				//System.out.println (friends[i]);
				shortNames[index] = friends[i];
				index++;
				//System.out.printf("10%s", shortNames[i]);
			}
		}
		
		
		return shortNames;
	}





	// Write the void method printOnlyValidStrings that receives an array of
	// String values named array and prints all of the non-null values
	// on one line.  Each String value will be printed right justified
	// in a field width of 10.  To test to see if a String value is not
	// equal to null, simply use:  ? != null
	public static void printOnlyValidStrings (String [] array)
	{
		for (int i = 0; i < array.length; i++)
		{
			if (array[i] != null)
				System.out.printf("%10s", array[i]);

		}
	}





} // end of FriendsList class - DO NOT DELETE THIS BRACE








