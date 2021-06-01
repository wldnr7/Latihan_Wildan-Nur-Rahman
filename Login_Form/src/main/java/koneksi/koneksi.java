/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class koneksi {
     public Connection con;
     public Statement stat;

    public void getConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/login_data", "root", "");
            stat = con.createStatement();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
       
    }
    
}
