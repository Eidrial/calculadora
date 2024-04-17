/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author Azahara
 */
public class Calculadora {

// Atributos
    private String marca;
    private String modelo;
    private String nserie;

    private Scanner s = new Scanner(System.in);

// Constructor
    public Calculadora(String marca, String modelo, String nserie) {
        this.marca = marca;
        this.modelo = modelo;
        this.nserie = nserie;
    }

// Constructor 2 sobrecarga del método constructor por número de parámetros
    public Calculadora() {

    }

// Métodos
    public void suma(float n1, float n2) {
        System.out.println("La suma de " + n1 + " más " + n2 + " es "
                + (n1 + n2));
    }

// Sobrecarga del método suma por tipo de datos del argumento
    public void suma(int n1, int n2) {
        System.out.println("La suma de " + n1 + " más " + n2 + " es "
                + (n1 + n2));
    }

    // Sobrecarga del método suma por tipo de datos del argumento
    public double suma(double n1, double n2) {

        double suma = n1 + n2;
        System.out.println("La suma de " + n1 + " más " + n2 + " es "
                + (n1 + n2));

        return suma;
    }

//// Sobrecarga del método suma por número de parámetros
//    public void suma() {
//        System.out.println("Introduce el primer número: ");
//        float n1 = s.nextFloat();
//        System.out.println("Introduce el segundo número: ");
//        float n2 = s.nextFloat();
//        System.out.println("La suma de " + n1 + " más " + n2 + " es "
//                + (n1 + n2));
//    }

    public double resta(double n1, double n2) {
        
        double resta = n1 - n2;
        System.out.println("La resta de " + n1 + " menos " + n2 + " es "
                + (n1 - n2));
        
        return resta;
    }

    public double multiplica(double n1, double n2) {
        
        double multiplica = n1 * n2;
        System.out.println("La multiplicación de " + n1 + " por " + n2 + "es " + (n1 * n2));
        
        return multiplica;
    }

    //prueba
    
    public double divide(double n1, double n2) {
        
        double divide = n1 / n2;
        System.out.println("La división de " + n1 + " entre " + n2 + " es "
                + (n1 / n2));
        
        return divide;
    }

    public void datos() {
        System.out.println("La marca de la calculadora es: " + this.marca + ".\nEl modelo de la calculadora es: " + this.modelo + ".\nEl numero de serie "
                + "de la calculadora es: " + this.nserie + ".");
    }
    

    
    
    
    
    
    
    //Haciendo pruebas para GIT
    
// Devuelve una cadena de texto con los valores de los atributos
    @Override
    public String toString() {
        //return "Calculadora{" + "marca=" + marca + ", modelo=" + modelo + ", nserie=" + nserie + '}';
        String datos = "La marca de la calculadora es: " + this.marca + ".\nEl modelo de la calculadora es: " + this.modelo + ".\nEl numero de serie de la calculadora es: " + this.nserie + ".";
        return datos;
    }

// Getters y Setters, podremos cambiar datos de los atributos seleccionados a través de esto,,, se hace con atributos privados.
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNserie() {
        return nserie;
    }

    public void setNserie(String nserie) {
        this.nserie = nserie;
    }
    
    

}
