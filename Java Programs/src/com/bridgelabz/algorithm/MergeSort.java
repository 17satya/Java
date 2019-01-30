package com.bridgelabz.algorithm;

import com.bridgelabz.Utility.Utility;

public class MergeSort {
	
	public static void main(String[] args) {
		System.out.println("Enetr the line of words");
		String line=Utility.getStringLine();
		String[] words=line.split(" ");
		String[] sorted=Utility.mergeSort(words);
		System.out.println("The Sorted values of string are :");
	        //Arrays.sort(names);
	        for (String sort:sorted)
	        {
	            System.out.println(sort);
	        }
	}

}
