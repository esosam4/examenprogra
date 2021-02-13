/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escuela;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ellia
 */
public class Agregar_aula extends javax.swing.JFrame {

    /**
     * Creates new form Agregar_aula
     */
    public Agregar_aula() {
        initComponents();
        setLocationRelativeTo(null);
        
         try{
         Connection cn=DriverManager.getConnection("jdbc:mysql://localhost/escuela", "root", "Ivansito07615.");
         PreparedStatement pst = cn.prepareStatement("select Grado from grado");
         ResultSet rs = pst.executeQuery();
         grado.addItem("Grado");
         while(rs.next()){
             grado.addItem(rs.getString("Grado"));
         }
        }catch(SQLException E){
            System.out.println(E);
            JOptionPane.showMessageDialog(rootPane, "Algo ha Ocurrido con la conexion", "ERROR",JOptionPane.ERROR_MESSAGE);
        }
         
         
        try{
         Connection cn=DriverManager.getConnection("jdbc:mysql://localhost/escuela", "root", "Ivansito07615.");
         PreparedStatement pst = cn.prepareStatement("select Seccion from seccion");
         ResultSet rs = pst.executeQuery();
         seccion.addItem("Seccion");
         while(rs.next()){
             seccion.addItem(rs.getString("Seccion"));
         }
        }catch(SQLException E){
            System.out.println(E);
            JOptionPane.showMessageDialog(rootPane, "Algo ha Ocurrido con la conexion", "ERROR",JOptionPane.ERROR_MESSAGE);
        } 
        
        try{
         Connection cn=DriverManager.getConnection("jdbc:mysql://localhost/escuela", "root", "Ivansito07615.");
         PreparedStatement pst = cn.prepareStatement("select Nombre from recursosaula");
         ResultSet rs = pst.executeQuery();
         recurso.addItem("Recursos");
         while(rs.next()){
             recurso.addItem(rs.getString("Nombre"));
         }
        }catch(SQLException E){
            System.out.println(E);
            JOptionPane.showMessageDialog(rootPane, "Algo ha Ocurrido con la conexion", "ERROR",JOptionPane.ERROR_MESSAGE);
        } 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grado = new javax.swing.JComboBox<>();
        seccion = new javax.swing.JComboBox<>();
        recurso = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("AGREGAR AULA");
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);

        jButton1.setText("AGREGAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(recurso, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(grado, 0, 111, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(seccion, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(grado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(recurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
          int opcion = grado.getSelectedIndex();  
          int opcion2 = seccion.getSelectedIndex();
          int opcion3 = recurso.getSelectedIndex();
          
          Connection cn=DriverManager.getConnection("jdbc:mysql://localhost/escuela", "root", "Ivansito07615.");
          PreparedStatement pst = cn.prepareStatement("insert into aula values(?,?,?,?,?)");
          pst.setString(1,null);
          pst.setInt(2,opcion);
          pst.setInt(3,opcion2);
          pst.setInt(4,opcion3); 
          pst.setString(5,"0");
  
        JOptionPane.showMessageDialog(rootPane, "Aula agregada exitosamente"); 
         
        pst.executeUpdate();
          
      }catch (HeadlessException | SQLException E){
          System.out.println(E);
      }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Agregar_aula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agregar_aula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agregar_aula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agregar_aula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agregar_aula().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> grado;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> recurso;
    private javax.swing.JComboBox<String> seccion;
    // End of variables declaration//GEN-END:variables
}