package com.bridgelabz.algorithm;

import java.util.Arrays;

import com.bridgelabz.Utility.Utility;
import com.bridgelabz.functionality.StopWatch;
/******************************************************************************
 *  Purpose :Create Utility Class having following static methods 
 * i)      binarySearch method for integer
 * ii)     binarySearch method for String
 * iii)    insertionSort method for integer
 * iv)     insertionSort method for String
 * v)      bubbleSort method for integer
 * vi)     bubbleSort method for String
 *  I/P     :Write main function to call the utility function
 *  O/P     : Print the Sorted List of Elements with the StopWatch elapsed time
 *  @author  BridgeLabz/punithhr
 *  @version 1.0
 *  @since   24-01-2019
 *******************************************************************************/

public class BinarySearch4  {
	//main method 
	public static void main(String []args) 
	{ 
		//This is for the String binary search
		StopWatch sa=new StopWatch();
		sa.start();
		String[] arr={"punith","revanth","prashanth","sudhakar"}; 
		String find="punith"; 
		int result=Utility.getBinarySearchString(arr,find);
		if(result==-1) 
			System.out.println("String element not present"); 
		else
			System.out.println("String element found at index "+result);
		sa.stop();
		long time=sa.elapsedTime();
		sa.time(time);
		
		
		System.out.println();
		
		
		//This is for the integer binary search

		int[] intarr={ 2, 3, 4, 10, 40 }; 
		int high=arr.length-1; 
		int low=0;
		int key=10;
		int res=Utility.getBinarySearchInt(intarr,10,low,high);
		sa.start();
		if (res==-1) 
			System.out.println("Integer element not present"); 
		else
			System.out.println("Integer element found at index "+res); 
		sa.stop();
		time=sa.elapsedTime();
		sa.time(time);



		System.out.println();


		//This is for Insertion Sort integer
		int[] insertarr= {2,4,0,20,7,10};
		System.out.println(Arrays.toString(insertarr));
		Utility.getInsertionSortInt(insertarr);
		sa.start();
		System.out.println();
		sa.stop();
		time=sa.elapsedTime();
		sa.time(time);



		System.out.println();


		//this for Insertion Sort String  
		String[] inputArray={"punith","srikanth","kiran"};
		sa.start();
		System.out.println("Insertion Sort elements are:"+Arrays.toString(inputArray));

		Utility.getInsertionSortString(inputArray);
		sa.stop();
		time=sa.elapsedTime();
		sa.time(time);

		System.out.println();


		//This is for Bubble Sort integer
		Utility.getBubbleSortInt(intarr);
		sa.stop();
		time=sa.elapsedTime();
		sa.time(time);

		System.out.println();

		//This is for Bubble Sort String
		Utility.getBubbleSortString(inputArray);
		sa.stop();
		time=sa.elapsedTime();
		sa.time(time);
		System.out.println();


	} 
} 

