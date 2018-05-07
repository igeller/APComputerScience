
// FileName:  PennyPitch.java  ... uses Square.java
// Author:  

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;



public class PennyPitch2 extends JApplet implements ActionListener
{
	private static final long serialVersionUID = 1L;

	// GLOBAL VARIABLE DECLARATIONS
	Square [ ] [ ] board;
	int totalPoints;
	int turnsLeft;

	// Declaration and Instantiation of GUI components.
	JLabel totalPointsLabel = new JLabel("Total Points");
	JLabel turnsLabel = new JLabel("Turns Left");
	JTextField totalPointsField = new JTextField();
	JTextField turnsField = new JTextField();
	JButton tossButton = new JButton("Toss");
	JButton resetButton = new JButton("Reset");
	JTextArea output = new JTextArea(20, 36);  // 10 rows & 20 cols (more cols may be needed for PCs)

	// NO CODE TO WRITE IN THIS METHOD
	public void init()
	{
		
		resize(600, 600);  // PC laptops may need to tweak figures

		JPanel dataPanel = new JPanel (new GridLayout(2,2, 10, 5));
		dataPanel.add(totalPointsLabel);
		dataPanel.add(totalPointsField);
		dataPanel.add(turnsLabel);
		dataPanel.add(turnsField);

		JPanel buttonPanel = new JPanel(new GridLayout(2, 1));
		buttonPanel.add(tossButton);
		buttonPanel.add(resetButton);

		JPanel textPanel = new JPanel();
		textPanel.add(output);
		output.setBackground(Color.yellow);
		output.setForeground(Color.red);

		totalPointsField.setEditable(false);
		turnsField.setEditable(false);
		output.setEditable(false);

		Container container =getContentPane();
		container.setLayout(new FlowLayout());
		container.add(dataPanel);
		container.add(buttonPanel);
		container.add(textPanel);

		tossButton.addActionListener(this);
		resetButton.addActionListener(this);

		// We will call the initGame() method here when program initially loads
		// and in the actionPerformed() method when a game is reset.
		initGame();  
	}



	/*
	Complete the initGame method below by doing the following:

	1) Initialize the global variables turnsLeft and totalPoints to the values
	   they should have when the applet loads or when a new game is started. The
	   turnsField and the totalPointsField should also be set to their initial values

	2) The variable board has already been declared globally at the top of this
	   file.  So all you need to do is construct it as a two-dimensional array
	   of Square objects.  DO NOT REDECLARE BOARD!!!

	3) Construct all Square objects to be placed in the board with the correct values
		based on the values seen in the online key program and be sure and place them
		in board in the correct memory location.

	4) Finally, call the displayBoard() method so the board is initially displayed.
	
	5) NOTE:  failing to place a validly constructed Square object in any location
				 of the board will cause a NullPointerException.
	 */
	private void initGame()
	{
		//1
		turnsLeft = 40;
		totalPoints = 0;
		totalPointsField.setText("0");
		turnsField.setText("40");
		
		//2
		board = new Square[10][10];
		
		//3
		for (int row = 0; row < board.length; row++)
		{
			for(int col = 0; col < board[row].length; col++)
			{
				board[row][col]=  new Square ("" + (int)(Math.random()*9 +1), false);
			}	
		}
		displayBoard();
	}


	// The only difference in the method below from a method that prints all the values
	// in a two-dimensional array, like ones in of our previous programs, is that 
	// THERE ARE NO System.out.println()  OR System.out.printf() statements!
	// Instead of a line of code like:		System.out.printf("%9s", ???);
	// You will use:    String s = String.format("%9s", ???); followed by ...
	//					output.append(s);
	// Finish this method so that all values in the two-dimensional board are
	// properly displayed in the JTextArea named output.  You must use String.format
	// utilizing right justification with a field width of 9.  (This could end up
	// being adjusted for PC computers.)  Print a blank line between every row of
	// text output.  DON'T FORGET:  output.setText() erases everything and then writes
	// text to output.  output.append() adds text to output without erasing anything.
	// output.setText("\n");  erases everything in output and then outputs a blank line.
	// output.append("\n\n");  adds two blank lines to output without erasing anything.
	// After the initial erasing of the board below, DO NOT USE SETTEXT ... USE APPEND!
	// YOU MUST USE A NESTED ENHANCED FOR LOOP (FOR EAC LOOP) IN THIS METHOD to output
	// the Square's value!!!
	private void displayBoard()
	{
		// start by erasing the entire output window
		output.setText("\n\n");

		// Use a nested enhanced for loop (for each loop) structure to output the values
		// of all squares in each row and column of the board.  The initial output as the
		// game starts will look like what is below.  However, don't use statements like
		// 	output.append("1");  output.append("2");  output.append("3");  in your code.
		// First, access the value of the Square object by calling the correct accessor
		// method inside of a String.format statement and then append it correctly to 
		// output, making sure that all values are displayed in rows and columns.
		/*
        			1        1        1        1        1

        			1        2        2        2        1

        			1        2        3        2        1

        			1        2        2        2        1

        			1        1        1        1        1
		 */
		// WRITE ALL OF YOUR CODE FOR THIS METHOD BELOW THIS LINE.
		
		//String s = "";
		for (Square [] row: board)
		{
			for (Square element: row)
			{
				String s = String.format("%11s", element.getValue()); 
				output.append(s);
			}
			output.append("\n\n");
		}
		
		
		
		
		

	}


	// The actionPerformed method below processes the actions of the two buttons
	// in the game in the two main branches of the extended-if statement.
	//
	// The resetButton should work any time during the game if it is clicked,
	// so the user can restart the game immediately.
	//
	// The tossButton is the button that controls the operation of the game.
	// This is the most important part of the program and you should be able
	// to do it based on knowing how the online version works.  If you can't
	// figure out what to do then you can buy expanded instructions for 8 raw points.
	//
	// This method has a final branch if (turnsLeft == 0) not connected to the
	// extended-if that checks to see if the game is over.  After a click of
	// the tossButton if there are no turns left, JOptionPane message box should
	// display "Game Over!" and "Score: 15" (or whatever the final score is).
	// When the user clicks OK in the message box, a new game should be
	// automatically set up.  
	public void actionPerformed(ActionEvent e) 
	{
		int r = 0;
		int c = 0;
		int x = 0;
		String newVal = "";
		if (e.getSource() == resetButton)
		{
			initGame();
		}
		else if (e.getSource()== tossButton)
		{
			
			r = (int)(Math.random()*5);
			c = (int)(Math.random()*5); 
		
			if (board[r][c].getChosen() == false)
			{
				x = Integer.parseInt(board[r][c].getValue());
				totalPoints += x;
				totalPointsField.setText("" + totalPoints);
				board[r][c].setValue("P");
				displayBoard();
				board[r][c].setChosen(true);
			}
						
			turnsLeft--;
			turnsField.setText("" + turnsLeft);
		}

		if (turnsLeft == 0)
		{
			JOptionPane.showMessageDialog(PennyPitch2.this, 
					"Game Over!\n Score: " + totalPoints,
					"PennyPitch", JOptionPane.INFORMATION_MESSAGE
					);
			initGame();
		}	

	} // end actionPerformed method - DO NOT ERASE THIS BRACE!


} // end PennyPitch class  - DO NOT ERASE THIS BRACE!

