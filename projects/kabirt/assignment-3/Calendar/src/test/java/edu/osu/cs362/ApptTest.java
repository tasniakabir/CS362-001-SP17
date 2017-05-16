package edu.osu.cs362;
/**
 *  This class provides a basic set of test cases for the
 *  Appt class.
 */
import org.junit.Test;

import static org.junit.Assert.*;

public class ApptTest {
	@Test
	public void test1(){
		String title = "Math midterm";
		String description = "Study chapters 1-4";
		int startHour = 0;
		int startMin = 30;
		int startDay = 18;
		int startMonth = 4;
		int startYear = 2017;

		Appt appt = new Appt(startHour, startMin, startDay, startMonth, startYear, title, description);

		assertTrue(appt.getValid());
		assertEquals(0, appt.getStartHour());
		assertEquals(30, appt.getStartMinute());
		assertEquals(18, appt.getStartDay());
		assertEquals(4, appt.getStartMonth());
		assertEquals(2017, appt.getStartYear());
		assertEquals("Math midterm", appt.getTitle());
		assertEquals("Study chapters 1-4", appt.getDescription());
	}

	@Test
	public void test2(){
		String title = null;
		String description = null;
		int startHour = 23;
		int startMin = 30;
		int startDay = 18;
		int startMonth = 4;
		int startYear = 2017;

		Appt appt = new Appt(startHour, startMin, startDay, startMonth, startYear, title, description);

		assertTrue(appt.getValid());
		assertEquals(23, appt.getStartHour());
		assertEquals(30, appt.getStartMinute());
		assertEquals(18, appt.getStartDay());
		assertEquals(4, appt.getStartMonth());
		assertEquals(2017, appt.getStartYear());
		assertEquals("", appt.getTitle());
		assertEquals("", appt.getDescription());

		appt.setStartHour(10);
		appt.setStartDay(20);
		appt.setStartMinute(25);
		appt.setStartMonth(3);
		appt.setStartYear(2018);

		assertEquals(10, appt.getStartHour());
		assertEquals(25, appt.getStartMinute());
		assertEquals(20, appt.getStartDay());
		assertEquals(3, appt.getStartMonth());
		assertEquals(2018, appt.getStartYear());
	}

	@Test
	public void test3(){
		String title = null;
		String description = null;
		int startHour = 25;
		int startMin = 50;
		int startDay = 12;
		int startMonth = 4;
		int startYear = 2017;

		Appt appt = new Appt(startHour, startMin, startDay, startMonth, startYear, title, description);

		assertEquals(false, appt.getValid());

		startHour = 20;
		startMin = 62;

		appt = new Appt(startHour, startMin, startDay, startMonth, startYear, title, description);

		assertEquals(false, appt.getValid());

		startMin = 40;
		startDay = 32;

		appt = new Appt(startHour, startMin, startDay, startMonth, startYear, title, description);

		assertEquals(false, appt.getValid());

		startDay = 30;
		startMonth = 14;

		appt = new Appt(startHour, startMin, startDay, startMonth, startYear, title, description);

		assertEquals(false, appt.getValid());
	}


	
}
