package com.bridgelabz.algorithm;

import com.bridgelabz.Utility.Utility;

/******************************************************************************
 *  Purpose :Write a Util Static Function to calculate monthlyPayment that reads
 *  		 in three command-line arguments P, Y, and R and calculates the monthly
 *  		 payments you would have to make over Y years to pay off a P principal 
 *  		loan amount at R per cent interest compounded monthly. 		  
 *  I/P     : command-line arguments P, Y, and R 
 *  O/P     : printing calculated monthly salary
 *  @author  BridgeLabz/punithhr
 *  @version 1.0
 *  @since   24-01-2019
 *******************************************************************************/
public class MonthlyPayment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		//System.out.println("Enter the payment");
		double payment=Double.parseDouble(args[0]);
		//System.out.println("Enter the year");
		int year=Integer.parseInt(args[1]);
		//System.out.println("Enter the Interest rate");
		double rate=Double.parseDouble(args[2]);
		Utility.getMonthlySalary(payment, year, rate);
		}
		catch(NumberFormatException e)
		{
			System.out.println("Enter the Valid input "+e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println("Enter the Correct input "+e.getMessage());
		}

	}

}
