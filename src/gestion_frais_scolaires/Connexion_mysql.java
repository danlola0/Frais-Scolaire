/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion_frais_scolaires;

import javax.swing.JOptionPane;
import java.sql.*;
public class Connexion_mysql {
    
    
    
public Connection conn = null;
    Statement stat = null;
    String url = "jdbc:mysql://localhost:3308/axel";
    String user = "root";
    String motpass = "";

    public Connexion_mysql() {
        
    }
    
    public Connection getConn(){
        return conn;
    }
    

    public ResultSet getResultat(String requete) {
        try {

            conn = DriverManager.getConnection(url,user,motpass);
            stat = conn.createStatement();
            
            if (requete.toLowerCase().contains("select")) {
                return stat.executeQuery(requete);
            } else if (requete.toLowerCase().contains("insert")) {
                stat.executeUpdate(requete);
                JOptionPane.showMessageDialog(null, "Enregistrement reussit avec succès");
                
            } else if (requete.toLowerCase().contains("delete")) {
                 stat.executeUpdate(requete);
                JOptionPane.showMessageDialog(null, "suppression reussit avec succès");
               
            } else if (requete.toLowerCase().contains("update")) {
                  stat.executeUpdate(requete);
                JOptionPane.showMessageDialog(null, "modification reussit avec succès");
              
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erreur au niveau de la connexion: " + ex);
        }
        return null;
    }

    public void fermerConnexion() {
        try {
            conn.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erreur de fermeture: " + ex);
        }

    }
    
    
}