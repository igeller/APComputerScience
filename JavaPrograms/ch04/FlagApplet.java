


import javax.swing.JApplet;

import ch04.FlagPanel;

import java.awt.Container;
import java.awt.Color;
import java.awt.Graphics;

public class FlagApplet extends JApplet
{
	private static final long serialVersionUID = 1L;
	
	// The variable panel will be available anywhere (globally)
	// in this file without having to pass it to a method.
	FlagPanel panel;	
	
	public void init ()
	{
		// set the size of the container in the applet window
		resize(800, 600);
		
		// create the content pane
		Container c = getContentPane();
		
		// call the FlagPanel constructor and pass it gray
		panel = new FlagPanel(Color.gray);
		
		// add the panel to the container
		c.add(panel);
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
	// paintComponent() method of our FlagPanel class.
	public void paint(Graphics g)
	{
		// call the paint() method of the JApplet class
		super.paint(g);		
		
		// call the paintComponent() method of the FlagPanel class
	    panel.paintComponent(g);	// call the paintComponent() method of the FlagPanel class
		
   }
	
} // end FlagApplet