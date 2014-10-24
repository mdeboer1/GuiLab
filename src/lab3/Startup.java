/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab3;

import java.text.ParseException;

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
