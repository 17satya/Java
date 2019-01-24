package com.bridgelabz.Utility;

import java.util.Scanner;
/******************************************************************************
 *  Purpose :To generate the resuable methods
 *  @author  BridgeLabz/punithhr
 *  @version 1.0
 *  @since   23-01-2019
 *******************************************************************************/
public class Utility {
	
	static Scanner sc1= new Scanner(System.in);
	//Getting the user String values inputs by user using scanner
	public static String getString()
	{
		String s=sc1.next();
		return s;
	}
	//Getting the user int number inputs by user using scanner
	public static int getInt()
	{
		int i=sc1.nextInt();
		return i;
	}
	//Getting the integer random number in this below method() 
	public static int getRandomNumber()
	{
		return (int)(Math.random()*10000);
	}
}
