package com.bridgelabz.algorithm;

import com.bridgelabz.Utility.Utility;
/******************************************************************************
 *  Purpose :Write a Program to calculate the minimum number of Notes as well as
 *  		 the Notes to be returned by the Vending Machine as a Change
 *  I/P     :Read the Change in Rs to be returned by the Vending Machine
 *  O/P     :one the number of minimum Note needed to give the change and second 
 *  		 list of Rs Notes that would given in the Change
 *  @author  BridgeLabz/punithhr
 *  @version 1.0
 *  @since   24-01-2019
 *******************************************************************************/
public class VendingMachine {

	public static void main(String[] args) {
		//The number of types in the vending machine notes
		int[] array={1,2,5,10,50,100,500,1000,2000};
		//taking the user inpet for amount 
		System.out.println("Enter the amount  ");
		int amount=Utility.getInt();
		//calling the vending machine
		Utility.getNoteCount(amount,array);
	}

}
