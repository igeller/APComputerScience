// RectangleDrawer.java

import javax.swing.JApplet;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.Graphics;

public class RectangleDrawer extends JApplet
{
	private static final long serialVersionUID = 1L;

	int x;
	int y;
	int width;
	int height;

	// In the init method below we will use the String variable inputStr to obtain
	// values from the GUI Input boxes
	public void init ()
	{
		resize(800, 800);
		String inputStr ="";

		// DON'T REDECLARE X, Y, WIDTH, AND HEIGHT.  THEY ARE ALREADY DECLARED GLOBALLY!
		
		// prompt and receive input for the abscissa of the upper left hand
		// corner of the rectangle using a showInputDialog box.  Make the
		// default value 1.
		
		inputStr = JOptionPane.showInputDialog(null, "Enter an integer for the abcissa of the upper-left hand corner of a rectangle:", "1");

		
		
		// Test inputStr to see if it is null.  If it is then end the method.
		if (inputStr == null)
			return;

		// Parse inputStr to an int and store in the variable x.
		// x is the abscissa of the upper left hand corner of the rectangle.
		x = Integer.parseInt(inputStr);

		// ******************************************************************

		// prompt and receive input for the ordinate of the upper left hand
		// corner of the rectangle using a showInputDialog box.  Make the
		// default value 1.
		inputStr = JOptionPane.showInputDialog(null, "Enter an integer for the ordinate of the upper left hand corner of a rectangle:", "1");

		// Test inputStr to see if it is null.  If it is then end the method.
		if (inputStr == null)
			return;
		
		// Parse inputStr to an int and store in the variable y.
		// y is the ordinate of the upper left hand corner of the rectangle.
		y = Integer.parseInt(inputStr);

		// ******************************************************************

		// prompt and receive input for the width of the rectangle using a
		// showInputDialog box.  Make the default value 1.
		inputStr = JOptionPane.showInputDialog(null, "Enter an integer for the width of the rectangle:", "1");

		// Test inputStr to see if it is null.  If it is then end the method.
		if (inputStr == null)
			return;

		// Parse inputStr to an int and store in the variable width.
		// width is the ordinate of the upper left hand corner of the rectangle.
		width = Integer.parseInt(inputStr);

		// ******************************************************************

		// prompt and receive input for the height of the rectangle using a
		// showInputDialog box.  Make the default value 1.
		inputStr = JOptionPane.showInputDialog(null, "Enter an integer for the height of the rectangle:", "1");

		// Test inputStr to see if it is null.  If it is then end the method.
		if (inputStr == null)
			return;

		// Parse inputStr to an int and store in the variable height.
		// height is the ordinate of the upper left hand corner of the rectangle.
		height = Integer.parseInt(inputStr);

		// ******************************************************************

		// Test x, y, width, and height to see that they have appropriate values.
		// If x or y is less than zero or if width or height are less than 1,
		// then output the following error message using a showMessageDialog box
		//  with an error message icon.
		// "Error: x and y must be >= 0 and width and height must be >= 1." 
		
		if (x < 0 || y < 0 ||width < 1 || height < 1)
		{
			JOptionPane.showMessageDialog(null, "Error: x and y must be >= 0 adn width and height must be >= 1.", 
												"Output Window", 
												JOptionPane.ERROR_MESSAGE);
		}

		
			
		
		
		
		

	}

	// This applet driver program needs to provide its own paint() method so 
	// things can be drawn or painted.  Since we are only painting once when
	// running the program, there is no need to begin the method with 
	// super.paint(g); because we don't need to clear the painting window,
	// which is mainly what super.paint(g) does.
	// It is important to note that we are over-riding the paint() method in
	// the JApplet class by providing our own paint method.  To over-ride the
	// method, we must write a method signature exactly like the one in the
	// JApplet class.  So we use public void paint (Graphics g) and for this
	// program to be an applet program it must extend JApplet.
	// We then write our own code in our paint method.
	public void paint(Graphics g)
	{
		// paint the entire applet window blue (size is 800 x 800)
		g.setColor(Color.blue);
		g.fillRect(0, 0, 800, 800);


		
		// set the painting color to red
		g.setColor(Color.RED);

		
		// paint the rectangle using the global variables x, y, width, and height
		g.fillRect(x, y, width, height);
		
	}
}






