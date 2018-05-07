

/* 	File:  Square.java
	This model class will only have two instance variables ... one
	called value of type String and the other called chosen of type boolean.
	
This class will only have the following methods:

1)  a default constructor that receives no parameter that 
	will initialize the instance variable value to empty string and
	initialize the instance variable chosen to false.

2)  an initializing constructor that receives two parameters that 
	will hand off appropriate parameter values to the instance variables.
	
3)	an accessor method named getValue that returns the value of an
	instance variable.
	
4)  an accessor method named getChosen that returns the value of an
	instance variable. 
	
5)  a mutator method named setValue that receives one parameter of type
 	String that sets the value of the appropriate instance variable.
 	
6)  a mutator method named setChosen that receives one parameter of type
 	boolean that sets the value of the appropriate instance variable. 
 	
7)  the toString method is done for you.  Do not erase it!
	
*/
public class Square
{
	private String value;
	private boolean chosen;
	
	//default constructor
	public Square()
	{
		value = "";
		chosen = false;
	}
	
	//intializing contructor
	public Square(String val, boolean chos)
	{
		value = val;
		chosen = chos;
	}
	
	//accessor methods
	public String getValue()
	{
		return value;
	}
	public boolean getChosen()
	{
		return chosen;
	}
	
	//mutator methods
	public void setValue(String val)
	{
		value = val;
	}
	public void setChosen(boolean chos)
	{
		chosen = chos;
	}
	
	
	// Included for testing.  No code to write.
	public String toString()
	{
		String str = "Value: " + value + "  Chosen: " + chosen + "\n";
		return str;
	}
}







