package edu.osu.cs362;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.Random;

import org.junit.Test;


import static org.junit.Assert.*;



/**
 * Random Test Generator  for TimeTable class.
 */

public class TimeTableRandomTest {
	private static final long TestTimeout = 60 * 50 * 1; /* Timeout at 30 seconds */
	private static final int NUM_TESTS=100;
    /**
     * Generate Random Tests that tests TimeTable Class.
     */
	 @Test
	  public void radnomtest()  throws Throwable  {

		 long startTime = Calendar.getInstance().getTimeInMillis();
		 long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;


		 System.out.println("Start testing...");


		 for (int iteration = 0; elapsed < TestTimeout; iteration++) {
			 long randomseed =10;//System.currentTimeMillis();
			 //			System.out.println(" Seed:"+randomseed );
			 Random random = new Random(randomseed);

			 TimeTable table = new TimeTable();
			 LinkedList<Appt> testList = new LinkedList<Appt>();


			 for (int i = 0; i < NUM_TESTS; i++) {
				 int startHour=ValuesGenerator.getRandomIntBetween(random, -10,30);
				 int startMinute=ValuesGenerator.getRandomIntBetween(random, -20,80);
				 int startDay= ValuesGenerator.getRandomIntBetween(random, -5,40);
				 int startMonth= ValuesGenerator.getRandomIntBetween(random, -3,15);
				 int startYear=2017;
				 String title="Birthday Party";
				 String description="This is my birthday party.";
				 //Construct a new Appointment object with the initial data
				 Appt appt = new Appt(startHour,
						 startMinute ,
						 startDay ,
						 startMonth ,
						 startYear ,
						 title,
						 description);
				 int startHour2=ValuesGenerator.getRandomIntBetween(random, -10,30);
				 int startMinute2=ValuesGenerator.getRandomIntBetween(random, -20,80);
				 int startDay2= ValuesGenerator.getRandomIntBetween(random, -5,40);
				 int startMonth2= ValuesGenerator.getRandomIntBetween(random, -3,15);
				 int startYear2=2017;
				 String title2="Birthday Party";
				 String description2="This is my birthday party.";
				 //Construct a new Appointment object with the initial data
				 Appt appt2 = new Appt(startHour2,
						 startMinute2 ,
						 startDay2 ,
						 startMonth2 ,
						 startYear2 ,
						 title2,
						 description2);
				 Appt appt3 = new Appt(startHour2,
						 startMinute2 ,
						 startDay2 ,
						 startMonth2 ,
						 startYear2 ,
						 title2,
						 "lol");

				 table.deleteAppt(null, null);

				 testList.add(appt);
				 testList.add(appt2);

				 table.deleteAppt(testList, appt);
				 table.deleteAppt(testList, appt2);
				 table.deleteAppt(testList, appt3);
			 }



			 elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
			 if((iteration%10000)==0 && iteration!=0 )
				 System.out.println("elapsed time: "+ elapsed + " of "+TestTimeout);

		 }


		 System.out.println("Done testing...");
	 }
	
}
