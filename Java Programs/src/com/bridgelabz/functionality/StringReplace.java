package com.bridgelabz.functionality;



import com.bridgelabz.Utility.Utility;
/******************************************************************************
 *  Purpose :To replace the <<Username>> String by user name and display output
 *  I/P     :Take User Name as Input.
 *  O/P     :Print the String by replacing the user name
 *  @author  BridgeLabz/punithhr
 *  @version 1.0
 *  @since   23-01-2019
 *******************************************************************************/

public class StringReplace {

	public static void main(String[] args) {
		System.out.println("Enter the username");
		String name=Utility.getString();
		String template="Hello <<UserName>>, How are you?";
		if(name.length()<3)
		{
			System.out.println("The username Should be more than three characters");;
		}
		String replacedString=template.replace("<<UserName>>",name);
		System.out.println(replacedString);
	}

}
