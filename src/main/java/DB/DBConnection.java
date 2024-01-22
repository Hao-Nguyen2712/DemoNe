/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Laptop
 */
public class DBConnection {

    public static Connection connect() throws ClassNotFoundException, SQLException {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        // tao doi tuong connect
        Connection conn = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-N2G9N3D\\SQLEXPRESS:1433;databaseName=nghien_nhua;user=sa;password=27122003;encrypt=true;trustServerCertificate=true");
        return conn;
    }   
}
