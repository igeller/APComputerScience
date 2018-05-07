package ch09;

// The Thermometer model class.  A small 
public class Thermometer
{
	private double degreesCelsius;

	// Java will provide a default constructor!
	
	public double getCelsius()
	{
		return degreesCelsius;
	}

	public double getFahrenheit()
	{
		return degreesCelsius * 9.0 / 5.0 + 32.0;
	}
	
	public void setCelsius(double degrees)
	{
		degreesCelsius = degrees;
	}

	public void setFahrenheit(double degrees)
	{
		degreesCelsius = (degrees - 32.0) * 5.0 / 9.0;
	}

} // end of class
