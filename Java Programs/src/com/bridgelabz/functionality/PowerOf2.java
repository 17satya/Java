package com.bridgelabz.functionality;

import com.bridgelabz.Utility.Utility;

/******************************************************************************
 *  Purpose :To find the powers of 2 for the given user number
 *  I/P     :command-line argument N number to find power of 2
 *  O/P     : Generating the power of 2 values
 *  @author  BridgeLabz/punithhr
 *  @version 1.0
 *  @since   23-01-2019
 *******************************************************************************/
public class PowerOf2 {

	public static void main(String[] args) {
	//Taking the user input by arguments to find the power of 2 till the number given
	int pownumber=Integer.parseInt(args[0]);
	//Validating the user input is greater than 31 and 0 
		if(pownumber>0&&pownumber<31)
		{
			System.out.print("Given number "+pownumber+" is powerof2 : "+Utility.getPowerOf2(pownumber));
		}
	else
		//Displaying the error message to the user by validation
		System.out.println("Enter the power number greater then 0 and less than 31");
	
	}

}
