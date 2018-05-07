
// ConvertWithGUI_9_4.java
// Applet temperature conversion program that converts from
// Fahrenheit to Celsius.  Uses the Thermometer Model Class.

package ch09;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ConvertWithGUI_9_4 extends JApplet
{
	private static final long serialVersionUID = 1L;

	// >>>>>>> The model <<<<<<<<
	// Declare and instantiate the thermometer    
	Thermometer thermo = new Thermometer();

	// >>>>>>> The view <<<<<<<<
	// Declare and instantiate the GUI objects.
	JLabel titleLabel		= new JLabel("Temperature Converter Applet");
	JLabel fahrLabel        	= new JLabel("          Degrees Fahrenheit");
	JLabel celsiusLabel     	= new JLabel("          Degrees Celsius");         
	JTextField fahrField    	= new JTextField("32.0");  
	JTextField celsiusField 	= new JTextField("0.0");
	JButton fahrButton      	= new JButton("Convert >>>");

	
	public void init ()
	{
		// Establish the size of the applet
		resize(400, 130);
		
		// Construct the title panel and add titleLabel to it.
		JPanel titlePanel = new JPanel();
		titlePanel.add(titleLabel);
		
		// Construct the data panel and add the two identifying fields
		// and two JTextFields to it.  Set the panels layout to a
		// GridLayout with 2 rows and 2 columns with a horizontal gap
		// between columns of 12 and a vertical gap between rows of 6.
		JPanel dataPanel = new JPanel(new GridLayout(2, 2, 12, 6));
		dataPanel.add(fahrLabel);
		dataPanel.add(celsiusLabel);
		dataPanel.add(fahrField);
		dataPanel.add(celsiusField);
		
		// Construct the button panel and add fahrButton to it.
		JPanel buttonPanel = new JPanel();
		buttonPanel.add(fahrButton);
		
		// Get a container and add the panels to it.  For an Applet
		// program, the default layout is a BorderLayout.  Place each
		// one of the three panels in the appropriate region of the
		// BorderLayout.
		Container container = getContentPane();
		
		// add the titlePanel to the container in the NORTH region
		container.add(titlePanel, BorderLayout.NORTH);
		
		// add the dataPanel to the container in the CENTER region
		container.add(dataPanel, BorderLayout.CENTER);
		
		// add the titlePanel to the container in the SOUTH region
		container.add(buttonPanel, BorderLayout.SOUTH);
		
		// add just the fahrButton NOT the buttonPanel to the SOUTH region
		// that makes the button stretch the entire width of the SOUTH region 
		// and makes it look unnatural
		//container.add(fahrButton, BorderLayout.SOUTH);
		
		
		// Attach a listener to the fahrButton of type FahrenheitListener
		// so when the button is clicked the actionPerformed method of the
		// private inner class FahrenheitListener is executed.
		fahrButton.addActionListener(new FahrenheitListener()); 
	
	} // end of init method

	
	// >>>>>>> Private Inner Controller Class <<<<<<<<
	private class FahrenheitListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			// Get the input from the JTextField as a String
			String input = fahrField.getText();
			// Convert to String to a double using parsing
			double fahr = Double.parseDouble(input);
			// Set the fahrenheit & celsius temperatures of the Thermometer object
			thermo.setFahrenheit(fahr);
	     	// Retrieve the celsius temperature of the Thermometer object
			double celsius = thermo.getCelsius();
			// Use setText to erase the celsiusField and put the celsius temperature
			// in it.  Since celsius is a double variable, concatenate it to empty string
			// because the parameter must be a String.
			celsiusField.setText("" + celsius);
		}
	}
}












