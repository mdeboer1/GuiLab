/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import static java.time.temporal.ChronoUnit.HOURS;
import static java.time.temporal.ChronoUnit.MINUTES;

/**
 *
 * @author mdeboer1
 */
public class DateDifference {
    private long hours ;
    private long minutes;
    
    public final void setDateTimes(String dateStartValue, String dateEndValue,
            String format){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/d/yyyy H:mm:ss");
        LocalDateTime start = LocalDateTime.parse(dateStartValue, formatter);
        LocalDateTime end = LocalDateTime.parse(dateEndValue, formatter);
        minutes = MINUTES.between(start, end);
        hours = HOURS.between(start, end);
        minutes = minutes - (hours * 60);
    }
    
    @Override
    public final String toString(){
        String result = hours + " hours, " + minutes + " minutes.";
        return result;
    }
}
