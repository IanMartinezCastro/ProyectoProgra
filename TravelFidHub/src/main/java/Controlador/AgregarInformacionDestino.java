/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author user
 */
public class AgregarInformacionDestino {
    private JTextArea txtInfo;

    public AgregarInformacionDestino() {
    }

    public AgregarInformacionDestino(JTextArea txtInfo) {
        this.txtInfo = txtInfo;
    }

    public JTextArea getTxtInfo() {
        return txtInfo;
    }

    public void setTxtInfo(JTextArea txtInfo) {
        this.txtInfo = txtInfo;
    }
    
    public void Informacion() throws IOException{
        String rutaArchivo = null;
        
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))){
            String linea = br.readLine();
            while(linea != null){
                this.txtInfo.append(linea);
            }
                
            } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error"+ex.getMessage());
        }
    }
    
    
}
