package com.bridgelabz.functionality;


import com.bridgelabz.Utility.Utility;
/******************************************************************************
 *  Purpose :To find the Distinct triplets of the user input numbers in a array.
 *  		 Displaying the count and values.
 *  I/P     : N number of integer to an array and N values
 *  O/P     : Display the count of Distinct triplets and values
 *  @author  BridgeLabz/punithhr
 *  @version 1.0
 *  @since   24-01-2019  
 *******************************************************************************/
public class SumOfIntegerToZero {

	
	public static void main(String[] args) {
		try
		{
		//Taking the inputs for the arraysize by the User
		System.out.println("Eneter the N elements to add in array ");
		int arraysize=Utility.getInt();
		int[] array=new int[arraysize];
		boolean triplet=false;
		int countTriplets=0;
		//validating the array length greater than 2 or not because length is less than 2 means checking of triplets is not necessary
		if(array.length>2)
		{
		//To hold the triplet number values which results to zero 
		System.out.println("Enter the "+arraysize+" elements to array");
		for(int l=0;l<array.length;l++)
		{
			//Taking the inputs to the array by the User
			array[l]=Utility.getInt();
		}
		//Logic to find the combination of the triplet number in the array elements and count
		for(int i=0;i<array.length-2;i++)
		{
			for(int j=i+1;j<array.length-1;j++)
			{
				for(int k=j+1;k<array.length;k++)
				{
					if(array[i]+array[j]+array[k]==0)
					{
						System.out.print(+array[i]+" ");
						System.out.print(+array[j]+" ");
						System.out.print(+array[k]+" ");
						System.out.println();
						triplet=true;
						countTriplets++;
					}
				}
			}
			
		}
		//Displaying weather it contains triplets count or not
		if(triplet==false)
		{
			System.out.println("There are no sum of 3 Integer triplets to"+countTriplets);
		}
		else 
		{
			System.out.print("The count of triplets is "+countTriplets);
		}
		}
		else
			System.out.println("the N numbers should be greater than 2 ");
		}
		catch(Exception e)
		{
			System.out.println("Enter the valid integers");
		}
		
	}

}
