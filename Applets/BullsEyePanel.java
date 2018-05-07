

// FileName:  BullsEyePanel.java
// This panel class paints a red and white bull's eye.

import javax.swing.*;
import java.awt.*;

public class BullsEyePanel extends JPanel
{
	private static final long serialVersionUID = 1L;
	
	// The variable circles is a global variable that can be used anywhere 
	// in this class.
	// The constructor code will give circles a value from the parameter named
	// numOfcircles so the program will know how many circles of the Bulls Eye
	// are to be drawn.
	int circles;		


	// If someone calls the following constructor they must provide the color
	// and the preferred width and height of the bull's eye.  YOU NEED TO MODIFY
	// THE METHOD SIGNATURE to include a fourth integer parameter named numberOfCircles.  
	public BullsEyePanel(Color backColor, int width, int height)		
	{		
		setBackground(backColor);
		setPreferredSize(new Dimension(width, height));

		// The private instance variable circles gets a value
		// from the parameter numOfCircles.
		
		
	} // end of BullsEyePanel constructor
	

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);

		// Originally this program paints 5 circles to make a bullseye, therefore
		// it had 10 thicknesses.  So that means that the program needs to paint
		// twice as many thicknesses as number of circles.  That is why we have
		// the code for the next line.
		int thickness = getWidth() / 10;				
		int x = 0;
		int y = 0;
		int width = getWidth() - 1;
		int height = getHeight() - 1;
		Color ringColor = Color.red;

		// Run this loop as many times as there are circles.
		// This loop paints 5 circles, where the biggest circle
		// is painted first, followed by the next biggest circle,
		// followed by the next biggest circle, etc.
		for (int count = 1; count <= 5; count++)
		{
			// paint a circle
			g.setColor(ringColor);
			g.fillOval(x, y, width, height);

			// Adjust the upper-left hand corner point of the circle
			// by moving it farther to the right and down farther.
			x = x + thickness;
			y = y + thickness;

			// Adjust width and height for the circle so it is not as big.
			width = width - thickness * 2;
			height = height - thickness * 2;

			// Change the color so that the circles alternate back and
			// forth between red and white.
			if (ringColor == Color.red)
				ringColor = Color.white;
			else
				ringColor = Color.red;
		}     
	}	
}
