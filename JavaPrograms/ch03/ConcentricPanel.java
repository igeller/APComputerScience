// Concentric Bonus Program.
// ConcentricPanel.java

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;

public class ConcentricPanel extends JPanel
{
	// constructor
	public ConcentricPanel(Color color)
	{
		setBackground(color);
	}

	/* 
	 This method paints a white isosceles triangle inside a blue oval inside of a red rectangle.

		The white isosceles triangle is inscribed inside the blue oval, and the blue oval is inscribed 
		inside of the  red rectangle.  See the online applet key to see how it should be painted.
	
		The three figures will be always located in the center of the window.
		To guarantee its position, you will make use of Java's getWidth() and getHeight() methods
		that always report the width and height of the window no matter how large the window is.
		This will allow the user to resize the window and the three figures should remain inscribed
		as described above in the center of the window but with a different size.  Try resizing the 
		window for the online applet and watch what happens.
		
		Also, you will use getWidth() and getHeight() to determine how big the rectangle, oval and
		triangle are at any moment in time.
		
		Note:  WHENEVER AN APPLET IS RESIZED, IT IS AUTOMATICALLY REPAINTED.
		
		READ THE FOLLOWING VERY CAREFULLY:
		
		The width of the red rectangle should always be one-half of the width of the window.
		The height of the red rectangle should always be one-half of the height of the window.		
		The same is true for the blue oval.  This makes sense since it is inscribed in the rectangle.
		
		The base of the white triangle should always be one-half of the width of the window.
		The altitude of the white triangle should be ONE-HALF OF THE HEIGHT OF THE 
		RECTANGLE ... NOT THE WINDOW.
	 */

	public void paintComponent (Graphics g)
	{
		super.paintComponent(g);	   	// This erases the panel and prepares it for drawing and painting.

		 // WRITE ALL OF YOUR CODE HERE!
		
		
	}

}

