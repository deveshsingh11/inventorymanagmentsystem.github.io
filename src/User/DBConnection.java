/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;
import java.sql.*;

/**
 *
 * @author dcdev
 */
public class DBConnection {
        // we need to set the connection first
    static final String DB_URL =  "jdbc:mysql://localhost/demo";
        static final String USER  =  "root";
        static final String PASS = "";
        public static Connection connectDB(){
            Connection conn = null;
            try{
                //register jdbc driver, not required fro new-version of jdk
                //Class.forName("com.mysql.jdbc.Driver");
                //open a connection
                conn = DriverManager.getConnection(DB_URL, USER, PASS);
                return conn;
            }catch(Exception ex){
                System.out.println("There is error while connecting to the database");
                return null;
            }
        }
}



