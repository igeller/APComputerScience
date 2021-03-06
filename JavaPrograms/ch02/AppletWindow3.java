/* File:  AppletWindow3.java

This program has an applet window that has window pane with
five panels in it.  The five panels are contained in the five
different regions of a BorderLayout.  BorderLayout is the default
layout for a JApplet program.  So if you don't specify any other
layout, then the applet will have a BorderLayout.

Instructions:  After studying the code for this program then
			   modify this program so that it has a ...

	yellow north region
	magenta south region
	green west region
	orange east region
	and a black center region. 
 */

package ch02;

import javax.swing.*;    // For JApplet

import java.awt.*;       // For Color and Container

public class AppletWindow3 extends JApplet
{
	private static final long serialVersionUID = 1L;

	// The init method initializes the applet and loads it.
	// It creates an applet window that is 300 pixels wide
	// and 200 pixels high.
	public void init()
	{
		resize(300, 200);

		// Construct a northPanel and set its background color to red
		JPanel northPanel = new JPanel(); 
		northPanel.setBackground(Color.yellow);

		// Construct a eastPanel and set its background color to blue
		JPanel eastPanel = new JPanel(); 
		eastPanel.setBackground(Color.orange);

		// Construct a southPanel and set its background color to red
		JPanel southPanel = new JPanel(); 
		southPanel.setBackground(Color.magenta);

		// Construct a westPanel and set its background color to blue
		JPanel westPanel = new JPanel(); 
		westPanel.setBackground(Color.green);

		// Construct a centerPanel and set its background color to white
		JPanel centerPanel = new JPanel(); 
		centerPanel.setBackground(Color.black);

		// Get a pane for the window
		Container pane = getContentPane();

		// Add the panels to the pane specifying where to put each one
		pane.add(northPanel, BorderLayout.NORTH);
		pane.add(eastPanel, BorderLayout.EAST);
		pane.add(southPanel, BorderLayout.SOUTH);
		pane.add(westPanel, BorderLayout.WEST);
		pane.add(centerPanel, BorderLayout.CENTER);

	} // end of init method


	// The paint method is needed to paint things in the applet window.
	// However, nothing is painted because we have no drawing or
	// painting commands in it.  The line of code super.paint(g);
	// serves to erase the applet window before anything is painted.
	public void paint(Graphics g)
	{
		super.paint(g);

		// missing painting and drawing code would go below.


	}// end of paint method

} // end of AppletWindow3 class










