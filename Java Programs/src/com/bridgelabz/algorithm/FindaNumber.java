package com.bridgelabz.algorithm;

import com.bridgelabz.Utility.Utility;

public class FindaNumber
{
	public static void guessNum(int[] array,int low,int high)
	{
		int mid;
		char result;
		if(low==high)
		{
			System.out.println("Your guess number is: "+(array[low]+1));
			return;
		}
		else 
		{
			mid=(low+high)/2;
			System.out.println("The number is within this number"+array[mid]);
			System.out.println("Enter your answer as y(for yes) or n(for no)");
			result=Utility.getString().toLowerCase().charAt(0);
			if(result=='y')
				guessNum(array,low,mid-1);//If low
			else
				guessNum(array,mid+1,high);//If high
			
		}
}

	public static void main(String[] args) {
		int range=0;
		if(args.length<1)
		{
			System.out.println("Provide a number(2^n) as command line argument...!");
			return;
		}
		range= Integer.parseInt(args[0]);
		//Adding values to array 0 
		int[] arr=new int[range];
		for(int i=0;i<=arr.length-1;i++)
		{
			   arr[i]=i;
		}
		System.out.println("Guess a number in the range : 0 to "+(range-1));
		char find;
		do{
			System.out.println("Have you assumed a number within given range");
			System.out.println("Enter your answer as y(for yes) or n(for no)");
			find=Utility.getString().toLowerCase().charAt(0);
		}while(find!='y');
guessNum(arr,0,range-1);
	}

}
