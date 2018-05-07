package ch08;

// FileName:  Person2.java
// Model Class that defines a Person2 Object
// This class allows a client programmer to construct and 
// send messages to any Person2 object and manage its data fields.
// Data fields are the instance variables of a model class.
// THIS CLASS IS ESSENTIALLY THE SAME AS PERSON.JAVA EXCEPT IT
// MAKES USE OF THE JAVA RESERVED WORD this.  Sometimes programmers
// like to use instance variable names as their parameters.  If this
// is done, then this must proceed the instance variable when 
// referring to it.  The word this refers to the object being
// constructed or to the object receiving the message from a
// driver file.

public class Person2
{
	// PRIVATE INSTANCE VARIABLES (also called fields)
	// Each Person object has a name, age, address, and phone number
	private String name;			// Person's name
	private int age;				// Person's age
	private String address;		// Person's address
	private String phone;		// Person's phone number
	
	// **************************************************************************

	// CONSTRUCTOR METHODS that construct Person objects in various ways
	
	// Default Constructor
	// Initialize a new Person's name, age, address, and phone to default values.
	// Default values are:
	//						"" for Strings
	//						0 for ints
	//						0.0 for doubles
	//						false for booleans
	public Person2()
	{
		this.name = "";
		this.age = 0;
		this.address = "";
		this.phone = "";
	}

	// Initializing Constructor
	// Initialize each one of the private instance variables using this
	// and the parameters name, age, address, and phone
	// Note:  Some programmers like to use parameters that have the same
	// names as the instance variables.  If they are used, then the
	// reserved word this must precede the instance variable when referring
	// to it.
	public Person2 (String name, int age, String address, String phone)
	{
		this.name = name;
		this.age = age;
		this.address = address;
		this.phone = phone;
	}

	
	// Copy Constructor
	public Person2 (Person2 p)
	{
		this.name = p.name;
		this.age = p.age;
		this.address = p.address;
		this.phone = p.phone;	
	}
	
	
	// **************************************************************************
	
	// ACCESSOR METHODS that retrieve private instance variable values.

	public String getName( )
	{
		return this.name;
	}

	public int getAge( )
	{
		return this.age;
	}

	public String getAddress( )
	{
		return this.address;
	}

	public String getPhone( )
	{
		return this.phone;
	}

	// **************************************************************************
	
	// MUTATOR METHODS that modify the values stored in private instance variables
	
	public void setName (String name)
	{	
		this.name = name;
	}

	public void setAge (int age)
	{	
		this.age = age;
	}

	public void setAddress (String address)
	{	
		this.address = address;
	}

	public void setPhone (String phone)
	{	
		this.phone = phone;
	}

	// **************************************************************************
	
	// OTHER METHODS
	
	// Method that returns the STATE of a Person object.  In other words, the values
	// of all the instance variables plus any other information we might want to return.
	// Essentially, construct and return a string representation of the Person.
	public String toString()
	{
		String str;
		str = 	"\nName: "  + this.name     + "\n" +
				"Age: "     + this.age      + "\n" +
				"Address: " + this.address  + "\n" + 
				"Phone: "   + this.phone    + "\n";
		return str;
	}  
}













