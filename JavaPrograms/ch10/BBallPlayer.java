// BBallPlayer.java
// This Model Class is used by the BBallTeamDriver.java file.
// The Instance variables for this model class are already declared.

package ch10;

public class BBallPlayer
{
	// player's name
	private String name;

	// player status:  either "starter", "bench", "injured"
	private String status;

	// player's jersey number
	private int number;
	
	// a player's free throw shooting percentage
	private double freeThrowPercentage;

	// a player's field goal shooting percentage
	private double shootingPercentage;	

	// an array of ints representing the 3 games where
	// a player scored his or her 3 highest point totals.
	private int [ ] topPoints = new int [3];

	
	// Write the Default Constructor that initializes the instance
	// variables to the appropriate values.  -1 is sufficient default
	// value for a jersey number since 0 is actually a valid number.
	public BBallPlayer()
	{
		name = "";
		status = "";
		number = -1;
		freeThrowPercentage = 0.0;
		shootingPercentage = 0.0;
		topPoints = new int [3];
		for (int i = 0; i < topPoints.length; i++)
			topPoints[i] = 0;
	}
	
	

	// Write the Initializing Constructor that initializes
	// the instance variables to the values of the parameters.
	// Use the following parameter identifiers in the following order:
	// nm, st, num, ftp, sp, and points (an int array).
	public BBallPlayer(String nm, String st, int num, double ftp, double sp, int [] points)
	{
		name = nm;
		status = st;
		number = num;
		freeThrowPercentage = ftp;
		shootingPercentage = sp;
		topPoints = new int [3];
		for (int i = 0; i < topPoints.length; i++)
			topPoints[i] = points[i];
	}

	
	

	// Write the accessor method getName that returns the name of the player.
	public String getName()
	{
		return name;
	}

	

	// Write the accessor method getStatus that returns the status of the player.
	public String getStatus()
	{
		return status;
	}

	
	
	// Write the accessor method getNumber that returns the jersey number of the player.
	public int getNumber()
	{
		return number;
	}

	

	// Write the accessor method getFreeThrowPercentage that returns
	// the free throw percentage of the player.
	public double getFreeThrowPercentage()
	{
		return freeThrowPercentage;
	}

	

	// Write the accessor method getShootingPercentage that returns
	// the shooting average of the player.
	public double getShootingPercentage()
	{
		return shootingPercentage;
	}

	

	// Write the accessor method getHighestPoints that returns the
	// highest of the three top points for a player.  You must use
	// an enhanced for loop in your code.
	public int getHighestPoints()
	{
		int highest = topPoints[0] ;
		for(int i = 0; i < topPoints.length; i++)
		{
			if (topPoints[i] > highest)
				highest = topPoints[i];
		}
		return highest;
	}

	
	

	// The toString() method that prints the state of a BBallPlayer.
	// NO CODE TO WRITE.
	public String toString()
	{
		String str =	 "Name: " + name  + "\n"
				+ "Playing Status: " + status  + "\n"
				+ "Free Throw Average: " + freeThrowPercentage  + "\n"
				+ "Shooting Average: " + shootingPercentage  + "\n"
				+ "Top 3 Highest Points:  " + topPoints[0] + "  "
				+ topPoints[1] + "  " + topPoints[2];
		return str;
	}  

} // end of BBallPlayer class

