/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package pruebaExamen2018;

import examen2018.Cadenas2;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class Cadenas2Test {

    private final Cadenas2 cadenas2 = new Cadenas2();
    private final String input1;
    private final String input2;
    private final String expectedOutput;

    public Cadenas2Test(String input1, String input2, String expectedOutput) {
        this.input1 = input1;
        this.input2 = input2;
        this.expectedOutput = expectedOutput;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testData() {
        return Arrays.asList(new Object[][] {
                {"Hola", "Mundo", "HolaMundo"},
                {"Java", "Programación", "JavaProgramación"},
                {"Cadenas", "Test", "CadenasTest"},
                {"Pruebas", "Unitarias", "PruebasUnitarias"},
                {"Framework", "JUnit", "FrameworkJUnit"}
        });
    }

    @Test
    public void testConcatenaCadenas() {
        assertEquals(expectedOutput, cadenas2.concatenaCadenas(input1, input2));
    }
}