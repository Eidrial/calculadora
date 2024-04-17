/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package pruebaExamen2021;

import examen2021.Metodos2;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class Metodos2ParametrizadoTest {

    private final String frase;
    private final int cantidadVocales;

    public Metodos2ParametrizadoTest(String frase, int cantidadVocales) {
        this.frase = frase;
        this.cantidadVocales = cantidadVocales;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testData() {
        return Arrays.asList(new Object[][]{
            {"Hola mundo", 3},
            {"Esta es una frase", 7},
            {"Java es divertido", 6},
            {"Programación", 4},
            {"Universidad", 5}
        });
    }

    @Test
    public void testCuentaVocales() {
        assertEquals(cantidadVocales, Metodos2.cuentaVocales(frase));
    }
}
