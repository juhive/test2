/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack;


import java.sql.*;
import javax.ejb.Stateless;
import javax.jws.WebParam;

/**
 *
 * @author yesufu1u
 */
@Stateless
public class MessageSessionBean implements MessageSessionBeanRemote {

     public void post(String key, String value) {
     
            String url = "jdbc:derby://localhost:1527/bean_user"; 
            String username = "bean_user";
            String password = "beanuser";
            String driver = "org.apache.derby.jdbc.ClientDriver";
            
          try { 
            Class.forName(driver).newInstance();
            Connection conn = DriverManager.getConnection(url,username,password); 
            Statement st = (Statement) conn.createStatement(); 
            st.executeUpdate("INSERT INTO Message " + 
                "VALUES ('" + key + "', '" + value + "')"); 

            conn.close(); 
        } catch (Exception e) { 
            System.err.println("Got an exception! "); 
            System.err.println(e.getMessage()); 
        } 
          
     }
}
