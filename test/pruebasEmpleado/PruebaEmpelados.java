/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package pruebasEmpleado;

import gestionEmpleadosMejorado.Empleado;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Maria Azahara Parrales Cuevas
 */
public class PruebaEmpelados {

    public PruebaEmpelados() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        System.out.println("\nAntes de ejecutar el test . . .\n");
    }

    @After
    public void tearDown() {
        System.out.println("\nDespués de ejecutar el test . . .\n");
    }

    @Test
    public void testCategoria() {
        System.out.println("~ Ejecutando testCategoria1:");

        //Empleado 1: Empleado de categoría Director.
        Empleado empleado1 = new Empleado('A', 0, 0, 0);
        String resultadoCategoria1 = empleado1.categoria(); //Calcularemos y veremos si da el resultado esperado.
        String resultadoEsperado1 = "Profesor"; //Resultado esperado.
        System.out.println("Categoría de empleado1: " + resultadoCategoria1); // Se espera Profesor. VA A FALLAR.
        assertEquals(resultadoEsperado1, resultadoCategoria1);
    }

    @Test
    public void testCategoria2() {
        System.out.println("~ Ejecutando testCategoria2:");

        //Empleado 2: Empleado de categoría Técnico Medio.
        Empleado empleado2 = new Empleado('C', 0, 0, 0);
        String resultadoCategoria2 = empleado2.categoria(); //Calcularemos y veremos si da el resultado esperado.
        String resultadoEsperado2 = "Técnico Medio"; //Resultado esperado.
        System.out.println("Categoría de empleado2: " + resultadoCategoria2); //Se espera Técnico Medio.
        assertEquals(resultadoEsperado2, resultadoCategoria2);
    }

    @Test
    public void testCategoria3() {
        System.out.println("~ Ejecutando testCategoria3:");

        //Empleado 3: Empleado de categoría Auxiliar.
        Empleado empleado3 = new Empleado('D', 0, 0, 0);
        String resultadoCategoria3 = empleado3.categoria(); //Calcularemos y veremos si da el resultado esperado.
        String resultadoEsperado3 = "Auxiliar"; //Resultado esperado.
        System.out.println("Categoría de empleado3: " + resultadoCategoria3); //Se espera Auxiliar.
        assertEquals(resultadoEsperado3, resultadoCategoria3);
    }

    @Test
    public void testSueldoBase() {
        System.out.println("~ Ejecutando testSueldoBase1:");

        //Empleado 1: Empleado de categoría Director con antigüedad de menos de 5 años.
        Empleado empleado1 = new Empleado('A', 0, 0, 4);
        double resultadoSueldo1 = empleado1.sueldoBase(); //Calcularemos y veremos si da el resultado esperado.
        double resultadoEsperado1 = 2500; //Resultado esperado.
        System.out.println("Sueldo base de empleado1: " + resultadoSueldo1); // Se espera: 2500.
        assertEquals(resultadoEsperado1, resultadoSueldo1, 0.01);
    }

    @Test
    public void testSueldoBase2() {
        System.out.println("~ Ejecutando testSueldoBase2:");

        //Empleado 2: Empleado de categoría Técnico Superior con antigüedad de 5 años.
        Empleado empleado2 = new Empleado('B', 0, 0, 5);
        double resultadoSueldo2 = empleado2.sueldoBase(); //Calcularemos y veremos si da el resultado esperado.
        double resultadoEsperado2 = 2200;  //Resultado esperado.
        System.out.println("Sueldo base de empleado2: " + resultadoSueldo2); // Se espera: 2200.
        assertEquals(resultadoEsperado2, resultadoSueldo2, 0.01);
    }

    @Test
    public void testSueldoBase3() {
        System.out.println("~ Ejecutando testSueldoBase3:");

        //Empleado 3: Empleado de categoría Técnico Medio con antigüedad de más de 5 años.
        Empleado empleado3 = new Empleado('C', 0, 0, 10);
        double resultadoSueldo3 = empleado3.sueldoBase(); //Calcularemos y veremos si da el resultado esperado.
        double resultadoEsperado3 = 1650; //Resultado esperado.
        System.out.println("Sueldo base de empleado3: " + resultadoSueldo3); // Se espera: 1650.
        assertEquals(resultadoEsperado3, resultadoSueldo3, 0.01);
    }

}
