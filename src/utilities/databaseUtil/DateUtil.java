package utilities.databaseUtil;

import java.text.SimpleDateFormat;
import java.sql.Date;

/**
 *
 * @author remcoruijsenaars
 */
public class DateUtil {
    
        public static java.sql.Date toSqlDate(int minute, int hour, int day, int month, int year) {

            java.util.Calendar cal = java.util.Calendar.getInstance();

            //Clear all fields
            cal.clear();

            cal.set(java.util.Calendar.YEAR, year);
            cal.set(java.util.Calendar.MONTH, month-1); //start bij 0, januari is dus maand 0
            cal.set(java.util.Calendar.DAY_OF_MONTH, day);
            cal.set(java.util.Calendar.HOUR, hour);
            cal.set(java.util.Calendar.MINUTE, minute);
           
            //Create instance of java.sql.Date
            Date sqlDate = new java.sql.Date(cal.getTimeInMillis());

            return sqlDate;

        }
        
        
     public static String fromSqlDateToString(Date date)
     {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy:HH:mm");
        String dateString = simpleDateFormat.format(date);
        return dateString;
     }   
    
}
