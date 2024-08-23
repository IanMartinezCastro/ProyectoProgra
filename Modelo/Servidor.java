package Modelo;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Servidor extends Thread {

    private static final String servidor = "localhost";
    private static final String schema = "travelfidehub";
    private static final String usuario = "root";
    private static final String contrasenna = "admin202418./";
    private static final String driver = "jdbc:mysql";

    private JTextArea cServidor;

    public Servidor() {
    }

    public Servidor(JTextArea cServidor) {
        this.cServidor = cServidor;
    }

    public JTextArea getcServidor() {
        return cServidor;
    }

    public void setcServidor(JTextArea cServidor) {
        this.cServidor = cServidor;
    }

    @Override
    public void run() {
        ServerSocket vSocketServidor;
        this.cServidor.append("\n...Iniciando Servidor....");
        try {
            vSocketServidor = new ServerSocket(10578);
            while (true) {
                Socket vClienteRecibido;

                vClienteRecibido = vSocketServidor.accept();

                DataInputStream vCanal = new DataInputStream(vClienteRecibido.getInputStream());

                ObjectInputStream vDeserializar = new ObjectInputStream(vCanal);

                Usuario vUsuarioRecibido = (Usuario) vDeserializar.readObject();
                
                // mostrar en el textArea los datos del usuario registrado
                
                this.cServidor.append("\n Usuario registrado");
                this.cServidor.append("\n Nombre:  "+vUsuarioRecibido.getNombre()
                +"\nApellido: "+vUsuarioRecibido.getApellido()
                +"\nUsuario: "+vUsuarioRecibido.getUsuario()
                +"\nCorreo: "+vUsuarioRecibido.getCorreo());
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error" + ex.getMessage());
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error" + ex.getMessage());

        }

    }

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
