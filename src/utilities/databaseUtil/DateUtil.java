package utilities.databaseUtil;

import java.text.SimpleDateFormat;
import java.sql.Date;

/**
 *
 * @author CVD
 */
public class DateUtil {
    
    public static java.sql.Date toSqlDate(java.util.Date  date) {
        java.sql.Date sqlDate = new java.sql.Date(date.getTime());
        return sqlDate;
    }
        
    public static String fromSqlDateToString(Date date)
    {
       SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy:HH:mm");
       String dateString = simpleDateFormat.format(date);
       return dateString;
    }   
    
}
