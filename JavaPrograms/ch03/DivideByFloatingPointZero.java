// FileName:  DivideByFloatingPointZero.java
// This program shows that Java will calculate division
// by 0 or 0.0 into a double value like 3.0.  The answer
// will be infinity.  If you have studied this in higher
// math courses like Calculus, then you know the answer
// is infinity.
// Run this program and view the output.

package ch03;

public class DivideByFloatingPointZero
{
	public static void main (String [] args)
	{
		double quotient;
		double divisor = 0.0;
		quotient = 3.0 / divisor;
		System.out.println ("The value of quotient is  " + quotient);
		System.out.println ("10 / " + divisor + " equals " + 10 / divisor);
	}
}
