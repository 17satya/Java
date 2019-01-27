package com.bridgelabz.Utility;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
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
			if(Set.size()==0)
			{
				System.out.println("Given two strings are  anagrams "+s1+" and "+s2);
			}
			else
			{ 

				System.out.println("Given two strings are not anagrams "+s1+" and "+s2);

			}

		}
		else
			System.out.println("Enter the correct two Strings values or enter same length strings");

	}
	//To get the prime number till range method
	public static ArrayList getPrimeNumbers(int range)
	{
		int i=0;
		int num=0;
		//Empty String
		ArrayList primeNumbers=new ArrayList();
		//String  primeNumbers="";
		for (i=1;i<=range;i++)   
		{ 	//counter for calculating the counts of dividing  	  
			int counter=0; 	  
			for(num=i;num>=1;num--)
			{
				if(i%num==0)
				{
					counter=counter+1;
				}
			}
			//counter value is greater and less than 2 not a prime number
			if(counter==2)
			{
				//Adding  the Prime numbers to the String
				primeNumbers.add(i);
			}	
		}	
		return primeNumbers;
	}
	//this method gives the PrimeAnagram palindrome values
	public static LinkedHashSet getPrimeAnagramPalindrome(ArrayList prime)
	{
		LinkedHashSet set=new LinkedHashSet();
		//This is the Loop for finding the Palindrome values
		for(int i=0;i<prime.size();i++)
		{
			String i1=prime.get(i).toString();
			//Checking the String is palindrome or not
			if(Utility.isPalindrome(i1))
			{
				set.add(i1);
			}

		}
		//This is the Loop for finding the Anagram values
		for(int i=0;i<prime.size();i++)
		{
			for(int j=1;j<prime.size();j++)
			{
				String i1=prime.get(i).toString();
				String i2=prime.get(j).toString();
				//Checking weather the two Strings are Anagram or not
				if(Utility.isAnagram(i1,i2))
				{
					set.add(i1);

				}
			}

		}
		return set;
	}
	//This method() for finding the String is palindrome or not returns boolean
	public static boolean isPalindrome(String s)
	{	
		String s2="";
		for(int i=s.length()-1;i>=0;i--)
		{
			s2=s2+s.charAt(i);
		}
		if(s.equals(s2))
		{
			return true;
		}
		return false; 
	}
	//checks the Anagram of the two Strings and returns boolean
	public static boolean isAnagram(String s1,String s2)
	{  
		HashSet Set=new HashSet();

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
			if(Set.size()==0)
			{
				return true;
			}
		}
		return false;
	}

}

