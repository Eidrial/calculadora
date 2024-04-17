/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2018;

import java.util.Scanner;

/**
 *
 * @author Azahara
 */
public class Cadenas1 {

    public String leeCadena() {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce una cadena:");
        return s.nextLine();
    }

    public String pasaMay(String cadena) {
        return cadena.toUpperCase();
    }

    public String pasaMin(String cadena) {
        return cadena.toLowerCase();
    }
}
