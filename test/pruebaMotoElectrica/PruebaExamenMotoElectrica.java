/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package pruebaMotoElectrica;

import examenMotoElectrica.ExamenMotoElectrica;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author Azahara
 */
//Necesario para hacer test parametrizados.
@RunWith(value = Parameterized.class)
public class PruebaExamenMotoElectrica {

    //Objeto instanciado para usar en los test.
    private ExamenMotoElectrica moto = new ExamenMotoElectrica();

    //Atributos test (acelerar)
    private int velocidadInicial;
    private int segundos;
    private int velocidadEsperada;

    //Atributos test (frenar)
    private int velocidadInicialFrenar;
    private int segundosFrenar;
    private int velocidadEsperadaFrenar;

    //Atributos test (girar)
    private int direccionInicial;
    private char direccionGiro;
    private int direccionEsperada;

    //Constructor
    public PruebaExamenMotoElectrica(int velocidadInicial, int segundos, int velocidadEsperada,
            int velocidadInicialFrenar, int segundosFrenar, int velocidadEsperadaFrenar,
            int direccionInicial, char direccionGiro, int direccionEsperada) {
        this.velocidadInicial = velocidadInicial;
        this.segundos = segundos;
        this.velocidadEsperada = velocidadEsperada;

        this.velocidadInicialFrenar = velocidadInicialFrenar;
        this.segundosFrenar = segundosFrenar;
        this.velocidadEsperadaFrenar = velocidadEsperadaFrenar;

        this.direccionInicial = direccionInicial;
        this.direccionGiro = direccionGiro;
        this.direccionEsperada = direccionEsperada;
    }

    //Se debe colocar antes del test.
    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            // Test para acelerar, frenar y girar
            {0, 5, 10, 40, 2, 30, 0, 'i', -1},
            {30, 3, 40, 20, 4, 0, 0, 'd', 1},
            {50, 2, 50, 10, 3, 0, 0, 'i', -1}
        });
    }

    @Test
    public void testAcelerar() { //Test acelerar
        System.out.println("\nEjecutando testAcelerar.");

        moto.setVelocidad(this.velocidadInicial);
        moto.acelerar(segundos);
        assertEquals(velocidadEsperada, moto.getVelocidad());
    }

    @Test
    public void testFrenar() { //Test frenar
        System.out.println("\nEjecutando testFrenar.");

        moto.setVelocidad(this.velocidadInicialFrenar);
        moto.frenar(segundosFrenar);
        assertEquals(velocidadEsperadaFrenar, moto.getVelocidad());
    }

    @Test
    public void testGirar() { //Test girar
        System.out.println("\nEjecutando testGirar.");

        moto.setDireccion(this.direccionInicial);
        moto.girar(direccionGiro);
        assertEquals(direccionEsperada, moto.getDireccion());
    }
}
