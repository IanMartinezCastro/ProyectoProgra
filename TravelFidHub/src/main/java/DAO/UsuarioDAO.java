package DAO;

import Modelo.Servidor;
import Modelo.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UsuarioDAO {

    public static void InsertarUsuario(Usuario pUsuario) {

        Connection conexion = Servidor.conectarBD();

        String comando = "INSERT INTO usuarios(usuario,contrasenna,nombre,apellido,correo,pref_viajes,pref_contacto) VALUES (?,?,?,?,?,?,?)";

        try {
            PreparedStatement comandoPreparado = conexion.prepareStatement(comando);

            comandoPreparado.setString(1, pUsuario.getNombre());
            comandoPreparado.setString(2, pUsuario.getApellido());
            comandoPreparado.setString(3, pUsuario.getUsuario());
            comandoPreparado.setString(4, pUsuario.getContrasenna());
            comandoPreparado.setString(5, pUsuario.getCorreo());
            comandoPreparado.setString(6, pUsuario.getPreferenciasViaje());
            comandoPreparado.setString(7, pUsuario.getPreferenciasContactos());

            comandoPreparado.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
