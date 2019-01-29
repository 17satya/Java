package com.bridgelabz.Utility;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;
/******************************************************************************
 *  Purpose :To generate the resuable methods
 *  @author  BridgeLabz/punithhr
 *  @version 1.0
 *  @since   23-01-2019
 *******************************************************************************/
public class Utility {

	static Scanner sc1= new Scanner(System.in);
	//Getting the user String values inputs by user using scanner
	public static String getString()
	{
		String s=sc1.next();
		return s;
	}
	//Getting the user int number inputs by user using scanner
	public static int getInt()
	{
		int i=sc1.nextInt();
		return i;
	}
	//Getting the user double number inputs by user using scanner
	public static double getDouble()
	{
		double i=sc1.nextDouble();
		return i;
	}
	//Getting the integer random number in this below method() 
	public static int getRandomNumber()
	{
		return (int)(Math.random()*10000);
	}
	public static void getAnagramString(String s1,String s2)
	{
		//Hashset is used it holds unique values
		HashSet Set=new HashSet();

		//checking the 2 String length are same are not
		if(s1.trim().length()==s2.trim().length())
		{
			//Adding character to the set
			for(int i=0;i<s1.length();i++)
			{
				Set.add(s1.charAt(i));
			}
			//removing the characters from the Set by using String 2nd characters
			for(int i=0;i<s2.length();i++)
			{
				char c=s2.charAt(i);
				Set.remove(c);

			}
			//printing the result to the user by validation
			if(Set.size()==0)
			{
				System.out.println("Given two strings are  anagrams "+s1+" and "+s2);
			}
			else
			{ 

				System.out.println("Given two strings are not anagrams "+s1+" and "+s2);

			}

		}
		else
			System.out.println("Enter the correct two Strings values or enter same length strings");

	}
	//To get the prime number till range method
	public static ArrayList getPrimeNumbers(int range)
	{
		int i=0;
		int num=0;
		//Empty ArrayList
		ArrayList primeNumbers=new ArrayList();
		for (i=1;i<=range;i++)   
		{ 	//counter for calculating the counts of dividing  	  
			int counter=0; 	  
			for(num=i;num>=1;num--)
			{
				if(i%num==0)
				{
					counter=counter+1;
				}
			}
			//counter value is greater and less than 2 not a prime number
			if(counter==2)
			{
				//Adding  the Prime numbers to the String
				primeNumbers.add(i);
			}	
		}	
		return primeNumbers;
	}
	//this method gives the PrimeAnagram palindrome values
	public static TreeSet getPrimeAnagramPalindrome(ArrayList prime)
	{
		TreeSet set=new TreeSet();
		//This is the Loop for finding the Palindrome values
		for(int i=0;i<prime.size();i++)
		{
			String i1=prime.get(i).toString();
			//Checking the String is palindrome or not
			if(Utility.isPalindrome(i1))
			{
				set.add(i1);
			}

		}
		//This is the Loop for finding the Anagram values
		for(int i=0;i<prime.size();i++)
		{
			for(int j=1;j<prime.size();j++)
			{
				String i1=prime.get(i).toString();
				String i2=prime.get(j).toString();
				//Checking weather the two Strings are Anagram or not
				if(Utility.isAnagram(i1,i2))
				{
					set.add(i1);

				}
			}

		}
		return set;
	}
	//This method() for finding the String is palindrome or not returns boolean
	public static boolean isPalindrome(String s)
	{	
		String s2="";
		for(int i=s.length()-1;i>=0;i--)
		{
			s2=s2+s.charAt(i);
		}
		if(s.equals(s2))
		{
			return true;
		}
		return false; 
	}
	//checks the Anagram of the two Strings and returns boolean
	public static boolean isAnagram(String s1,String s2)
	{  
		TreeSet Set=new TreeSet();

		if(s1.trim().length()==s2.trim().length())
		{
			//Adding character to the set
			for(int i=0;i<s1.length();i++)
			{
				Set.add(s1.charAt(i));
			}
			//removing the characters from the Set by using String 2nd characters
			for(int i=0;i<s2.length();i++)
			{
				char c=s2.charAt(i);
				Set.remove(c);
			}
			if(Set.size()==0)
			{
				return true;
			}
		}
		return false;
	}
	// Returns index of x if it is present in arr[] or return -1
	public static int getBinarySearchString(String[] arr,String find)
	{
		int start=0; 
		int end=arr.length-1;
		while(start<=end)
		{
			//finding mid element
			int mid=(start+end)/2;
			//comparing the index mid value and holding value 
			int comp=find.compareTo(arr[mid]);
			//if comp value is equal to 0 key value found
			if(comp==0)
			{
				return mid;
			}
			//if comp value is less than 0 key value end value is mid-1
			else if(comp<0)
			{
				end=mid-1;
			}
			else
			{
				//if comp value is greater than 0 key value start value is mid+1
				start=mid+1;
			}
		}
		//if key value not found return -1
		return -1;
	}
	// Returns index of key if it present or return -1 
	public static int getBinarySearchInt(int[] sortedArray,int key, int low,int high) 
	{
		//initial index value
		int index=Integer.MAX_VALUE;

		while (low<=high) 
		{
			//finding mid element
			int mid=(low+high)/2;
			//if array mid value is less than key value end value is mid+1
			if(sortedArray[mid]<key)
			{
				low=mid+1;
			}
			//if array mid value is greater than key value end value is mid-1
			else if(sortedArray[mid]>key)
			{
				high=mid-1;
			}
			//if array mid value is equal to key mid value is equal to index and break come out of the loop 
			else if(sortedArray[mid]==key)
			{
				index=mid;
				break;
			}
		}
		return index;
	}
	//This is for  Insertion Sort method
	public static void getInsertionSortInt(int[] array)
	{
		int n=array.length-1;
		for (int j=1;j<=n;j++)
		{
			int key=array[j];
			int i=j-1;
			while((i>-1)&&(array[i]>key))
			{
				array[i+1]=array [i];
				i--;
			}
			array[i+1]=key;
		}
		//for printing the Sorted array values
		System.out.print("Sorted Elements is:"+Arrays.toString(array));
	}
	//This is for  Insertion Sort method for Strings
	public static void getInsertionSortString(String[] array)
	{
		int n=array.length-1;
		for (int j=1;j<=n;j++)
		{
			String key=array[j];
			int i=j-1;
			while((i>-1)&&(array[i].compareTo(key)>0))
			{
				array[i+1]=array[i];
				i--;
			}
			array[i+1]=key;
		}
		System.out.println("Sorted elements is:"+Arrays.toString(array));

	}
	//This is for Buuble Sort Integer method
	public static void getBubbleSortInt(int[] array)
	{
		int n=array.length;
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if (array[j]>array[j+1])
				{
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		System.out.println("The Sorted elements are:"+Arrays.toString(array));
	}

	//This is for Buuble Sort String method
	public static void getBubbleSortString(String[] array)
	{
		for(int i=1;i<array.length;i++)
		{
			String temp="";
			if(array[i-1].compareTo(array[i])>0)
			{
				temp=array[i-1];
				array[i-1]=array[i];
				array[i]=temp;
			}
		}
		System.out.println("The Sorted elements are:"+Arrays.toString(array));
	}
	//TemperatureConversion from celsius to fahrenheit
	public static void getTemperatureConversion(double number,int check)
	{
		if(check==1)
		{
			double celsius=(5.0*(number-32.0))/9.0;
			System.out.println(number+"F is same as "+celsius+"C");
		}
		else
		{
			double fahrenheit=((number*9.0/5.0)+32);
			System.out.println(number+"C is same as "+fahrenheit+"F");
		}

	}
	//Method for merge Sort Integer
	public static int[] mergeSort(int[] a,int n) {
		if(n<2)
		{
			return a;
		}
		int mid=n/2;
		int[] l=new int[mid];
		int[] r=new int[n-mid];

		for(int i=0;i<mid;i++) 
		{
			l[i]=a[i];
		}
		for(int i=mid;i<n;i++)
		{
			r[i-mid]=a[i];
		}
		mergeSort(l,mid);
		mergeSort(r,n-mid);
		merge(a,l,r,mid,n-mid);
		return a;

	}
	public static void merge(int[] a,int[] l,int[] r,int left,int right)
	{
		int i=0,j=0,k=0;
		while(i<left&&j<right)
		{
			if (l[i]<=r[j])
			{
				a[k++]=l[i++];
			}
			else {
				a[k++]=r[j++];
			}
		}
		while(i<left)
		{
			a[k++]=l[i++];
		}
		while(j<right)
		{
			a[k++]=r[j++];
		}

	}

	/* public static void mergeSortString(String[] names) {
        if (names.length>2) {
            String[] left = new String[names.length/2];
            String[] right = new String[names.length/ 2];

            for (int i=0;i<left.length;i++)
            {
                left[i]=names[i];
            }

            for (int i=0;i<right.length;i++)
            {
                right[i]=names[i+names.length/2];
            }

            mergeSortString(left);
            mergeSortString(right);
            mergeString(names,left,right);
        }
    }

    public static void mergeString(String[] names, String[] left,String[] right)
    {
        int a=0;
        int b=0;
        for (int i=0;i<names.length;i++)
        {
            if (b >=right.length || (a < left.length && left[a].compareToIgnoreCase(right[b]) < 0)) {
                names[i] = left[a];
                a++;
            } else {
                names[i] = right[b];
                b++;
            }
        }
    }*/
	//For payment salary method
	public static void getMonthlySalary(double p,int y,double R)
	{
		int month=12*y;
		double r=R/(12*100);
		//powering the denominator value as per the formula
		double power=Math.pow((1+r),-month);
		//Applied the formula
		double payment=((p*month)/(1-power));
		//
		System.out.println("Monthly payment is "+payment);

	}
	//Find sqrt using of the Newton method
	public static double getSqrtNewtons(double num)
	{
		double epsilon=1e-15;
		double t=num;			
		while(Math.abs(t-num/t)>epsilon*t)
		{
			t=(num/t+t)/2.0;
		}
		return t;
	}
	//to get the note counts of a Vending machine
	public static void getNoteCount(int amount,int[] array)
	{
		int notes=0;//per note count
		int totalcount=0;//for total number of counts
		for(int i=array.length-1;i>=0;i--)
		{

			if(amount/array[i]>=1)
			{
				int count=(int)Math.floor(amount/array[i]);
				notes=notes+count;
				//printing the per count notes value and count
				System.out.println("The number of count of note "+array[i]+ " is "+count+" Notes");
				amount=amount%array[i];
				totalcount++;//total number of counts increment
			}

		}
		System.out.println("Total number of counts are :"+totalcount);

	}
	//Static method to find the day
	public static int getDayOfWeek(int month,int date,int year) 
	{			
		year=year-(14-month)/12;;
		int x=year+(year/4)-year/100+year/400;
		month=month+12*((14-month)/12)-2;
		date=(date+x+31*month/12)%7;
		return date;
	} 
	//static method to find binary digits
	public static String getToBinary(int number)
	{
		int rem;
		String str="";
		int num=number;
		while(num>0)
		{
			rem=num%2;
			str+=rem;
			num=num/2;
		}
		return str;
	}
	//SwapNibbles
	public static int getSwapNibbles(int decimal) 
	{ 
		return ((decimal&0x0F)<<4|(decimal&0xF0)>>4); 
	} 
	//powerOf two
	//logic to find the power of 2
	public static String getPowerOf2(int pownumber)
	{ 
		String result="";
		for(int i=1;i<=pownumber;i++)
		{
			result+=(i*2)+" ";
		}
		return result;
	} 
}


