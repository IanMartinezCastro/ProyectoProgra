/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Usuario;
import Vistas.Nuevo_Usuario;
import Vistas.ServidorVista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class ServidorControlador implements ActionListener {

    public  Nuevo_Usuario vVistaNuevoUsuario;
    public  Usuario vModeloUsuario;
    public  ServidorVista vServidor;

    public ServidorControlador() {
        vVistaNuevoUsuario = new Nuevo_Usuario();
        vModeloUsuario = new Usuario();
        vVistaNuevoUsuario.getBtnCrearUsuario().addActionListener(this);
    }
 

    @Override
    public void actionPerformed(ActionEvent ae) {
        Socket vSocketCliente;
        try {
            vSocketCliente = new Socket("127.0.0.1", 10578);

            DataOutputStream vCanal = new DataOutputStream(vSocketCliente.getOutputStream());
            ObjectOutputStream vSerializar = new ObjectOutputStream(vCanal);

            vModeloUsuario.setUsuario(vVistaNuevoUsuario.getTxtUsuario().getText());
            vModeloUsuario.setContrasenna(vVistaNuevoUsuario.getTxtContrasenna().getText());
            vModeloUsuario.setNombre(vVistaNuevoUsuario.getTxtNombre().getText());
            vModeloUsuario.setApellido(vVistaNuevoUsuario.getTxtApellido().getText());
            vModeloUsuario.setCorreo(vVistaNuevoUsuario.getTxtCorreo().getText());
            vModeloUsuario.setPreferenciasViaje(vVistaNuevoUsuario.getTxtPrefViajes().getText());
            vModeloUsuario.setPreferenciasContactos(vVistaNuevoUsuario.getTxtPrefContactos().getText());
            
            vSerializar.writeObject(vModeloUsuario);
            
            vCanal.close();
            vSerializar.close();
            
       

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error" + ex.getMessage());
        }

    }
      public void MostrarServidor(){
        vServidor.setVisible(true);
    }

}
