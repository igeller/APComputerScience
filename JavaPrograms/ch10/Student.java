package ch10;
// Modified Version of the Student Class that has two instance variables:
//	1.  A String name
//	2.  A standard array of int named tests

public class Student
{
	private String name;			// Student name
	private int [] tests; 

	// Default Constructor that sets the instance variable name to empty
	// string and constructs (instantiates) the instance variable tests
	// to a physical size of 3 and initializes all of the test scores to 0.
	public Student()
	{
		name = "";
		tests = new int [3];
		for (int i = 0; i < tests.length; i++)
			tests[i] = 0;
		studentCount++;
	}


	// Initializing Constructor that sets the instance variable name to nm
	// and constructs (instantiates) the instance variable tests
	// to a physical size of 3 and initializes all of the test scores to 0.
	public Student(String nm)
	{
		name = nm;
		tests = new int [3];
		for (int i = 0; i < tests.length; i++)
			tests[i] = 0;
		studentCount++;

	}


	// Initializing constructor that sets the instance variable name to nm
	// and instantiates the instance variable tests to a physical size of n
	// and initializes all of the test scores to 0.
	public Student(String nm, int n)
	{
		name = nm;

		tests = new int [n];
		for (int i = 0; i < tests.length; i++)
			tests[i] = 0;
		studentCount++;

	}

	// Initializing constructor that sets the instance variable name to nm
	// and instantiates the instance variable tests to a physical size of
	// t.length and then copies all of the test scores out of t into
	// the instance variable tests.
	public Student(String nm, int[] t)
	{
		name = nm;
		
		tests = new int [t.length];
		for (int i = 0; i < tests.length; i++)
			tests[i] = t[i];
		studentCount++;

	}


	// ACCESSOR METHODS

	// Get the name of the student.
	public String getName ()
	{
		return name;
	}

	// This method returns a particular test score of the Student.
	// Precondition:  i must be a valid integer value in the range
	// of 1 to tests.length so that value can be converted to 
	// 0 to tests.length - 1, because the user may call the method
	// and pass it 1, 2, 3 referring to test 1, test2, test3 .... not
	// knowing that those tests are actually stored in [0], [1], & [2].
	// Therefore, this method will make the adjustment by subtracting 1
	// from the index value before accessing the data.  So the throw
	// statement will test to see if i is outside of the range from
	// 1 to tests.length.	
	public int getScore (int i)
	{
		if (i < 1 || i > tests.length)
			throw new IllegalArgumentException("i must be >= 1 and <= " + tests.length);
			
		return tests[i-1];
	}
	
	// Returns all the tests for a student as an array of int values.
	public int [] getScores()
	{
		return tests;
	}
	

	// PRIVATE HELPER METHOD ... CLIENT PROGRAMMERS CAN'T CALL THIS METHOD.
	// This method is intended to only be called by other methods of this class!!!
	private int sumTests( )
	{
		int sum = 0;
		
		for(int i = 0; i < tests.length; i++)
			sum += tests[i];
		return sum;
	}
	
	
	// This method calculates and returns a student's average by
	// summing all of the test scores and then calculating an average
	// no matter how many tests are in the array tests.
	public double getAverage()
	{
		double average;
		int sum = sumTests();
		average = (double) sum /tests.length;  // CAST THE INT VALUE IN SUM TO A DOUBLE FOR AN EXACT AVERAGE!
		return average;
	}

	// This method uses a loop to find the highest test score
	// in the array tests and returns it.
	public int getHighScore()
	{
		int highScore = tests[0];
		
		for (int i = 1; i< tests.length; i++)
		{
				highScore = tests[i];
		}
		
		return highScore;
	}
	
	
	// MUTATOR METHODS

	// This method modifies the Student name to the parameter nm.
	public void setName (String nm)
	{
		name = nm;
	}

	// This method replaces a test score in the tests array at
	// index i - 1 with the value stored in the parameter score.
	// Precondition:  i must be a valid integer value in the range
	// of 1 to tests.length so that value can be converted to 
	// 0 to tests.length - 1, because the user may call the method
	// and pass it 1, 2, 3 referring to test 1, test2, test3 .... not
	// knowing that those tests are actually stored in [0], [1], & [2].
	// Therefore, this method will make the adjustment by subtracting 1
	// from the index value before accessing the data.  So the throw
	// statement will test to see if i is outside of the range from
	// 1 to tests.length.
	public void setScore (int i, int score)
	{
		if (i < 1 || i > tests.length)
			throw new IllegalArgumentException("i must be >= 1 and <= " + tests.length);
			
		
		tests[i-1] = score;
	}

	// An appropriate toString() method that prints the Student data
	public String toString()
	{
		String str = "Name:    " + name  + "\n";

		for (int i = 0; i < tests.length; i++)
		{
			str += "test " + (i+1) + ":  " + tests[i] + "\n";
		}

		str += "Average: " + getAverage();
		return str;
	} 

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
}

