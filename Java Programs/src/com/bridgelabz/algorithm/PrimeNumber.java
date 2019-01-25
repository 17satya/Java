package com.bridgelabz.algorithm;

import com.bridgelabz.Utility.Utility;

public class PrimeNumber
{
   public static void main (String[] args)
   {	

	   int i=0;
	   int num=0;
	   //Empty String
	   String primeNumbers="";

	   for (i=1;i<=1000;i++)         
	   { 		  	  
		   int counter=0; 	  
		   for(num=i;num>=1;num--)
		   {
			   if(i%num==0)
			   {
				   counter=counter++;
			   }
		   }
		   if (counter==2)
		   {
			   primeNumbers=primeNumbers+i+" ";
		   }	
	   }
	  
	   System.out.println(primeNumbers);
	}
   
   
}