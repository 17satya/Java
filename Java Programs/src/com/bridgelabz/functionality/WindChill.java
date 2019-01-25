package com.bridgelabz.functionality;

/******************************************************************************
 *  Purpose :Takes two double command-line arguments t and v and print the 
 *  			wind chill.
 *  I/P     :T and V inputs From command-line Arguments
 *  O/P     :Prints the Wind chill by calculating temperature and Wind 
 *  @author  BridgeLabz/punithhr
 *  @version 1.0
 *  @since   24-01-2019  
 *******************************************************************************/
public class WindChill {
	public static void main(String[] args) {
		//Validating the inputs are correct are not
		try
		{
			//Taking inputs from the command-line arguments
			double t=Double.parseDouble(args[0]);
			double v=Double.parseDouble(args[1]);
			//validating the v and t values
			if(t<50 &&(v<120||v>3))
			{
			//formula to find the WindChill
			double w=35.74+0.6215*t+(0.4275*t-35.75)*Math.pow(v,0.16);
			//Displaying the Output	
			System.out.println("Wind chill= "+w);
			}
			else
			{
				System.out.println("Give the T value less than 50 and V value should be less than 120 and greater than 3");
			}
		}
		catch(NumberFormatException e)
		{
			System.out.println("Enter the input like 1,2 and 1.1"+e.getMessage());
		}
		
	}

}





