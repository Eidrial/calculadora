/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebaExamen2022;

/**
 *
 * @author Azahara
 */
public class Examen {

 private String asignatura;
 
    //Atributos
    private int fecha;
    private int unidad;
    private String nombre;
    private String apellidos;
    private final int ponderacion1 = 80;
    private final int ponderacion2 = 20;
    private double ejercicio1;
    private double ejercicio2;
    private final int notaAprobar = 5;

    //Constructor

    public Examen(String asignatura, int fecha, int unidad, String nombre, String apellidos, double ejercicio1, double ejercicio2) {
        this.asignatura = asignatura;
        this.fecha = fecha;
        this.unidad = unidad;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.ejercicio1 = ejercicio1;
        this.ejercicio2 = ejercicio2;
    }
    

   //Métodos
    public double notaExamen() {
        double notaFinal;
        notaFinal = (ejercicio1 * ponderacion1 / 100) + (ejercicio2 * ponderacion2 / 100);
        return notaFinal;
    }

    public boolean superado() {
        return notaExamen() >= notaAprobar;
    }

    // Getters y setters
    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public int getUnidad() {
        return unidad;
    }

    public void setUnidad(int unidad) {
        this.unidad = unidad;
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

    public int getPonderacion1() {
        return ponderacion1;
    }

    public int getPonderacion2() {
        return ponderacion2;
    }

    public double getEjercicio1() {
        return ejercicio1;
    }

    public void setEjercicio1(double ejercicio1) {
        this.ejercicio1 = ejercicio1;
    }

    public double getEjercicio2() {
        return ejercicio2;
    }

    public void setEjercicio2(double ejercicio2) {
        this.ejercicio2 = ejercicio2;
    }

    public int getNotaAprobar() {
        return notaAprobar;
    }
}