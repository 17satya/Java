package com.bridgelabz.functionality;

import java.util.Date;


import com.bridgelabz.Utility.Utility;
/******************************************************************************
 *  Purpose :Write a Stopwatch Program for measuring the time that elapses
 *  		 between the start and end click
 *  I/P     :Start the Stopwatch and End the Stopwatch
 *  O/P     :Measure the elapsed time between start and end. Print the elapsed time.
 *  @author  BridgeLabz/punithhr
 *  @version 1.0
 *  @since   24-01-2019  
 *******************************************************************************/

public class StopWatch {
	private long startTime;
	private long endTime;
	private boolean isStarted=false;

	//to start the StopWatch
	public void start()
	{
		if(isStarted==false)
		{
			System.out.println("StopWatch time Started");
			startTime=System.currentTimeMillis();
			isStarted=true;
		}
	}
	////to stop the StopWatch
	public void stop()
	{
		if(isStarted==true) 
		{
			endTime=System.currentTimeMillis();
			System.out.println("StopWatch time ended");
		}
		else
		{
			System.out.println("Before Stoping the StopWatch first Start the StopWatch");
		}

	}
	//to find the time spent from start to stop
	public long elapsedTime()
	{
		return (endTime-startTime);
	}
	//this method for finding miliseconds,minutes,seconds,hours
	public void time(long time)
	{
		if(isStarted==true)
		{

			int milisec=(int)(time%1000.0);
			int sec=(int)(time/1000.0);
			int min=sec/60;
			int hour=min/60;
			System.out.println("Hours:"+hour+" Minutes:"+min+" Seconds:"+sec+" Miliseconds:"+milisec);
		}
	}
	//method for stopWatch
	public static void main(String[] args) {


		StopWatch sw=new StopWatch();
		int ch=0;

		System.out.println("************Enter your choice*******");
		System.out.println("            1->StartWatch");
		System.out.println("            2->StopWatch");
		while(ch!=2)
		{
			ch=Utility.getInt();
			switch(ch)
			{
			case 1:sw.start();
			break;
			case 2:sw.stop();
			sw.time(sw.elapsedTime());
			break;
			}

		}


	}

}
