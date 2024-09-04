/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lms.connection;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author DELL
 */
public class ProvideConnection {
    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/tution_hub";
            Connection con = DriverManager.getConnection(url, "root", "");
            System.out.println("Connection established");
            return con;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
}
