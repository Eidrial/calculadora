/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package pruebaExamen2018;

import examen2018.Cadenas1;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Cadenas1Test {

    private final Cadenas1 cadenas1 = new Cadenas1();
    private final String testString = "Test String";

    @Test
    public void testPasaMay() {
        assertEquals("TEST STRING", cadenas1.pasaMay(testString));
    }

    @Test
    public void testPasaMin() {
        assertEquals("test string", cadenas1.pasaMin(testString));
    }
}
