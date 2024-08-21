package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Servidor {
    
    private static final String servidor = "localhost";
    private static final String schema = "travelfidehub";
    private static final String usuario = "root";
    private static final String contrasenna = "admin202418./";
    private static final String driver = "jdbc:mysql";

    public static Connection conectarBD() {

        Connection conexion = null;

        try {

            conexion = DriverManager.getConnection(driver + "://" + servidor + "/" + schema + "?serverTimezone=UTC", usuario, contrasenna);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        } finally {
            return conexion;
        }
    }
    
}
