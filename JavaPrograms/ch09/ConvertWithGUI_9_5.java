package ch09;

/* Example 9.5
	ConvertWithGUI_9_5.java
	The main view for a GUI-based temperature conversion 
	program that coverts from Fahrenheit to Celsius and back again.
 */

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class ConvertWithGUI_9_5 extends JApplet
{
	private static final long serialVersionUID = 1L;

	// >>>>>>> The model <<<<<<<<

	// Declare and intantiate the thermometer    
	Thermometer thermo = new Thermometer();

	// >>>>>>> The view <<<<<<<<

	// Declare and instantiate the window objects.
	JLabel titleLabel		= new JLabel("Temperature Converter Applet");
	JLabel fahrLabel        	= new JLabel("          Degrees Fahrenheit");
	JLabel celsiusLabel     	= new JLabel("          Degrees Celsius");         
	JTextField fahrField    	= new JTextField("32.0");  
	JTextField celsiusField 	= new JTextField("0.0");
	JButton fahrButton      	= new JButton("Convert >>>");
	// ADD A celsiusButton declaration here and make the name "<<< Convert"
	JButton celsiusButton 		= new JButton ("<<< Convert");

	
	
	public void init ()
	{
		// set the size of the applet
		resize(400, 130);
		
		// Set up panels to organize widgets and
		// add them to the window in the code below
		
		// declare title panel and add components
		JPanel titlePanel = new JPanel();
		titlePanel.add(titleLabel);
		
		// declare data panel and add components
		JPanel dataPanel = new JPanel(new GridLayout(2, 2, 12, 6));
		dataPanel.add(fahrLabel);
		dataPanel.add(celsiusLabel);
		dataPanel.add(fahrField);
		dataPanel.add(celsiusField);
		
		// declare button panel and add components
		JPanel buttonPanel = new JPanel();
		buttonPanel.add(fahrButton);
		// ADD THE CELSIUS BUTTON TO THE PANEL HERE
		buttonPanel.add(celsiusButton);
		
		// set up container and add panels
		Container container = getContentPane();
		container.add(titlePanel, BorderLayout.NORTH);
		container.add(dataPanel, BorderLayout.CENTER);
		container.add(buttonPanel, BorderLayout.SOUTH);
		
		// Attach a listener to the fahrenheit convert button 
		fahrButton.addActionListener(new FahrenheitListener()); 
		
		// ATTACH A LISTENER TO THE celsiusButton here
		celsiusButton.addActionListener(new CelsiusListener());
		
		
	}

	// >>>>>>> The controller <<<<<<<<

	private class FahrenheitListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			String input = fahrField.getText();       	// Obtain input
			double fahr = Double.parseDouble(input);  	// Convert to double
			thermo.setFahrenheit(fahr);               	// Reset thermometer
			double celsius = thermo.getCelsius();     	// Obtain Celsius
			celsiusField.setText("" + celsius);       	// output result
		}
	}

	private class CelsiusListener implements ActionListener
	{
		// COPY AND PASTE THE actionPerformed method above and modify so
		// that it will work properly to convert celsius values to fahrenheit.
		public void actionPerformed(ActionEvent e)
		{
			String input = celsiusField.getText();       	// Obtain input
			double celsius = Double.parseDouble(input);  	// Convert to double
			thermo.setCelsius(celsius);               		// Reset thermometer
			double fahr = thermo.getFahrenheit();     		// Obtain fahrenheit
			fahrField.setText("" + fahr);       			// output result
		}
		
	}

}


















