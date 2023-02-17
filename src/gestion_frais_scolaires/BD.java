/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion_frais_scolaires;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Danlola
 */
public class BD {
   
Connection con; 

 public Connection getBD(){
    
     try {
         
   Class.forName("com.mysql.jdbc.Driver");
   
   con=DriverManager.getConnection("jdbc:mysql://localhost/axel","root","");
         JOptionPane.showConfirmDialog(null, "Conncetion reussie");
         return con;
         
         
     } catch (Exception e) {
         
        System.out.println("pas de connection sur votre BD"+e);
     }
   
    
    
    return null;
    
    
    
}
    
    
}
