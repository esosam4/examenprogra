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
public class Agregar_materia extends javax.swing.JFrame {

    /**
     * Creates new form Agregar_materia
     */
    public Agregar_materia() {
        initComponents();
        setLocationRelativeTo(null);
        
         try{
         Connection cn=DriverManager.getConnection("jdbc:mysql://localhost/escuela", "root", "Ivansito07615.");
         PreparedStatement pst = cn.prepareStatement("select Nombre from profesor");
         ResultSet rs = pst.executeQuery();
         coordinador.addItem("Seleccione al coordinador");
         while(rs.next()){
             coordinador.addItem(rs.getString("Nombre"));
         }
        }catch(SQLException E){
            System.out.println(E);
            JOptionPane.showMessageDialog(rootPane, "Algo ha Ocurrido con la conexion", "ERROR",JOptionPane.ERROR_MESSAGE);
        }
         
         
        try{
         Connection cn=DriverManager.getConnection("jdbc:mysql://localhost/escuela", "root", "Ivansito07615.");
         PreparedStatement pst = cn.prepareStatement("select Nombre from profesor");
         ResultSet rs = pst.executeQuery();
         tutor.addItem("Seleccione al tutor");
         while(rs.next()){
             tutor.addItem(rs.getString("Nombre"));
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

        coordinador = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        tutor = new javax.swing.JComboBox<>();
        agregar_estudiante = new javax.swing.JButton();
        nombre = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("AGREGAR MATERIA");
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);

        coordinador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coordinadorActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre");

        agregar_estudiante.setText("AGREGAR");
        agregar_estudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregar_estudianteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(21, 21, 21)
                        .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(agregar_estudiante, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                        .addComponent(tutor, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(coordinador, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(coordinador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(agregar_estudiante)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void coordinadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coordinadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_coordinadorActionPerformed

    private void agregar_estudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregar_estudianteActionPerformed
        try{
            int opcion = coordinador.getSelectedIndex();
            int opcion2 = tutor.getSelectedIndex();
            

            Connection cn=DriverManager.getConnection("jdbc:mysql://localhost/escuela", "root", "Ivansito07615.");
            PreparedStatement pst = cn.prepareStatement("insert into materia values(?,?,?,?)");
            pst.setString(1,null);
            pst.setString(2,nombre.getText());
            pst.setString(3,String.valueOf(opcion));
            pst.setString(4,String.valueOf(opcion2));
            

            //limpiar campos

            nombre.setText("");
            JOptionPane.showMessageDialog(rootPane, "Materia agregada exitosamente");

            pst.executeUpdate();

        }catch (HeadlessException | SQLException E){
            System.out.println(E);
        }
    }//GEN-LAST:event_agregar_estudianteActionPerformed

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
            java.util.logging.Logger.getLogger(Agregar_materia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agregar_materia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agregar_materia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agregar_materia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agregar_materia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar_estudiante;
    private javax.swing.JComboBox<String> coordinador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField nombre;
    private javax.swing.JComboBox<String> tutor;
    // End of variables declaration//GEN-END:variables
}