package ch06;
//Demo File:  UnwantedBoolean.java
/*
	Read and study the inline comments and then try running the program
	as instructed.
 */

public class UnwantedBoolean
{
	public static void main (String [] args)
	{	
		boolean overdrawn = false;

		// If you use a boolean variable in an if condition, then you 
		// need to be extremely careful not to use the assignment operator =
		// in the if condition as seen below.  Make sure you use ==.
		// The reason is that with boolean variables the assignment operator =
		// will be accepted without a compile error.  Remember to check for
		// equality you must use ==.
		// In the example below, the System.out.println statement in the
		// if branch will always be executed if you use = instead of ==, because
		// what the code does is assign true to overdrawn and then the if checks  
		// the value of overdrawn and its value will be true.
		// RUN THE CODE TO SEE THIS HAPPEN, THEN CHANGE = TO == AND SEE THE CODE
		// RUN PROPERLY.
		// But change it to == so nothing is printed.
		if (overdrawn == true)	
			System.out.println("the value of overdrawn is " + overdrawn);
		else
			System.out.println("the value of overdrawn is " + overdrawn);

		// ----------------------------------------------------------------------
		
		// However, when you use simple int variables like x and y, java will not
		// allow you to use if (x = y).  You must use if (x == y).  This is because
		// the compiler treats int variables different than boolean variables.
		int x = 5;
		int y = 10;
		
		// ACTIVATE ALL OF THIS CODE AND VIEW THE COMPILE ERROR, then
		// change the assignment operator in the if expression so it uses ==
		// instead of =.
	/*
		if (x = y)		
			System.out.println("x is equal to y");
		else
			System.out.println("x is not equal to y");
		 */
	}
}

