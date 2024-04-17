/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2021;

/**
 *
 * @author Azahara
 */
public class Metodos1 {

    public static int repiteCaracter(String cadena, char caracter) {
        int cantidadRepeticiones = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == caracter) {
                cantidadRepeticiones++;
            }
        }
        return cantidadRepeticiones;
    }
}
