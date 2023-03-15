
package com.mycompany.speedruncrud;
import java.sql.*;
/**
 *
 * @author krizk
 */
public class koneksi {
       private static Connection mysqlconfig;
       public static Connection configDB() throws SQLException {
           try{
               String url = "jdbc:mysql://localhost/data_siswa";
               String username = "root";
               String pass = "";
               DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
               mysqlconfig = DriverManager.getConnection(url, username, pass);
           } catch(Exception e) {
               System.out.println(e.getMessage());
           }
           
           return mysqlconfig; 
       }
}
