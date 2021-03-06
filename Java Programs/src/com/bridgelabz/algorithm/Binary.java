package com.bridgelabz.algorithm;

import com.bridgelabz.Utility.Utility;
/******************************************************************************
 *  Purpose :Write Binary.java to read an integer as an Input, convert to Binary
 *   		 using toBinary function and perform the following functions.
 *				i. Swap nibbles and find the new number.
 *				ii. Find the resultant number is the number is a power of 2.
 *  I/P     :take the decimal number from user
 *  O/P     :print the swapped nibbles value is power of Two or not
 *  @author  BridgeLabz/punithhr
 *  @version 1.0
 *  @since   24-01-2019
 *******************************************************************************/

public class Binary {
	public static void main(String[] args) 
	{

	System.out.println("Enter the number to find binary digits");
	int number=Utility.getInt();
	System.out.print("The Binary digits for "+number+" number is:");
	String str=Utility.getToBinary(number);
	String string2="";
	for(int i=str.length()-1;i>=0;i--)
    {
    string2+=str.charAt(i);
    }
	System.out.println(string2);
	int binary=Integer.parseInt(string2);
	//passing the number to swap the binary numbers
	int swapbinary=Utility.getSwapNibbles(binary);
	//Printing swapped binary
	System.out.println("The swapnibbles binary values are: "+swapbinary);
	boolean power2=Utility.getPowerOf2(swapbinary);
	if(power2)
	{
		
			System.out.println("The swapped nibble is power of two "+swapbinary);
	}
	else
	{
			System.out.println("The swapped nibble is not power of two "+swapbinary);
	}
	}

}
