/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author mdeboer1
 */
public class Order {
    private Date orderDate;

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }
    
    public String getFormattedDate(String format){
        // Validate
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(orderDate);
    }
    
    public void setOrderDateFromString(String dateValue, String format) 
            throws ParseException{
        //Validate
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        orderDate = sdf.parse(dateValue);
    }    
}
