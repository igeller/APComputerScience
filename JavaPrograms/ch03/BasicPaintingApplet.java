package ch03;

/*
	Chapter 3 Program.  First Graphic Program.

	FileName:  BasicPaintingApplet.java.
	Driver Program that constructs and uses
	the BasicPaintingPanel class.
*/

import javax.swing.*;
import java.awt.*;

public class BasicPaintingApplet extends JApplet
{
	// Applet programs want this line.  Don't worry about what it is.
	private static final long serialVersionUID = 1L;

	
	// Declare the global variable panel that can be used
	// in either method below.
	BasicPaintingPanel panel;

	
	// This method initializes the applet and does the following work:
	//  1)  sets the size of the applet window.
	//	2)  gets a content pane for the window so the pane can hold a panel.
	//	3)  constructs a new BasicPaintingPanel
	//	4)  adds the new panel to the window pane.
	public void init ()
	{
		resize(900, 800);
		Container pane = getContentPane();
		panel = new BasicPaintingPanel(Color.gray);
		pane.add(panel);
	}

	
	// This method paints the applet window by first erasing it with
	// the line of code super.paint(g); and then it calls the method
	// paintComponent(g) of the BasicDrawingAndPaintingPanel class so
	// that the panel is painted.
	public void paint(Graphics g)
	{
		super.paint(g);		// must have to paint background gray
		panel.paintComponent(g);

	}

}


