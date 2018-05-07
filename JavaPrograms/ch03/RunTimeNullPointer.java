// FileName:  RunTimeNullPointer.java
// Run this program and view the error message
// in the console window.
package ch03;
import java.util.Scanner;

public class RunTimeNullPointer
{
	public static void main (String [] args)
	{
		// Note:  we use the following line instead of just Scanner reader;
		// like on the PPT lecture, otherwise the program would not compile and run.
		Scanner reader = null;  // should be new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = reader.nextLine();
		System.out.println ("The name is  " + name);
	}
}
