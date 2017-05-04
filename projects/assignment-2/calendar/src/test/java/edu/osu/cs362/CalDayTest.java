package edu.osu.cs362;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalDayTest{
    @Test
    public void intialize(){
    CalDay myDay;
    myDay = new CalDay();
    assertEquals(myDay.iterator(),null);
    assertEquals(myDay.isValid(), false);
    assertEquals("", myDay.toString());

    }
    @Test
    public void appTest1(){
        String title = "Math midterm";
        String description = "Study chapters 1-4. Good luck!";
        int startHour = 14;
        int startMin = 30;
        int startDay = 18;
        int startMonth = 4;
        int startYear = 2017;
        boolean validDate = false;

        Appt appointment1 = new Appt(startHour, startMin, startDay, startMonth, startYear, title, description);

        GregorianCalendar date = new GregorianCalendar();
        CalDay day = new CalDay(date);
        assertEquals(0, day.getSizeAppts());
        day.addAppt(appointment1);
        assertEquals(1, day.getSizeAppts());

        Appt appointment2 = new Appt(7,15,16,5,2017,"Dam Jam", "Spring concert");
        day.addAppt(appointment2);
        assertEquals(2, day.getSizeAppts());
        String test = day.toString();
        if(test.contains("Dam Jam") && test.contains("Spring concert")){
            validDate = true;
        }
        assertTrue(validDate);
    }

    @Test
    public void appTest2(){
        String title = "Math midterm";
        String description = "Study chapters 1-4. Good luck!";
        int startHour = 14;
        int startMin = 30;
        int startDay = 18;
        int startMonth = 4;
        int startYear = 2017;
        boolean validDate = false;

        Appt appointment1 = new Appt(startHour, startMin, startDay, startMonth, startYear, title, description);

        GregorianCalendar date = new GregorianCalendar();
        CalDay day = new CalDay(date);
        assertEquals(0, day.getSizeAppts());
        day.addAppt(appointment1);
        assertEquals(1, day.getSizeAppts());

        Appt appointment2 = new Appt(16,15,16,5,2017,"Dam Jam", "Spring concert");
        day.addAppt(appointment2);
        assertEquals(2, day.getSizeAppts());
        String test = day.toString();
        if(test.contains("Dam Jam") && test.contains("Spring concert")){
            validDate = true;
        }
        assertTrue(validDate);

        Appt appointment3 = new Appt(25,15,16,5,2017,"Dam Jam", "Spring concert");
        day.addAppt(appointment3);

        day.valid = true;
        day.iterator();

    }
}
