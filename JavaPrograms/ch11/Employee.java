/* 	File:  Employee.java
	This model class will only have four instance variables ...
		a String called name
		a String called gender
		a double called payRate
		a String called department
		
	This class will only have the following methods:
	1)  an initializing constructor that receives four parameters that 
		will hand off values to the instance variables.
	2)	an accessor method named getName that returns the value of an
		instance variable.
	3)  an accessor method named getGender that returns the value of an
		instance variable. 
	4)  an accessor method named getPayRate that returns the value of an
		instance variable. 
	5)  an accessor method named getDept that returns the value of an
		instance variable. 
	6)  a mutator method named setName that receives one parameter of type
	 	String that sets the value of the appropriate instance variable.
	7)  a mutator method named setGender that receives one parameter of type
	 	String that sets the value of the appropriate instance variable.
	8)  a mutator method named setPayRate that receives one parameter of type
	 	double that sets the value of the appropriate instance variable. 	 	
	9)  a mutator method named setDept that receives one parameter of type
	 	String that sets the value of the appropriate instance variable. 

	The toString method is done for you.  PLEASE DON'T MODIFY IT IN ANY WAY!!!
	YOU WILL LOSE POINTS IF YOU WRITE ANY OTHER METHODS THAN THE ONES STATED HERE!!!
*/
package ch11;

public class Employee 
{
	private String name;
	private String gender;
	private double payRate;
	private String department;
	
	public Employee()
	{
		name = "";
		gender = "";
		payRate = 0.0;
		department = "";
	}
	
	public Employee(String nm, String gdr, double pR, String dpt)
	{
		name = nm;
		gender = gdr;
		payRate = pR;
		department = dpt;
	}
	
	
	//Accessor Methods
	public String getName()
	{
		return name;
	}
	
	public String getGender ()
	{
		return gender;
	}
	
	public double getPayRate()
	{
		return payRate;
	}
	
	public String getDept ()
	{
		return department;
	}
	
	
	//Mutator Methods
	public void setName(String nm)
	{
		name = nm;
	}
	
	public void setGender(String gdr)
	{
		gender = gdr;
	}
	
	public void setPayRate(double pR)
	{
		payRate = pR;
	}
	
	public void setDept(String dpt)
	{
		department = dpt;
	}
	
	
	
	// DO NOT MODIFY ANY OF THE CODE IN THIS METHOD!!!!
	// ERRORS WILL CLEAR UP AFTER YOU GET THE CODE WRITTEN.
	public String toString()
	{
		String str = String.format("%-10s%-8s%8.2f     %-10s",
				name, gender, payRate, department);
		return str;
	} 
}







