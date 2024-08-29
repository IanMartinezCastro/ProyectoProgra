package Controlador;

import DAO.UsuarioDAO;
import Modelo.Usuario;
import Vistas.Nuevo_Usuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Nuevo_Usuario_Controlador implements ActionListener{
    
    private Nuevo_Usuario vVistaNuevoUsuario;
    
    private Usuario vModeloUsuario;
    
    public Nuevo_Usuario_Controlador(){
        vVistaNuevoUsuario = new Nuevo_Usuario();
        vModeloUsuario = new Usuario();
        vVistaNuevoUsuario.getBtnCrearUsuario().addActionListener(this);//escucha el boton Guardar

    }
    
    public void MostrarVista(){
        vVistaNuevoUsuario.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == vVistaNuevoUsuario.getBtnCrearUsuario()){
            
            vModeloUsuario.setUsuario(vVistaNuevoUsuario.getTxtUsuario().getText());
            vModeloUsuario.setContrasenna(vVistaNuevoUsuario.getTxtContrasenna().getText());
            vModeloUsuario.setNombre(vVistaNuevoUsuario.getTxtNombre().getText());
            vModeloUsuario.setApellido(vVistaNuevoUsuario.getTxtApellido().getText());
            vModeloUsuario.setCorreo(vVistaNuevoUsuario.getTxtCorreo().getText());
            vModeloUsuario.setPreferenciasViaje(vVistaNuevoUsuario.getTxtPrefViajes().getText());
            vModeloUsuario.setPreferenciasContactos(vVistaNuevoUsuario.getTxtPrefContactos().getText());
            
            UsuarioDAO.InsertarUsuario(vModeloUsuario);
            
            JOptionPane.showMessageDialog(null, "Usuario guardado con exito.");
            
        }
        
    }
    
}
