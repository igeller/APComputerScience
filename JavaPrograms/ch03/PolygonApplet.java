
package ch03;
// FileName:  PolygonApplet.java
// This is the driver file for a program that paints
// polygons on a PolygonPanel.  It uses the PolygonPanel class.

import javax.swing.*;
import java.awt.*;

public class PolygonApplet extends JApplet
{
	private static final long serialVersionUID = 1L;

	// Declare a global panel variable that can be used in both
	// the init() and paint() methods below.
	PolygonPanel panel;
	
	
	// Complete this method so that it sets up a window pane with
	public void init ()
	{
		resize(1000, 800);
		// Write the three lines of code necessary for this
		// applet program to work correctly.  Refer to your
		// other applet driver files to see how it was done.
		resize(800,700);
		Container pane = getContentPane();
		panel = new PolygonPanel (Color.gray);
		pane.add(panel);
		
		
	} // end init method

	
	public void paint(Graphics g)
	{
		// Write the two lines of code necessary in this method
		// so that the program will function correctly.  Refer to your
		// BasicDrawingAndPainting.java file to see how it
		// was done for that program.
		super.paint(g);
		panel.paintComponent(g);
		
		
	} // end paint method

} // end PolygonApplet