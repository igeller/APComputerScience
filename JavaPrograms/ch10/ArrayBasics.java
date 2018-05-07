// Chapter 10 Warm-Up program
// Students should have read Chapter 10 Sections 1 - 4.
package ch10;

import java.util.Scanner;

public class ArrayBasics
{
	public static void main (String[] args)
	{
		Scanner reader = new Scanner(System.in);

		// PART 1.  WORKING WITH AN ARRAY OF INTEGERS

		// Declare and instantiate an integer array named nums of size 100.
		int [] nums = new int[100];

		// Use a loop to fill the array completely with random integers
		// between 1 and 999 inclusive
		for (int i = 0; i < nums.length; i++)
		{
			nums [i] = (int)(Math.random()*998) + 1;
		}
		
		
		


		System.out.println("List of random integers printed 10 per line.");
		System.out.println();
		// Write a loop to print all of the random integers 10 per line.
		// In doing this, use a printf statement with a field width of 6.
		// To print 10 integers per line, declare, initialize, and use a variable
		// named count.
		int count = 1;
		for (int i = 0; i < nums.length; i++)
		{
			
			System.out.printf("%6d", nums[i]);
			if (count % 10 == 0)
				System.out.println();
			count++;
		} 
		
		
		
		

		// STOP AND RUN THE PROGRAM AND MAKE SURE 10 INTS PER LINE ARE PRINTED.
		
		// Write a loop that will replace all integers in nums that are a multiple
		// of 5 with the value -999.
		for (int i = 0; i < nums.length; i ++)
        {
              if (nums[i] % 5 == 0)
                    nums[i] = -999;
        }
		
		
		
		

		System.out.println();
		System.out.print("List of random integers printed 10 per line");
		System.out.println(" with multiples of 5 replaced with -999.");
		System.out.println();
		// Copy and paste your loop above that prints nums here to reprint
		// nums once multiples of 5 have been replaced with -999.
        count = 1; 
		for (int i = 0; i < nums.length; i ++)    
         {
               System.out.printf("%6d", nums[i]);
               if (count % 10 == 0)
                     System.out.println();  // start a new line
               count++;
         }
		
		
		
		// STOP AND RUN THE PROGRAM AND MAKE SURE THE MULTIPLES OF 5 ARE REPLACED.
		System.out.println();
		System.out.println();
		
		// *****************************************************************
		
		// PART 2. TRACKING THE LOGICAL SIZE OF AN ARRAY OF STRINGS

		// Declare and instantiate an array named courses
		// that can hold 7 string values.
		String [] courses = new String [7];

		// Reuse the variable count to track the logical size
		// of courses and initialize it to zero.
		count = 0;

		// Write a query-controlled loop that will allow the user to
		// enter from the keyboard up to 7 course names and store them
		// in the array courses.  After the user enters a course name,
		// ask them whether they want to enter another course.
		String answer = "y";
		while (answer.equals("y") && count < courses.length)
		{
			System.out.print("Enter a course name and press return: ");
            String course = reader.nextLine();
            courses[count] = course;
            count++;
            System.out.print("Enter another course? (y/n): ");
            answer = reader.nextLine();
		}
		
		
		

		System.out.println();
		System.out.println();
		System.out.print("Course List:  ");
		// Write a for loop to display all the courses in only the valid 
		// part of the array.  Print all of the course names on one line
		// in a field width of 14 right justified using a printf statement.  
		for (int i = 0; i < count; i++)
		{
			System.out.printf("%14s", courses [i]);
			count++;
		}


		
		// STOP AND RUN THE PROGRAM AND MAKE SURE THE VALID PART OF
		// THE ARRAY IS PRINTED
		System.out.println();
		System.out.println();
		System.out.print("Course List:  ");
		// Write a for loop to display all the courses in the entire array,
		// even the invalid part.  Print all of the course names on one line
		// in a field width of 14 right justified using a printf statement.  
        for (int i = 0; i < courses.length; i++)
        {
              System.out.printf("%14s", courses[i]);
        }
				
		
		// STOP AND RUN THE PROGRAM AND MAKE SURE THE VALID AND INVALID PARTS OF
		// THE ARRAY ARE PRINTED
		System.out.println();
		System.out.println();

		// *****************************************************************
		
		// PART 3. COPYING ONLY THE AP COURSES TO A NEW STRING ARRAY

		// Declare and instantiate a new String array named apcourses
		// that will be the same phyiscal length of courses.  Don't
		// place a number in the brackets like [7] to do this.
        String [ ] apcourses = new String [courses.length];
		

		// Declare an integer variable named apcount and initialize it to zero.
		// This variable will track the number of courses added to apcourses.
        int apcount = 0;


		// Write the code to copy all of the courses that are AP courses to the
		// new array.  Make sure that you inspect only the valid part of the
		// courses array for courses that begin with AP.  Check to see if a course
		// name contains AP at the very beginning of the course name by using
		// the indexOf method.  You must use the indexOf method! 
        for ( int i = 0; i < count; i ++)
        {
              if(courses[i].indexOf("AP") == 0)
              {
                    apcourses[apcount] = courses[i];
                    apcount++;
              }
        }

		
		System.out.print("AP Course List:   ");
		// Write a for loop to display all the courses in only the valid 
		// part of the array.  Print all of the course names on one line
		// in a field width of 14 right justified using a printf statement.  
		 for (int i = 0; i < apcount; i++)
         {
               System.out.printf("%14s", apcourses[i]);
         }

         

		

		System.out.println();
		System.out.println();
		System.out.print("AP Course List:   ");
		// Write a for loop to display all the courses in the entire array,
		// even the invalid part.  Print all of the course names on one line
		//in a field width of 14 right justified using a printf statement.  
		for (int i = 0; i < apcourses.length; i++)
        {
              System.out.printf("%14s", apcourses[i]);
        }

		
		

		System.out.println();
		System.out.println();
		System.out.println("Program Terminated.");
	}
}
