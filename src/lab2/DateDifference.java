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
 * This class calculates the date and time difference and has a toString method
 * that returns the number of hours and minutes between two date/times entered 
 * into the SimpleDateWindow GUI class.
 * @author mdeboer1
 */
public class DateDifference {
    private Date start;
    private Date end;
    private Calendar startCalendar;
    private Calendar endCalendar;
    private long hoursDifferent;
    private long minutesDifferent;
    private long startMmSecs;
    private long endMmSecs;
    private long diffMmSecs;

    
    public final void setDateTimes(String startDate, String endDate, String format) throws ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        start = sdf.parse(startDate);
        startCalendar = Calendar.getInstance();
        startCalendar.setTime(start);
        end = sdf.parse(endDate);
        endCalendar = Calendar.getInstance();
        endCalendar.setTime(end);
        startMmSecs = startCalendar.getTimeInMillis();
        endMmSecs = endCalendar.getTimeInMillis();
        diffMmSecs = endMmSecs - startMmSecs;
        minutesDifferent = diffMmSecs / 1000 / 60;
        hoursDifferent = minutesDifferent / 60;
        minutesDifferent = minutesDifferent - (hoursDifferent * 60);
    }
    
    @Override
    public final String toString(){
        String result = hoursDifferent + " hours, " + minutesDifferent + " minutes"; 
        return result;
    }
}
