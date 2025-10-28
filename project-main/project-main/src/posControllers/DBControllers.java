
package posControllers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;




public class DBControllers {

    public static final String DBName = "possystem";
    public static final String DBDriver = "com.mysql.cj.jdbc.Driver";
    public static final String DBUrl = "jdbc:mysql://localhost:3306/" + DBName;
    public static final String DBUserName = "root";
    public static final String DBPassWord = "";
    
    public static Connection getConnection(){
        try{
            Connection conn = DriverManager.getConnection(DBUrl, DBUserName, DBPassWord);
            System.out.println("Connected to Database");
            return conn;
        } catch (SQLException e){
            System.out.println("Connection to Database Failed");
            return null;
        }
    }
   
}
