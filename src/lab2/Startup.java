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
 * This is the startup class for this package.  It starts the SimpleDateWindow
 * GUI class.
 * @author mdeboer1
 */
public class Startup {
    public static void main(String[] args) throws ParseException {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SimpleDateWindow().setVisible(true);
            }
        });
    }
}
