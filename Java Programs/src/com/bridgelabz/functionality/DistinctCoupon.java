package com.bridgelabz.functionality;

import java.util.HashSet;

import com.bridgelabz.Utility.Utility;
/******************************************************************************
 *  Purpose :To generate the distinct coupon and displaying the number of distinct
 *  		 coupon and number of counts to generate the distinct coupon  
 *  I/P     : N Distinct Coupon Number to get generated
 *  O/P     : Total random number needed to have all distinct numbers.
 *  @author  BridgeLabz/punithhr
 *  @version 1.0
 *  @since   24-01-2019
 *******************************************************************************/
public class DistinctCoupon {

	public static void main(String[] args)
	{
		System.out.println("Enter the number of Distinct Coupon required");
		//Taking the user input to generate the number of distinct coupons
		int requiredCoupon=Utility.getInt();
		//Used to add Distinct coupon
		HashSet<Integer> distinctcouponelements=new HashSet<Integer>();
		int numberofcounts=0;
		//logic to find the distinct coupon
		while( distinctcouponelements.size()<requiredCoupon)
		{
			//Getting the random number by using static member
			int couponnum=Utility.getRandomNumber();
			distinctcouponelements.add(couponnum);
			numberofcounts++;
			
		}
		//Displaying the count and distinct coupon to the user 
		System.out.println("The count taken to generate "+ requiredCoupon+" distinct coupon  is "+numberofcounts+" and the distinct coupons are "+distinctcouponelements);
		
	}
}
