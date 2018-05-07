// FileName:  StringEqualityLecture.java
// Objective:  	Learn about the difference between == and compareTo.
//				Learn about what is really happening when you have an alias.
// Important Equality Concept:
/* 
		Assume the code:    
		String pet1 = "cat";
		String pet2 = "cat";
		if ( pet1.compareTo(pet2) == 0) ....

		When Java checks to see if pet1 is equal to pet2 using compareTo,
		this is what will happen:

 		The compareTo method compares two strings lexicographically.
 		The comparison is based on the Unicode value of each character
 		in the strings.  The character sequence represented by this String
 		object is compared lexicographically to the character sequence
 		represented by the argument string.  The result is a negative integer
 		if this String object lexicographically precedes the argument string.
 		The result is a positive integer if this String object lexicographically
 		follows the argument string.  The result is zero if the strings are equal.

		Definition of lexicographic ordering:  If two strings are different,
		then either they have different characters at some index that is a valid
		index for both strings, or their lengths are different, or both.
		If they have different characters at one or more index positions,
		let k be the smallest such index; then the string whose character at
		position k has the smaller value, as determined by using the < operator,
		lexicographically precedes the other string.  In this case, compareTo
		returns the difference of the two character Unicode values at position k
		in the two strings.

*/
package ch07;

import java.util.Scanner;

public class StringEqualityLecture
{
	public static void main(String[] args)
	{
		Scanner reader = new Scanner (System.in); 

		// INSTRUCTIONS:										
		//		1)  FIRST RUN THE PROGRAM AND VIEW THE OUTPUT.
		//		2)  READ AND STUDY THE CODE AND COMMENTS IN THE PROGRAM.
		//		3)  RERUN THE PROGRAM AND VIEW THE OUTPUT AND THINK ABOUT
		//			THE CODE IN THE PROGRAM. 
		
		// In the following line of code, Java creates a String object referenced
		// by the variable a and that String object holds the value "cat".
		String a = "cat";  

		// In the following lines of code, Java creates a String object referenced
		// by the variable b and places the value entered from the keyboard into
		// that String object.  If "cat" is entered from the keyboard, then the
		// String object referenced by the variable b holds the value "cat".
		// If cat isn't entered, then b references a String object that holds that value.
		System.out.print("Enter the word \"cat\" to store in the variable b:  ");
		String b = reader.nextLine();

		// If we wish to see if the two String values held by a and b are equal, we
		// cannot use the == operator.  The == operator checks for object identity
		// not for the equality of the contents of two String objects.  So actually
		// what happens when we use a == b, only the memory addresses of the
		// two objects referenced by variables a and b are checked to see if the 
		// memory addresses are the same.  The contents of those memory locations
		// are NOT compared!
		// So the following code will print out that a and b reference different
		// objects, which indeed they do.
		// Summarizing again:  == checks to see if memory addresses are the same.
		// It does NOT compare the contents of what is stored at the memory locations!
		if (a == b)
			System.out.println("a and b reference the same object.");
		else
			System.out.println("a and b reference different objects."); 

		System.out.println(); 
		System.out.println(); 	
		
		// ******************************************

		// So to check for content equality for two String values, we should use the
		// compareTo method.  If the user entered "cat" from the keyboard, then the output
		// of the next segment will be:
		//		"a and b reference objects that contain equal strings."
		// This is because "cat" is stored in one String object referenced
		// by the variable a, and "cat" is also stored in another String object
		// referenced by the variable b.
		// If the user does not enter exactly "cat" from the keyboard, then the
		// output would instead be:
		//      "a and b reference objects that contain unequal strings."
		
		if ( a.compareTo(b) == 0)
			System.out.println("a and b reference objects that contain equal strings.");
		else
			System.out.println("a and b reference objects that contain unequal strings.");
		
		// In the if-else statement above, the variable a is calling the compareTo method
		// and the variable b is the argument (parameter) being passed to the method.
		// We can refer to to the variable a in two ways.  First, we formally refer to it
		// by calling it this. (Yes the word this.  You'll understand more about it later.)
		// We also informally refer to it as the receiver object, because it is receiving
		// the message "check the contents of the variable b to see if it is equal to my
		// contents".  So since a is calling the method compareTo, it is referred to as this
		// and also as the receiver object.  
		// We can refer to the variable b also in two ways.  First, it is the parameter object
		// because it is in the parentheses following the name of the method.  This is obvious
		// from what we already know about method calls.  In programming, we also refer to
		// parameters as arguments.  This may seem like a misnomer, but parameters are formally
		// referred to as arguments in Java and other programming languages.  Second, we
		// informally refer to b as other.  (That's right ... other.)  As you go along in
		// programming, you will see many method signatures that have a parameter named other.
		// This is generally true when the parameter is an object parameter (not int, double,
		// or boolean).
		
		System.out.println(); 
		System.out.println(); 
		
		// ******************************************************************************
		// Note:  The following code making an alias is not really desirable,
		// but we need to show you what goes on if you use it inadvertently or otherwise.
		// ******************************************************************************
		
		// If we use an alias String variable, then it and the original String
		// variable will reference (or point to) the same String object or in
		// other words the same memory address.
		
		System.out.print("Enter a word and press return:  ");
		String word1 = reader.nextLine();
		
		// word2 below will be an alias of word1.  The alias is created because
		// of the use of the assignment operator.  Making an alias means that
		// word2 will refer to the same String object as word1.  Also, it is
		// important to note that a copy of the value in word1 is NOT made.
		String word2 = word1;  
		
		// We can prove that they both reference the same String object by the
		// following code that uses the equality operator == that checks memory
		// addresses to see if the two variables point to the same memory address.
		// Because word2 is an alias of the object pointed to by word1, then the
		// code below will print out:  "word1 and word2 reference the same String object"
		if (word1 == word2)
			System.out.println("word1 and word2 reference the same String object");
		else
			System.out.println("word1 and word2 do NOT reference the same String object");
		
		System.out.println(); 
		System.out.println(); 
		
		// It turns out that if two variables reference the same String object, then
		// using the compareTo method will always return true.  Its like saying,
		// "The content of the String object is exactly equal to the content of the
		// very same String Object.
		if ( word1.compareTo(word2) == 0)
		{
			System.out.print("The contents of word1: " + word1 + " and word2: " + word2 + " are the same");
			System.out.println(" because of aliasing.");
		}
		else
		{
			// The following output statement will never be printed if aliasing is used like above.
			System.out.println("The contents of word1 and word2 are NOT the same.");  
		}
	} // end main
	
} // end class





