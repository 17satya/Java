package com.bridgelabz.algorithm;

import java.text.DecimalFormat;

import com.bridgelabz.Utility.Utility;
/******************************************************************************
 *  Purpose :Write a static function sqrt  to compute the square root of a nonnegative
 *  		 number c given in the input using Newton's method:
 *  I/P     :number to find square root
 *  O/P     :printing the square root value
 *  @author  BridgeLabz/punithhr
 *  @version 1.0
 *  @since   24-01-2019
 *******************************************************************************/

public class Newton {

	public static void main(String[] args) {
		double num;
		double sqrtnum;
		do {
			System.out.println("Enter a non-negative number");
			num=Utility.getDouble();
		}while(num<0);
		sqrtnum=Utility.getSqrtNewtons(num);
		DecimalFormat df = new DecimalFormat("#.0");
		System.out.println("Square root of "+num +" is "+df.format(sqrtnum));
	}

}
