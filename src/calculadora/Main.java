/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

/**
 *
 * @author Azahara
 */
public class Main {

    public static void main(String[] args) {

        Calculadora casio1 = new Calculadora("Casio", "DPD-59", "NS34675");

// Viene del constructor 2
        Calculadora casio2 = new Calculadora();

        casio1.datos();
        
        System.out.println("");

        int n1 = 4;
        int n2 = 8;
        casio1.suma(n1, n2);

        casio1.suma(3, 7);
        casio1.resta(8, 3);
        casio2.multiplica(4, 5);
        casio2.divide(10, 5);

// Viene del sobrecargado del método suma por número de parámetros
        System.out.println("");
//        casio2.suma();
// Viene de @Override public String toString() ,,, es más normal usar esto para sacar/mostrar valores de atributos que un public void datos 
        System.out.println("\n" + casio1.toString());
    }
}
