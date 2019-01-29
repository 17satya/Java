package com.bridgelabz.algorithm;

import com.bridgelabz.Utility.Utility;

/******************************************************************************
 *  Purpose :To the Util Class add dayOfWeek static function that takes a date as
 *  		 input and prints the day of the week that date falls on
 *  I/P     :Read three command-line arguments: m(month),d(day),and y(year).
 *  O/P     :Print Day as 0 for Sunday,1 for Monday,2 for Tuesday,and so forth
 *  @author  BridgeLabz/punithhr
 *  @version 1.0
 *  @since   29-01-2019
 *******************************************************************************/
public class DaysOfWeek {
	
	public static void main(String[] args)
	{
		//validating
		if(args.length==0||args.length<3) 
		{
			System.out.println("Give the input in order Month,Day,year in command-line argument");
			return;
		}
		int month,date,year,weekDay;
		//taking inputs from the argument
		month=Integer.parseInt(args[0]);
		date=Integer.parseInt(args[1]);
		year=Integer.parseInt(args[2]);
		//day value
		weekDay=(int)(Utility.getDayOfWeek(month,date,year));
		//printing the given input
		System.out.println("Given Date: "+month+":"+date+":"+year);
		//priting the day value
		System.out.println("The Day of given date is: "+weekDay);

	}

}
