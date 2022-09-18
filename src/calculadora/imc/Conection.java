/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora.imc;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author alumno
 */
public class Conection {
    public static final String URL="jdbc:mysql://127.0.0.1:3306/?user=root";
    public static final String USERNAME="root";
    public static final String PASSWORD="Umg$2019";
    
    PreparedStatement ps;
    ResultSet rs;
    
    public static Connection getConection(){
        
        Connection con = null;
        
        try{
            Class.forName("com.mysql,jdbc.Driver");
            con= (Connection) DriverManager.getConnection(URL, USERNAME, PASSWORD);
        }
        
        catch(Exception e){
            System.out.print(e);
        } 
        return null;
    }
}
