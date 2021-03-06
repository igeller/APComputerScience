

// FileName:  FlagPanel.java
// This file will contain all the code to draw the flag.
// Author:  

// NOTE:  do not write any code until you make sure that this file 
// is in your applets project folder.

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;

public class FlagPanel extends JPanel
{
	private static final long serialVersionUID = 1L;

	// constructor
	public FlagPanel(Color color)
	{
		setBackground(color);
	}

	// We need this method to direct the flow of the whole applet program.
	// It will call all the other methods in this class, but first it has to call
	// the paintComponent method of the JPanel class.  It does this with
	// the line of code:  super.paintComponent(g);  This erases the panel
	// and prepares it for drawing and painting.
	// Then whatever code we write will be executed once the applet is loaded.
	public void paintComponent (Graphics g)
	{
	   	// call the paintComponent() method of the JPanel class
	   	// and erase the panel before anything is drawn.

		

	   	// call the three methods paintWhiteBackground, paintRedStripes, paintBlueField here
	   	// after you have written their method signatures below.

		
		
	   
	   	// SKIP this instruction until you have written the code for paintWhiteBackground,
	   	// paintRedStripes, and paintBlueField.  Once you've done that, 
		// then call your first version of the method paintStar here.

	   	
	   	
	   	
		// SKIP this instruction until you have written the second version of the method paintStar.  Once 
	   	// you've done that, call your second version of method paintStar here and paint a star at (100, 100).

		
		
	   	
	   	// SKIP this instruction until you have written the code for the paintStars method. Once you've
	   	// done that, then call the method paintStars here.
		
	   	

	}  // end paintComponent method
	
	
	// Write the method signature for the paintWhiteBackground method.
	// It doesn't return a value, but receives the Graphics parameter g.
	// Add curly braces but don't write any code until you read the FlagLayout web page.

	
	
	

	// Write the method signature for the paintRedStripes method.
	// It doesn't return a value, but receives the Graphics parameter g.
	// Add curly braces but don't write any code until you read the FlagLayout web page.

	
	
	
	
	// Write the method signature for the paintBlueField method.
	// It doesn't return a value, but receives the Graphics parameter g.
	// Add curly braces but don't write any code until you read the FlagLayout web page.
	

	
	
	// AFTER HAVING READ THE FLAG LAYOUT WEB PAGE AND YOU HAVE COMPLETED THE CODE
	// FOR THE ABOVE THREE METHODS, THEN READ THE STAR LAYOUT WEB PAGE BEFORE
	// WRITING THE CODE FOR PAINTSTAR BELOW.
	
	// Write the method signature for the paintStar method.
	// It doesn't return a value, but receives the Graphics parameter g.
	// Follow the instructions on the StarLayout Web Page for completing the code for the method.

	
	
	

	// Write a second version of the paintStar method that receives 3 parameters.
	// It doesn't return a value, but receives the Graphics parameter g, the whole number
	// parameter h, and the whole number parameter v in that order.
	// h will represent horizontal displacement and v will represent vertical displacement.
	// Copy your code from the above paintStar method and paste it into this method and
	// then change the x and y values in the { }s so that h is added to all the x values, and
	// v is added to all the y values.
	// You do not delete the other paintStar method.  Java knows how to tell them apart,  
	// because they have different method signatures but the same name.
	// This is called "overloading" a method.

	
	

	// Finally, write the method signature and all the code for the paintStars method.
	// It doesn't return a value, but receives the Graphics parameter g.
	// Paint your first star in the first row of stars at the coordinates (20, 20) by calling 
	// the PaintStar() method.  Figure out where to print your second star in the first row of stars.
	// Note: All stars in a row are 40 pixels from each other horizontally.
	// Paint your first star in the second row of stars at the coordinates (40, 40) by calling
	// the PaintStar() method. Note: All stars in a column are 20 pixels from each other vertically. 
	// Note that a star in any row is offset horizontally from the stars in the rows immediately above and below. 

	
	

	
} // end FlagPanel class  - DO NOT WRITE CODE BEYOND THIS POINT!!!



