package com.bridgelabz.algorithm;



import com.bridgelabz.Utility.Utility;
/******************************************************************************
 *  Purpose :To find the prime numbers for the user input number and Displaying
 *  		 the prime numbers.
 *  I/P     : N integer input from the user 
 *  O/P     : Display the prime numbers for given input
 *  @author  BridgeLabz/punithhr
 *  @version 1.0
 *  @since   27-01-2019  
 *******************************************************************************/

public class PrimeNumber
{
   public static void main (String[] args)
   {	
	  try
	  {
		  //taking inputs from the user
		  System.out.println("Enter the range to find the primenumbers");
		  int range=Utility.getInt();
		  //getting the primenumbers from the Utility class of getPrimeNumbers method
		  //printing the prime numbers
		  System.out.println("The primeNumbers from 1 to "+range+" are:"+Utility.getPrimeNumbers(range));
		  
	  }
	  catch(Exception e)
	  {
		  System.out.println("please enter the integer numbers ");
	  }
   }
}