/*
Here is a listing of Java drawing commands and how to use them.

GENERAL FORM									DESCRIPTION AND EXAMPLE

g.drawLine(x1, y1, x2, y2);				Draws a line from (x1, y1) to (x2, y2)
															To draw a line from the point (10, 25) to the point (40, 55) use ...

															g.drawLine(10, 25, 40, 55);


g.drawRect(x, y, width, height);		Draws the outline of a rectangle whose upper-left corner is (x, y)
															and whose dimensions are the specified width and height.
															To draw a rectangle with upper-left hand corner at the point (50,50)
															with a width of 200 and height of 150 use ...

															g.drawRect(50, 50, 200, 150);


g.fillRect(x, y, width, height)	;			Paints a rectangle whose upper-left corner is (x, y)
															and whose dimensions are the specified width and height.
															To paint a rectangle with upper-left hand corner at the point (50,50)
															with a width of 200 and height of 150 use ...

															g.fillRect(50, 50, 200, 150);


g.clearRect(x, y, width, height);		Erases a rectangular area whose upper-left corner is (x, y) and whose 
															dimensions are the specified width and height with the current 
															background color.

															g.clearRect(10, 25, 40, 30);


g.drawRoundRect(x, y, width, height, arcWidth, arcHeight);	

															Draws the outline of a rounded rectangle whose upper-left corner is (x, y)
															and whose dimensions are the specified width and height.  The arcWidth
															and arcHeight values control how much the corners are rounded.  To make
															the corners perfectly rounded (symmetrical) make these last two values
															the same number.  For example, to draw a rounded-rectangle with an
															upper-left corner positioned at the point (40, 40) that has a width of 75
															and a height of 35 and an arcWidth and arcHeight of 5 use ...

															g.drawRoundRect(40, 40, 75, 35, 5, 5);


g.fillRoundRect(x, y, width, height, arcWidth, arcHeight);		

															Paints a rounded rectangle whose upper-left corner is (x, y) and whose
															dimensions are the specified width and height.  The arcWidth
															and arcHeight values control how much the corners are rounded.  To make
															the corners perfectly rounded (symmetrical) make these last two values
															the same number.  For example, to paint a rounded-rectangle with an
															upper-left corner positioned at the point (40, 40) that has a width of 75
															and a height of 35 and an arcWidth and arcHeight of 5 use ...

															g.fillRoundRect(40, 40, 75, 35, 5, 5);


g.drawOval(x, y, width, height);		Draws the outline of an oval that fits within a rectangular area whose
															upper-left corner is (x, y) and whose dimensions are the specified width
															and height.  To draw a circle, make the width and height equal. For example,
															to draw an oval with upper-left corner at the point (10, 25) and a width of 50
															and a height of 25 use ...

															g.drawOval(10, 25, 50, 25);

g.fillOval(x, y, width, height);			Paints an oval that fits within a rectangular area whose upper-left corner is
															(x, y) and whose dimensions are the specified width and height.  To draw a
															circle, make the width and height equal. For example, to paint an oval with
															upper-left corner at the point (10, 25) and a width of 50 and a height of 25 use ...

															g.fillOval(10, 25, 50, 25);


g.drawArc(x, y, width, height, startAngle, arcAngle);		

															Draws the outline of an arc that fits within a rectangle whose upper-left
															corner is (x, y) and whose dimensions are the specified width and height.
															The arc is drawn from startAngle to startAngle + arcAngle.  The angles
															are expressed in degrees.  A startAngle of 0 indicates the 3 o'clock position.
															A positive arc indicates a counterclockwise rotation, and a negative arc 
															indicates a clockwise rotation from 3 o'clock.  For example, to draw an arc
															whose upper-left corner is (10, 25) and whose rectangular area has a width
															of 50 and a height of 50 with a starting angle of 0 sweeping for 90 degrees use ...

															g.drawArc(10, 25, 50, 50, 0, 90);


g.fillArc(x, y, width, height, startAngle, arcAngle);

															Paints an arc that fits within a rectangle whose upper-left
															corner is (x, y) and whose dimensions are the specified width and height.
															The arc is drawn from startAngle to startAngle + arcAngle.  The angles
															are expressed in degrees.  A startAngle of 0 indicates the 3 o'clock position.
															A positive arc indicates a counterclockwise rotation, and a negative arc 
															indicates a clockwise rotation from 3 o'clock.  For example, to paint an arc
															whose upper-left corner is (10, 25) and whose rectangular area has a width
															of 50 and a height of 50 with a starting angle of 0 sweeping for 90 degrees use ...

															g.fillArc(10, 25, 50, 50, 0, 90);


 g.drawPolygon(x, y, n);					Draws an n-sided polygon where x and y have already been defined in lines
 															of code prior to the command ...

 															int x [ ] = {x1, x2, x3, .... };
 															int y [ ] = {y1, y2, y3, .... };

 															For example, to draw a pentagon by connecting the points:
 															(10, 25) , (40, 25) , (60, 50) , (30, 60) , (40, 40)  use

 															int x [ ] = {10, 40, 60, 30, 40};
 															int y [ ] = {25, 25, 50, 60, 40};

 															g.drawPolygon(x, y, 5);


g.fillPolygon(x, y, n);							Paints an n-sided polygon where x and y have already been defined in lines
 															of code prior to the command ...

 															int x [ ] = {x1, x2, x3, .... };
 															int y [ ] = {y1, y2, y3, .... };

 															For example, to paint a pentagon by connecting the points:
 															(10, 25) , (40, 25) , (60, 50) , (30, 60) , (40, 40)  use

 															int x [ ] = {10, 40, 60, 30, 40};
 															int y [ ] = {25, 25, 50, 60, 40};

 															g.fillPolygon(x, y, 5);


 g.setColor(Color.???);						Sets the current color which will be drawn or painted with the next command.
 															Inside the parentheses ( ) you must use one of he following Java Color constants:

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

Alternative way to use setColor		Construct a new color using RGB values and then use that color instead of a 
															color constant.   For example, the color brown has the following RGB values ...
 									 						red = 164, green = 84, and blue = 30. 

 									 						To construct a new color follow the rule:
 									 						Color colorName = new Color (R, G, B);

 									 						So to construct brown use
 															Color brown = new Color(164, 84, 30);

 															then you would call setColor as follows:

 															g.setColor(brown);

 															// Note: DON'T TRY TO USE Color.brown in parentheses ( )


g.drawString(str, x, y);						Draws the string str at the point (x, y) starting at the position of the 
															base line of the first character in str.  To draw the words "Java Rules"
															at the point (10, 50), then use ...

															g.drawString("Java Rules", 10, 50);

 setBackground(c);								Sets the entire background color of the applet window.  Normally not used.
															Don't use g when coding this command.

															setBackground(Color.gray);
 */