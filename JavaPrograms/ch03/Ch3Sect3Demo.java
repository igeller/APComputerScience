// FileName:  Ch3Sect3Demo.java
package ch03;
import java.util.Scanner;

/*
In this program you can run the examples from the Writing Methods web page
that are also discussed in the Chapter 3 Section 3 Lecture. 
				
(REVIEW THE CODE IN THE MAIN METHOD AND OTHER METHODS AND ALL THE COMMENTS!)
				
						THERE IS NO CODE TO WRITE!
		
To be able to use or even write a method, you must know three things:

1) the method's name

2) the type of value the method returns 

3) the number and type of parameters that the method expects


Void methods do NOT return a value. Their job is to do some type of work
like only print something out, but that work does not involve returning
a value. It may involve just printing information or possibly calculating
a value and then printing it out, but not returning it.  So calling them
takes this general form:

<name of method> (parameters);  // DON'T INCLUDE DATA TYPE WITH PARAMETERS!!!

Void methods are called by typing only the name of the method followed by
whatever parameters need to be passed the method.

A program that has methods that return a value must do something with the
returned value.  Almost always (there are some exceptions) the returned 
value is stored in a variable using an assignment statement.  So calling 
the method takes this general form:

<data type matching return value type> <variable name> = <name of method> (parameters);

 */

public class Ch3Sect3Demo
{

	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in);

		String nm = getName ();
		System.out.print ("Your name is: " + nm); 
		
		System.out.println(); 
		
		System.out.print ("Enter your address (a string): "); 
		String address = reader.nextLine();
		printAddress (address);

		System.out.println(); 
		
		System.out.print ("Enter your student id number (a whole number): "); 
		int studentID = reader.nextInt();
		printStudentID (studentID);

		System.out.println(); 

		int age = getAge();
		System.out.println("Your age is: " + age); 
		
		System.out.println();
		
		System.out.print ("Enter the time in hours (a floating point): "); 
		double hrs = reader.nextDouble();
		System.out.print ("Enter the distance in miles (a floating point): "); 
		double miles = reader.nextDouble();
		printMilesPerHour (hrs, miles);
		
		System.out.println(); 
		
		double ave = getAverage();
		System.out.println("The average is: " + ave); 
		
		System.out.println();
		
		System.out.print ("Enter the Fahrenheit temperature (a floating point): "); 
		double fahr = reader.nextDouble();
		double cels = calculateCelsius (fahr);
		System.out.println("The equivalent celsius temperature is: " + cels);
		System.out.println();
		
		System.out.println("The program has terminated!");
	
	} // end main() method


	//  Here is the method getName that receives no parameters.  The method prompts the user
	// to enter a name, stores it in the local variable name and then returns this String value stored
	// in the variable name.
	public static String getName ( ) 
	{
		Scanner reader = new Scanner (System.in);
		System.out.println("Enter your name (a string): "); 
		String name = reader.nextLine();
		return name; 
	}
	
	
	// Here is the void method printAddress.  It receives one parameter of type String.
	// It has no return statement inside the body of this method.
	public static void printAddress (String address) 
	{
		System.out.println("The address is :" + address); 
	}


	// Here is the void method printStudentID.  It receives one parameter of type int.
	// It has no return statement inside the body of this method.
	public static void printStudentID (int id) 
	{
		System.out.println("The student ID is :" + id); 
	}

	
	// You're probably asking yourself ... why create a method just to have one println statement?
	// Well, the answer is we really wouldn't. What we're really trying to do is show you how to write 
	// a void method in its simplest form. 


	//  Here is the method getAge that receives no parameters . The method returns an integer value.
	public static int getAge ( ) 
	{
		Scanner reader = new Scanner (System.in);
		System.out.println("Enter your age (a whole number): "); 
		int age = reader.nextInt();
		return age; 
	}
	
	
	// Here is the void method printMilesPerHour.  It receives two parameters both of type double.
	// It has no return statement inside the body of this method.  It calculates a speed and prints it out.
	public static void printMilesPerHour ( double hours, double distance) 
	{
		double mph = distance / hours; 
		System.out.println("The speed is :" + mph + " miles/hr"); 
	}

	
	// Here is the method getAverage that receives no parameters . The method prompts the user for
	// an average, reads it from the keyboard, stores it in the local variable average, and then returns 
	// the floating point value stored in the variable average.Ê
	public static double getAverage ( ) 
	{
		Scanner reader = new Scanner (System.in);
		System.out.println("Enter the average (a floating point): "); 
		double average = reader.nextDouble();
		return average; 
	}
	
	
	// Here is the method calculateCelsius receives one floating point parameter, fahrenheit.
	// It uses farhenheit to calculate the celsius equivalent in an assignment statement and
	// store it in the local variable celsius.  It then returns the floating point value stored in 
	// the variable celsius.
	public static double calculateCelsius ( double fahrenheit) 
	{
		double celsius;
		celsius = (fahrenheit - 32) * 5.0 / 9.0; 
		return celsius; 
	}

	
} // end Ch3Sect3Demo