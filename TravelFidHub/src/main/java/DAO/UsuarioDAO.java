package DAO;

import Modelo.Servidor;
import Modelo.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class UsuarioDAO {

    public static void InsertarUsuario(Usuario pUsuario) {

        Connection conexion = Servidor.conectarBD();

        String comando = "INSERT INTO usuarios(usuario,contrasenna,nombre,apellido,correo,pref_viajes,pref_contacto) VALUES (?,?,?,?,?,?,?)";

        try {
            PreparedStatement comandoPreparado = conexion.prepareStatement(comando);
            
            comandoPreparado.setString(1, pUsuario.getUsuario());
            comandoPreparado.setString(2, pUsuario.getContrasenna());
            comandoPreparado.setString(3, pUsuario.getNombre());
            comandoPreparado.setString(4, pUsuario.getApellido());
            comandoPreparado.setString(5, pUsuario.getCorreo());
            comandoPreparado.setString(6, pUsuario.getPreferenciasViaje());
            comandoPreparado.setString(7, pUsuario.getPreferenciasContactos());

            comandoPreparado.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error"+ex.getMessage());
        }
    }
    

}
