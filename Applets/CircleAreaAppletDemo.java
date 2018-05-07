

// CircleAreaAppletDemo.java
// This program calculates the area of a circle from a value entered by the
// user and then paints the circle in the center of the applet window.
import javax.swing.JApplet;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.Graphics;

public class CircleAreaAppletDemo extends JApplet
{
	private static final long serialVersionUID = 1L;

	int radius = 0;
	// In the init method below we will use the String variable inputStr to obtain
	// values from the GUI Input boxes
	public void init ()
	{
		resize(600, 600);

		String inputStr = JOptionPane.showInputDialog(null, "Enter an integer for the radius", "0");
		
		// The following if statement breaks out of the init method without
		// completing it.  However, the paint method will still be automatically called.

		if (inputStr == null) // if someone clicks the Cancel button in the GUI Input Box.
			return; 

		radius = Integer.parseInt(inputStr);  // parse (convert) the string entered to an int

		if (radius < 0)
		{
			JOptionPane.showMessageDialog(null,
										"Error: Radius must be >= 0 \n Your radius will be automatically set to 10",
										"Output Window",
										JOptionPane.ERROR_MESSAGE);
			radius = 10; // give radius this value if a negative value was entered.
		}
		else
		{
			double area = Math.PI * Math.pow(radius, 2);
			JOptionPane.showMessageDialog(null,
										"The area is " + area,
										"Output Window",
										JOptionPane.INFORMATION_MESSAGE);
		}

	} // end of init method

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
		// paint the entire applet window green (size is 600 x 600)
		g.setColor(Color.green);
		g.fillRect(0, 0, 600, 600);
		
		// set the painting color to yellow
		g.setColor(Color.yellow);

		
		// paint the circle exactly in the center of the window knowing the center
		// is at (300, 300)
		g.fillOval(300-radius,300-radius, radius*2, radius* 2);
		
	} // end of paint method
	
} // end of CircleAreaAppletDemo






