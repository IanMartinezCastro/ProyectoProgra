package Modelo;

public class Usuario {
    
    private String usuario, contrasenna, nombre, apellido, correo, preferenciasViaje, preferenciasContactos;    

    public Usuario() {
    }

    public Usuario(String usuario, String contrasenna, String nombre, String apellido, String correo, String preferenciasViaje, String preferenciasContactos) {
        this.usuario = usuario;
        this.contrasenna = contrasenna;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.preferenciasViaje = preferenciasViaje;
        this.preferenciasContactos = preferenciasContactos;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenna() {
        return contrasenna;
    }

    public void setContrasenna(String contrasenna) {
        this.contrasenna = contrasenna;
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

    public String getPreferenciasViaje() {
        return preferenciasViaje;
    }

    public void setPreferenciasViaje(String preferenciasViaje) {
        this.preferenciasViaje = preferenciasViaje;
    }

    public String getPreferenciasContactos() {
        return preferenciasContactos;
    }

    public void setPreferenciasContactos(String preferenciasContactos) {
        this.preferenciasContactos = preferenciasContactos;
    }
    
    
    
}
