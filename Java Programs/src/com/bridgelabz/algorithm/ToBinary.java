package com.bridgelabz.algorithm;

import com.bridgelabz.Utility.Utility;
/******************************************************************************
 *  Purpose :Write a static function toBinary that outputs the binary (base 2) 
 *  		representation of the decimal number typed as the input. 
 *  I/P     :the n int values by user
 *  O/P     :To print the binary digits
 *  @author  BridgeLabz/punithhr
 *  @version 1.0
 *  @since   29-01-2019
 *******************************************************************************/

public class ToBinary {
	

	public static void main(String[] args) {
		System.out.println("Enter the number to find binary digits");
		int number=Utility.getInt();
		System.out.print("The Binary digits for "+number+" number is:");
		String str=Utility.getToBinary(number);//calling binary static method
		/*for(int i=str.length()-1;i>=0;i--)
        {
        System.out.print(str.charAt(i));
        }*/
		StringBuilder sb=new StringBuilder(str);
		sb.reverse();
		System.out.print(sb);
    }

}
