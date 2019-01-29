package com.bridgelabz.algorithm;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import com.bridgelabz.Utility.Utility;
/******************************************************************************
 *  Purpose :Read in a list of words from File. Then prompt the user to enter a word
 *  		 to search the list. The program reports if the search word is found in the list.
 *  I/P     :read in the list words comma separated from a File and then 
 *  		 enter the word to be searched
 *  O/P     :Printing the result if the word is found or not
 *  @author  BridgeLabz/punithhr
 *  @version 1.0
 *  @since   29-01-2019  
 *******************************************************************************/

public class BinarySearch {

	public static void main(String[] args) {
		BufferedReader br=null;
		try{
			//given the path to read
			String path="/home/admin1/eclipse-workspace/Java Programs/src/com/bridgelabz/algorithm/BinarySearch.txt";
			//passing the path to read using bufferReader
			br=new BufferedReader(new FileReader(path));
			//given path file is read and stored in string object
			String line=br.readLine();
			//taken the input from the user to find the word in the file
			System.out.println("Enter the Element to find ");
			String find=Utility.getString();
			//reading the file untill the line becomes null
			while(line!=null)
			{	
				//replacing all special characters from the Empty String
				line=line.replaceAll("[^a-zA-Z0-9 ]","");
				//spliting the read line by space
				String[] stringarray=line.split(" ");
				//Calling the binary Search to find the given string if found returns position else -1
				int result=Utility.getBinarySearchString(stringarray,find);
				//Checking the element is found or not
				if(result==-1)
				{
					System.out.println("The given Element "+find+" is not found");
				}
				else
				{
					System.out.println("The given element "+find+" is found at position: "+result);
				}
				//reading the next line if present in the file
				line=br.readLine();
			}
		} 
		//handling the IO Exceptions
		catch(IOException ioe) 
		{
			ioe.printStackTrace();
		} 
		finally 
		{
			try
			{
				//Closing the buffer reader
				if(br!=null)
					br.close();
			} 
			//handling the IO Exceptions
			catch(IOException ioe) 
			{
				System.out.println("Error in closing the BufferedReader");
			}
		}
	}

}


