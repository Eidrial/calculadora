/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package testPruebas;

import calculadora.Calculadora;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Azahara
 */
public class Prueba {

    //Creamos atributos que usaremos en los distintos tests
    //en nuestro caso es un objeto Calculadora para testear los métodos instanciables
    //de la clase Calculadora
    private Calculadora objectCalc = new Calculadora();

    public Prueba() {
    }

    @BeforeClass
    public static void setUpClass() {
        System.out.println("Comienza la ejecución de la clase Prueba . . .\n");
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("\nFinaliza la ejecución de la clase Prueba.");
    }

    @Before
    public void setUp() {
        System.out.println("\nAntes de ejecutar el test . . .");
    }

    @After
    public void tearDown() {
        System.out.println("Después de ejecutar el test . . .");
    }

    @Test
    public void testSuma() {

        System.out.println("~ Ejecutando testSuma:");
        //Damos el valor que deseamos a las variables para hacer el test.
        double a = 2.4;
        double b = 5.8;
        //Resultado esperado. Este es el resultado que debería ser.
        double resultExp = 8.2;

        //Calcularemos y veremos si da el resultado esperado.
        double result = objectCalc.suma(a, b);
        //Método estático de la clase assert de JUnit que evalúa si es válido el test
        //Evalúa si resulExp es igual a resultOr con una diferencia menor que delta (0.0 es que tiene que ser exacto, sin ninguna variación)
        assertEquals(resultExp, result, 0.0);
    }

    @Test
    public void testResta() {

        System.out.println("~ Ejecutando testResta:");
        //Damos el valor que deseamos a las variables para hacer el test.
        double a = 90;
        double b = 75.8;

        //Resultado esperado. Este es el resultado que debería ser.
        double resultExp = 14.2;

        //Calcularemos y veremos si da el resultado esperado.
        double result = objectCalc.resta(a, b);
        //Método estático de la clase assert de JUnit que evalúa si es válido el test
        //Evalúa si resulExp es igual a resultOr con una diferencia menor que delta (0.0 es que tiene que ser exacto, sin ninguna variación)
        assertEquals(resultExp, result, 0.1);
    }

    @Test
    public void testMultiplicacion() {
        
        System.out.println("~ Ejecutando testMultiplicacion:");
        //Damos el valor que deseamos a las variables para hacer el test.
        double a = 10;
        double b = 6;

        //Resultado esperado. Este es el resultado que debería ser.
        double resultExp = 60;
        //Calcularemos y veremos si da el resultado esperado.
        double result = objectCalc.multiplica(a, b);
        //Método estático de la clase assert de JUnit que evalúa si es válido el test
        //Evalúa si resulExp es igual a resultOr con una diferencia menor que delta (0.0 es que tiene que ser exacto, sin ninguna variación)
        assertEquals(resultExp, result, 0.0);
    }

    @Test
    public void testDivision() {
        
        System.out.println("~ Ejecutando testDivide:");
        //Damos el valor que deseamos a las variables para hacer el test.
        double a = 10;
        double b = 5;

        //Resultado esperado. Este es el resultado que debería ser.
        double resultExp = 2;
        //Calcularemos y veremos si da el resultado esperado. Hay que poner el método que queremos usar después del objeto !!!
        double result = objectCalc.divide(a, b);
        //Método estático de la clase assert de JUnit que evalúa si es válido el test
        //Evalúa si resulExp es igual a resultOr con una diferencia menor que delta (0.0 es que tiene que ser exacto, sin ninguna variación)
        assertEquals(resultExp, result, 0.00000000001);
    }

}
