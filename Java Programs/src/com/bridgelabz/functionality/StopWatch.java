package com.bridgelabz.functionality;

import java.util.Date;

import com.bridgelabz.Utility.Utility;

public class StopWatch {
	private long startTime;
	private long endTime;
	private boolean isStarted=false;
	

	public void start()
	{
		if(isStarted==false)
		{
			System.out.println("StopWatch time Started");
		    startTime=System.currentTimeMillis();
		    isStarted=true;
		}
	}
	
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
	public long elapsedTime()
	{
		return (endTime-startTime);
	}
	public void time(long time)
	{
		if(isStarted==true)
		{
		int sec=(int)(time/1000.0);
		int milisec=(int)(time%1000.0);
		int min=sec/60;
		int hour=min/60;
		System.out.println("Hours"+hour+":"+min+":"+sec+":"+milisec);
		}
	}
	
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
