/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escuela;

/**
 *
 * @author ellia
 */
public class Menu_agregar extends javax.swing.JFrame {

    /**
     * Creates new form Menu_agregar
     */
    public Menu_agregar() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        agregarAlumno = new javax.swing.JButton();
        agregarProfesor = new javax.swing.JButton();
        agregarAula = new javax.swing.JButton();
        agregarMateria = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("MENÚ AGREGAR");
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);

        agregarAlumno.setText("Agregar Alumno");
        agregarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarAlumnoActionPerformed(evt);
            }
        });

        agregarProfesor.setText("Agregar Profesor");
        agregarProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarProfesorActionPerformed(evt);
            }
        });

        agregarAula.setText("Agregar Aula");
        agregarAula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarAulaActionPerformed(evt);
            }
        });

        agregarMateria.setText("Agregar Materia");
        agregarMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarMateriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(agregarMateria, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(agregarAlumno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(agregarAula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(agregarProfesor, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                .addGap(0, 27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agregarAlumno)
                    .addComponent(agregarAula))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agregarMateria)
                    .addComponent(agregarProfesor))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agregarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarAlumnoActionPerformed
        Agregar_alumno agregar = new Agregar_alumno();
        agregar.setVisible(true); 
    }//GEN-LAST:event_agregarAlumnoActionPerformed

    private void agregarAulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarAulaActionPerformed
        Agregar_aula agregar = new Agregar_aula();
        agregar.setVisible(true); 
    }//GEN-LAST:event_agregarAulaActionPerformed

    private void agregarMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarMateriaActionPerformed
        Agregar_materia agregar = new Agregar_materia();
        agregar.setVisible(true); 
    }//GEN-LAST:event_agregarMateriaActionPerformed

    private void agregarProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarProfesorActionPerformed
        Agregar_profesor agregar = new Agregar_profesor();
        agregar.setVisible(true); 
    }//GEN-LAST:event_agregarProfesorActionPerformed

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
            java.util.logging.Logger.getLogger(Menu_agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_agregar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarAlumno;
    private javax.swing.JButton agregarAula;
    private javax.swing.JButton agregarMateria;
    private javax.swing.JButton agregarProfesor;
    // End of variables declaration//GEN-END:variables
}
