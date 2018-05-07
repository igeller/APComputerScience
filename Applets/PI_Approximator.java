// PI Appoximator Applet Program
// Chapter 9

/*
 	We are NOT using Math.PI in this program!!!

	1.  First run the PI Approximator Applet program on line by going to
	our class home page and clicking on the link for it.  Try entering the
	following input in the iterations field and view the output:

		1
		2
		3
		10
		100
		1000
		1000000
		-5
		asdf

	2.  Note how the GUI is set up in the applet.  You will want to duplicate
	this layout in your program.  Begin by writing the code to declare the
	different GUI components ... labels, fields, and button.  Follow the example
	in the GUIWindow_9_5.java file that you recently completed.  Declare and
	instantiate all of the components globally.  Use the following variable names
	for your components:

		instructionsLabel					termsField
		termsLabel							answerField
		answerLabel							computeBtn

	3.  Next, write the code for the init() method and use a similar design
	approach for the layout as used in ConvertWithGUI_9_4, 9_5, or 9_6.java.
	Construct the panels listed below and place the following components in
	the panels and regions as follows:

	instructionsLabel goes in the instructionsPanel in the north region of
	the borderLayout
	
	termsLabel, answerLabel, termsField, and answerField all go in the
	dataPanel in the center region
	
	the computeButton goes in the buttonPanel in the south region of
	the borderLayout, 

	Once the panels have the components placed in them,
	then add the panels to the correct region of the container.


	4. Add a listener for the computeBtn.  You are now done with the init() method.
	Run the program and view the layout.

	5. Write the code for the private inner class named ComputeListener.
	Use the private inner class FahrenheitListener or CelsiusListener as a guide.
	To protect against invalid input, you will use a try-catch statement.
	You will call the method computePi() inside the try clause.  The catch clause
	will call the JOptionPane.showMessageDialog method and output the message
	"Bad number format".

	NOTE:  terms is an integer but the approximation of π is a double.
	You will need to read the number of terms from the GUI and pass it
	to the computePi() method so it can do its work.
		
	When outputting the value of π to the GUI, use a String.format statement
	with a format specifier of "%18.16f".


	6. Write the computePi() method.  Here is the background information you
	need to read so you will know how to calculate π:

	The German mathematician Gottfried Leibniz developed the following method
	to approximate the value of π.  The formula is based on an infinite series
	derived from higher mathematics.

	Formula:  π/4 = 1 - 1/3 + 1/5 - 1/7 + ...

	This could be transposed algebraically to π = 4 x (1 - 1/3 + 1/5 - 1/7 + ...)	

	This program will allow the user to compute PI to a specified number of terms.
	The number of terms entered by the user in the GUI will be passed to the method
	computePI and it will be used to control the number of times the loop will run.
	The method signature of computePI is the following:

	public double computePi (int terms)

	Specifications of local variables inside the computePI method:

		Use the loop control variable cntr to control how many times the loop runs.
		Use the variable numerator to refer to the numerator of a term.
		Use the variable denominator to refer to the denominator of a term.
		Use the variable term to refer to a calculated term.
		Use the variable pi to hold the calculated value of π.
   
	7.  You should get the following output when running the program for the
	specified number of iterations:

	Terms			Approximation of π
		1				4.0
		2				2.6666666666666670
		3				3.4666666666666670
		10				3.0418396189294032
		100			3.1315929035585537
		1000			3.1405926538397940
		1000000		3.1415916535897743
		-5				Message Box = "The number of terms must be greater than 0!"
		asdf			Message Box = "Bad Number Format!"
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;

public class PI_Approximator extends JApplet
{
	private static final long serialVersionUID = 1L;
	
	// Declare and Construct the GUI Components
	JLabel instructionsLabel 	= new JLabel ("					Enter the number of terms and then click the compute button.");					
	JTextField termsField		= new JTextField ("1");
	JLabel termsLabel			= new JLabel ("					Number of terms (an integer > 0)");
	JTextField answerField		= new JTextField ("");
	//JLabel answerLabel			= new JLabel ("Approximation of \u03C0");
	JButton computeBtn			= new JButton ("Compute \u03C0");
	
	// Students with Mac use Option p to give the π symbol
	//JLabel answerLabel = new JLabel("Approximation of π");
	
	// Students with Window machines can use the code  "\u03C0" to produce π
	JLabel answerLabel = new JLabel("Approximation of \u03C0");
	
	
	public void init ()
	{
		resize(500, 120);
		
		//constructitle panel (go to north region)
		JPanel instructionsPanel = new JPanel();
		instructionsPanel. add(instructionsLabel);
		
		//constructing the data panel (go to center region)
		JPanel dataPanel = new JPanel(new GridLayout(2, 2, 12, 6));
		dataPanel.add(termsLabel);
		dataPanel.add(answerLabel);
		dataPanel.add(termsField);
		dataPanel.add(answerField);
		
		//constructing button panel (go to south region)
		JPanel buttonPanel = new JPanel();
		buttonPanel.add(computeBtn);
		
		//setting the panels to regions
		Container container = getContentPane();
		container.add(instructionsPanel, BorderLayout.NORTH);
		container.add(dataPanel, BorderLayout.CENTER);
		container.add(buttonPanel, BorderLayout.SOUTH);
		
		//listener for button
		computeBtn.addActionListener(new ComputeListener());
	
	}//end of init method

	/*
	Complete the computePi method below.  The method signature is done for you.
	Calculate the approximation of π using a while loop with the loop control
	variable cntr and the other variables numerator, denominator, terms, and
	pi.  The value of terms (the formal parameter) is the number of iterations
	of the loop.  (The number of times the loop runs.)  Consider carefully what
	the starting values for numerator, denominator, and pi should be.  You may wish
	to use another variable term to hold the calculated value of each term in the
	sequence.
	*/
	public double computePi (int terms)
	{			
		double numerator = 1;
		double denominator = 1;
		int cntr = 1;
		double term= 0.0;
		double pi = 0.0;		
		
		while (cntr <= terms)
		{
			if (cntr %2 == 0)
			{
				term = -(numerator /denominator);
			}
			else
			{
				term = (numerator / denominator);
			}
			pi += term;
	
			cntr++;
			denominator += 2;
			
		}
		
		return 4.0*pi;  // temporary stub return value
	} // end computePi
	
	

	/*
	 Write the code for the private inner class named ComputeListener.
	Use the private inner class FahrenheitListener or CelsiusListener as a guide.
	To protect against invalid input, you will use a try-catch statement.
	You will call the method computePi() inside the try clause.  The catch clause
	will call the JOptionPane.showMessageDialog method and output the message
	"Bad number format".

	NOTE:  terms is an integer but the approximation of π is a double.
	You will need to read the number of terms from the GUI and pass it
	to the computePi() method so it can do its work.
		
	When outputting the value of π to the GUI, use a String.format statement
	with a format specifier of "%18.16f".
	*/
	// >>>>>>> The controller class <<<<<<<<
	private class ComputeListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			try
			{
				String input = termsField.getText();
				int terms = Integer.parseInt(input);
				if (terms > 0.0)
				{
					double pi = computePi(terms);
					String s = String.format("%18.16f", pi);
					answerField.setText(""+s);
				}
				else
				{
					JOptionPane.showMessageDialog(PI_Approximator.this, "The number must be greater than 0!", "\u03C0 Approximator", 
							JOptionPane.ERROR_MESSAGE);
					termsField.setText("");
					answerField.setText("");
				}
			}
			catch (Exception ex)
			{
				JOptionPane.showMessageDialog(PI_Approximator.this, "Bad number format", "\u03C0 Approximator", 
						JOptionPane.ERROR_MESSAGE);
				termsField.setText("");
				answerField.setText("");
			}
			
			
			
			
			
			

			
			
			
			
			
		}
	}
}









