package ch08;

// FileName:  Student3.java
// This file uses CHAINING OF CONSTRUCTORS  ... and ... THIS.
// This is elegant and works but not necessarily a recommended style.

// This Model Class defines a Student3 Object.
// This class allows a client programmer to construct and 
// send messages to any Student3 object and manage its name
// and three test scores.
 
public class Student3
{
	// PRIVATE INSTANCE VARIABLES (also called fields)
	// Each Student3 object has a name and three test scores
	private String name;			// Student name
	private int test1;			// Score on test 1
	private int test2;			// Score on test 2
	private int test3;			// Score on test 3

	// **************************************************************************
		
	// CONSTRUCTOR METHODS that construct Student3 objects in various ways
	
	// Default Constructor
	// Initialize a Student3 object's name to default values by passing
	// default values to the initializing constructor.
	public Student3()
	{
		this("", 0, 0, 0);
	}

	// Initializing Constructor
	// Initialize each one of the private instance variables using
	// this WITH PARAMETER NAMES THAT ARE THE SAME AS THE INSTANCE VARIABLES.
	public Student3 (String name, int test1, int test2, int test3)
	{
		this.name = name;
		this.test1 = test1;
		this.test2 = test2;				
		this.test3 = test3;
	}
	
	// Copy Constructor
	// Makes a copy of the Student3 object s.
	// This method copies the data of the Student3 object s into
	// a newly constructed Student object.
	public Student3 (Student3 s)
	{
		this (s.name, s.test1, s.test2, s.test3);	
	}
	
	// **************************************************************************

	// ACCESSOR METHODS that retrieve private instance variable values
	
	// Accessor method for the private instance variable name of the Student3 object.
	// Retrieve the name stored in the Student3 object.
	public String getName ()
	{
		return this.name;
	}

	// Accessor method to get one of the private instance variable tests of a Student3 object.
	// Retrieve the test score in the Student3 object designated by the parameter i. 
	public int getScore (int i)
	{
		if (i == 1) 
			return this.test1;
		else if (i == 2) 
			return this.test2;
		else             
			return this.test3;
	}
	
	// **************************************************************************

	// MUTATOR METHODS that modify the values stored in private instance variables
	
	// Mutator method for the private instance variable name of the Student3 object.
	// Change the name stored in the Student3 object.
	public void setName (String name)
	{
		this.name = name;
	}

	// Mutator method that modifies a Student3's test score.
	// Change the test score of the test represented by the parameter i.
	public void setScore (int i, int score)
	{
		if (i == 1) 
			this.test1 = score;
		else if (i == 2) 
			this.test2 = score;
		else             
			this.test3 = score;
	}

	// **************************************************************************

	// OTHER METHODS

	// Method that calculates and returns the average of a Student3 object's test scores.
	// Note:  This isn't actually an accessor method because there is no private
	// instance variable named average.  Note:  this method calls the private helper method
	// named sumTests.
	public double getAverage ( )
	{
		double average;
		int sum = this.sumTests();
		average = (double) sum / 3;  // CAST THE INT VALUE IN SUM TO A DOUBLE FOR AN EXACT AVERAGE!
		return average;
	}

	
	// PRIVATE HELPER METHOD ... CLIENT PROGRAMMERS CAN'T CALL THIS METHOD.  This method is
	// intended to only be called by other methods of this class!!!
	private int sumTests( )
	{
		int sum;
		sum = this.test1 + this.test2 + this.test3;
		return sum;
	}
	

	// Method that determines and returns the highest test score of a Student3 object's
	// three test scores.  Note:  This isn't actually an accessor method because
	// there is no particular private instance variable that will be returned every time
	// by this method.  It depends on the values stored in the instance variables.
	// Note the interesting approach of the code ... assume test1 is the highest score,
	// then check test2 and test3 to see if they are higher.  Which ever one is the highest
	// store it in the variable highScore and return it.
	public int getHighScore()
	{
		int highScore;
		highScore = this.test1;
		if (this.test2 > highScore) 
			highScore = this.test2;
		if (this.test3 > highScore) 
			highScore = this.test3;
		return highScore;
	}

	
	// Method that returns the STATE of a Student3 object.  In other words, the values
	// of all the instance variables plus any other information we might want to return.
	// Essentially, construct and return a string representation of the student.
	public String toString()
	{
		String str;
		str = "\nName:    " + this.name  + "\n" +    // "\n" denotes a newline
				"Test 1:  " + this.test1 + "\n" +
				"Test 2:  " + this.test2 + "\n" + 
				"Test 3:  " + this.test3 + "\n" +
				"Average: " + this.getAverage() + "\n";
		return str;
	}  
	
} // end Student3 class