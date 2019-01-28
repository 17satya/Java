package com.bridgelabz.algorithm;

import java.util.ArrayList;
import java.util.TreeSet;

import com.bridgelabz.Utility.Utility;
/******************************************************************************
*  Purpose :To find the prime Anagram palindrome numbers for the user input number and Displaying
*  I/P     : N integer input from the user 
*  O/P     : Display the prime Anagram palindrome numbers for given input
*  @author  BridgeLabz/punithhr
*  @version 1.0
*  @since   27-01-2019  
*******************************************************************************/


public class PrimeAnagramPalindrome {

	public static void main(String[] args) {
		//Getting prime numbers from Utility class
		ArrayList primenumlist=Utility.getPrimeNumbers(1000);
		//Printing the prime anagram palindrome values
		System.out.println("The prime Anagram palidrome values till 1000 are:"+Utility.getPrimeAnagramPalindrome(primenumlist));

	}

}
