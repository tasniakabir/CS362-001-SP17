package edu.osu.cs362;
import java.sql.Time;
import java.util.Calendar;
import java.util.GregorianCalendar;

import java.util.LinkedList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

public class TimeTableTest{
	@Test
	public void test1(){
		int startHour = 12;
		int startDay = 7;
		int startMonth = 7;
		int startMin = 25;
		int startYear = 2017;

		String title = "Sight seeing";
		String description = "This will be fun";
		Appt appt  = new Appt(startHour, startMin, startDay, startMonth, startYear, title, description);
		TimeTable Time = new TimeTable();
		LinkedList<Appt> apps =  new LinkedList<Appt>();
		apps.add(appt);
		GregorianCalendar date1 =  new GregorianCalendar(2017,5,4);
		GregorianCalendar date2 = new GregorianCalendar(2017, 7,12);
		assertNotNull(Time.getApptRange(apps, date1, date2));

		GregorianCalendar date3 =  new GregorianCalendar(2017,3,4);
		GregorianCalendar date4 = new GregorianCalendar(2017, 9,12);
		assertNotNull(Time.getApptRange(apps, date3, date4));

	}

	@Test
	public void test2(){
		int startHour = 12;
		int startDay = 7;
		int startMonth = 7;
		int startMin = 25;
		int startYear = 2017;

		String title = "Sight seeing";
		String description = "This will be fun";
		Appt appt  = new Appt(startHour, startMin, startDay, startMonth, startYear, title, description);
		TimeTable Time = new TimeTable();
		LinkedList<Appt> apps =  new LinkedList<Appt>();
		apps.add(appt);
		GregorianCalendar date1 =  new GregorianCalendar(2017,5,4);
		GregorianCalendar date2 = new GregorianCalendar(2017, 7,12);
		try {
			assertNotNull(Time.getApptRange(apps, date2, date1));
		}catch(Exception e){
			System.out.print(e);
		};
		Time.deleteAppt(apps, appt);
		Appt appt2 = new Appt(20, startMin, startDay, startMonth, startYear, title, description);
		Appt appt3 = new Appt(10, startMin, startDay, startMonth, startYear, title, description);
		Time.deleteAppt(apps, appt2);
		Time.deleteAppt(null, null);
		apps.add(appt);
		apps.add(appt2);
		try {
			assertNotNull(Time.getApptRange(apps, date2, date1));
		}catch(Exception e){
			System.out.print(e);
		};

	}

	@Test
	public void test3(){
		int startHour = 12;
		int startDay = 7;
		int startMonth = 7;
		int startMin = 25;
		int startYear = 2017;

		String title = "Sight seeing";
		String description = "This will be fun";
		Appt appt  = new Appt(startHour, startMin, startDay, startMonth, startYear, title, description);
		Appt appt2  = new Appt(13, startMin, 8, startMonth, startYear, title, description);
		GregorianCalendar date1 =  new GregorianCalendar(2017,5,4);
		GregorianCalendar date2 = new GregorianCalendar(2017, 7,12);


		TimeTable Time = new TimeTable();
		LinkedList<Appt> apps =  new LinkedList<Appt>();
		apps.add(appt);
		//apps.add(appt2);
		LinkedList<CalDay> calDays = Time.getApptRange(apps, date1, date2);
		assertEquals(1, calDays.get(64).getAppts().size());
		assertNotEquals(null, Time.deleteAppt(apps, appt));

	}

}