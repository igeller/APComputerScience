


// Chapter 5 Section 6 applet program
// FileName:  BullsEyeDriver.java ... applet driver program file
// that uses th BullsEyePanel class.

// This driver will be modified so that it implements a showInputDialog
// box to receive the number of circles in the BullsEye from the user.

// FIRST, RUN THE PROGRAM WITHOUT ADDING OR CHANGING ANY CODE AND VIEW
// THE OUTPUT, then follow the instructions for the next two instructions below.

import javax.swing.*;    

import java.awt.*;       

public class BullsEyeDriver extends JApplet
{
	private static final long serialVersionUID = 1L;

	public  void init()
	{
		resize(600, 600);
		
		// BEGIN BY RUNNING THE PROGRAM AS IT IS.
		
		// Write the input dialog code here like in the file CircleAreaDemo.java
		// to ask for the number of rings of the Bulls Eye. Be sure and include code
		// that will test to see if null was returned if the cancel button was
		// clicked.  Use a default value of 5 for the number of rings.
		

		
		// After running the program initially and seeing 5 rings in the bulls eye, then
		// modify the following line so that 5 is not stored in numOfCircles, but rather
		// the input string above is properly parsed as an int and stored in numOfCircles.
		int numOfCircles = 5;
		
		
		// Modify the next line to pass the BullsEyePanel constructor the
		// color white, a width of 600, a height of 600 and the number of circles
		// that should be painted in the bull's eye.
		BullsEyePanel panel = new BullsEyePanel(Color.white, 600, 600);
		
		// Get a container for the JApplet Window to put the ColorPanel in.
		Container pane = getContentPane();
		
		// Add the panel to the container
		pane.add(panel);
	}
	
}




