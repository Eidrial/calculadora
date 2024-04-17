/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionEmpleados;

/**
 *
 * @author María Azahara Parrales Cuevass
 */
public class Empleados {

    //Atributos
    private String nombre;
    private String apellidos;
    private String dni;
    private String direccion;
    private int codigoPostal;
    private String poblacion;
    private String provincia;
    private int edad;
    private char categoria;
    private int nHijos;
    private int nivelIngles;
    private int antiguedad;

    //Primer constructor
    public Empleados(String nombre, String apellidos, String dni, String direccion, int codigoPostal, String poblacion, String provincia, int edad, char categoria, int nHijos, int nivelIngles, int antiguedad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.direccion = direccion;
        this.codigoPostal = codigoPostal;
        this.poblacion = poblacion;
        this.provincia = provincia;
        this.edad = edad;
        this.categoria = categoria;
        this.nHijos = nHijos;
        this.nivelIngles = nivelIngles;
        this.antiguedad = antiguedad;
    }

    //Segundo constructor
    public Empleados(String nombre, String apellidos, String dni, String direccion, int codigoPostal, String poblacion, String provincia, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.direccion = direccion;
        this.codigoPostal = codigoPostal;
        this.poblacion = poblacion;
        this.provincia = provincia;
        this.edad = edad;
    }

    //Tercer constructor
    public Empleados() {
    }

    //Métodos del empleado
    //Categoría del empleado
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

    //Sueldo base del empleado
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

    //Retención del irpf del empleado según hijos
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

    //Nivel de inglés del empleado
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

    @Override
    public String toString() {   
        return "\tNombre: " + nombre + "\n\tApellidos: " + apellidos + "\n\tDNI: " + dni + "\n\tCategoria: " + categoria()
                + "\n\tDireccion: " + direccion + "\n\tCódigo Postal: " + codigoPostal + ""
                + "\n\tPoblación: " + poblacion + "\n\tProvincia: " + provincia;
    }

    //Getters y setters
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

    public String getPoblacion(String poblacion) {
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
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
