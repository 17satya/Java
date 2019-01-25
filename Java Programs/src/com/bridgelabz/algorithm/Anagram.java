package com.bridgelabz.algorithm;

import com.bridgelabz.Utility.Utility;
/******************************************************************************
 *  Purpose :To take the inputs from the user and find it is anagram or not
 *  I/P		:Take two Strings as Input such abcd and dcba and Check for Anagram	
 *  O/P		:Print given two Strings are Anagram or not
 *  @author  BridgeLabz/punithhr
 *  @version 1.0
 *  @since   23-01-2019
 *******************************************************************************/
public class Anagram {

	public static void main(String[] args) {
		//handling the exception
		try
		{
			//taking user input values
		System.out.println("Enter the First String");
		String string1=Utility.getString();
		System.out.println("Enter the Second String");
		String string2=Utility.getString();
		//passing user string to find the Anagram or not
		Utility.getAnagramString(string1,string2);
		}
		catch(Exception e)
		{
			System.out.println("Enter the valid String values"+e.getMessage());
		}
	}

}
