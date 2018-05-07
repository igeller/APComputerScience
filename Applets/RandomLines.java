// FileName:  RandomLinesimport java.awt.Color;import java.awt.Font;import java.awt.Graphics;public class RandomLines extends SimpleAnimation{	private static final long serialVersionUID = 1L;	// The init() method is called when the applet is first started	// and is used to initialize the applet.	public void init()	{		resize(900, 675);		// The next line of code controls the speed of the animation.		// The parameter is the number of milliseconds.		// A parameter of 1000 creates a 1 second delay between animation frames.		setMillisecondsPerFrame(1);				// Set the background color of the applet to white.		setBackground(Color.white);	}	// Finish the code of the drawFrame so that every time this method is	// called it will construct and draw a new line whose color is totally	// random that has random end points. You will need to use the Color	// constructor, remembering that the Color constructor can receive	// integer values in the range of 0 to 255 inclusive.  When you construct	// a color all three color components (red, green, and blue) should have	// random values between 0 and 255.  Also, both end points of the line	// should be totally random.  Since the window is 900 wide and 675 high,	// all x values of a point should have a value between 0 and 900 inclusive	// and all y values of a point should have a value between 0 and 675 inclusive.	public void drawFrame(Graphics g)	{			// Write all your code for constructing and drawing a line with a random		// color and random end points here.		int red = (int)(Math.random()*256);		int green = (int)(Math.random()*256);		int blue = (int)(Math.random()*256);				Color randomColor= new Color (red, green, blue);		g.setColor(randomColor);				int x1 = (int) (Math.random()*901);		int y1 = (int) (Math.random()*676);		int x2 = (int) (Math.random()*901);		int y2 = (int) (Math.random()*676);				g.drawLine(x1, y1, x2, y2);																				// FINALLY FOLLOW THE INSTRUCTIONS HERE TO DRAW "Random Lines" IN		// THE MIDDLE OF THE APPLET WINDOW IN THE COLOR BLACK.  The words		// "Random Lines" should be in the plain font Times 36pt and should		// be centered exactly in the middle of the applet window.  See the		// link on our home page for changing the drawing font and size.		Font font1 = new Font("Times", Font.PLAIN, 36);		g.setFont(font1);				g.setColor(Color.black);				g.drawString("Random Lines", (getWidth()/2) - 110, getHeight()/2);					}  // end drawFrame()}  // end class RandomLines/*HERE IS THE LIST OF JAVA DRAWING AND PAINTING COMMANDS and INFORMATION.---------------------------------------------------------------------------g.setColor(Color.red);Sets the current color of the paint brush to draw or paint.  Whichever drawingor painting command comes next will draw or paint with this color.Here is the list of Java Color constants that can be used:Color.redColor.yellowColor.blueColor.orangeColor.pinkColor.cyanColor.magentaColor.blackColor.whiteColor.grayColor.lightGrayColor.darkGrayTo create a custom color, call the Color class constructor and pass it theappropriate RGB values (red, green, blue values) ...Color colorVariableName = new Color (R, G, B);For example, the color brown has the following RGB values:red = 164, green = 84, and blue = 30. So to construct brown use ...Color brown = new Color(164, 84, 30);then you would call setColor as follows:g.setColor(brown);//Note: DON'T TRY TO USE Color.brown in parentheses ( ).  It is not a constant!------------------------------------------------------------------------g.drawLine(x1, y1, x2, y2);Draws a line from (x1, y1) to (x2, y2)To draw a line from the point (10, 25) to the point (40, 55) use ...g.drawLine(10, 25, 40, 55);-------------------------------------------------------------------------g.drawRect(x, y, width, height);	Draws the outline of a rectangle whose upper-left corner is (x, y) and whosedimensions are the specified width and height.  To draw a rectangle withupper-left hand corner at the point (50,50) with a width of 200 and heightof 150 use ...g.drawRect(50, 50, 200, 150);-------------------------------------------------------------------------g.fillRect(x, y, width, height);Paints a rectangle whose upper-left corner is (x, y) and whose dimensionsare the specified width and height.  To paint a rectangle with upper-lefthand corner at the point (50,50) with a width of 200 and height of 150 use ...g.fillRect(50, 50, 200, 150);-------------------------------------------------------------------------g.clearRect(x, y, width, height);Erases a rectangular area whose upper-left corner is (x, y) and whosedimensions are the specified width and height with the current backgroundcolor.  To erase the rectangular area with an upper left hand corner of(10, 25) that has a width of 40 pixels and a height of 30 pixels use ...g.clearRect(10, 25, 40, 30);-------------------------------------------------------------------------g.drawRoundRect(x, y, width, height, arcWidth, arcHeight);	Draws the outline of a rounded rectangle whose upper-left corner is (x, y)and whose dimensions are the specified width and height.  The arcWidthand arcHeight values control how much the corners are rounded.  To makethe corners perfectly rounded (symmetrical) make these last two valuesthe same number.  For example, to draw a rounded-rectangle with anupper-left corner positioned at the point (40, 40) that has a width of 75and a height of 35 and an arcWidth and arcHeight of 5 use ...g.drawRoundRect(40, 40, 75, 35, 5, 5);-------------------------------------------------------------------------g.fillRoundRect(x, y, width, height, arcWidth, arcHeight);		Paints a rounded rectangle whose upper-left corner is (x, y) and whosedimensions are the specified width and height.  The arcWidth and arcHeightvalues control how much the corners are rounded.  To make the cornersperfectly rounded (symmetrical) make these last two values the same number.For example, to paint a rounded-rectangle with an upper-left cornerpositioned at the point (40, 40) that has a width of 75 and a height of 35and an arcWidth and arcHeight of 5 use ...g.fillRoundRect(40, 40, 75, 35, 5, 5);-------------------------------------------------------------------------g.drawOval(x, y, width, height);Draws the outline of an oval that is inscribed within a rectangular area whoseupper-left corner is (x, y) and whose dimensions are the specified widthand height.  To draw a circle, make the width and height equal. For example,to draw an oval with upper-left corner at the point (10, 25) and a width of 50and a height of 25 use ...g.drawOval(10, 25, 50, 25);-------------------------------------------------------------------------g.fillOval(x, y, width, height);Paints an oval that is inscribed within a rectangular area whose upper-leftcorner is (x, y) and whose dimensions are the specified width and height.To draw a circle, make the width and height equal. For example, to paint anoval with upper-left corner at the point (10, 25) and a width of 50 and aheight of 25 use ...g.fillOval(10, 25, 50, 25);-------------------------------------------------------------------------g.drawArc(x, y, width, height, startAngle, arcAngle);		Draws the outline of an arc that is inscribed within a rectangle whoseupper-left corner is (x, y) and whose dimensions are the specified widthand height.  The arc is drawn from startAngle to startAngle + arcAngle.The angles are expressed in degrees.  A startAngle of 0 indicates the3 o'clock position.  A positive arc indicates a counterclockwise rotation,and a negative arc indicates a clockwise rotation from 3 o'clock.  Forexample, to draw an arc whose upper-left corner is (10, 25) and whoserectangular area has a width of 50 and a height of 50 with a starting angleof 0 sweeping for 90 degrees use ...g.drawArc(10, 25, 50, 50, 0, 90);-------------------------------------------------------------------------g.fillArc(x, y, width, height, startAngle, arcAngle);Paints an arc that is inscribed within a rectangle whose upper-left corneris (x, y) and whose dimensions are the specified width and height.  The arcis drawn from startAngle to startAngle + arcAngle.  The angles are expressedin degrees.  A startAngle of 0 indicates the 3 o'clock position.  A positivearc indicates a counterclockwise rotation, and a negative arc indicates aclockwise rotation from 3 o'clock.  For example, to paint an arc whoseupper-left corner is (10, 25) and whose rectangular area has a width of 50and a height of 50 with a starting angle of 0 sweeping for 90 degrees use ...g.fillArc(10, 25, 50, 50, 0, 90);-------------------------------------------------------------------------g.drawPolygon(x, y, n);Draws an n-sided polygon where x and y have already been defined as listsin lines of code prior to the command.The following line defines a list named x that will hold all of the x values(abscissas) of the points of the polygon.int x [ ] = {x1, x2, x3, .... }; The following line defines a list named y that will hold all of the y values(ordinates) of the points of the polygon.int y [ ] = {y1, y2, y3, .... };So, to draw the pentagon defined by the 5 points:(10, 25) , (40, 25) , (60, 50) , (30, 60) , (40, 40)  use ...int x [ ] = {10, 40, 60, 30, 40};int y [ ] = {25, 25, 50, 60, 40};g.drawPolygon(x, y, 5);  // The number is 5 because it is a pentagon.-------------------------------------------------------------------------g.fillPolygon(x, y, n);Paints an n-sided polygon where x and y have already been defined as listsin lines of code prior to the command.The following line defines a list named x that will hold all of the x values(abscissas) of the points of the polygon.int x [ ] = {x1, x2, x3, .... }; The following line defines a list named y that will hold all of the y values(ordinates) of the points of the polygon.int y [ ] = {y1, y2, y3, .... };For example, to paint a pentagon by connecting the points:(10, 25) , (40, 25) , (60, 50) , (30, 60) , (40, 40)  useint x [ ] = {10, 40, 60, 30, 40};int y [ ] = {25, 25, 50, 60, 40};g.fillPolygon(x, y, 5);  // The number is 5 because it is a pentagon.-------------------------------------------------------------------------g.drawString(str, x, y);Draws the String value stored in the String variable str at the point (x, y)starting at the position of the base line of the first character in str.To draw the words "Java Rules" beginning at the point (10, 50), then use ...g.drawString("Java Rules", 10, 50);-------------------------------------------------------------------------getWidth()Call this method without any object to get the width in pixels of the panel.When calling this method do not put g and a dot before it.getHeight()Call this method without any object to get the height in pixels of the panel.When calling this method do not put g and a dot before it.For example, if you wanted to find the location one-fourth of the way acrossthe window, you could use  getWidth() / 4  as a parameter.  You could also usegetHeight() / 4 to find the location 1/4 of the way down.To draw the string "Java Rules" at this location in the applet window use ...g.drawString("Java Rules", getWidth() / 4, getHeight() / 4);-------------------------------------------------------------------------THE END. */