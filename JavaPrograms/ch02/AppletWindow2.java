package ch02;

/* File:  AppletWindow2.java

This program contains one window pane that will hold one panel.
We can set the background color of that panel when the program
first loads the applet and we can paint or draw on it if we want.

Study the code below and then add code in the init() method so
that a customized color is used rather than the color constant
pink.  Find a color you like at this web site:
http://www.web-source.net/216_color_chart.htm 
and remember the three integers that represent it.  There will be
a red integer, a green integer, and a blue integer.  Then,
activate the constructor line that looks like this:
Color myColor = new Color(red, green, blue);   and replace the words
red, green, and blue with your three integers in the correct order.
Then modify the setBackground line of code to use myColor.

Finally deactivate each import statement one at a time and read the
errors that appear.  Reactivate each import after doing this.
*/

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;

import javax.swing.*;

public class AppletWindow2 extends JApplet
{
	private static final long serialVersionUID = 1L;

	// The init method initializes the applet and loads it.
	// It creates an applet window that is 300 pixels wide
	// and 200 pixels high.
	public  void init()
	{
		resize(300, 200);

		JPanel panel = new JPanel();

		// Activate the next line of code and give red, green, and blue different numbers
		Color myColor = new Color(255, 0, 102);

		// The following line of code 
		panel.setBackground(myColor);  // <------- change Color.pink to myColor

		Container pane = getContentPane();

		pane.add(panel);
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
	
} // end of AppletWindow2 class










