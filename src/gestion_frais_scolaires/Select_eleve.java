/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion_frais_scolaires;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Geek Man
 */
public class Select_eleve extends javax.swing.JFrame {

    Connexion_mysql mycon = new Connexion_mysql();
    
    private ResultSet Rs;
    
    Map<String, String> matEleve = new HashMap<>();
    
    String Matricule, Nom, Postnom, Prenom, Sexe, Classe, Date_naiss, matCaissier, nomCaissier;
    DefaultTableModel dt = new DefaultTableModel();
    
    public Select_eleve() {
        initComponents();
    }
    
    public Select_eleve(String matCaissier, String nomCaissier){
        this();
        
        this.matCaissier = matCaissier;
        this.nomCaissier = nomCaissier;
        lMatcaissier.setText(matCaissier);
        lNomcaissier.setText(nomCaissier);
   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        tChercher = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        dteleve = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lMatcaissier = new javax.swing.JLabel();
        lNomcaissier = new javax.swing.JLabel();
        lMatricule = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jButton5.setText("Rechercher");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(tChercher, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tChercher))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton5.getAccessibleContext().setAccessibleParent(this);

        dteleve.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        dteleve.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dteleveMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(dteleve);

        jButton1.setText("Selectionner");
        jButton1.setEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 51, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Selectionner l'élève qui veut payer");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lNomcaissier)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lMatcaissier))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lMatcaissier)
                    .addComponent(lNomcaissier))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        lMatricule.setText("ID");

        jButton2.setText("Aller directement au paiement");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 617, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lMatricule)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                            .addComponent(lMatricule, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2))
        );

        getAccessibleContext().setAccessibleParent(this);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void afficherSEleve() throws SQLException {
        String query = "SELECT * FROM eleves";
        Rs = mycon.getResultat(query);
        dt.setRowCount(0);
        try{
            while(Rs.next()){
                Matricule = Rs.getString("Matricule_Eleve");
                Nom = Rs.getString("NOM");
                Postnom = Rs.getString("POSTNOM");
                Prenom = Rs.getString("PRENOM");
                Sexe = Rs.getString("SEXE");
                Classe = Rs.getString("CLASSE");
                Date_naiss = Rs.getString("DATE_NAISSANCE");
                
                matEleve.put(Nom, Matricule);
                
                Object[] Table = {Matricule,Nom,Postnom,Prenom,Sexe,Classe, Date_naiss};
                dt.addRow(Table);
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Erreur d'affichage\n"+ex.getMessage());
        }
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String nomEleve= Nom;
        new Paiement(Matricule, nomEleve, matCaissier, nomCaissier, Classe).show();
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        dt= new DefaultTableModel();
        dt.addColumn("Matricule");
        dt.addColumn("Nom");
        dt.addColumn("Postnom");
        dt.addColumn("Prénom");
        dt.addColumn("Sexe");
        dt.addColumn("Classe");
        dt.addColumn("Date de naissance");
        dteleve.setModel(dt);
        
        try {
            afficherSEleve();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erreur d'Enregistrement\n"+ex.getMessage());
        }
    }//GEN-LAST:event_formWindowOpened

    private void dteleveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dteleveMouseClicked
        DefaultTableModel dl = (DefaultTableModel)dteleve.getModel();
        int index = dteleve.getSelectedRow();
        
        matCaissier = lMatcaissier.getText();
        lMatricule.setText(dl.getValueAt(index, 0).toString());
        Nom = dl.getValueAt(index, 1).toString();
        Matricule = matEleve.get(Nom);
        Postnom = dl.getValueAt(index, 2).toString();
        Prenom = dl.getValueAt(index, 3).toString();
        jButton1.setEnabled(true);
        
    }//GEN-LAST:event_dteleveMouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String query = "SELECT * FROM eleves WHERE Matricule_Eleve='" + tChercher.getText() + "' OR NOM='" + tChercher.getText() + "' OR POSTNOM='" +
                                                                        tChercher.getText() + "' OR PRENOM='" + tChercher.getText() + "' OR SEXE='" +
                                                                        tChercher.getText() + "' OR CLASSE='" + tChercher.getText() + "' OR DATE_NAISSANCE='" +
                                                                        tChercher.getText() + "'";
        Rs = mycon.getResultat(query);
        dt.setRowCount(0);
        try{
            while(Rs.next()){
                Matricule = Rs.getString("Matricule_Eleve");
                Nom = Rs.getString("NOM");
                Postnom = Rs.getString("POSTNOM");
                Prenom = Rs.getString("PRENOM");
                Sexe = Rs.getString("SEXE");
                Classe = Rs.getString("CLASSE");
                Date_naiss = Rs.getString("DATE_NAISSANCE");
                
                Object[] Table = {Matricule,Nom,Postnom,Prenom,Sexe,Classe, Date_naiss};
                dt.addRow(Table);
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Erreur d'affichage\n"+ex.getMessage());
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String nomEleve= Nom;
        new Paiement(Matricule, nomEleve, matCaissier, nomCaissier, Classe).show();
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Select_eleve.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Select_eleve.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Select_eleve.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Select_eleve.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Select_eleve().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable dteleve;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lMatcaissier;
    private javax.swing.JLabel lMatricule;
    private javax.swing.JLabel lNomcaissier;
    private javax.swing.JTextField tChercher;
    // End of variables declaration//GEN-END:variables
}