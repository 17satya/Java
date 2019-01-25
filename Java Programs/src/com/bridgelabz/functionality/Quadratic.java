package com.bridgelabz.functionality;
/******************************************************************************
 *  Purpose :To find the find the quadratic equation for given Command-Line Arguments
 *  I/P     :Two values by command-Line arguments
 *  O/P     :quadratic equations of two roots
 *  @author  BridgeLabz/punithhr
 *  @version 1.0
 *  @since   24-01-2019  
 *******************************************************************************/
public class Quadratic { 
	
	public static void main(String[] args) { 
		try
		{
		double b=Double.parseDouble(args[0]);
		double c=Double.parseDouble(args[1]);
		//formula to find the quadratic equation
		double discriminant=b*b-4.0*c;
		double sqroot= Math.sqrt(discriminant);
		double root1=(-b+sqroot)/2.0;
		double root2=(-b-sqroot)/2.0;
		System.out.println(root1);
		System.out.println(root2);
		}
		catch(NumberFormatException e)
		{
			System.out.println("Enter the integer  inputs "+e.getMessage());
		}
		
		
	}
}