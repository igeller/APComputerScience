package ch09;

/* 
	ConvertWithGUI_9_6.java
	The main view for a GUI-based temperature conversion 
	program that coverts from Fahrenheit to Celsius and back again.

	Note:  this program displays repeating decimals and other decimals
	in a field width of 17 spaces including the dot unless a temperature
	converts "evenly" as in 32F to 0C.
	Therefore this is a good place to practice the use of String.format 
	and the "," comma flag to display the commas in large numbers.
 */

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class ConvertWithGUI_9_6 extends JApplet
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
	JButton celsiusButton   	= new JButton("<<< Convert");


	public void init()
	{
		resize(400, 130);
		// Set up panels to organize widgets and add them to the window

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
		buttonPanel.add(celsiusButton);

		// set up container and add panels
		Container container = getContentPane();
		container.add(titlePanel, BorderLayout.NORTH);
		container.add(dataPanel, BorderLayout.CENTER);
		container.add(buttonPanel, BorderLayout.SOUTH);

		// Attach a listener to the convert button
		fahrButton.addActionListener(new FahrenheitListener()); 
		celsiusButton.addActionListener(new CelsiusListener()); 
	}

	// >>>>>>> The controllers <<<<<<<<
	private class FahrenheitListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			try{
				String input = fahrField.getText();       	// Obtain input
				double fahr = Double.parseDouble(input);  	// Convert to double
				if (fahr >= -459.67)
				{
					thermo.setFahrenheit(fahr);        			// Reset thermometer
					double celsius = thermo.getCelsius();     	// Obtain Celsius
					String s = String.format("%,15.5f", celsius);
					celsiusField.setText(s);   					// Output result
				}
				else
				{
					JOptionPane.showMessageDialog(ConvertWithGUI_9_6.this, 
							"Impossible!  That number is below absolute zero",
							"Temperature Converter",
							JOptionPane.ERROR_MESSAGE);
					fahrField.setText("");  
					celsiusField.setText(""); 
				}
			}catch(Exception ex){
				JOptionPane.showMessageDialog(ConvertWithGUI_9_6.this, 
						"Bad number format",
						"Temperature Converter",
						JOptionPane.ERROR_MESSAGE);
				fahrField.setText("");  
				celsiusField.setText(""); 
			}
		}
	}

	// Complete the actionPerformed method below by adding a try-catch statement 
	// with an if-else statement inside the try branch to protect the program 
	// against celsius values entered below -273.16 or bad number input like Strings.
	// Use the FahrenheitListener class above as an example of how to do this.
	// Finally, make sure you format the fahrenheit output using a String.format
	// statement, like the code in the FahrenheitListener class.
	private class CelsiusListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{			
			try
			{
				String input = celsiusField.getText();        // Obtain input
				double celsius = Double.parseDouble(input);   // Convert to double
				if(celsius <= 273.15)
				{
					thermo.setCelsius(celsius);                	 // Reset thermometer
					double fahr = thermo.getFahrenheit();         // Obtain Fahrenheit
					String f = String.format("%,15.5f", fahr);
					fahrField.setText(f);
				}
				else 
				{
					JOptionPane.showMessageDialog(ConvertWithGUI_9_6.this, 
							"Impossible!  That number is below absolute zero",
							"Temperature Converter",
							JOptionPane.ERROR_MESSAGE);
					fahrField.setText("");  
					celsiusField.setText(""); 
				}
			}
			catch (Exception ex)
			{
				JOptionPane.showMessageDialog(ConvertWithGUI_9_6.this, 
						"Bad number format",
						"Temperature Converter",
						JOptionPane.ERROR_MESSAGE);
				fahrField.setText("");  
				celsiusField.setText(""); 
			}
		}
	}

}
