/* 
File:  HonorRollMailingList.java
Name:  Mr. Conrey

Include any import statements necessary.

The output of the programming should be formatted as follows:

Enter your first name (a string):  Sandra
Enter your last name (a string):  Smith
Enter your street address (a string):  123 Cardinal Blvd.
Enter your city (a string):  Louisville
Enter your state (a string):  Kentucky
Enter your zip code (an integer):  40241
Enter your gpa (a floating-point number):  4.38

Here is the information you entered:
First Name: Sandra
Last Name: Smith
Address: 123 Cardinal Blvd.
City: Louisville
State: Kentucky
Zip Code: 40241
GPA: 4.38

*/

package ch02;

import java.util.Scanner;

//Include any import statements necessary.


public class HonorRollMailingList
{
	public static void main(String[] args)
	{			
	Scanner reader = new Scanner(System.in);
	
	//String first;
	//String last;
	//String street;
	//String city;
	//String state;
	int zip;
	double gpa;
	
	System.out.print("Enter your first name: ");
	String first = reader.nextLine(); //write the full thing as "firstName" - capitalize the second word
	
	System.out.print("Enter your last name: ");
	String last = reader.nextLine();
	
	System.out.print("Enter your Street address: ");
	String street = reader.nextLine();
	
	System.out.print("Enter your city: ");
	String city = reader.nextLine();
	
	System.out.print("Enter your state: ");
	String state = reader.nextLine();
	
	System.out.print("Enter your zip code: ");
	zip = reader.nextInt();
	
	System.out.print("Enter your gpa: ");
	gpa = reader.nextDouble();
	
	System.out.println();
	
	
	System.out.println("Here is the information you entered: ");
	System.out.println();
	
	System.out.println("First Name: " + first);
	System.out.println("Last Name: " + last);
	System.out.println("Address: " + street);
	System.out.println("City: " + city);
	System.out.println("State: " + state);
	System.out.println("Zip Code: " + zip);
	System.out.println("GPA: " + gpa);
	
	
	
	
	}
}

