/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iniciar_Sesión_Paquete;
import Main_paquete.Bdd;
import Usuario_Paquete.Main_usuario;

import java.sql.Connection;
import javax.swing.JOptionPane;
/**
 *
 * @author HP OMEN
 */
public class Inicio_Sesion extends javax.swing.JFrame {
    boolean[] Bandera=new boolean[2];
    Bdd bdd= new Bdd();
    
    Connection conexion = null;
    
    /**
     * Creates new form Inicio_Sesio
     */
    public Inicio_Sesion() {
        initComponents();
        
        try{
            conexion=bdd.Conectar();
        }catch(Exception e){
            
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        JNombre = new javax.swing.JTextField();
        JContraseña1 = new javax.swing.JTextField();
        Envio_data = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Ingrese para iniciar Sesión");

        JNombre.setText("Ingrese nombre");
        JNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                JNombreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                JNombreFocusLost(evt);
            }
        });
        JNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JNombreActionPerformed(evt);
            }
        });

        JContraseña1.setText("Ingrese contraseña");
        JContraseña1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                JContraseña1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                JContraseña1FocusLost(evt);
            }
        });

        Envio_data.setText("Iniciar Sesion");
        Envio_data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Envio_dataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(182, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(160, 160, 160))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Envio_data)
                    .addComponent(JContraseña1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(59, 59, 59)
                .addComponent(JNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(JContraseña1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84)
                .addComponent(Envio_data)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JNombreFocusGained
        if (!Bandera[0]) {
            JNombre.setText("");
            Bandera[0] = true;
        }
    }//GEN-LAST:event_JNombreFocusGained

    private void JNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JNombreFocusLost
        if(JNombre.getText().isEmpty()){
            JNombre.setText("Ingrese nombre");
            Bandera[0] = false;
        }
    }//GEN-LAST:event_JNombreFocusLost

    private void JContraseña1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JContraseña1FocusGained
        if (!Bandera[1]) {
            JContraseña1.setText("");
            Bandera[1] = true;
        }
    }//GEN-LAST:event_JContraseña1FocusGained

    private void JContraseña1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JContraseña1FocusLost
        if(JContraseña1.getText().isEmpty()){
            JContraseña1.setText("Ingrese contraseña");
            Bandera[1] = false;
        }
    }//GEN-LAST:event_JContraseña1FocusLost

    private void Envio_dataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Envio_dataActionPerformed
        String Nombre=JNombre.getText();
        String Con=JContraseña1.getText();
        
        if(bdd.Select_Nombre_Contraseña(Nombre,Con,conexion)){
            JOptionPane.showMessageDialog(this,"Ingreso de sesión exitosa");
            int id=bdd.sacar_id(Nombre,conexion);
            Main_usuario Mu=new Main_usuario(conexion,id);
            this.setVisible(false);
            Mu.setVisible(true);
            Mu.setLocationRelativeTo(null);
        }else{
            JOptionPane.showMessageDialog(this,"El usuario no ha podido ingresarse, es probable que el nombre o contraseña no concuerden","ERROR", JOptionPane.WARNING_MESSAGE);
        }
        
        
        
        
    }//GEN-LAST:event_Envio_dataActionPerformed

    private void JNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JNombreActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio_Sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio_Sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio_Sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio_Sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio_Sesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Envio_data;
    private javax.swing.JTextField JContraseña1;
    private javax.swing.JTextField JNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
