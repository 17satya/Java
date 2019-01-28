package com.bridgelabz.algorithm;

import com.bridgelabz.Utility.Utility;
/******************************************************************************
 *  Purpose :To find the Sorted String elements by using Insertion Sort
 *  I/P     :Take the inputs from the user to Sort the Elements
 *  O/P     : Print the Sorted List of Elements
 *  @author  BridgeLabz/punithhr
 *  @version 1.0
 *  @since   24-01-2019
 *******************************************************************************/

public class InsertionSort {

	public static void main(String[] args) {
		try
		{
		System.out.println("Enter N number to Sort ");
		int range=Utility.getInt();
		System.out.println("Enter the Elements to be Sorted");
		String[] array=new String[range];
		for(int i=0;i<array.length;i++)
		{
			array[i]=Utility.getString();
		}
		Utility.getInsertionSortString(array);
		}
		catch(Exception e)
		{
			System.out.println("Enter the correct element");
			
		}
		


	}

}
