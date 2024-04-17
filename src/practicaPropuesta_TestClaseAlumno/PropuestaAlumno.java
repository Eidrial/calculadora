/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaPropuesta_TestClaseAlumno;

import proyectoGestionAlumnos.Persona;

/**
 *
 * @author Azahara
 */
public class PropuestaAlumno extends Persona {

    // atributos del alumno
    private String modulos;
    private int notaPractica1;
    private int notaPractica2;
    private int notaPractica3;
    private int notaExamen;

    // Constructores
    public PropuestaAlumno(String modulos, int notaPractica1, int notaPractica2, int notaPractica3, int notaExamen) {
        this.modulos = modulos;
        this.notaPractica1 = notaPractica1;
        this.notaPractica2 = notaPractica2;
        this.notaPractica3 = notaPractica3;
        this.notaExamen = notaExamen;
    }

    public PropuestaAlumno(String nombre, String apellidos, String direccion, String dni, int telefono) {
        super(nombre, apellidos, direccion, dni, telefono);
    }

    public PropuestaAlumno() {
    }

    // Métodos     
    public double notaModulo() {

        double notaMediaPracticas = (notaPractica1 + notaPractica2 + notaPractica3) / 3.0;
        double notaFinal = 0.4 * notaMediaPracticas + 0.6 * notaExamen;
        return notaFinal;

        //AÑADIR AQUÍ: "Para que un alumno pueda aprobar debe tener tanto la media de las prácticas como la nota de examen mayor que 3. En caso de tener de media mas de 5 pero no tener al menos un 3 en ambos  suspenderá con un 4 aunque esté aprobado."
    }

    public String calificacionModulo() {
        //PONER AQUÍ LA NOTA FINAL PARA QUE LA TRAIGA.
        if (notaModulo() <= 4) {
            return "Suspenso";
        } else if (notaModulo() >= 5 || notaModulo() <= 5.9) {
            return "Aprobado";
        } else if (notaModulo() >= 6 || notaModulo() <= 6.9) {
            return "Bien";
        } else if (notaModulo() >= 7 || notaModulo() <= 8.9) {
            return "Notable";
        } else if (notaModulo() >= 9 || notaModulo() <= 10) {
            return "Sobresaliente";
        } else {
            return "Nota no válida.";
        }

    }

    public boolean entregaPracticas() {

        if (notaPractica1 == 0 || notaPractica2 == 0 || notaPractica3 == 0) {
            return false;
        } else {
            return true;
        }
    }

    public String toStringPersona() {
        return super.toString();
    }

    // Getters y Setters
    public String getModulos() {
        return modulos;
    }

    public void setModulos(String modulos) {
        this.modulos = modulos;
    }

    public int getNotaPractica1() {
        return notaPractica1;
    }

    public void setNotaPractica1(int notaPractica1) {
        this.notaPractica1 = notaPractica1;
    }

    public int getNotaPractica2() {
        return notaPractica2;
    }

    public void setNotaPractica2(int notaPractica2) {
        this.notaPractica2 = notaPractica2;
    }

    public int getNotaPractica3() {
        return notaPractica3;
    }

    public void setNotaPractica3(int notaPractica3) {
        this.notaPractica3 = notaPractica3;
    }

    public int getNotaExamen() {
        return notaExamen;
    }

    public void setNotaExamen(int notaExamen) {
        this.notaExamen = notaExamen;
    }

}
