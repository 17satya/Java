package com.bridgelabz.functionality;

public class StringPermutation {
		// Utility function to swap two characters in a character array
		private static void swap(char[] ch,int i,int j)
		{
			char temp=ch[i];
			ch[i]=ch[j];
			ch[j]=temp;
		}
		//Recursive function to generate all permutations of a String
		private static void permutations(char[] ch,int index)
		{ 
			if(index==ch.length-1) {
				System.out.println(String.valueOf(ch));
			}
			for (int i=index;i<ch.length;i++)
			{
				swap(ch,index,i);
				permutations(ch,index+1);
				swap(ch,index,i);
				
			}
			
		}
		

		// generate all permutations of a String in Java
		public static void main(String[] args)
		{
			String s="punith";
			permutations(s.toCharArray(),0);
		}
	
	}


