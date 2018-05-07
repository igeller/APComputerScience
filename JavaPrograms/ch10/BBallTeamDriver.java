package ch10;
// Program:  BBallTeamDriver
// This program manipulates an array of BBallPlayer objects.

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BBallTeamDriver
{
	public static void main (String[] args) throws FileNotFoundException
	{	
		// Declare and instantiate a standard array named ... players ...that will
		// hold 10 BBallPlayer objects representing a basketball team.
		BBallPlayer [] players = new BBallPlayer[10];
		

		// DO NOT ERASE ANY OF THE LINES BELOW THAT READ FROM THE FILE INSIDE
		// THE LOOP.  YOU WILL ONLY ADD TWO LINES OF CODE INSIDE THE LOOP.
		
		// ACTIVATE ONLY ONE OF THE TWO LINES OF CODE BELOW DEPENDING ON WHAT
		// FILE YOU WANT TO READ TEAM PLAYERS FROM.
		String fileName = "ch10/GirlsBBallTeam.txt";
		//String fileName = "ch10/BoysBBallTeam.txt";
		Scanner file = new Scanner(new File (fileName));

		// ONLY TWO LINES OF CODE TO FINISH INSIDE THE FOLLOWING LOOP.
		int i = 0;
		while (i < players.length && file.hasNextLine())
		{
			String name = file.nextLine();       // read the name from the file
			String status = file.nextLine();     // read the status from the file
			int number = file.nextInt();         // read the jersey number from the file
			double ftAve = file.nextDouble();    // read the free throw percentage from the file
			double shootAve = file.nextDouble(); // read the free throw percentage from the file
			int [] highestPoints = new int [3];  // construct points array for players 3 highest points
			highestPoints[0] = file.nextInt();   // read the first highest points value from the file
			highestPoints[1] = file.nextInt();   // read the second highest points value from the file
			highestPoints[2] = file.nextInt();   // read the third highest points value from the file
			
			 // consume new line character after last numeric value of a player in the file
			file.nextLine();
			
			// Call the BBallPlayer initializing constructor and construct
			// a BBallPlayer object from the above information.
			BBallPlayer bbp = new BBallPlayer(name, status, number, ftAve, shootAve, highestPoints); 
			
			// Add the constructed BBallPlayer object to the array at index i.
			players [i] = bbp;
			
			i++;
		}

	
		System.out.println();
		System.out.println();

		System.out.println("Here is the list of players on the team:");
		
		// Write the method named printPlayers at the end of this file, and
		// then call the method here and pass it the players array.
		printPlayers(players);
		

		System.out.println();
		System.out.println();
		
		System.out.println("Here are the injured players on the team:");
		
		// Write the method named printStatusPlayers at the end of this file, and
		// then call the method here and pass it the players array and the String "injured".
		printStatusPlayers(players, "injured");
		
		
		System.out.println();
		System.out.println();
		
		System.out.println("Here are the bench players on the team:");
		
		// Write the method named printStatusPlayers at the end of this file, and
		// then call the method here and pass it the players array and the String "bench".
		printStatusPlayers(players, "bench");
		
		
		System.out.println();
		System.out.println();

		System.out.println("Here is the starting line up:");
		
		// Write the method named printStartingLineUp at the end of this file, and
		// then call the method here and pass it the players array.
		printStartingLineUp(players);
		
		
		System.out.println();
		System.out.println();
		
		// Stop and write the method getHighestFreeThrowPercentagePlayer at the end of this
		// file and then call it here and store the value returned by the method in the
		// BBallPlayer variable named player.  Pass the method the players array.
		BBallPlayer player = getHighestFreeThrowPercentagePlayer(players);
		

		
		System.out.println("The player with the highest free throw percentage is:");
		// Print out the player with the highest free throw percentage.
		// ACTIVATE THE NEXT LINE.
		System.out.println(player);


		System.out.println();
		System.out.println();
		
		// Stop and write the method getLowestShootingPercentagePlayer at the end of this
		// file and then call it here and store the value returned by the method in the
		// BBallPlayer variable player. DON'T REDECLARE PLAYER!  IT HAS ALREADY BEEN DECLARED!
		// Pass the method the players array.
		player = getLowestShootingPercentagePlayer(players);



		System.out.println("The player with the lowest shooting percentage is:");
		// Print out the player with the lowest free throw percentage.
		// ACTIVATE THE NEXT LINE.
		System.out.println(player);

		System.out.println();
		System.out.println();
		
		// Stop and write the method getTeamFreeThrowPercentageAverage at the end of this
		// file and then call it here and store the value returned by the method in a new
		// variable named freeThrowPercentAverage.  Pass the method the players array.
		double freeThrowPercentAverage = getTeamFreeThrowPercentAverage(players);
		

		// ACTIVATE THE NEXT LINE.
		System.out.print("The team free throw shooting percentage average is: " + freeThrowPercentAverage);

		System.out.println();
		System.out.println();
		
		// Stop and write the method getTeamShootingPercentageAverage at the end of this
		// file and then call it here and store the value returned by the method in a new
		// variable named shootingPercentAverage.  Pass the method the players array.
		double shootingPercentAverage = getTeamShootingPercentageAverage(players);
		

		// Print out the team free shooting percentage by completing the following line.
		// ACTIVATE THE NEXT LINE.
		System.out.print("The team shooting percentage average is: " + shootingPercentAverage);

		System.out.println();
		System.out.println();
		
		// Stop and write the method getPlayerWithHighestPoints at the end of this
		// file and then call it here and store the value returned by the method in the
		// BBallPlayer variable player. DON'T REDECLARE PLAYER!  IT HAS ALREADY BEEN DECLARED!
		// Pass the method the players array.
		player = getPlayerWithHighestPoints(players);
		
		
		// ACTIVATE THE NEXT FEW LINES.
		System.out.println(player);
		System.out.println();
		System.out.println(player.getName() + " has scored more points in a game than any other player on the team.");
		System.out.println(player.getName() + " has scored " + player.getHighestPoints() + " points in one game.");
		System.out.println();
		System.out.println();
		
		System.out.println("Its the end of the game and a starting player has fouled out.");
		System.out.println("The coach wants to put in the bench player with the highest");		
		System.out.println("shooting percentage because the team is behind. The coach wants");
		System.out.println("this player to have a good chance of making the last shot if he");
		System.out.println("gets the ball.  The coach should send in:");
		
		// Stop and write the method getSubstitute at the end of this file and then call it
		// here and store the value returned by the method in the BBallPlayer variable player.
		// DON'T REDECLARE PLAYER!  IT HAS ALREADY BEEN DECLARED!  Pass the method the players array.
		player = getSubstitute(players);
		
		
		// ACTIVATE THE NEXT LINE.
		System.out.println(player);
		
		System.out.println();
		System.out.println();
		System.out.println("Program Terminated!");
	} // end main


	// Write the method printPlayers.  It does not return a value.
	// It receives one parameter that is an array of BBallPlayer objects.
	// The method must use AN ENHANCED FOR LOOP to access each BBallPlayer
	// object in the array and print each player's full information.  Print
	// a blank line after printing each BBallPlayer's information.
	public static void printPlayers(BBallPlayer [] players)
	{
		for (BBallPlayer element: players)
		{
			if (element != null)
			{
				System.out.println(element.toString());
				System.out.println();
			}
		}
	}
	
	
	
	


	// Write the method printStatusPlayers.  It does not return a value.
	// It receives two parameters. The first is an array of BBallPlayer objects.
	// The second is a String parameter named status. This method will print ONLY
	// the players that have the particular BBallPlayer status.  The method must
	// use AN ENHANCED FOR LOOP to access each BBallPlayer object in the array and
	// print the full information of any BBallPlayer that has the particular status.
	// Print a blank line after printing each BBallPlayer's information.
	public static void printStatusPlayers (BBallPlayer [] players, String status)
	{
		for (BBallPlayer element : players)
		{
			if(element != null && element.getStatus().compareToIgnoreCase(status) == 0)
			{
				System.out.println(element);
				System.out.println();
			}
				
		}
	}
	
	
	


	
	// Write the method printStartingLineUp.  It does not return a value.
	// It receives one parameter that is an array of BBallPlayer objects.
	// The method must use AN ENHANCED FOR LOOP to access each BBallPlayer
	// object in the array and print ONLY the player names and numbers of
	// players that are a starter.  Use a printf statement that will right justify
	// the player's number in a field width of 2 followed by a couple of blank spaces
	// and then the name of the player.  Here is a sample of what should be printed:
	/*
			10  Bill Bouncer
			 5  Jack Jumper 
			 3  Daryl Dunker
			14  Paul Walker 
			 2  Dan Dribble 
	*/

	public static void printStartingLineUp(BBallPlayer [] players)
	{
		for (BBallPlayer element : players)
		{
			if (element.getStatus().compareToIgnoreCase("starter")==0)
			{
				System.out.printf("%2d  %s%n",element.getNumber(), element.getName());
			}
		}
	}
	
	
	
	
	
	// Write the method getHighestFreeThrowPercentagePlayer.  This method returns a
	// BBallPlayer object.  It receives one parameter the array of BBallPlayer objects.
	// This method must use AN ENHNACED FOR LOOP to find the BBallPlayer with the highest
	// free throw shooting percentage. THIS PLAYER IS RETURNED BY THE METHOD NOT THE
	// PERECENTAGE OF THE PLAYER.
	public static BBallPlayer getHighestFreeThrowPercentagePlayer(BBallPlayer [] players)
	{
		//double percent = players[0].getFreeThrowPercentage();
		BBallPlayer player = players[0];
		
		for (BBallPlayer element: players)
		{
			if (element.getFreeThrowPercentage() > player.getFreeThrowPercentage())
				player = element;
		}
		
		return player;
	}
	
	
	
	


	// Write the method getLowestShootingPercentagePlayer.  This method returns a
	// BBallPlayer object.  It receives one parameter the array of BBallPlayer objects.
	// This method must use AN ENHNACED FOR LOOP to find the BBallPlayer with the lowest
	// shooting percentage (NOT THE FREE THROW PERCENTAGE).. THIS PLAYER IS RETURNED BY
	// THE METHOD NOT THE PERECENTAGE OF THE PLAYER.
	public static BBallPlayer getLowestShootingPercentagePlayer(BBallPlayer [] players)
	{
		BBallPlayer player = players[0];
		for (BBallPlayer element: players)
		{
			if (element.getShootingPercentage() < player.getShootingPercentage())
				player = element;
		}
		return player;
	}
	
	
	
	


	// Write the method getTeamFreeThrowPercentageAverage.  This method returns a
	// double that represents the average FREE THROW percentage of all players on
	// the team.  This method receives one parameter the array of BBallPlayer objects.
	// The method must use AN ENHNACED FOR LOOP to calculate and return the average
	// of the free throw shooting percentages of all players.
	public static double getTeamFreeThrowPercentAverage (BBallPlayer [] players)
	{
		double teamAverage = 0.0;
		double sumOfIndivAvg = 0.0;
		for (BBallPlayer element: players)
		{
			sumOfIndivAvg += element.getFreeThrowPercentage();
		}
		teamAverage = sumOfIndivAvg/players.length;
		return teamAverage;
	}
	
	
	
	


	// Write the method getTeamShootingPercentageAverage.  This method returns a
	// double that represents the average SHOOTING percentage of all players on
	// the team.  This method receives one parameter the array of BBallPlayer objects.
	// The method must use AN ENHNACED FOR LOOP to calculate and return the average
	// of the shooting percentages of all players.
	public static double getTeamShootingPercentageAverage (BBallPlayer [] players)
	{
		double indivShooting = 0.0;
		double shootAvg = 0.0;
		for(BBallPlayer element: players)
		{
			indivShooting += element.getShootingPercentage();
		}
		shootAvg = indivShooting/players.length;
		return shootAvg;
	}
	
	
	
	
	

	// Write the method getPlayerWithHighestPoints.  This method returns a BBallPlayer
	// object.  It receives one parameter the array of BBallPlayer objects.  This method
	// must use AN ENHNACED FOR LOOP to find the BBallPlayer that has the highest number
	// of points scored in a game. THIS PLAYER IS RETURNED BY THE METHOD NOT THE NUMBER
	// OF POINTS.  Its ok to assume that players[0] has the highest number of points.
	public static BBallPlayer getPlayerWithHighestPoints (BBallPlayer [] players)
	{
		BBallPlayer highPlayer = players[0];
		for (BBallPlayer element: players)
		{
			if (element.getHighestPoints() > highPlayer.getHighestPoints())
			{
				highPlayer = element;
			}
		}
		return highPlayer;
	}
	
	
	
	
	
	
	
	// Write the method getSubstitute.  This method returns a BBallPlayer object.
	// It receives one parameter the array of BBallPlayer objects.  This method must
	// use AN ENHNACED FOR LOOP to find the BBallPlayer with status "bench" that has
	// the highest shooting percentage. THIS PLAYER IS RETURNED BY THE METHOD NOT THE
	// PERECENTAGE OF THE PLAYER.  Its ok to assume that players[0] is the highest bench
	// player but realize that this player's status may not be bench.  Code in your loop
	// can do the correct comparisons to find the correct bench player after that initial
	// assumption.  Assume there is at least one bench player in players.
	public static BBallPlayer getSubstitute(BBallPlayer [] players)
	{
		BBallPlayer sub = players[0];
		//double shootPercent = 0.0;
		for(BBallPlayer element: players)
		{
			if (element.getStatus().compareToIgnoreCase ("bench") ==0)
			{
				if(element.getShootingPercentage() > sub.getShootingPercentage())
					sub = element;
			}
		}
		return sub;
	}
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
} // end of BBallTeamDriver












