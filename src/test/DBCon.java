/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author Windows
 */
import java.sql.*;
public  class DBCon {
    static Connection con=null;
    static
    {
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
           con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","samarth");
        }
        catch(Exception e)
        {
            
        }
    }
    public static Connection getcon()
    {
        return con;
    }
}
    

