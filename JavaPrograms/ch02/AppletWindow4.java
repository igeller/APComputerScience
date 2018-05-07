/* File:  AppletWindow4.java

An applet can display panels in other configurations like
a GridLayout.  In a GridLayout, all of the panels are laid
out in rows and columns and they all have the same size.

This program initially uses a 2 by 2 GridLayout so it has 2 rows
and 2 columns.  Since it is not a BorderLayout we must explicitly
set the layout to a GridLayout by calling the setLayout() method.

You will modify this program in these ways:

1) Resize the GUI to 800 pixels wide and 600 pixels high.

2) Modify the code so that a GridLayout with 4 rows and 2 columns
is used instead. Keep the panels in the first two rows the same as
they already are and then make the panels in the last 2 rows the
following colors:  orange, cyan, blue, and green.
 */

package ch02;

import javax.swing.*;    // For JApplet

import java.awt.*;       // For Color and Container

public class AppletWindow4 extends JApplet
{
	private static final long serialVersionUID = 1L;

	public void init()
	{
		resize(800, 600);

		JPanel whitePanel = new JPanel(); 
		whitePanel.setBackground(Color.white);

		JPanel blackPanel = new JPanel(); 
		blackPanel.setBackground(Color.black);

		JPanel grayPanel = new JPanel(); 
		grayPanel.setBackground(Color.gray);

		JPanel redPanel = new JPanel(); 
		redPanel.setBackground(Color.red);
		
		JPanel orangePanel = new JPanel();
		orangePanel.setBackground(Color.orange);
		
		JPanel cyanPanel = new JPanel();
		cyanPanel.setBackground(Color.CYAN);
		
		JPanel greenPanel = new JPanel();
		greenPanel.setBackground(Color.green);
		
		JPanel bluePanel = new JPanel();
		bluePanel.setBackground(Color.blue);


		// Get a pane for the window
		Container pane = getContentPane();

		// Set the applets layout to a GridLayout with 
		// 2 rows and 2 columns.
		pane.setLayout(new GridLayout(4, 2));   // (rows, columns)

		// Add the panels to the pane in the order you want them.
		pane.add(whitePanel);
		pane.add(blackPanel);
		pane.add(grayPanel);
		pane.add(redPanel);
		pane.add(orangePanel);
		pane.add(cyanPanel);
		pane.add(greenPanel);
		pane.add(bluePanel);
		
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

} // end of AppletWindow4 class










