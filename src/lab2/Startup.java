/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author mdeboer1
 */
public class Startup {
    public static void main(String[] args) throws ParseException {
        Demo1 demo1 = new Demo1();
        Date date = demo1.getCurrentDateTime();
        Calendar calendar = demo1.getCurrentCalendar();
        // Putting a at the end creates a am/pm 12 hour time, z adds time zone abbreviated
        // Giving a single parameter eliminates leading zeros on the format
        // SimpleDateFormat requires a Date object, cannot be used with Calendar
        SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy h:mm:ss a");
        SimpleDateFormat sdf2 = new SimpleDateFormat("M/d/yyyy h:mm a z");
        // Convert Date to String
        System.out.println(sdf.format(date));
        // sdf can only be used with calendar if you return a date object with the method
        // getTime()
        System.out.println(sdf2.format(calendar.getTime()));
        
        // Convert String into a Date, String must be in correct format or it will crash
        String s ="10/20/2014 6:19:08 PM";
        Date date2 = sdf.parse(s);
        System.out.println(date2);
        // Parse into a Calendar object
        Calendar cal2 = Calendar.getInstance();
        cal2.setTime(date2);
        System.out.println(cal2.getTime());
        
        //Date difference
        Calendar startDate = Calendar.getInstance();
        // Allows a specific date to be set
        startDate.set(2014, Calendar.JANUARY, 1);
        // Changes the date from the above line
        startDate.roll(Calendar.YEAR, -2);
        Calendar endDate = Calendar.getInstance();
        // Allows a specific date to be set
        endDate.set(2014, Calendar.JANUARY, 15);
        
        long startMsecs = startDate.getTimeInMillis();
        long endMsecs = endDate.getTimeInMillis();
        
        long difference = endMsecs - startMsecs;
        // Turns milliseconds into days with formula below
        long days = difference/1000/60/60/24;
        System.out.println("Days between dates: " + days);
    }
}
