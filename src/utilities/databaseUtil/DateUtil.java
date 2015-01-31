package utilities.databaseUtil;

import java.text.SimpleDateFormat;
import java.sql.Date;

/**
 *
 * @author CVD
 */
public class DateUtil {
    
    public static java.sql.Timestamp toSqlTimestamp(java.util.Date  date) {
        java.sql.Timestamp sqlTimestamp = new java.sql.Timestamp(date.getTime());
        return sqlTimestamp;
    }
    
    public static String fromSqlTimestampToString(Date date)
    {
       SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy:HH:mm");
       String dateString = simpleDateFormat.format(date);
       return dateString;
    }   
    
    public static String fromUtilDateToString(java.util.Date date)
    {
       SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy:HH:mm");
       String dateString = simpleDateFormat.format(date);
       return dateString;
    } 
    
}
