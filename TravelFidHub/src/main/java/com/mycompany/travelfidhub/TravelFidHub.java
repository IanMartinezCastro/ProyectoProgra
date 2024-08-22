package com.mycompany.travelfidhub;

import Controlador.Nuevo_Usuario_Controlador;
import Controlador.ServidorControlador;

public class TravelFidHub {

    public static void main(String[] args) {
        
        Nuevo_Usuario_Controlador vControladorNuevoUsuario = new Nuevo_Usuario_Controlador();
        ServidorControlador vServidorControlador = new ServidorControlador();
        
        vControladorNuevoUsuario.MostrarVista();
        vServidorControlador.MostrarServidor();
        
        
        
    }
}
