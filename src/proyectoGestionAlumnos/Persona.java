/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoGestionAlumnos;

/**
 *
 * @author María Azahara Parrales Cuevas
 */
public class Persona {

    // atributos
    private String nombre;
    private String apellidos;
    private String direccion;
    private String dni;
    private int telefono;

    // constructores
    public Persona(String nombre, String apellidos, String direccion, String dni, int telefono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.dni = dni;
        this.telefono = telefono;
    }

    public Persona() {
    }

    // métodos
    @Override
    public String toString() {

        String datos = " ~ Alumno: " + this.apellidos + " , " + this.nombre
                + "\n ~ Dni: " + this.dni + "\n ~ Direccion: " + this.direccion + "\n ~ Telefono: " + this.telefono;
        return datos;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

}
