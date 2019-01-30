package com.bridgelabz.functionality;

import com.bridgelabz.Utility.Utility;

/******************************************************************************
 *  Purpose :To calculate the percentage of tail and head by number of flip Coin
 *  I/P     :The number of times to Flip Coin(Ensuring the number is positive)
 *  O/P     : Percentage of Head vs Tails
 *  @author  BridgeLabz/punithhr
 *  @version 1.0
 *  @since   23-01-2019
 *******************************************************************************/
public class FlipCoin {
	public static void main(String[] args)
	{
		System.out.println("Enter the number of times coin to flip");
		//Taking the user input to flip a coin
		int flipnum=Utility.getInt();
		double head=0,tail=0;
		double tailpercentage=0,headpercentage=0;
		//validating the user input is positive or negative
		if(flipnum>0)
		{
		//logic for finding the number of count for tails and heads
			for(int i=0;i<=flipnum;i++)
			{
			if(Math.random()<0.5)
			{
				tail++;
			}
			else
			{
				head++;
			}
			}
			//finding the percentage of tail
			tailpercentage=tail*100/flipnum; 
			//finding the percentage of head
			headpercentage=100.0-tailpercentage;
			System.out.println("The percentage of Head vs Tail is: "+tailpercentage+" of "+headpercentage);
		}
		else
			//showing the error message to user wheather the input is negative
			System.out.println("Enter the positive integers like 1 and 2 etc--");
	}

}
