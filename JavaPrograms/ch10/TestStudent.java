package ch10;
import java.util.Scanner;

// This is a driver file that tests the revamped Student class.
public class TestStudent
{
	public static void main(String[] args)
	{
		Scanner reader = new Scanner (System.in);

		// Call the class method named setStudentCount to set the initial number of students to 0.
		Student.setStudentCount(0);

		// Create an instance of the Student class referred to by s1
		// using the default constructor.
		Student s1 = new Student();		

		// Print (explicitly) the state of the Student object referred to by s1.
		System.out.println("The default values for student s1 are:");	
		System.out.println(s1.toString());	// explicit call
		System.out.println();
		System.out.println("The number of students in the program is " + Student.getStudentCount());
		System.out.println();

		// call mutator methods and set the values for student s1 as follows
		// Set the student's name to "Bill", test 1 to 84, test 2 to 86,  test 3 to 88
		s1.setName("Bill");			
		s1.setScore(1,84);			
		s1.setScore(2,86);			
		s1.setScore(3,88);			

		System.out.println("After calling the mutator methods for student s1, the state of that object is:");
		System.out.println(s1);	// implicit call
		System.out.println();		System.out.println();
		
		// Call the accessor method and get the name of s1 and then print it
		// along with the message: "The name of s1 is "
		String name = s1.getName();
		System.out.println("Using the getName accessor method, the name of s1 is " + name);
		System.out.println();

		// Prompt the user to enter the number of the test to retrieve and read
		// it from the keyboard.
		String answer = "y";
		while (answer.compareTo("y") == 0)
		{
			System.out.print("What test do you want to retrieve(enter 1, 2, or 3)? ");
			int whichTest = reader.nextInt();
			try
			{
				int score1 = s1.getScore(whichTest);
				System.out.println("Test Score " + whichTest + " is " + score1);
			}
			catch (IllegalArgumentException e)
			{
				System.out.println(e);
			}

			reader.nextLine(); // consume new line character from nextInt().
			System.out.print("Check another score (y/n): ");
			answer = reader.nextLine();
			System.out.println();
		} // end of query loop


		// Call the accessor method and get the highest test score of Student s1
		// and then print it along with the message: "The Highest Test Score is "
		int highScore = s1.getHighScore();
		System.out.println("The Highest Test Score of s1 is " + highScore);
		System.out.println();

		// Call the accessor method and get the average test score of Student s1
		// and then print it along with the message: "The Average Test Score is "
		double ave = s1.getAverage();
		System.out.println("The Average Test Score of s1 is " + ave);
		System.out.println();	System.out.println();	
		
		
		// Make an alias of s1 named s2 ... s1 and s2 will now refer
		// to the same object.  s2 is of type Student also.
		Student s2 = s1;

		// Set the name of the object using the alias s2 to "Ann"
		s2.setName("Ann");

		System.out.println("We have used the alias s2 to change the name of the object");
		System.out.println("referred to by s1 and if we call getName with s1, then see");
		System.out.println("s2 was able to change the object's name.");
		System.out.println();
		
		name = s1.getName();
		System.out.println("The name of s1 (changed by s2) is " + name);

		System.out.println();
		System.out.println("Now let's print the same student using both s1 and s2");
		System.out.println("to see there is no difference.  Both variables refer to");
		System.out.println("the same object.\n");

		// Finish the lines below to print out both students s1 and s2 by
		// calling the toString method explicitly
		System.out.println("Here is student s1\n" + s1.toString() );	
		System.out.println();
		System.out.println("Here is student s2\n" + s2.toString() );
		System.out.println();

		// The point of the previous code segments is that we don't usually want
		// to use aliases but it is possible and we need to know that we need to
		// be careful because they can create side effects.  In other words, we
		// might not realize that the name of s1 has been changed if we use s2
		// to call setName().  Remember: s2 = s1; was used to make an the alias s2,
		// but a new Student object was not created.
		// Now let's break the connection of the alias s2 with the student object
		// s1, then only s1 refers to the student object and s2 doesn't.  After we
		// break the connection, let's print out s1 and s2 explicitly.
		s2 = null;

		// Finish the lines below to print out both students s1 and s2 by
		// calling the toString method implicitly
		System.out.println("Now let's print the objects referenced by both s1 and s2");
		System.out.println("After breaking the connection of s2 to the object by setting it to null.");
		System.out.println();
		System.out.println("Here is student s1\n" + s1);	
		System.out.println();
		System.out.println("Here is student s2\n" + s2);
		System.out.println();

		
		
		
		// Use the initializing constructor to construct and initialize a
		// new student object s3 with values:   "Jack", 90, 80, 70, 75, 85, 95
		int [ ] tests = {90, 80, 70, 75, 85, 95};
		Student s3 = new Student ("Jack", tests);

		System.out.println("Now let's print the info for the new student that has 6 tests.");
		System.out.println();

		// Explicitly call the toString() method to see the data associated
		// with the student s3
		System.out.println("Here is student s3\n" + s3.toString()); 
		System.out.println();
		highScore = s3.getHighScore();
		System.out.println("The Highest Test Score for s3 is " + highScore);
		System.out.println();
		
		// Write the code to print the number of students created by this program.
		System.out.println("There are " + Student.getStudentCount() +  " students in this program.");
		System.out.println();
		
		// Now let's delete the last student s3 by setting s3 to null and then decrement the logical size
		// of the number of students by 1.
		s3 = null;
		Student.setStudentCount(Student.getStudentCount() - 1);
		System.out.println("After breaking the connectiong between s3 and the new object,");
		System.out.print("then the program has " + Student.getStudentCount() +  " student");
		System.out.println(" in the program.");
	}
}








