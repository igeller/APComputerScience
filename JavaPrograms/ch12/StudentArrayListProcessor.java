package ch12;
// FileName:  StudentArrayListProcessor
// Program Description:  This program will fill an ArrayList of Student
// values named students from a file and then perform operations on that list.
// It uses the newly converted ArrayList version of the Student class.

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentArrayListProcessor
{
	public static Scanner reader = new Scanner(System.in);  // global

	public static void main (String[] args) throws FileNotFoundException
	{		
		// Using the List interface, declare a List named students and
		// then instantiate an ArrayList for it. 
		List <Student> students = new ArrayList <Student> ();


		// DO NOT ERASE ANY OF THE LINES BELOW THAT READ FROM THE FILE.  YOU WILL ONLY
		// ADD A FEW LINES OF CODE INSIDE THE LOOP.
		String fileName = "ch12/StudentData.txt";
		Scanner file = new Scanner(new File (fileName));

		Student student = null;

		// ONLY TWO LINES OF CODE TO FINISH INSIDE THE FOLLOWING LOOP.
		while (file.hasNextLine())
		{
			String name = file.nextLine();       // read the name from the file
			String id = file.nextLine();     // read the status from the file

			// Using the List interface, declare and construct an ArrayList
			// named tests that can hold integers.
			List <Integer> tests = new ArrayList <Integer> ();

			// Because we are reading from a file with this loop, each student will have 4 test scores.
			int test1 = file.nextInt();   	// read a test score from the file		
			// add the test score to the list
			tests.add(test1);
			
			int test2 = file.nextInt();   	// read a test score from the file		
			// add the test score to the list
			tests.add(test2);
			
			int test3 = file.nextInt();   	// read a test score from the file
			// add the test score to the list
			tests.add(test3);
			
			int test4 = file.nextInt();   	// read a test score from the file
			// add the test score to the list
			tests.add(test4);

			// consume new line character after last numeric test score of a student in the file
			file.nextLine();

			// Call the 3 parameter Student initializing constructor and 
			// construct a Student object from the above information.
			student = new Student (name, id, tests);

			// Add the constructed Student object to the array at the end
			// of the list using add(obj).
			students.add(student);
		}	

		System.out.println("Here is the current list of students:\n");
		// Write the method named printStudents at the end of this file, and
		// then call the method here to print all of the Student objects in the list.
		printStudents(students);

		System.out.println();		System.out.println();

		System.out.println("Enter the info for a student add it at the first of the list...");
		// Stop and finish the method createStudent at the end of this file and then call it
		// here.  There is nothing to pass it.  Store the new student returned by the method
		// in the variable student.
		createStudent();


		// Add the new student at the very first of the students list using the add(i, obj) method.
		students.add(0, createStudent());


		System.out.println();		System.out.println();
		System.out.println("Here is the current list of students:\n");

		// Call the method printStudents to print all Student objects that are
		// currently in the students list.
		printStudents(students);


		System.out.println();		System.out.println();

		System.out.println("Enter the data for a new student to add to the end of the list....");
		// Call the method createStudent to construct a new student and store it in the variable student.
		student = createStudent();

		// Add the new student at the end of the list using the add(i, obj)
		// method. Don't use a literal number for the index parameter i.
		students.add(students.size(), student);

		System.out.println();		System.out.println();
		System.out.println("Here is the current list of students:\n");

		// Call the method printStudents to print all Student objects that are
		// currently in the students list.
		printStudents(students);

		System.out.println();		System.out.println();

		System.out.print("Enter a student to replace the student at index 3:  ");
		// Call the method createStudent to construct a new student and
		// store it in the variable student.
		student = createStudent();

		// Replace the student at index 3 with the student created above and save the
		// student being replaced by storing it back in the variable student.
		student = students.set(3, student);

		// ACTIVATE THE NEXT LINE OF CODE
		System.out.println("The student who was replaced is\n" + student);
		System.out.println();	System.out.println();
		System.out.println("Here is the current list of students:\n");

		// Call the method printStudents to print all Student objects that are
		// currently in the students list.
		printStudents(students);

		System.out.println();		System.out.println();

		// Without knowing how many students are in the list, remove the last student
		// and store it in the variable student.
		student = students.remove(students.size());

		// ACTIVATE THE FOLLOWING LINE OF CODE.
		System.out.println("The last student removed was ...\n" + student);
		System.out.println();
		System.out.println("Here is the current list of students:\n");

		// Call the method printStudents to print all Student objects that are
		// currently in the students list.
		printStudents(students);

		System.out.println();		System.out.println();
		System.out.println("Now let's remove as many students as you want ...\n");

		// NOW ACTIVATE THE ENTIRE NEXT LOOP AND FINISH IT.
		
		String answer = "y";
		while (answer.equals("y") && students.size() > 0)
		{
			System.out.print("Enter the name of the student you wish to remove from the list:  ");
			String name = reader.nextLine();

			System.out.print("Enter the id of the student you wish to remove from the list:  ");
			String id = reader.nextLine();

			// Call a Student class constructor here to create a student with the above name and id
			// but no test scores and store the student in the Student variable target.  (We are
			// creating a temporary student so we can search for a student in students that has that
			// name and id.  If we find it, we will remove it.)  Go to Student.java and check the
			// constructors that are there so you know which one to use. DON'T ADD target to students!!!
			Student target = new Student (name, id);

			// STOP AND WRITE THE METHOD searchStudents AT THE BOTTOM OF THIS FILE.
			// Call the method searchStudents passing it students and the target to search for
			// and store the value returned in the int variable i.



			// If the student is found, then remove it from students using the remove(i) method
			// and save the removed student in the Student variable named removed.  You will need
			// to declare this variable.  If the search said the student was NOT found, then print
			// out the message: "The student was NOT found!".  However, if the student was found
			// then print the student removed with the message:  "The student found and removed was ...






			System.out.println();		System.out.println();
			System.out.println("Here is the current list of students:\n");
			// Call the method printStudents to print all Student objects that are
			// currently in the students list.
			printStudents(students);

			System.out.print("Do you wish to remove another student (Y/N):  ");
			answer = reader.nextLine();
		} // end while loop
		 
		System.out.println();		System.out.println("Program Terminated!");
	} // end main


	// Finish the method createStudent that is partially completed.
	// The method will receive info from the keyboard and then construct
	// and return a Student object.
	public static Student createStudent()
	{
		System.out.println();
		System.out.println("Enter the students name, id and test scores.");
		System.out.print("Enter the student's name: ");
		String name = reader.nextLine();
		System.out.print("Enter the student's id: ");
		String id = reader.nextLine();

		// // Using the List interface, declare and construct an ArrayList
		//  named tests to hold the test scores that will be entered from the keyboard.
		List <Integer> tests = new ArrayList <Integer> ();

		String answer = "y";
		int i = 0;
		while ( answer.equals("y") )
		{
			System.out.print("Enter test #" + (i) + ": ");
			int test = reader.nextInt();

			// If the test entered is less than Student.MIN_SCORE or greater than
			// Student.MAX_SCORE, then output the error message ... 
			//   "Test Score out of valid range.  Enter the test again."
			// Otherwise, add the test to the tests ArrayList and increment i.
			if (Student.MIN_SCORE > test || Student.MAX_SCORE < test)
				System.out.println("test Score out of valid range. Enter the test again");
			else
			{
				tests.add(test);
				i++;

			}


			reader.nextLine();  // consume nextInt() new line character
			System.out.print("Enter another test?  (Y/N): ");
			answer = reader.nextLine();
		}

		System.out.println();

		// Call the 3 parameter constructor of the Student class here and pass it what is
		// needed to construct a new Student object from the above data.
		Student student = new Student(name, id, tests);

		// return the new Student object
		return student;

	} // end createStudent


	// Write the method printStudents.  It does not return a value.  It receives
	// one parameter  ... the List of Student objects named students.  The method
	// will contain a standard for loop that will print each student by calling
	// the toString method of the Student class.
	// Precondition:  the parameter students contains only valid Student objects.
	// Postcondition:  the parameter students will not be changed by the method.
	public static void printStudents (List <Student> students)
	{
		for (int i = 0; i < students.size(); i++)
		{
			System.out.println((students.get(i)).toString()+ "\n");
		}
	}






	// WE WILL COMPLETE THIS METHOD AFTER A DISCUSSION ON FRIDAY - NO NEED TO FINISH NOW!
	// Write the method searchStudents that searches the list students for a
	// particular Student object using the equals() method of the Student class.
	// This method receives two parameters, the List of Student objects named
	// students and the Student variable target. The method should return the
	// index of the first occurrence of target OR -1 if the student is not found.
	// IF THE TARGET IS FOUND THEN END THE LOOP IMMEDIATELY AND RETURN THE INDEX.
	// DO NOT USE AN ENHANCED FOR LOOP ON THIS METHOD.
	// Precondition:  the parameter students contains only valid Student objects
	//                and the parameter target is guaranteed to not be null.
	// Postcondition:  the parameter students will not be changed by the method.







} // end StudentArrayListProcessor