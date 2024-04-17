/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package pruebaPropuestaAlumno;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import practicaPropuesta_TestClaseAlumno.PropuestaAlumno;

/**
 *
 * @author Azahara
 */
//Necesario para hacer test parametrizados.
@RunWith(value = Parameterized.class)

public class TestPropuestaAlumno {

    //Objeto instanciado para usar en los test.
    private PropuestaAlumno alumno = new PropuestaAlumno();

    //Atributos
    private int notaPractica1;
    private int notaPractica2;
    private int notaPractica3;
    private int notaExamen;
    private double notaEsperada;
    private String calificacionEsperada;
    private boolean entregadasPracticas;

    //Constructor
    public TestPropuestaAlumno(int notaPractica1, int notaPractica2, int notaPractica3, int notaExamen,
            double notaEsperada, String calificacionEsperada, boolean entregadasPracticas) {
        this.notaPractica1 = notaPractica1;
        this.notaPractica2 = notaPractica2;
        this.notaPractica3 = notaPractica3;
        this.notaExamen = notaExamen;
        this.notaEsperada = notaEsperada;
        this.calificacionEsperada = calificacionEsperada;
        this.entregadasPracticas = entregadasPracticas;
    }
    
    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
            { 5, 5, 5, 6, 5.4, "Bien", true }, 
            { 4, 4, 4, 5, 4.4, "Suspenso", true }, 
            { 2, 3, 4, 3, 3.0, "Suspenso", false }, 
            { 7, 7, 7, 8, 7.4, "Notable", true }, 
            { 8, 8, 8, 7, 7.8, "Notable", true }
        });
    }

    @Test
    public void testNotaModulo() {
        System.out.println("\nEjecutando testNotaModulo.");

        alumno.setNotaPractica1(notaPractica1);
        alumno.setNotaPractica2(notaPractica2);
        alumno.setNotaPractica3(notaPractica3);
        alumno.setNotaExamen(notaExamen);

        assertEquals(notaEsperada, alumno.notaModulo(), 0.01);
    }

    @Test
    public void testCalificacionModulo() {
        System.out.println("\nEjecutando testCalificacionModulo.");

        alumno.setNotaPractica1(notaPractica1);
        alumno.setNotaPractica2(notaPractica2);
        alumno.setNotaPractica3(notaPractica3);
        alumno.setNotaExamen(notaExamen);

        assertEquals(calificacionEsperada, alumno.calificacionModulo());
    }

    @Test
    public void testEntregaPracticas() {
        System.out.println("\nEjecutando testEntregaPracticas.");

        alumno.setNotaPractica1(notaPractica1);
        alumno.setNotaPractica2(notaPractica2);
        alumno.setNotaPractica3(notaPractica3);

        assertEquals(entregadasPracticas, alumno.entregaPracticas());
    }
}


