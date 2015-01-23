package utilities.databaseUtil;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
   A simple data source for getting database connections. 
*/
public class DataBaseConnector
{

   private static String dbserver;
   private static String database;
   private static String username;
   private static String password;

   private static Connection activeConn;

   /**
      Initializes the data source.
      Checks if MySQL Driver is found
      contains the database driver,
      Fill variabels dbserver, database, username, and password
   */
   private static void init()
         
   {
      try {
        String driver = "com.mysql.jdbc.Driver";
        Class.forName(driver);
      }
      catch (ClassNotFoundException e) {
          System.err.println("No suitable driver");
      }

      dbserver="localhost";
      database="FullHouseGr11";
      username = "root";
      password = "03D99E09F7";
   }

   /**
      Gets a connection to the database.
      @return the database connection
     * @throws java.sql.SQLException
   */
   public static Connection getConnection() throws SQLException
   {
       if (activeConn==null) {
           init();
           activeConn=createConnection();
       }

       return activeConn;

   }

   private static Connection createConnection() throws SQLException
   {

        String connectionString = "jdbc:mysql://" + dbserver + "/" + database + "?" +
                "user=" + username + "&password=" + password;

       return DriverManager.getConnection(connectionString);
   }
}
