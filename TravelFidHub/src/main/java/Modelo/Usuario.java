package Modelo;

public class Usuario {
    
    private String nombre, apellido, correo, prreferenciasViaje, preferenciasContactos;    

    public Usuario() {
    }

    public Usuario(String nombre, String apellido, String correo, String prreferenciasViaje, String preferenciasContactos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.prreferenciasViaje = prreferenciasViaje;
        this.preferenciasContactos = preferenciasContactos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPrreferenciasViaje() {
        return prreferenciasViaje;
    }

    public void setPrreferenciasViaje(String prreferenciasViaje) {
        this.prreferenciasViaje = prreferenciasViaje;
    }

    public String getPreferenciasContactos() {
        return preferenciasContactos;
    }

    public void setPreferenciasContactos(String preferenciasContactos) {
        this.preferenciasContactos = preferenciasContactos;
    }
    
    
    
}
