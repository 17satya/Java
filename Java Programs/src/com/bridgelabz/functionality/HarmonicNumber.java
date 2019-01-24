package com.bridgelabz.functionality;

import java.text.DecimalFormat;

import com.bridgelabz.Utility.Utility;
/******************************************************************************
 *  Purpose :To Generate the Harmonic number for given number
 *  I/P     : The Harmonic Value N
 *  O/P     : Print the Nth  Harmonic Value.
 *  @author  BridgeLabz/punithhr
 *  @version 1.0
 *  @since   23-01-2019
 *******************************************************************************/
public class HarmonicNumber {

	public static void main(String[] args) {
		System.out.println("Enter the nth number to find harmonic number");
		//Taking the user input for the nth number
		int nthnum=Utility.getInt();
		double sum=0.0;
		//Validating weather the number is positive
		if(nthnum!=0)
		{
		//Logic for the finding Harmonic number
		for(int i=1;i<=nthnum;i++)
		{
			sum+=1.0/i;
		}
		}
		//Method to decrease the decimal values
		DecimalFormat numberFormat=new DecimalFormat("#.000");
		System.out.println(numberFormat.format(sum));
		
	}

}
