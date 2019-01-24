package com.bridgelabz.functionality;

import com.bridgelabz.Utility.Utility;
/******************************************************************************
 *  Purpose :To Generate the prime fators of the Number
 *  I/P     :Number to find the prime factors
 *  O/P     : Print the prime factor a Number
 *  @author  BridgeLabz/punithhr
 *  @version 1.0
 *  @since   23-01-2019
 *******************************************************************************/

public class PrimeFactor {

	public static void main(String[] args) {
		System.out.println("Enter the number to Find the factor");
		//Taking the user input to find the prime Factor
		int findfactornum=Utility.getInt();
		//Logic for number Divisible by 2
		while(findfactornum%2==0)
		{
			//Displaying the values Divisible by 2
			System.out.println(2);
			findfactornum=findfactornum/2;
		}
		//Logic for number Divisible by prime factor
		for(int i=3;i<=findfactornum;i+=2)
		{
			if(findfactornum%i==0)
			{
				//Displaying the values Divisible by Prime Numbers
				System.out.println(i);
				findfactornum=findfactornum/i;
			}
		} 
		if(findfactornum>2)
		{
			//Displaying the value which is greater than 2
			System.out.println(findfactornum);
		}
	}

}
