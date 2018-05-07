package ch02;

// Program that creates an empty JApplet window that does not
// have a pane in it.  You'll learn about panes in the next program.

// Comment out the import statements one at a time and view the
// errors that appear. Mouse over the errors and read what they say.
// Reactivate each import after doing this.

// Change the size of the JApplet window to
// a width of 800 and a height of 600 and run the program.

import java.awt.Graphics;

import javax.swing.JApplet;


public class AppletWindow1 extends JApplet
{
	// applet programs like to have this line of code, but
	// the applet will still run without it.  However, it
	// will show a warning.  This warning is NOT an error!
	private static final long serialVersionUID = 1L;

	// The init method initializes the applet and loads it.
	// It creates an applet window that is 300 pixels wide
	// and 200 pixels high.
	public void init ()
	{
		resize(800, 600); // first number is width second number is height
		
	} // end of init method


	// The paint method is needed to paint things in the applet window.
	// However, nothing is painted because we have no drawing or
	// painting commands in it.  The line of code super.paint(g);
	// serves to erase the applet window before anything is painted.
	public void paint(Graphics g)
	{
		super.paint(g);

		// missing painting and drawing code would go below.
		
		
	} // end of paint method

} // end of AppletWindow1 class