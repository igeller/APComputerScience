package ch10;
// Program:  StudentArrayProcessor
// INCLUDES CLASS VARIABLES, CONSTANTS AND METHODS
// This driver tests the revamped Student class and
// extends the use of the other methods of Student.

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import ch10.Student;

public class StudentArrayProcessor
{
	public static Scanner reader = new Scanner(System.in);  //global

	public static void main (String[] args) throws FileNotFoundException
	{		
		// Declare and instantiate an array of physical size 4 named students
		// that will hold Student objects.
		Student [] students = new Student [4];

		// Call the class method setStudentCount and set the initial number of
		// students to zero since the array students has not been filled.
		Student.setStudentCount(0);

		System.out.println("You will enter up to 4 students.");
		System.out.println();

/*		int i = 0;
		String answer = "y";
		// Finish the while loop header so that the loop will continue while the loop
		// control variable i is less than the physical size of students and answer
		// is equal to "y".
		while(i < students.length && answer == "y")
		{
			// Stop and finish the createStudent method at the bottom of this file
			// and then call it here.  Declare a Student variable named s to catch
			// the Student object returned by the method.
			Student s = createStudent();
			
			// Place the newly created Student object in the students array.
			students[i] = s;
			
			i++;
			System.out.println();
			System.out.print("Enter another student? (y/n): ");
			answer = reader.nextLine();
		} // end of while-loop that calls the createStudent method.
*/
		
		
		String fileName = "ch10/studentsfile.txt";
		Scanner file = new Scanner(new File (fileName));

		int i = 0;
		while (i < students.length && file.hasNextLine())
		{
			String name = file.nextLine();	// read the name from the file
			int [] tests = new int [3];  		// construct tests array for students with 3 tests
			tests[0] = file.nextInt();   		// read the first test value from the file
			tests[1] = file.nextInt();   		// read the second test value from the file
			tests[2] = file.nextInt();   		// read the third test value from the file

			// consume new line character after last test value of a student in the file
			file.nextLine();

			// Call the Student initializing constructor that has two parameters:
			// The first parameter is a String for the name and the second is an array
			// of int values for the tests.
			Student s = new Student(name, tests);

			// Add the constructed student object to the array at index i.
			students[i] = s;

			i++;
		}

		
		// Stop and write the method named printStudents at the end of this file, and
		// then call the method here to print the students.
		printStudents(students);

		System.out.println();
		System.out.println();
		
		// Stop and write the method bumpLowestTestScores at the bottom of this file,
		// and then call it here.  Pass the method the students array.
		bumpLowestTestScores(students);
		
		
		System.out.println("Now here are the students with their lowest test grade bumped up 10 pts:");
	
		// Stop and write the method named printStudents2 at the end of this file, and
		// then call the method here to print the students.
		printStudents2(students);
		
		System.out.println();
		System.out.println();
	
		// Activate & finish  the line of code to print out how many students there are
		// by calling the class method getStudentCount.
		System.out.println("The number of students in the array is :" + Student.getStudentCount());

		System.out.println();
		System.out.println();

		// Stop and write the getHighestStudentAverage method at the bottom of this file
		// and then call it.  Pass the method the students array and store the returned
		// student in Student variable named student1.
		Student student1 = getHighestStudentAverage(students);

		System.out.println("Here is the student with the highest test average.");
		System.out.println("Using the first getHighestStudentAverage method");
		
		// Activate the line of code to print the student with the highest average.
		System.out.println(student1.toString());

		System.out.println();
		System.out.println();

		// Stop and write the getHighestStudentAverage2 method at the bottom of this file
		// and then call it.  Pass the method the students array and store the returned
		// student in Student variable named student2.
		Student student2 = getHighestStudentAverage2(students);
		

		System.out.println("Here is the student with the highest test average.");
		System.out.println("Using the second getHighestStudentAverage method");
		
		// Activate the line of code to print student2 that contains the highest average.
		System.out.println(student2.toString());
		
		System.out.println();
		System.out.println();
		
		// Stop and write the getLowestStudentAverage method at the bottom of this file
		// and then call it.  Pass the method the students array and store the returned
		// student in Student variable named student3.
		Student student3 = getLowestStudentAverage(students);

		System.out.println("Here is the student with the lowest test average.");
		
		// Activate the line of code to print student2 that contains the highest average.
		System.out.println(student3.toString());
			
		System.out.println();
		System.out.println();
		
		System.out.println("Now removing the last student in the array ...");

		// Remove the last student in the list by placing null where the last
		// student is in the array.  Remember the getStudentCount method gets
		// you the logical size of the students array.
		students [Student.getStudentCount()-1] = null;

		// Decrement the studentCount by 1 by calling the class method setStudentCount.
		Student.setStudentCount(Student.getStudentCount() - 1);

		System.out.println();
		System.out.println();

		// Call the method printStudents to print all the students in the list.
		printStudents(students);

		// Activate and finish the line of code to print out the logical size of the array.
		System.out.println("The number of students in the array is: " + Student.getStudentCount());

		System.out.println();		System.out.println();
	
		System.out.println();
		System.out.println("Program Terminated!");
	} // end main


