package com.bridgelabz.functionality;
/******************************************************************************
 *  Purpose : To find the Euclidean distance and Display
 *  I/P     :from and to n int values by Command line Argument list
 *  O/P     :To print the Euclidean distance
 *  @author  BridgeLabz/punithhr
 *  @version 1.0
 *  @since   24-01-2019
 *******************************************************************************/
public class Distance {

	public static void main(String[] args) {
		//taking the inputs from argument line and parsing
		int from=Integer.parseInt(args[0]);
		int to=Integer.parseInt(args[1]);
		//Formula to find the Euclidean distance
		Double Distance=Math.sqrt(Math.pow(from, from)+Math.pow(to, to));
		//Displaying the ouput Euclidean distance
		System.out.println(Distance);
	}

}
