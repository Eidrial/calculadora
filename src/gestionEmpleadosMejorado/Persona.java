/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionEmpleadosMejorado;

/**
 *
 * @author María Azahara Parrales Cuevass
 */
public class Persona {
    
     private String nombre;
     private String apellidos;
     private String dni;
     private String direccion;
     private int codigoPostal;
     private String poblacion;
     private String provincia;

    public Persona(String nombre, String apellidos, String dni, String direccion, int codigoPostal, String poblacion, String provincia) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.direccion = direccion;
        this.codigoPostal = codigoPostal;
        this.poblacion = poblacion;
        this.provincia = provincia;
    }

    @Override
    public String toString() {
        return "\tNombre: " + nombre + "\n\tApellidos: " + apellidos + "\n\tDNI: " + dni + ""
                + "\n\tDireccion: " + direccion + "\n\tCódigo Postal: " + codigoPostal + ""
                + "\n\tPoblación: " + poblacion + "\n\tProvincia: " + provincia;
    }

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
     
     
}
