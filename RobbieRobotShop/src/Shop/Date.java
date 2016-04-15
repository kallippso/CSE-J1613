
package Shop;          // Change to whatever package name will be

/**
 * Name: John Ngo
 * ID: 1000893775
 * Class: CSE 1325 - 003
 * Description: For Group J1613's Robot Project - the class defining a Date
 */

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Date {
    
    //private instance variables
    private int month, day, year;
    
    //constructors
    public Date()                                   // creates a date using today's date
    {
        GregorianCalendar cal = new GregorianCalendar();
        month = cal.get(Calendar.MONTH) + 1;
        day = cal.get(Calendar.DAY_OF_MONTH);
        year = cal.get(Calendar.YEAR);
    }
     
    public Date(int m, int d, int y)                // creates a date from a specified month, day, and year
    {
        month = m;
        day = d;
        year = y;
    }
    
    public Date(String date)                        // creates a date from a string in the "mm/dd/yy" format
    {
        String[] parts = date.split("/");
	month = Integer.parseInt(parts[0]);
	day = Integer.parseInt(parts[1]);
	year = Integer.parseInt(parts[2]);
    }
    
    //methods
    @Override
    public String toString() {
	return month + "/" + day + "/" + year;
    }
    
    public static void main(String[] args) {
        Date test = new Date();
        System.out.println(test);
        
        Date test2 = new Date(1,1,2015);
        System.out.println(test2);
        
        Date test3 = new Date(test.toString());
        System.out.println(test3);
    }
}
