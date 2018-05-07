
// Concentric Bonus Program.
// ConcentricApplet.java

import javax.swing.JApplet;
import java.awt.Container;
import java.awt.Color;
import java.awt.Graphics;

public class ConcentricApplet extends JApplet
{
	ConcentricPanel panel;	// panel is available anywhere (globally) in this file 
										// without having to pass it to a method.
	
	public void init ()
	{
		Container c = getContentPane();		// instantiate a container for the panel
		
		// call the ConcentricPanel constructor
		
		
		// add the panel to the container
		
   }
   
	// This applet driver program needs to provide its own paint() method
	// even though the JApplet class has one.  We over-ride JApplet's paint()
	// method by writing a method signature exactly like the one in the JApplet
	// class.  So we use public void paint (Graphics g).
	// We then need to first call the paint method in the JApplet class
	// before we write our own code.  We call the paint() method of the JApplet
	// class by coding super.paint(g);  This will erase the container window so
	// other things can be drawn and painted.
	// We then write our own code. For this program, we just need to call the
	// paintComponent() method of our ConcentricPanel class.  Since panel
	// is a ConcentricPanel variable, when we use panel.paintComponent(g);
	// line we do that.
	public void paint(Graphics g)
	{
		super.paint(g);		// call the paint() method of the JApplet class
		
	    // call the paintComponent() method of the ConcentricPanel class
		
   }
}