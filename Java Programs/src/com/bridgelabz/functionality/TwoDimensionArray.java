package com.bridgelabz.functionality;

import com.bridgelabz.Utility.Utility;
/******************************************************************************
 *  Purpose :To generate the 2D Array by using User inputs and Displaying Values
 *  I/P     :M(rows) and N(column) integers for 2D Array 
 *  O/P     : Display Two Dimensional Array Values
 *  @author  BridgeLabz/punithhr
 *  @version 1.0
 *  @since   23-01-2019
 *******************************************************************************/
public class TwoDimensionArray {
	public static void main(String[] args)
	{
		System.out.println("Enter the number of rows in an array");
		//Taking the user input for number of rows
		int row=Utility.getInt();
		System.out.println("Enter the number of columns in an array");
		//Taking the user input for number of Columns
		int column=Utility.getInt();
		//Creating 2D Array
		int[][] twodarr=new int[row][column];
		System.out.println("Enter the "+row*column+" integer elements for 2-D Array");
		//Logic for inserting values by user for 2D Array
		for(int i=0;i<row;i++)
		{				
			twodarr[i][0]=Utility.getInt();
			for(int j=1;j<column;j++)
			{
				twodarr[i][j]=Utility.getInt();
			}
		}
		//Logic for Displaying the 2D array values
		for(int i=0;i<row;i++)
		{
			System.out.print("The "+i+" row elements :");
			for(int j=0;j<column;j++)
			{
				System.out.print(+twodarr[i][j]+" ");
				
			}
			System.out.println();
		}
		
	}

}
