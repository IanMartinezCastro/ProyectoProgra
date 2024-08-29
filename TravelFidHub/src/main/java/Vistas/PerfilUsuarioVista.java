/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author dcast
 */
public class PerfilUsuarioVista extends javax.swing.JFrame {

    /**
     * Creates new form UsuarioVista
     */
    public PerfilUsuarioVista() {
        initComponents();
       AgregarDatosPerfil();
    }
    Connection nuevaConexion;
   

    public void AgregarDatosPerfil() {
        try {
            this.nuevaConexion = DriverManager.getConnection("jdbc:mysql://localhost/travelfidehub?serverTimezone=UTC", "root", "admin202418./");
            String comando = "Select usuario,contrasenna,nombre,apellido,correo,pref_viajes,pref_contacto FROM usuarios ";
            PreparedStatement nuevoStatamentPreparado = nuevaConexion.prepareStatement(comando);
            ResultSet resultadoBusqueda = nuevoStatamentPreparado.executeQuery();

            if (resultadoBusqueda.next()) {

                
                lblxUsuario.setText(resultadoBusqueda.getString("Usuario"));
                lblxContrasenna.setText(resultadoBusqueda.getString("contraseña"));
                lblxNombre.setText(resultadoBusqueda.getString("nombre"));
                lblxApellido.setText(resultadoBusqueda.getString("apellido"));
                lblxCorreoElectronico.setText(resultadoBusqueda.getString("correo"));
                lblxPrefViaje.setText(resultadoBusqueda.getString("pref_viajes")); // preferencia viaje 
                lblxPrefContacto.setText(resultadoBusqueda.getString("pref_ontacto")); // contacto de preferencia

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error"+ ex.getMessage());
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

        lblContrasenna = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        lblPrefViajes = new javax.swing.JLabel();
        lblPrefContacto = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblxUsuario = new javax.swing.JLabel();
        lblxContrasenna = new javax.swing.JLabel();
        lblxNombre = new javax.swing.JLabel();
        lblxApellido = new javax.swing.JLabel();
        lblxCorreoElectronico = new javax.swing.JLabel();
        lblxPrefContacto = new javax.swing.JLabel();
        lblxPrefViaje = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblContrasenna.setText("Contraseña:");

        lblApellido.setText("Apellido:");

        lblUsuario.setText("Usuario:");

        lblCorreo.setText("Correo electronico:");

        lblPrefViajes.setText("Pref. de viaje:");

        lblPrefContacto.setText("Pref. de contacto:");

        lblNombre.setText("Nombre:");

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel1.setText("Perfil de Usuario");

        lblxUsuario.setText("jLabel2");

        lblxContrasenna.setText("jLabel2");

        lblxNombre.setText("jLabel2");

        lblxApellido.setText("jLabel2");

        lblxCorreoElectronico.setText("jLabel2");

        lblxPrefContacto.setText("jLabel2");

        lblxPrefViaje.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblContrasenna)
                                    .addComponent(lblUsuario))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addComponent(lblxUsuario))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblxContrasenna))))
                            .addComponent(btnVolver)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblNombre)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblxNombre))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblPrefContacto)
                                        .addComponent(lblCorreo, javax.swing.GroupLayout.Alignment.TRAILING)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblxCorreoElectronico)
                                    .addComponent(lblxPrefContacto)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblApellido)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblxApellido))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPrefViajes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblxPrefViaje))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jLabel1)))
                .addContainerGap(130, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsuario)
                    .addComponent(lblxUsuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblContrasenna)
                    .addComponent(lblxContrasenna))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(lblxNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApellido)
                    .addComponent(lblxApellido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCorreo)
                    .addComponent(lblxCorreoElectronico))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrefViajes)
                    .addComponent(lblxPrefViaje))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrefContacto)
                    .addComponent(lblxPrefContacto))
                .addGap(30, 30, 30)
                .addComponent(btnVolver)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVolverActionPerformed

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
            java.util.logging.Logger.getLogger(PerfilUsuarioVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PerfilUsuarioVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PerfilUsuarioVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PerfilUsuarioVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PerfilUsuarioVista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblContrasenna;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPrefContacto;
    private javax.swing.JLabel lblPrefViajes;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JLabel lblxApellido;
    private javax.swing.JLabel lblxContrasenna;
    private javax.swing.JLabel lblxCorreoElectronico;
    private javax.swing.JLabel lblxNombre;
    private javax.swing.JLabel lblxPrefContacto;
    private javax.swing.JLabel lblxPrefViaje;
    private javax.swing.JLabel lblxUsuario;
    // End of variables declaration//GEN-END:variables
}
