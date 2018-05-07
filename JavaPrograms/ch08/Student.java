package ch08;

// FileName:  Student.java
// Model Class that defines a Student Object
// This class allows a client programmer to construct and 
// send messages to any Student object and manage its name
// and three test scores.

public class Student
{
	// PRIVATE INSTANCE VARIABLES (also called fields)
	// Each student object has a name and three test scores
	private String name;			// Student name
	private int test1;			// Score on test 1
	private int test2;			// Score on test 2
	private int test3;			// Score on test 3

	// **************************************************************************
	
	// CONSTRUCTOR METHODS that construct Student objects in various ways
	
	// Default Constructor
	// Initialize a Student object's name to default values.
	public Student ( )
	{
		name = "";
		test1 = 0;
		test2 = 0;
		test3 = 0;
	}

	// Initializing Constructor
	// Initialize each one of the private instance variables using
	// the appropriate parameters nm, t1, t2, & t3.
	public Student (String nm, int t1, int t2, int t3)
	{
		name = nm;
		test1 = t1;
		test2 = t2;
		test3 = t3;
	}
	
	// Copy Constructor
	// Makes a copy of the Student object s.
	// This method copies the data of the Student object s into
	// a newly constructed Student object.
	public Student (Student s)
	{
		// get the name of Student object s and copy it into the name field
		// of the Student object being constructed.
		name = s.name;
		
		// get the value of test1 of Student object s and copy it into
		// the test1 field of the Student object being constructed.
		test1 = s.test1;
		
		// get the value of test2 of Student object s and copy it into
		// the test2 field of the Student object being constructed.
		test2 = s.test2;
		
		// get the value of test3 of Student object s and copy it into
		// the test3 field of the Student object being constructed.
		test3 = s.test3;	
	}
	
	// **************************************************************************

	// ACCESSOR METHODS that retrieve private instance variable values
	
	// Accessor method for the private instance variable name of the Student object.
	// Retrieve the name stored in the Student object.
	public String getName ( )
	{
		return name;
	}

	// Instead of having 3 individual accessor methods for the 3 test scores, this
	// class will have only one.  An integer must be passed to this method and that
	// integer parameter determines what test score is returned.  If the integer
	// parameter i is 1, then test1 is returned.  If the integer parameter i is 2,
	// then test2 is returned.  And, if the integer parameter i is 3, then test3 is returned.
	public int getScore (int i)
	{
		if (i == 1)
			return test1;
		else if (i == 2)
			return test2;
		else if (i == 3)
			return test3;
		else 
			return 0;
		
	
	}

	// **************************************************************************

	// MUTATOR METHODS that modify the values stored in private instance variables
	
	// Mutator method for the private instance variable name of the Student object.
	// Change the name stored in the Student object.
	public void setName (String nm)
	{	
		name = nm;
	}
	
	// Instead of having 3 individual mutator methods for the 3 test scores, this
	// class will have only one.  It receives two parameters i and score.  The
	// parameter i represents what test score to change and score represents the
	// new value of that test score.
	public void setScore (int i, int score)
	{
		if (i == 1)
			test1 = score;
		else if (i == 2)
			test2 = score;
		else if (i == 3)
			test2 = score;
		
	}

	// **************************************************************************

	// OTHER METHODS
	
	// Method that calculates and returns the average of a Student object's test scores.
	// Note:  This isn't actually an accessor method because there is no private
	// instance variable named average.  Note:  this method calls the private helper method
	// named sumTests.
	public double getAverage ( )
	{
		double average;
		int sum = sumTests();
		average = (double) sum / 3;  // Cast the int value in sum to a double for an exact average!
		return average;  
	}

	// PRIVATE HELPER METHOD ... CLIENT PROGRAMMERS CAN'T CALL THIS METHOD.  This method is
	// intended to only be called by other methods of this class!!!
	private int sumTests( )
	{
		int sum;
		sum = test1 + test2 + test3;
		return sum;
	}
	
	// This method determines and returns the highest test score of a Student object's
	// three test scores.  This is an additional public method but it is not truly an
	// accessor method, because it doesn't return a particular instance variable value.
	// One approach to writing this code is to assume that test1 is the highest score,
	// then check test2 and test3 to see if they are higher.  Which ever one is the
	// highest store it in the variable highScore and return it.
	public int getHighScore ()
	{
		int highScore = 0;

		if (test1 > test2 && test1 > test3)
			highScore = test1;
		else if (test2 > test1 && test2 > test3)
			highScore = test2;
		else if (test3 > test1 && test3 > test3)
			highScore = test3;

		return highScore;
		
		/* or :
		 int highScore;
		 highScore = test1;
		 if (test2 > highScore)
		 	highScore = test2;
		 if (test3 > highScore)
		 	highScore = test3;
		 return highScore;
		 
		 */

		
	}
	
	// Method that returns the STATE of a Student object.  In other words, the values
	// of all the instance variables plus any other information we might want to return.
	// Essentially, construct and return a string representation of the student.
	public String toString()
	{
		String str;
		str = "\nName:    " + name  + "\n" +    // "\n" denotes a newline
		"Test 1:  " + test1 + "\n" +
		"Test 2:  " + test2 + "\n" + 
		"Test 3:  " + test3 + "\n" +
		"Average: " + getAverage() + "\n";
		return str;
	}  
}