/*
Here is a list of Java drawing commands.

GENERAL FORM				DESCRIPTION AND EXAMPLE

setBackground(c);					Sets the entire background color of the applet window.
											No graphics context g is used to invoke this method.

											Example:  setBackground(Color.gray);
							

g.drawString(str, x, y);			Draws a string.  The point (x, y) indicates the position of the 
											base line of the first character.
							
											Example:   g.drawString("Java Rules", 10, 50);
							

g.drawLine(x1, y1, x2, y2)	Draws a line from (x1, y1) to (x2, y2)

											Example:	  g.drawLine(10, 25, 40, 55);


g.drawRect(x, y, width, height)	Draws the outline of a rectangle whose upper-left corner is (x, y)
												and whose dimensions are the specified width and height.
							
												Example:	  g.drawRect(10, 25, 40, 30);
							
			
g.fillRect(x, y, width, height)		Paints a rectangle whose upper-left corner is (x, y)
												and whose dimensions are the specified width and height.
							
												Example:	  g.fillRect(10, 25, 40, 30);
							
							
g.clearRect(x, y, width, height)	Paints a rectangle whose upper-left corner is (x, y) and whose 
												dimensions are the specified width and height with the current 
												background color.
							
												Example:	  g.clearRect(10, 25, 40, 30);
							
							
g.drawRoundRect(x, y, width, height, arcWidth, arcHeight)		Draws the outline of a rounded 
												
												rectangle whose upper-left corner is (x, y) and whose dimensions 
												are the specified width and height.  The corners are rounded 
												according to the last two parameters.  To make them perfectly
												symmetrical, make the last two values equal.
							
												Example:	  g.drawRoundRect(10, 25, 40, 30, 10, 10);
							

g.fillRoundRect(x, y, width, height, arcWidth, arcHeight)		Paints a rounded rectangle
							
												whose upper-left corner is (x, y) and whose dimensions are
												the specified width and height.  The corners are rounded 
												according to the last two parameters.  To make them perfectly
												symmetrical, make the last two values equal.
							
												Example:	  g.fillRoundRect(10, 25, 40, 30, 10, 10);
							
														
g.drawOval(x, y, width, height)		Draws the outline of an oval that fits within a rectangle whose
							
													origin (upper-left corner) is (x, y) and whose dimensions are
													the specified width and height.  To draw a circle, make the
													width and height equal.
							
													Example:	  g.drawOval(10, 25, 50, 25);
							
g.fillOval(x, y, width, height)			Paints an oval that fits within a rectangle whose
													origin (upper-left corner) is (x, y) and whose dimensions are
													the specified width and height.  To draw a circle, make the
													width and height equal.
							
													Example:	  g.fillOval(10, 25, 50, 25);
							
							
g.drawArc(x, y, width, height, startAngle, arcAngle)		Draws the outline of an arc that fits within
							
													a rectangle whose upper-left corner is (x, y) and whose dimensions 
													are the specified width and height.  The arc is drawn from startAngle 
													to startAngle + arcAngle.  The angles are expressed in degrees.
													A startAngle of 0 indicates the 3 o'clock position.  A positive arc
													indicates a counterclockwise rotation, and a negative arc indicates a
													clockwise rotation from 3 o'clock.
							
													Example:   g.drawArc(10, 25, 50, 50, 0, 90);
							
							
g.fillArc(x, y, width, height, startAngle, arcAngle)			Paints an arc that fits within a rectangle whose 
							
													upper-left corner is (x, y) and whose dimensions are the specified width
													and height.  The arc is drawn from startAngle to startAngle + arcAngle.
							
													Example:   g.fillArc(10, 25, 50, 50, 0, 90);
							
							
 g.drawPolygon(x, y, n);		Draws a polygon where the following has been already defined in lines
 											of code prior to making a call to drawPolygon ...
 											int x [ ] = {10, 40, 60, 30, 40};
 											int y [ ] = {25, 25, 50, 60, 40};
 											n = 5;
 							
 											Example:   g.drawPolygon(x, y, n);
 							
 									
g.fillPolygon(x, y, n);				Paints a polygon where the following has been already defined in lines
 											of code prior to making a call to drawPolygon ...
 											int x [ ] = {10, 40, 60, 30, 40};
 											int y [ ] = {25, 25, 50, 60, 40};
 											n = 5;
 							
 											Example:   g.fillPolygon(x, y, n);
 							
 g.setColor(c);		Sets the current color which will be applied by the next draw or paint command.
 							c must be a legal color value.  The following are the available Java Color constants:
 							
 							Color.red
 							Color.yellow
 							Color.blue
 							Color.orange
 							Color.pink
 							Color.cyan
 							Color.magenta
 							Color.black
 							Color.white
 							Color.gray
 							Color.lightGray
 							Color.darkGray
 							
Alternative setColor		Sets the current color to the RGB values supplied.  For example, the color brown has
 									RGB values of red = 164, green = 84, and blue = 30.  So if you know the values, 
 									you can simply code it as:
						
 							A more readable way is to define brown as a color and then use it in numerous places in
 							your program.  Here is how you can do it:
 							
 							Color brown = new Color(164, 84, 30);
 							
 							then you would call setColor as follows:
 							
 							g.setColor(brown);
 							
 							// Note you would not put Color.brown as the parameter if you define it this way.
*/
