package Modelo;

import Vistas.PaginaPrincipal;
import com.mysql.cj.protocol.Resultset;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Inicio_Sesion {

    private JTextField nombreUsuario;
    private JPasswordField campoPW;

    public Inicio_Sesion() {
    }

    public Inicio_Sesion(JTextField nombreUsuario, JPasswordField campoPW) {
        this.nombreUsuario = nombreUsuario;
        this.campoPW = campoPW;
    }

    public void validarUsuario() {

        
    }

}
