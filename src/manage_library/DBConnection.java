/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manage_library;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Manish
 */
public class DBConnection {
    
    static Connection con;
    public static Connection getConnection()
    {
        
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lms","root","Admin@21");
            Statement statment = (Statement) con.createStatement();
        }
        catch(ClassNotFoundException | SQLException e)
        {
        }
        return con;
    }
    Object Statment;
    }
    
    
    

