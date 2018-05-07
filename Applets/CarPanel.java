

// CarPanel.java
// Used by the driver CarApplet.java
// Date: 
// Author:  

import javax.swing.*;

import java.awt.*;

public class CarPanel extends JPanel
{
	// Write the constructor for this class.  This method
	// will only set the background color of the panel.
	// Refer to your BasicDrawingAndPainting.java file to
	// see how it was done for that program.
	public CarPanel (Color color)
	{
		setBackground(color);
	}
	
	
	

	public void paintComponent (Graphics g)
	{
		// Write the line of code that always goes first in the
		// method paintComponent.
		super.paintComponent(g);
		
		// call the method paintBody after writing it below.
		paintBody(g);
		
		
		// call the method paintLeftWheel after writing it below.
		
		
		
		// call the method paintRightWheel after writing it below.
		
		

	} // END OF paintComponent method.  DO NOT ERASE THIS CURLY BRACE.

	
	
	public void paintBody(Graphics g)
	{
		// Write all the code to draw and paint your car below these
		// instructions. Write comments to identify each part of the
		// car that you are drawing and painting.  Refer to the online
		// Applet key for the car that has all of the required specifications.
		
		// Paint the car's body ... either an oval or round rectangle that begins
		// at (200, 200) and has a width of 600 and a height of 200.
		
		
		
		// Paint the convertible cut out gray by painting a rounded-rectangle.
		
		
		
		// Paint the border of the convertible cut out black by drawing a rounded-rectangle.
		
		
		
		// Erase the top part of the border of the convertible cut out gray.
		
		
		
		// Draw a black outline for the door.
		
		
		
		// Draw the black door knob.
		
		
		
		// Draw the black pen stripe.
		
		
		
		// Draw the black "Go Cards" logo (or other logo) on the body just
		// above the pen stripe at the back of the car.
		
		
		
		// Paint the light gray wind shield using an arc.
		
		
		
		// Draw the black border of the wind shield.
		
		
		
		// Draw the car's antenna black and the ball at the top of the antenna red.
		
		
		
		// Draw two black lines to represent the steering wheel column (shaft).
		
		
		
		// Draw a black circle to represent the steering wheel.
		
		
		
		// Draw a black vertical and a black horizontal line for the spokes on
		// the steering wheel.
		
		
	} // end of paintBody method - DO NOT ERASE THIS BRACE OR LINE


	// This method will paint the left wheel black and paint the left
	// hub cap light gray.  It will also draw the black spokes.  There will be 4 spokes.
	// One will be horizontal, one will be vertical, and two will be diagonal.
	public void paintLeftWheel(Graphics g)
	{

		
		
	} // end of paintLeftWheel method - DO NOT ERASE THIS BRACE OR LINE


	// This method will paint the right wheel black and paint the right
	// hub cap light gray.  It will also draw the black spokes.  There will be 4 spokes.
	// One will be horizontal, one will be vertical, and two will be diagonal.
	public void paintRightWheel(Graphics g)
	{

		
		
	} // end of paintRightWheel method - DO NOT ERASE THIS BRACE OR LINE
	
} // END OF CAR PANEL CLASS.  DO NOT DELETE THIS CURLY BRACE

