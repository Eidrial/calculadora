/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebaExamen2021;

import examen2021.Metodos1;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Azahara
 */
public class Metodos1Test {

    @Test
    public void testRepiteCaracter() {
        String cadena = "banana";
        char caracter = 'a';
        int repeticiones = Metodos1.repiteCaracter(cadena, caracter);
        assertEquals(3, repeticiones);
    }
}
