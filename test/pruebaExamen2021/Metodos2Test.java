/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebaExamen2021;

import examen2021.Metodos2;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Azahara
 */
public class Metodos2Test {

    @Test
    public void testCuentaVocales() {
        String cadena = "Hola mundo";
        int vocales = Metodos2.cuentaVocales(cadena);
        assertEquals(4, vocales);
    }

    @Test
    public void testInvierteCadena() {
        String cadena = "Hola mundo";
        String cadenaInvertida = Metodos2.invierteCadena(cadena);
        assertEquals("odnum aloH", cadenaInvertida);
    }
}
