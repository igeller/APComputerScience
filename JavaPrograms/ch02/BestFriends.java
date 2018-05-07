/* 
File:  BestFriends.java
Name:  

Include any import statements necessary.

The output of the programming should be formatted as follows:

Enter your first best friend (a string):  Bill
Enter your second best friend (a string):  Ann
Enter your third best friend (a string):  Steve

Here are your three best friends:
Bill
Ann
Steve

*/
package ch02;

import java.util.Scanner;

public class BestFriends
{
	public static void main(String[] args)
	{	
	
	Scanner reader = new Scanner (System.in);
	
	String best_friend1;
	String best_friend2;
	String best_friend3;
	
	System.out.print("Enter your first best friend: ");
	best_friend1 = reader.nextLine();

	System.out.print("Enter your second best friend: ");
	best_friend2 = reader.nextLine();
	
	System.out.print("Enter your third best friend: ");
	best_friend3 = reader.nextLine();
	
	System.out.println();
	
	System.out.print("Your three best friends are:");
	System.out.println();
	
	System.out.println(best_friend1);
	System.out.println(best_friend2);
	System.out.println(best_friend3);
	
	System.out.println();

	System.out.print("The program has terminated.");
	
	}
}













