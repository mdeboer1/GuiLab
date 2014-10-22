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
public class DateDifference {
    Date start;
    Date end;
    Calendar calendar;
    Calendar calendar1;
    long startMinutes;
    long startHours;
    long endMinutes;
    long endHours;

    public final Date getStart() {
        return start;
    }

    public final void setStart(Date start) {
        this.start = start;
    }

    public final Date getEnd() {
        return end;
    }

    public final void setEnd(Date end) {
        this.end = end;
    }
    
    public void setStringToStartDate(String startDate, String format)throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        start = sdf.parse(startDate);
        calendar = Calendar.getInstance();
        calendar.setTime(start);
        long mmSecs = calendar.getTimeInMillis();
        startMinutes = mmSecs/1000/60;
        startHours = startMinutes/60;
        //subtract the amount of hours in minutes from minutes to ensure correct
        //display
    }
    
    public void setStringToEndDate(String endDate, String format)throws ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        end = sdf.parse(endDate);
        calendar1 = Calendar.getInstance();
        calendar1.setTime(end);
        long mmSecs = calendar.getTimeInMillis();
        endMinutes = mmSecs/1000/60;
        endHours = endMinutes/60;
        //subtract the amount of hours in minutes from minutes to ensure correct
        //display
    }
    
    public String getDateDiffernce(){
        return ;
    }
}