	// Finish this method based on the inline instructions.
	public static Student createStudent()
	{
		System.out.println();
		System.out.println("Enter the students name and test scores");
		System.out.print("Enter the student's name: ");
		String name = reader.nextLine();

		System.out.print("Enter the number of tests the student will have: ");
		int numberOfTests = reader.nextInt();
		
		// Declare and construct an array of int values named tests that will be of
		// size numberOfTests
		int [] tests = new int [numberOfTests];

		// Finish the for loop header so that it will loop over all memory locations of tests.
		for (int i = 0; i < tests.length; i++)
		{
			System.out.print("Enter test #" + (i + 1) + ": ");
			int test = reader.nextInt();

			// Write the if condition below that will execute the if branch if a test score entered
			// is below the minimum score allowed or if it higher than the maximum score allowed.
			if (test < Student.MIN_SCORE || test > Student.MAX_SCORE) 
			{
				System.out.println("Error.  A test score should be between "
						+ Student.MIN_SCORE + " and " +  Student.MAX_SCORE);
				
				i--;  // decrement i so the loop reruns for this iteration to get a valid test score.
			}
			else
			{
				// Write the line of code that stores a valid test score in tests if it is the valid range.
				tests [i] = test;
			}	
		}

		reader.nextLine();  // consume nextInt() new line character

		Student s = new Student (name, tests);

		return s;
	} // end createStudent


	// Write the method printStudents.  It does not return a value.
	// It receives one parameter  ... the array of students.
	// The method will contain a loop that will print each student
	// in the valid part of the array by using the actual
	// student count by calling the getStudentCount method. The Student
	// class toString method can be called implicitly or explicitly.
	// DON'T USE A FOR EACH LOOP FOR THIS METHOD.
	public static void printStudents(Student [] students)
	{
		for(int i = 0; i < Student.getStudentCount(); i++)
		{
			System.out.println(students[i].toString());
			System.out.println("");
		}
	}
	
	
	
	



	// Write the method bumpLowestTestScores that is a void method.
	// The method receives one parameter that is an array of Student objects
	// named students.  This method will go through the valid part of the
	// students array and locate the lowest test score of each student and
	// then increase it by ten points. Because the parameter students is
	// being passed by reference, the changes to the array will be retained
	// without the method returning any value.
	public static void bumpLowestTestScores (Student [] students)
	{
		for (int i = 0; i < Student.getStudentCount(); i++)
		{
			Student student = students[i];
			int [] tests = student.getScores();
			
			int lowScore = tests[0];
			int indexOfLowestScore = 0;
			
			for (int j = 0; j < tests.length; j++)
			{
				if (tests[j] < lowScore)
				{
					lowScore = tests[j];
					indexOfLowestScore = j;
				}
			}
			student.setScore(indexOfLowestScore+1, lowScore +10);
		}
	}

	
	
	
	
	
	// Write this second version of the above method called printStudents2
	// THAT USES A FOR EACH LOOP.  But, inside the loop, make sure that
	// element is not equal to null, before you try to print the element.
	public static void printStudents2(Student [] students)
	{
		for (Student element: students)
		{
			if (element != null)
			{
				System.out.println(element.toString());
				System.out.println();
			}
		}
	}
	
	
	
	


	// Write the method getLowestStudentAverage.  It returns a Student object.
	// It receives one parameter  ... the array of students.  The method will
	// contain a loop that goes through the valid part of the students array by
	// using the actual student count by calling the getStudentCount method, until
	// it determines the student with the lowest test average.  The method will
	// return the Student with the lowest test average, NOT the student's average.  
	// DON'T USE A FOR EACH LOOP FOR THIS METHOD.
	public static Student getLowestStudentAverage(Student [] students)
	{
		Student lowest = students[0];
		for (int i = 0; i < Student.getStudentCount(); i++)
		{
			if (lowest.getAverage() > students[i].getAverage())
				lowest = students [i];
		}
		
		return lowest;
	}
	
	
	
	

	
	// Write the method getHighestStudentAverage.  It returns a Student object.
	// It receives one parameter  ... the array of students.  The method will
	// contain a loop that goes through the valid part of the students array by
	// using the actual student count by calling the getStudentCount method, until
	// it determines the student with the highest test average.  The method will
	// return the Student with the highest test average, NOT the student's average.  
	// DON'T USE A FOR EACH LOOP FOR THIS METHOD.
	public static Student getHighestStudentAverage(Student [] students)
	{
		Student highest = students[0];
		for (int i = 0; i < Student.getStudentCount(); i++)
		{
			if (highest.getAverage() < students[i].getAverage())
				highest = students [i];
		}
		
		return highest;
	}
	
	
	

	// Write a second version of the above method named getHighestStudentAverage2
	// THAT USES A FOR EACH LOOP. When accessing each element of the array, the
	// method should first to test element to make sure it is NOT null before it
	// accesses a student's average (otherwise a NULLPointerException will occur).
	// Again, the method will return the Student with the highest average, NOT the
	// student's average.
	public static Student getHighestStudentAverage2(Student [] students)
	{
		Student highest = students[0];
		
		for (Student element: students)
		{
			if (element != null && highest.getAverage() < element.getAverage())
				highest = element;
		}
		return highest;
	}

	
	
	

	
} // end StudentArrayProcessor

