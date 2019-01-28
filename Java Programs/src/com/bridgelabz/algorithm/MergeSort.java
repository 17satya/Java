package com.bridgelabz.algorithm;

import java.util.Arrays;

import com.bridgelabz.Utility.Utility;

public class MergeSort {
	
	public static void main(String[] args) {
		int[] actual={ 5, 1, 6, 2, 3, 4 };
		int[] res=Utility.mergeSort(actual,actual.length);
		if(res.length==actual.length)
		{
			System.out.println(Arrays.toString(res));
		}
		/*  String[] ClassOne = { "Kring", "Panda", "Soliel", "Darryl", "Chan", "Matang", "Jollibee.", "Inasal" };
	        String[] names = new String[ClassOne.length];

	        Utility.mergeSortString(ClassOne);
	        Utility.mergeSortString(names);
	        //Arrays.sort(names);

	        for (String ClassThree:names)
	        {
	            System.out.println(ClassThree);
	        }*/
	}

}
