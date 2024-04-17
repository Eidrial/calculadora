/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionEmpleadosMejorado;

/**
 *
 * @author María Azahara Parrales Cuevass
 */
public class Empleado extends Persona {

    private char categoria;
    private int nHijos;
    private int nivelIngles;
    private int antiguedad;

    public Empleado(String nombre, String apellidos, String dni, String direccion, int codigoPostal, String poblacion, String provincia) {
        super(nombre, apellidos, dni, direccion, codigoPostal, poblacion, provincia);
    }

    public Empleado() {
        super();
    }

    public Empleado(char categoria, int nHijos, int nivelIngles, int antiguedad) {
        this.categoria = categoria;
        this.nHijos = nHijos;
        this.nivelIngles = nivelIngles;
        this.antiguedad = antiguedad;
    }

    public String categoria() {
        String cat = "";

        switch (this.categoria) {
            case 'A':
                cat = "Director";
                break;
            case 'B':
                cat = "Técnico Superior";
                break;
            case 'C':
                cat = "Técnico Medio";
                break;
            case 'D':
                cat = "Auxiliar";
                break;
        }

        return cat;
    }

    public double sueldoBase() {
        double base = 0;
        double plus = 1;

        if (this.antiguedad >= 5) {
            plus = 1.1;
        }

        switch (this.categoria) {
            case 'A':
                base = 2500;
                break;
            case 'B':
                base = 2000;
                break;
            case 'C':
                base = 1500;
                break;
            case 'D':
                base = 1000;
                break;
        }
        return base * plus;
    }

    public double retencionIFPF() {

        double irpf = 0;

        if (this.nHijos >= 2) {
            irpf = 14;
        } else if (this.nHijos == 1) {
            irpf = 16;
        } else {
            irpf = 18;
        }

        return irpf;
    }

    public String niveIngles() {

        String nivel = "";

        switch (this.nivelIngles) {
            case 1:
                nivel = "Nivel inicial.";
                break;
            case 2:
                nivel = "Nivel medio.";
                break;
            case 3:
                nivel = "Nivel avanzado.";
                break;
            default:
                nivel = "Ese nivel no existe.";
        }
        return nivel;
    }

    public void nomina() {
        System.out.println("\n" + super.toString() + "\n\n\tSueldo: " + this.sueldoBase() + ""
                + "\n\n\tRetención: " + this.retencionIFPF() + "% " + (this.sueldoBase() * this.retencionIFPF() / 100) + ""
                + "\n\n\tSueldo neto: " + (this.sueldoBase() * (100 - this.retencionIFPF()) / 100));
    }

    public char getCategoria() {
        return categoria;
    }

    public void setCategoria(char categoria) {
        this.categoria = categoria;
    }

    public int getnHijos() {
        return nHijos;
    }

    public void setnHijos(int nHijos) {
        this.nHijos = nHijos;
    }

    public int getNivelIngles() {
        return nivelIngles;
    }

    public void setNivelIngles(int nivelIngles) {
        this.nivelIngles = nivelIngles;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

}
