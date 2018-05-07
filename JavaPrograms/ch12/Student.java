package ch12;

import java.util.ArrayList;
import java.util.List;


public class Student
{
	private String name;
	private String id;

	// Change the tests instance variable so that it is declared as a
	// List of Integer objects instead of a standard one-dimensional
	// array of ints.  USE LIST  ... NOT ...  ARRAYLIST!
	//DO NOT CONSTRUCT IT.  JUST DECLARE IT!! Comment out your previous code.
	//private int[] tests;
	private List <Integer> tests;
	

	// Modify the code in this constructor so that an empty ArrayList is 
	// constructed and assigned to tests.
	public Student()
	{
		name = "";
		id = "";
		//tests = new int [3];
		tests = new ArrayList <Integer> ();
		studentCount++;
	}

	// Modify the code in this constructor so that an empty ArrayList is 
	// constructed and assigned to tests.
	public Student(String name, String id)
	{
		this.name = name;
		this.id = id;
		//tests = new int [3];
		tests = new ArrayList <Integer> ();
		studentCount++;
	}

	// Modify this constructor so that ... the parameter t is a List of type Integer.
	// Also, modify the code in this constructor so that an empty ArrayList is 
	// constructed and assigned to tests.
	// Finally, copy all of the values from t to the instance variable tests
	// using a loop.
	public Student(String name, String id, List <Integer> t) 
	{
		this.name = name;
		this.id = id;
		//tests = new int[t.length];
		tests = new ArrayList <Integer> ();

		for (int i = 0; i < t.size(); i++)	
		{
			/*tests[i] = t[i]; --> old line of code
			  * 
			  * STEPS: (to why tests.add(t.get(i)) works)
			  * int test = t.get(i);
			  * tests.add(test);
			  * 
			  */
			tests.add(t.get(i));	
		}
		studentCount++;
	}

	// Accessor Methods.

	// Get the name of the student.
	public String getName ()
	{
		return name;
	}
	
	// Get the id of the student.
	public String getId()
	{
		return id;
	}	

	// Modify the code in this method so that it uses ArrayList code rather
	// than one-dimensional array code.
	public int getScore (int i)
	{
		if (i < 0 || i >= tests.size())  	
			throw new IllegalArgumentException("i must be >= 0 and < " + (tests.size()));

		//return tests[i];
		return tests.get(i);
	}

	// Modify the code in this method so that it uses ArrayList code rather
	// than one-dimensional array code.
	public int getAverage()
	{
		int sum = 0;

		for (int i = 0; i < tests.size(); i++)
		{
			//sum += tests[i];
			sum += tests.get(i);
		}

		return sum / tests.size();
	}

	// Modify the code in this method so that it uses ArrayList code rather
	// than one-dimensional array code.
	public int getHighScore()
	{
		int highScore = tests.get(0);  
		
		for (int i = 1; i < tests.size(); i++) 
		{
			if (tests.get(i)> highScore)	
				highScore = tests.get(i);	
		}
		return highScore;
	}

	// Mutator Methods.

	// Changes the name of the Student.
	public void setName (String name)
	{
		this.name = name;
	}

	// Changes the id of the Student.
	public void setId (String id)
	{
		this.id = id;
	}
	
	// Modify the code in this method so that it uses ArrayList code rather
	// than one-dimensional array code.
	public void setScore (int i, int score)
	{
		if (i < 0 || i >= tests.size())
			throw new IllegalArgumentException("i must be >= 0 and < " + (tests.size()));

		if (score < MIN_SCORE || score > MAX_SCORE)
			throw new IllegalArgumentException("score must be >= " + MIN_SCORE + " and <= " + MAX_SCORE);

		//tests[i] = score;
		tests.set(i, score);
	}

	// Modify the code in this method so that it uses ArrayList code rather
	// than one-dimensional array code.
	public String toString()
	{
		String str = "Name: " + name  + "\n"
				+ "ID Number: " + id + "\n";

		for (int i = 0; i < tests.size(); i++)
		{
			str += "test " + i + ":  " + tests.get(i) + "\n";
		}

		str += "Average: " + getAverage();
		return str;
	} 


	// ***************************************************************************** 

	// WE WILL COMPLETE THE FOLLOWING CODE LATER.
	
	// Write the equals method that will override the equals method of the Object
	// class.  It must have the method signature:  public boolean equals (Object other)
	// This method is used checking two Student objects for equality.
	// If the names of two Student objects are equal and their id numbers
	// are equal, then the Student objects are equal, otherwise they are NOT equal.
	public boolean equals (Object other)
	{
		// Check to see if the receiver object is the exact same object as the parameter object.
		// If it is then return true. The contents would be the same in this case.
		if (this == other)						
			return true;

		// If the parameter object is not of the same type as the receiver object,
		// then throw an exception.
		if (! (other instanceof Student) )	// if other is NOT an instance of the Student class
			throw new IllegalArgumentException ("The object you are passing is NOT a Student!");

		// cast other to a Student because the parameter is of generic type Object
		

		// Write the code for the check for equality below this line.

		
		return false;  // temporary return value to remove compile error
	}



	// NO OTHER CODE BELOW TO WRITE!!!

	// ------------------- Class variables and methods --------------------

	// Class variables are sometimes referred to as static variables.

	// Class (static) variable
	static private int studentCount;

	// Class (static) constants
	static final public int MIN_SCORE = 0;
	static final public int MAX_SCORE = 100;

	// Class methods are sometimes referred to as static methods.

	// Class (static) method ... accessor
	static public int getStudentCount()
	{
		return studentCount;
	}

	// Class (static) method ... mutator
	static public void setStudentCount(int count)
	{
		studentCount = count;
	}

	// ----------------------------------------------------------------------

	// NO CODE TO MODIFY ---- DON'T CHANGE OR DELETE!!!
	// Returns null if there are no errors otherwise
	// returns an appropriate error message.
	public String validateData()
	{
		if (name.equals (""))
			return "SORRY: name required";

		for (int score : tests)
		{
			if (score < MIN_SCORE || score > MAX_SCORE)
			{
				String str = "SORRY: must have "+ MIN_SCORE
						+ " <= test score <= " + MAX_SCORE;  
				return str;
			}
		}
		return null;
	}
} // end of class Student


