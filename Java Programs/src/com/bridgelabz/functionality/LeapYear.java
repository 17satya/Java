package com.bridgelabz.functionality;

import com.bridgelabz.Utility.Utility;
/******************************************************************************
 *  Purpose :To find the given year is leap year or not
 *  I/P     : N number for year (ensure it is a 4 digit number)
 *  O/P     :  Print the year is a Leap Year or not
 *  @author  BridgeLabz/punithhr
 *  @version 1.0
 *  @since   23-01-2019
 *******************************************************************************/

public class LeapYear {

	public static void main(String[] args) {
		System.out.println("Enter the year");
		//taking the User input 
        String year=Utility.getString();
        //Validating the Digits are more than 4 or not
        if(year.length()==4)
        {
        	//Parsing the String value to  int number
        	int yearname=Integer.parseInt(year);
        	//Logic to find weather it is leap year or not
        	if(((yearname%4==0)||(yearname%100==0))&&(yearname%400==0))
        	{
        		//Displaying a reasult
        		System.out.println(+yearname+" year is a leap year");
        	}
        	else
        	{
        		//Displaying the result
        		System.out.println(+yearname+" year is not a leap year");
        	}
        }
        else
        {
        System.out.println("Enter the correct year like 2010");

        }
	}
}
