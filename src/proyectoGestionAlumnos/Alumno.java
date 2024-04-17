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
public class Alumno extends Persona {

    // atributos del alumno
    private Modulo[] modulos;
    private String centro;

    // Constructores
    public Alumno(String nombre, String apellidos, String direccion, String dni, int telefono, Modulo[] modulos, String centro) {

        super(nombre, apellidos, direccion, dni, telefono);
        this.modulos = modulos;
        this.centro = centro;
    }

    public Alumno(String nombre, String apellidos, String direccion, String dni, int telefono) {
        super(nombre, apellidos, direccion, dni, telefono);

    }

    public Alumno() {
        super();
    }

    // Métodos     
    @Override
    public String toString() {
        String datos;
        datos = super.toString()
                + "\n ~ Centro: " + this.centro
                + "\n ~ Módulos matriculados:";

        for (int i = 0; i < this.modulos.length; i++) {
            datos = datos + ("\t\n\n") + this.modulos[i].toString();
        }
        return datos;

    }

    public String toStringPersona() {
        return super.toString();
    }

    // el alumnoe promociona si aprueba todos los modulos en los que se matricula
    public boolean promociona() {
        boolean p = true;
        for (int i = 0; i < modulos.length; i++) {

            if (!(modulos[i].aprobado())) {
                p = false;
            }
        }
        return p;
    }

    // Getters y Setters
    public Modulo[] getModulos() {
        return modulos;
    }

    public void setModulos(Modulo[] modulos) {
        this.modulos = modulos;
    }

    public String getCentro() {
        return centro;
    }

    public void setCentro(String centro) {
        this.centro = centro;
    }

}