/*
HERE IS THE LIST OF JAVA DRAWING AND PAINTING COMMANDS and INFORMATION.
---------------------------------------------------------------------------

g.setColor(Color.red);

Sets the current color of the paint brush to draw or paint.  Whichever drawing
or painting command comes next will draw or paint with this color.
Here is the list of Java Color constants that can be used:

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

To create a custom color, call the Color class constructor and pass it the
appropriate RGB values (red, green, blue values) ...

Color colorVariableName = new Color (R, G, B);

For example, the color brown has the following RGB values:
red = 164, green = 84, and blue = 30. 

So to construct brown use ...
Color brown = new Color(164, 84, 30);

then you would call setColor as follows:

g.setColor(brown);

//Note: DON'T TRY TO USE Color.brown in parentheses ( ).  It is not a constant!

------------------------------------------------------------------------

g.drawLine(x1, y1, x2, y2);

Draws a line from (x1, y1) to (x2, y2)

To draw a line from the point (10, 25) to the point (40, 55) use ...

g.drawLine(10, 25, 40, 55);

-------------------------------------------------------------------------

g.drawRect(x, y, width, height);	

Draws the outline of a rectangle whose upper-left corner is (x, y) and whose
dimensions are the specified width and height.  To draw a rectangle with
upper-left hand corner at the point (50,50) with a width of 200 and height
of 150 use ...

g.drawRect(50, 50, 200, 150);

-------------------------------------------------------------------------

g.fillRect(x, y, width, height);

Paints a rectangle whose upper-left corner is (x, y) and whose dimensions
are the specified width and height.  To paint a rectangle with upper-left
hand corner at the point (50,50) with a width of 200 and height of 150 use ...

g.fillRect(50, 50, 200, 150);

-------------------------------------------------------------------------

g.clearRect(x, y, width, height);

Erases a rectangular area whose upper-left corner is (x, y) and whose
dimensions are the specified width and height with the current background
color.  To erase the rectangular area with an upper left hand corner of
(10, 25) that has a width of 40 pixels and a height of 30 pixels use ...

g.clearRect(10, 25, 40, 30);

-------------------------------------------------------------------------

g.drawRoundRect(x, y, width, height, arcWidth, arcHeight);	

Draws the outline of a rounded rectangle whose upper-left corner is (x, y)
and whose dimensions are the specified width and height.  The arcWidth
and arcHeight values control how much the corners are rounded.  To make
the corners perfectly rounded (symmetrical) make these last two values
the same number.  For example, to draw a rounded-rectangle with an
upper-left corner positioned at the point (40, 40) that has a width of 75
and a height of 35 and an arcWidth and arcHeight of 5 use ...

g.drawRoundRect(40, 40, 75, 35, 5, 5);

-------------------------------------------------------------------------

g.fillRoundRect(x, y, width, height, arcWidth, arcHeight);		

Paints a rounded rectangle whose upper-left corner is (x, y) and whose
dimensions are the specified width and height.  The arcWidth and arcHeight
values control how much the corners are rounded.  To make the corners
perfectly rounded (symmetrical) make these last two values the same number.
For example, to paint a rounded-rectangle with an upper-left corner
positioned at the point (40, 40) that has a width of 75 and a height of 35
and an arcWidth and arcHeight of 5 use ...

g.fillRoundRect(40, 40, 75, 35, 5, 5);

-------------------------------------------------------------------------

g.drawOval(x, y, width, height);

Draws the outline of an oval that is inscribed within a rectangular area whose
upper-left corner is (x, y) and whose dimensions are the specified width
and height.  To draw a circle, make the width and height equal. For example,
to draw an oval with upper-left corner at the point (10, 25) and a width of 50
and a height of 25 use ...

g.drawOval(10, 25, 50, 25);

-------------------------------------------------------------------------

g.fillOval(x, y, width, height);

Paints an oval that is inscribed within a rectangular area whose upper-left
corner is (x, y) and whose dimensions are the specified width and height.
To draw a circle, make the width and height equal. For example, to paint an
oval with upper-left corner at the point (10, 25) and a width of 50 and a
height of 25 use ...

g.fillOval(10, 25, 50, 25);

-------------------------------------------------------------------------

g.drawArc(x, y, width, height, startAngle, arcAngle);		

Draws the outline of an arc that is inscribed within a rectangle whose
upper-left corner is (x, y) and whose dimensions are the specified width
and height.  The arc is drawn from startAngle to startAngle + arcAngle.
The angles are expressed in degrees.  A startAngle of 0 indicates the
3 o'clock position.  A positive arc indicates a counterclockwise rotation,
and a negative arc indicates a clockwise rotation from 3 o'clock.  For
example, to draw an arc whose upper-left corner is (10, 25) and whose
rectangular area has a width of 50 and a height of 50 with a starting angle
of 0 sweeping for 90 degrees use ...

g.drawArc(10, 25, 50, 50, 0, 90);

-------------------------------------------------------------------------

g.fillArc(x, y, width, height, startAngle, arcAngle);

Paints an arc that is inscribed within a rectangle whose upper-left corner
is (x, y) and whose dimensions are the specified width and height.  The arc
is drawn from startAngle to startAngle + arcAngle.  The angles are expressed
in degrees.  A startAngle of 0 indicates the 3 o'clock position.  A positive
arc indicates a counterclockwise rotation, and a negative arc indicates a
clockwise rotation from 3 o'clock.  For example, to paint an arc whose
upper-left corner is (10, 25) and whose rectangular area has a width of 50
and a height of 50 with a starting angle of 0 sweeping for 90 degrees use ...

g.fillArc(10, 25, 50, 50, 0, 90);

-------------------------------------------------------------------------

g.drawPolygon(x, y, n);

Draws an n-sided polygon where x and y have already been defined as lists
in lines of code prior to the command.

The following line defines a list named x that will hold all of the x values
(abscissas) of the points of the polygon.
int x [ ] = {x1, x2, x3, .... }; 

The following line defines a list named y that will hold all of the y values
(ordinates) of the points of the polygon.
int y [ ] = {y1, y2, y3, .... };

So, to draw the pentagon defined by the 5 points:
(10, 25) , (40, 25) , (60, 50) , (30, 60) , (40, 40)  use ...

int x [ ] = {10, 40, 60, 30, 40};
int y [ ] = {25, 25, 50, 60, 40};
g.drawPolygon(x, y, 5);  // The number is 5 because it is a pentagon.

-------------------------------------------------------------------------

g.fillPolygon(x, y, n);

Paints an n-sided polygon where x and y have already been defined as lists
in lines of code prior to the command.

The following line defines a list named x that will hold all of the x values
(abscissas) of the points of the polygon.
int x [ ] = {x1, x2, x3, .... }; 

The following line defines a list named y that will hold all of the y values
(ordinates) of the points of the polygon.
int y [ ] = {y1, y2, y3, .... };

For example, to paint a pentagon by connecting the points:
(10, 25) , (40, 25) , (60, 50) , (30, 60) , (40, 40)  use

int x [ ] = {10, 40, 60, 30, 40};
int y [ ] = {25, 25, 50, 60, 40};
g.fillPolygon(x, y, 5);  // The number is 5 because it is a pentagon.


-------------------------------------------------------------------------

g.drawString(str, x, y);

Draws the String value stored in the String variable str at the point (x, y)
starting at the position of the base line of the first character in str.
To draw the words "Java Rules" beginning at the point (10, 50), then use ...

g.drawString("Java Rules", 10, 50);

-------------------------------------------------------------------------

getWidth()

Call this method without any object to get the width in pixels of the panel.
When calling this method do not put g and a dot before it.

getHeight()

Call this method without any object to get the height in pixels of the panel.
When calling this method do not put g and a dot before it.

For example, if you wanted to find the location one-fourth of the way across
the window, you could use  getWidth() / 4  as a parameter.  You could also use
getHeight() / 4 to find the location 1/4 of the way down.

To draw the string "Java Rules" at this location in the applet window use ...

g.drawString("Java Rules", getWidth() / 4, getHeight() / 4);

-------------------------------------------------------------------------

THE END.
 */