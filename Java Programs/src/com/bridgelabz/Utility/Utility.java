package com.bridgelabz.Utility;

import java.util.HashSet;
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
	public static void getAnagramString(String s1,String s2)
	{
		//Hashset is used it holds unique values
		HashSet Set=new HashSet();
		//checking the 2 String length are same are not
		if(s1.trim().length()==s2.trim().length())
		{
			//Adding character to the set
			for(int i=0;i<s1.length();i++)
			{
				Set.add(s1.charAt(i));
			}
			//removing the characters from the Set by using String 2nd characters
			for(int i=0;i<s2.length();i++)
			{
				char c=s2.charAt(i);
				Set.remove(c);

			}
			//printing the result to the user by validation
			if(Set.size()>0)
			{
				System.out.println("Given two strings are not anagrams "+s1+" and "+s2);
			}
			else
			{
				System.out.println("Given two strings are  anagrams "+s1+" and "+s2);
			}

		}
		else
			System.out.println("Enter the correct two Strings values or enter same length strings");
	}
	
}
