package ch03;

/* FileName:  IncomeTaxCalculator.java
	This program works as it is and computes a person's income tax.
	In this program you will use constants, learn about adding a
	reader.nextLine(); statement to consume a new line character,
	and learn how to write methods that are void or return a value.	
 */


import java.util.Scanner;

public class IncomeTaxCalculator
{	
	// Global Variable and Constant Declaration area here just below the
	// class declaration line and not inside any method. 
	static final double TAX_RATE = 0.20; 		//THE CONVENTION SAYS TO WRITE THE CONSTANT VARIABLES IN CAPS 
	static final double STANDARD_DEDUCTION = 10000.0;
	static final double DEPENDENT_DEDUCTION = 2000.0;
	
	
	
	public static void main (String [] args)
	{
		// First, run the program as it is.
		
		// Constant declarations for the main method. CONSTANT - a variable that can't change its value
		
		// Second, move the constant declarations on the next few lines above the
		// main() method so they are global.  This means they will be available
		// anywhere in the program without passing them to any method.
		// AFTER MOVING THEM, add the words public static immediately in front of
		// the word final in each constant declaration.
		
		Scanner reader = new Scanner (System.in);

		double grossIncome;			// the gross income (input)
		int numDependents;				// the number of dependents (input)
		double taxableIncome;			// the taxable income (calculated)
		double incomeTax;				// the income tax (calculated and output) 
		String name = "";				// the name of the person being taxed

		// Request the inputs
		System.out.print ("Enter the gross income: ");
		grossIncome = reader.nextDouble();
		System.out.print ("Enter the number of dependents: ");
		numDependents = reader.nextInt();
		reader.nextLine();
		System.out.print ("Enter your full name: ");
		name = reader.nextLine();
		System.out.println(name + ", here is the income tax you need to pay.");
		// FIX THE ABOVE SEGMENT OF CODE SO THAT INPUT FOR THE NAME ISN'T SKIPPED!
		// BE SURE AND DO THIS BEFORE WORKING ON ANYTHING BELOW.
	
		
		
		// MAKE SURE YOU HAVE FIXED THE AVOVE BEFORE CONTINUING.
		
		// NOTE THE FOLLOWING INSTRUCTIONS!  (READ AND REREAD THEM!)
		// NOTE THE FOLLOWING INSTRUCTIONS!
		// NOTE THE FOLLOWING INSTRUCTIONS!

		// NOTE: move each one of the following three lines inside the appropriate
		// method after you have written it.  (DON'T LEAVE A COPY OF IT HERE.)
		taxableIncome = computeTaxableIncome(grossIncome, numDependents);

		incomeTax = computeIncomeTax(taxableIncome);
		
		printIncomeTax(incomeTax);
		
		// After you have moved the above lines, then write three lines of code that
		// will properly call the three methods right here.
		
		
		
	} // end of main method ... write other methods AFTER THIS LINE
	
	// WRITE THE CODE FOR THE THREE ADDITIONAL METHODS BELOW.
	// ACTIVATE EACH METHOD ONE AT A TIME!!! (Not all at once!)
	// FINISH THE CODE FOR EACH METHOD THEN TEST IT
	// BEFORE ACTIVATING THE CODE FOR THE NEXT METHOD.

	// Write the method computeTaxableIncome.  It returns a floating-point value.
	// It receives two parameters:  a floating-point parameter named grossIncome and
	// an integer parameter named numDependents.  Make sure you include the word static
	// in your method signature line, because this is a terminal IO program.  See the main()
	// method signature to see how it was done.  After writing the method signature, move
	// the assignment statement for taxableIncome from the main() method to inside
	// computeTaxableIncome and change the variable taxableIncome to taxableInc.  You will
	// need to declare taxableInc in the method.  Make sure the method has a return statement
	// that includes taxableInc.
	public static double computeTaxableIncome(double grossIncome, int numDependents)
	{
		double taxableInc = grossIncome - STANDARD_DEDUCTION - DEPENDENT_DEDUCTION * numDependents;
		return taxableInc;
		
	}
	


	// Write the method computeIncomeTax.  It returns a floating-point value.
	// It receives one floating-point parameter:  taxableIncome.
	// Make sure you include the word static in your method signature line,
	// because this is a terminal IO program.  See the main() method signature to
	// see how it was done.  After writing the method signature, move the assignment 
	// statement for incomeTax from the main() method to inside computeIncomeTax and
	// change the variable incomeTax to incTax.  You will need to declare incTax in
	// the method.  Make sure the method has a return statement that includes incTax.
	public static double computeIncomeTax(double taxableIncome)
	{
		double incTax = taxableIncome * TAX_RATE;
		return incTax;
	}
	
	

	
	// Write the method printIncomeTax.  It does not return any value.
	// It receives one floating point parameter:  incomeTax.  Make sure you include the
	// word static in your method signature line, because this is a terminal IO program.
	// See the main() method signature to see how it was done.  After writing the method
	// signature, move the assignment statement for incomeTax from the main() method to
	// inside printIncomeTax.
	public static void printIncomeTax(double incomeTax)
	{
		System.out.println ("The income tax is $" + incomeTax);
	}
	
	
	

}	// end of program.  Do NOT write code beyond this line!


