package ch03;

/*
	FileName:  BasicPaintingPanel.java.

	Chapter 3 Program.  First Graphic Program.

	Run the BasicPaintingApplet driver file
	to display the graphics coded here.

 */

import javax.swing.*;
import java.awt.*;

public class BasicPaintingPanel extends JPanel
{
	private static final long serialVersionUID = 1L;


	// This is the constructor method!  A constructor method
	// always has the same name as the class!  This constructor
	// only does one thing and that is set the background color.
	// It sets the background color to the color that is passed to it.
	public BasicPaintingPanel(Color color)
	{
		setBackground(color);
	}

	// The paintComponent method is where all of the code is located
	// that will draw and paint on the panel.  It must begin with the
	// line of code super.paintComponent(g);
	public void paintComponent (Graphics g)
	{
		super.paintComponent(g);

		// IF WE SAY DRAW, WE MEAN DRAW AN OUTLINE OF THE OBJECT.
		// IF WE SAY PAINT, WE MEAN FILL THE OBJECT WITH A COLOR.

		// General Rule:   g.drawLine(x1, y1, x2, y2);
		// Draws a line from (x1, y1) to (x2, y2).
		// Draw a line from from the point (100, 100) to the point (200, 400).
		g.drawLine(100, 100, 200, 400);

		// General Rule:   g.drawRect(x, y, width, height);
		// Draws the outline of a rectangle whose upper-left corner is (x, y)
		// and whose dimensions are the specified width and height.
		// Draw a Rectangle with upper left point (200, 400) and a width of 100
		// and a height of 100
		g.drawRect(200, 400, 100, 100);

		// General Rule:  g.drawString(str, x, y);
		// Draws the string str beginning at the point (x, y). 
		// Label the rectangle in the center with the words "Square".	
		g.drawString("square", 235, 450);

		// General Rule:    g.setColor(Color.blue);
		// Sets the drawing and painting color of the paint brush g
		// Change the color of the paint brush to blue.
		g.setColor(Color.blue);


		// General Rule:   g.fillRoundRect(x, y, width, height, arcWidth, arcHeight);
		// Paints a rounded rectangle whose upper-left corner is (x, y) and whose
		// dimensions are the specified width and height.  The corners are rounded 
		// according to the last two parameters.  To make them perfectly symmetrical,
		// make the last two values equal.
		// Paint a Rounded Rectangle with upper left corner of (400, 100) and a bottom
		// right corner of (600, 300)  and has an arcWidth of 40 and an arcHeight of 40
		// You need to calculate what the width and height would be before coding this.
		g.fillRoundRect(400, 100, 200, 200, 40, 40);
		
		
		// Change the current color to yellow
		g.setColor(Color.yellow);

		// Label the center of the Rounded Rectangle with the words "Rounded Rectangle".
		g.drawString("Rounded Rectangle", 450, 200);

		// Change the current color to yellow
		g.setColor(Color.yellow);


		// General Rule:   g.fillArc(x, y, width, height, startAngle, arcAngle);
		// Paints an arc that is inscribed within a rectangle whose upper-left corner is
		// (x, y) and whose dimensions are the specified width and height.
		// The arc is drawn from startAngle to startAngle + arcAngle.
		
		// Paint an arc where the upper left corner of the rectangle that bounds it is
		// at (450, 425) and it has a width and length of 100.  Begin painting the arc
		// at 0 degrees. The arc should be painted for 1/4 of a circle in a positive direction.
		g.fillArc(450, 425, 100, 100, 0, 90);


		// Paint an arc where the upper left corner of the rectangle that bounds it is at (600, 425)
		// and it has a width and length of 100.  Begin painting the arc at 90 degrees.
		// The arc should be painted for 1/4 of a circle in a positive direction.
		g.fillArc(600, 100, 100, 100, 90, 90);

		// Paint an arc where the upper left corner of the rectangle that bounds it is at (700, 425)
		// and it has a width and length of 100.  Begin painting the arc at 180 degrees.
		// The arc should be painted for 1/4 of a circle in a positive direction.
		g.fillArc(700, 425, 100, 100, 180, 90);

		// Paint an arc where the upper left corner of the rectangle that bounds it is at (750, 425)
		// and it has a width and length of 100.  Begin painting the arc at 270 degrees.
		// The arc should be painted for 1/4 of a circle in a positive direction.
		g.fillArc(750, 425, 100, 100, 270, 90);

		// Paint an arc where the upper left corner of the rectangle that bounds it is at (700, 125)
		// and it has a width and length of 100.  Begin painting the arc at 0 degrees.
		// The arc should be painted for 1/2 of a circle in a positive direction.
		g.fillArc(700, 125, 100, 100, 0, 180);

		// Paint an arc where the upper left corner of the rectangle that bounds it is at (700, 225)
		// and it has a width and length of 100.  Begin painting the arc at 180 degrees.
		// The arc should be painted for 1/2 of a circle in a positive direction.
		g.fillArc(200, 225, 100, 100, 180, 180);

		// Constructing the color brown.  No code to write.
		Color brown = new Color (164, 84, 30);
		g.setColor(brown);


		// General Rule:  g.fillOval(x, y, width, height);
		// Paints an oval that is inscribed within a rectangle whose upper-left corner
		// is (x, y) and whose dimensions are the specified width and height.  To paint
		// a circle, make the width and height equal.

		// Paint a brown oval with upper left corner (600, 600) and bottom right
		// corner (780, 700)
		g.fillOval(600, 600, 180, 100);


		// Change the current color to black.
		g.setColor(Color.black);

		// General Rule:  g.drawOval(x, y, width, height);
		// Draws an oval that is inscribed within a rectangle whose upper-left corner
		// is (x, y) and whose dimensions are the specified width and height.  To draw
		// a circle, make the width and height equal.

		// Draw a black outline for the football
		g.drawOval(600, 600, 180, 100);

		// Change the current color to red.
		g.setColor(Color.red);

		// Draw "Go Cards!" in red in the middle of the brown football
		g.drawString("Go Cards!", 650, 650);

		// Change the current color to magenta
		g.setColor(Color.magenta);


		/* 
		 * General Rule:  g.fillPolygon(x, y, n);
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
		 */
		
		// Paint a polygon that is defined by the five points:
		// (50, 500), (90, 530), (130, 590), (100, 630), and (60, 565)

		

		// Change the current color to cyan
		

		// General Rules:   getWidth()  or getHeight() and g.drawString(str, x, y);
		// For example, if you wanted to find the location one-fourth of the way across
		// the window, you could use  getWidth() / 4  as a parameter.  You could also use
		// getHeight() / 4 to find the location 1/4 of the way down.
		// To draw the string "Java Rules" at this location in the applet window use ...
		// g.drawString("Java Rules", getWidth() / 4, getHeight() / 4);
		
		// Draw "Java Rules" to the middle of the screen using getWidth() and getHeight(). 
		g.drawString("Java Rules", getWidth() / 2, getHeight() / 2);

		// Using thde drawString() method, print the width and height of the current window
		// at the point (20, 20)  using the getWidth() and getHeight() methods.
		g.drawString("(" + getWidth() + "," + getHeight() + ")", 20, 20);

	}

}


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