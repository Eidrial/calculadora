///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
// */
//package pruebasExamen;
//
//import org.junit.After;
//import org.junit.AfterClass;
//import org.junit.Before;
//import org.junit.BeforeClass;
//import org.junit.Test;
//import static org.junit.Assert.*;
//import pruebaExamen2022.Examen;
//
///**
// *
// * @author Azahara
// */
//public class PruebasExamen {
//
////    private Examen objectExamen = new Examen();
//
//    public PruebasExamen() {
//    }
//
//    @BeforeClass
//    public static void setUpClass() {
//    }
//
//    @AfterClass
//    public static void tearDownClass() {
//    }
//
//    @Before
//    public void setUp() {
//    }
//
//    @After
//    public void tearDown() {
//    }
//
//@Test
//    public void testNotaExamen() {
//        System.out.println("~ Ejecutando testNotaExamen:");
//
//        Examen examen = new Examen("Matemáticas", 2022, 1, "Juan Pérez", "González", 40, 60, 7, 6, 5);
//        double resultadoNota = examen.notaExamen(); // Calcular la nota del examen
//        double resultadoEsperado = 6.2; // Resultado esperado
//        System.out.println("Nota del examen: " + resultadoNota); // Se espera 6.2
//        assertEquals(resultadoEsperado, resultadoNota, 0.0); // Verificar que la nota sea la esperada
//    }
//    
//    @Test
//    public void testAprobado() {
//        System.out.println("~ Ejecutando testAprobado:");
//
//        Examen examenAprobado = new Examen("Matemáticas", 2022, 1, "Juan Pérez", "González", 40, 60, 7, 6, 5);
//        boolean resultadoAprobado = examenAprobado.superado(); // Verificar si el examen está aprobado
//        assertTrue(resultadoAprobado); // El examen debería estar aprobado
//    }
//
//    @Test
//    public void testSuspenso() {
//        System.out.println("~ Ejecutando testSuspenso:");
//
//        Examen examenSuspenso = new Examen("Matemáticas", 2022, 1, "Juan Pérez", "González", 40, 60, 4, 5, 5);
//        boolean resultadoSuspenso = examenSuspenso.superado(); // Verificar si el examen está aprobado
//        assertFalse(resultadoSuspenso); // El examen debería estar suspendido
//    }
//}
