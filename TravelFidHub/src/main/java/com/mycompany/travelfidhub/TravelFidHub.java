package com.mycompany.travelfidhub;

import Controlador.Nuevo_Usuario_Controlador;
import Controlador.ServidorControlador;
import Vistas.Inicio_Sesion_Vista;

public class TravelFidHub {

    public static void main(String[] args) {
        
        ServidorControlador vServidorControlador = new ServidorControlador();
        Inicio_Sesion_Vista vInicioSesion = new Inicio_Sesion_Vista();
        
        vInicioSesion.setVisible(true);
        vServidorControlador.MostrarServidor();
        
        
        
    }
}
