/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2021;

/**
 *
 * @author Azahara
 */
public class Metodos2 {

    public static int cuentaVocales(String cadena) {
        int cantidadVocales = 0;
        for (int i = 0; i < cadena.length(); i++) {
            char car = cadena.charAt(i);
            if (car == 'a' || car == 'e' || car == 'i' || car == 'o' || car == 'u') {
                cantidadVocales++;
            }
        }
        return cantidadVocales;
    }

    public static String invierteCadena(String cadena) {
        StringBuilder cadenaInvertida = new StringBuilder();
        for (int i = cadena.length() - 1; i >= 0; i--) {
            cadenaInvertida.append(cadena.charAt(i));
        }
        return cadenaInvertida.toString();
    }
}
