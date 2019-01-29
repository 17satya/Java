package com.bridgelabz.algorithm;

import com.bridgelabz.Utility.Utility;
/******************************************************************************
 *  Purpose :To the Util Class add temperaturConversion static function, given 
 * 			 the temperature in fahrenheit as input outputs the temperature in Celsius
 *  		 or viceversa using the formula
 *  I/P     :Inputs from user to convert the fahrenheit to  Celsius Or vice versa
 *  O/P     :printing the coverted value of fahrenheit or Celsius 
 *  @author  BridgeLabz/punithhr
 *  @version 1.0
 *  @since   28-01-2019
 *******************************************************************************/
public class temperatureConversion {

	public static void main(String[] args) 
	{
		try
		{
		System.out.println("Enter the number to find fahrenheit Or celsius");
		double number=Utility.getDouble();
		System.out.println("Click 1 to find celsius and any  other number to find Fahrenheit");
		int check=Utility.getInt();
		Utility.getTemperatureConversion(number, check);
		}
		catch(Exception e)
		{
			System.out.println("Give the correct input "+e.getMessage());
		}
		
	}

}
