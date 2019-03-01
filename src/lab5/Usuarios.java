
package lab5;

import java.util.ArrayList;
import java.util.Date;

public class Usuarios {
    //tendrán Nombre, Apellido, Nombre de Usuario, Contraseña, Fecha de Nacimiento, Edad (Calculada con la fecha de nacimiento), Color Favorito, 3 Mazos.
    private String nombre;
    private String nusuario;
    private String Apellido;
    private String contraseña;
    private Date fecha;
    private int edad;
    private String colorfav;
    ArrayList<Mazos>mazos=new ArrayList();

    public Usuarios(String nombre, String nusuario, String Apellido, String contraseña, Date fecha, int edad, String colorfav) {
        this.nombre = nombre;
        this.nusuario = nusuario;
        this.Apellido = Apellido;
        this.contraseña = contraseña;
        this.fecha = fecha;
        this.edad = edad;
        this.colorfav = colorfav;
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getColorfav() {
        return colorfav;
    }

    public void setColorfav(String colorfav) {
        this.colorfav = colorfav;
    }

    public ArrayList<Mazos> getMazos() {
        return mazos;
    }

    public void setMazos(ArrayList<Mazos> mazos) {
        this.mazos = mazos;
    }

    public String getNusuario() {
        return nusuario;
    }

    public void setNusuario(String nusuario) {
        this.nusuario = nusuario;
    }

    @Override
    public String toString() {
        return  nusuario ;
    }
    
    
}
