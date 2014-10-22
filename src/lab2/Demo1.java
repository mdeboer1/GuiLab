/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab2;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author mdeboer1
 */
public class Demo1 {
    public Date getCurrentDateTime(){
        Date currentDate = new Date();
        return currentDate;
    }
    
    public Date getSpecificDateTime(){
        //This is an illegal use of the Date class
        Date currentDate = new Date(2015-1900, 0, 1);
        return currentDate;
    }
    

    public Calendar getCurrentCalendar(){
        Calendar calendar = Calendar.getInstance();
        return calendar;
    }
}
