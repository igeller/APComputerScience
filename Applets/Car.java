// FileName:  Car.java
// Write the class Car that contains the following instance variables and methods:
//		DO NOT WRITE THE CODE INSIDE THESE INSTRUCTIONS!!!
// 		START AFTER THE IMPORT STATEMENT BELOW.
/*		
		instance variables:
		horizontal of type int
		vertical of type int
		cabin of type Color
		body of type Color
		wheels of type Color
		name of type String
		speed of type int
		
   DECLARE AND WRITE THE CODE FORE ONLY THE FOLLOWING METHODS:
   
		Default constructor (initializes all instance variables appropriately,
			but sets cabin and body to black and wheels to white)
		Initializing constructor (receives as many parameters as there are instance variables)
		DO NOT WRITE A COPY CONSTRUCTOR!
		Accessor method getH that returns the horizontal  position
		Accessor method getV that returns the vertical position
		Accessor method getCabinColor that returns the color of the cabin
		Accessor method getBodyColor that returns the color of the body
		Accessor method getWheelsColor that returns the color of the wheels
		Accessor method getName that returns the name of the car
		Accessor method getSpeed that returns the speed
		ONLY WRITE THE FOLLOWING TWO MUTATOR METHODS!
		Mutator method setH that changes the horizontal position of the car
		Mutator method setSpeed that changes the speed of the car
		A toString method that returns the current state of a Car object
 */
import java.awt.Color;

public class Car
{
	private int horizontal;
	private int vertical;
	private Color cabin;
	private Color body;
	private Color wheels;
	private String name; 
	private int speed;

	public Car()
	{	
		horizontal = 0;
		vertical = 0;
		cabin = Color.black;
		body = Color.black;
		wheels = Color.white;
		name = "";
		speed = 0;
	}
	
	public Car (int horz, int vert, Color cbn, Color bod, Color whls, String nm, int spd)
	{
		horizontal = horz;
		vertical = vert;
		cabin = cbn;
		body = bod;
		wheels = whls;
		name = nm;
		speed = spd;
	}
	
	public int getH()
	{
		return horizontal;
	}
	
	public int getV()
	{
		return vertical;
	}
	
	public Color getCabinColor()
	{
		return cabin;
	}
	
	public Color getBodyColor()
	{
		return body;
	}
	
	public Color getWheelsColor()
	{
		return wheels;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getSpeed()
	{
		return speed;
	}
	
	public void setH (int horz)
	{
		horizontal = horz;
	}
	
	public void setSpeed(int spd)
	{
		speed = spd;
	}
	
	public String toString()
	{
		String str;
		str = "Horizontal: " + horizontal + 
				"\nVertical: " + vertical +
				"\nCabin: " + cabin +
				"\nBody: " + body +
				"\nWheels: " + wheels +
				"\nName: " + name +
				"\nSpeed: " + speed +"\n";
		return str;
	}
}











