package ch02;

// The class definition line below has a compile error, because
// the name of the class is not the same as the name of the file.
// Mouse over the red box and read the error message.
// Next, click on the red box and select
// "rename compilation unit to SyntaxAndCompileErrors".
// This renames the file CompileErrors.java to match the name of
// the class.  The new name is SyntaxAndCompileErrors.java
public class SyntaxAndCompileErrors
{

	public static void main(String[] args) 
	{
		// The next line gives a syntax error.
		// Mouse over the red circle to the left and view the message.
		// Fix this syntax error and then read the next instructions.
		System.out.println("Java Rules!");
		
		// The next line also gives a syntax error.
		// Mouse over the red circle to the left and view the message.
		// Fix this syntax error and then read the next instructions.
		System.out.println("Programming is Fun!");
		
		// The next line also gives a syntax error.
		// Mouse over the red box to the left and view the message.
		// Fix this syntax error and then read the next instructions.
		System.out.println("This class is RADICAL man!");
		
		// The next line also gives a syntax error.
		// Mouse over the red box to the left and view the message.
		// Fix this syntax error and then read the next instructions.
		System.out.println("Go Bearcats!");
		
		int num1 = 5;
		int num2 = 18;
		
		// The next line also gives a syntax error.
		// Mouse over the red circle to the left and view the message.
		// Fix this syntax error and then read the next instructions.
		System.out.println(num1 + "plus" + num2 + "is" + (num1 + num2));

		// The next line gives a compile-time error.
		// We know this because nothing is misspelled according to Java's rules.
		// So we have commanded Java to do something it cannot do.
		// It cannot store a String value in and int variable.
		// First, mouse over the red box and read the error message.
		// Next, click on the red box to the left and then double click on the words ...
		// change type of 'i' to 'String'.  This fixes the error.
		String i = "Java";
		
		// Now mouse over the remaining compile-time errors and read the messages
		// and then resolve them.
		
		boolean d = false; //boolean can only hold the value true and false
		
		int done = 1; // you can store 1 in a double you can only do mathematical equation with double and int not strings
		
		char ch = 'J'; // char is the single letter storage
		
		// After you have fixed all the errors above, then delete the first curly
		// brace below and mouse over the red circle.  Java suspects that you need
		// another curly brace and gives you the message:  
		// "syntax error, insert } to complete ClassBody.
		// Now without fixing it delete the second curly brace and read the error
		// message.  Notice there is now a red circle next to the line:  
		// char ch = 'J';
		// Add both curly braces back and make sure there are not any syntax or
		// compile-time errors in the program.  You can run the program if you want.
	}
}





