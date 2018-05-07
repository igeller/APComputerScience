package ch08;

// FileName:  Person.java
// Model Class that defines a Person Object
// This class allows a client programmer to construct and 
// send messages to any Person object and manage its data fields.
// Data fields are the instance variables of a model class.

public class Person
{
	// PRIVATE INSTANCE VARIABLES (also called fields)
	// Each Person object has a name, age, address, and phone number
	private String name;			// Person's name
	private int age;				// Person's age
	private String address;		// Person's address
	private String phone;			// Person's phone number
	
	// **************************************************************************

	// CONSTRUCTOR METHODS that construct Person objects in various ways
	
	// Default Constructor
	// Initialize a new Person's name, age, address, and phone to default values.
	// Default values are:
	//						"" for Strings
	//						0 for ints
	//						0.0 for doubles
	//						false for booleans
	public Person()
	{
		name = "";
		age = 0;
		address = "";
		phone = "";
	}

	// Initializing Constructor
	// Initialize each one of the private instance variables using
	// the appropriate parameters nm, ag, ad, & ph
	// Note:  parameters are given names that are abbreviations of the fields
	public Person (String nm, int ag, String ad, String ph)
	{
		name = nm;
		age = ag;
		address = ad;
		phone = ph;
	}


	// Copy Constructor
	// Makes a copy of the Person object p. This method copies the data
	// of the Person object p into a newly constructed Person object.
	// You know the method is a copy constructor because the parameter
	// is the same type as the class.
	// Note:  most model classes don't have a copy constructor because
	// programmers generally don't believe one should be provided.
	// But, we show you how it is done.
	// ALERT:  There is something new here!  We use the dot operator to
	// signify the field of the parameter Person object p.
	// There are no ( ) when doing this!
	public Person (Person p)
	{
		// get the name of Person object p and copy it into the name field
		// of the Person object being constructed.
		name = p.name;
		
		// get the age of Person object p and copy it into the age field
		// of the Person object being constructed.
		age = p.age;
		
		// get the address of Person object p and copy it into the address field
		// of the Person object being constructed.
		address = p.address;
		
		// get the phone of Person object p and copy it into the phone field
		// of the Person object being constructed.
		phone = p.phone;	
	}
	
	
	// **************************************************************************
	
	// ACCESSOR METHODS that retrieve private instance variable values.
	
	// Accessor method for the private instance variable name of the
	// Person object.  Retrieve the name stored in the Person object.
	public String getName( )
	{
		return name;
	}

	// Accessor method for the private instance variable age of the
	// Person object.  Retrieve the age stored in the Person object.	
	public int getAge( )
	{
		return age;
	}
	
	// Accessor method for the private instance variable address of the
	// Person object. Retrieve the address stored in the Person object.
	public String getAddress( )
	{
		return address;
	}

	// Accessor method for the private instance variable phone of the
	// Person object.  Retrieve the phone stored in the Person object.
	public String getPhone( )
	{
		return phone;
	}

	// **************************************************************************
	
	// MUTATOR METHODS that modify the values stored in the
	// private instance variables.
	
	// Mutator method for the private instance variable name of the
	// Person object.  Change the name stored in the Person object.
	public void setName (String nm)
	{	
		name = nm;
	}
	
	// Mutator method for the private instance variable age of the
	// Person object.  Change the age stored in the Person object.
	public void setAge (int ag)
	{	
		age = ag;
	}
	
	// Mutator method for the private instance variable address of the
	// Person object.  Change the address stored in the Person object.
	public void setAddress (String ad)
	{	
		address = ad;
	}
	
	// Mutator method for the private instance variable phone of the
	// Person object.  Change the phone stored in the Person object.
	public void setPhone (String ph)
	{	
		phone = ph;
	}

	// **************************************************************************
	
	// OTHER METHODS

	// Method that returns the STATE of a Person object.  In other words,
	// the values of all the instance variables plus any other information
	// we might want to return.
	// Essentially, create and return a string representation of the Person.
	public String toString()
	{
		String str;
		str = 	"\nName:    " + name  + "\n" +    		// "\n" denotes a newline
				"Age:  " + age + "\n" +
				"Address:  " + address + "\n" + 
				"Phone:  " + phone + "\n";
		return str;
	} 
	
	 
} // End of Person class

