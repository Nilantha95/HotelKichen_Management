/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import com.sun.jdi.connect.spi.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;

/**
 *
 * @author CSN
 */
public class databaseCon {
    
    public static Connection dbCon = null;
    public static void loadConnection()
    {
        String url = "jdbc:mysql://localhost:3306/hotelmgt";
        String root = "root";
        String pass = "";
        
        try {
            
            dbCon =   (Connection) DriverManager.getConnection(url, root, pass);
            
            if(dbCon != null)
            {
                JOptionPane.showMessageDialog(null, "Database has been successfully connected ");
            }            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error in database loading" + e);
        }
    }
    
}
