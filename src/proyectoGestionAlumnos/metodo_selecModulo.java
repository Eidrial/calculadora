/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoGestionAlumnos;

import java.util.Scanner;

/**
 *
 * @author María Azahara Parrales Cuevas
 */
public class metodo_selecModulo {

    static Scanner s = new Scanner(System.in);

    public static Modulo selecModulo() {
        Modulo modulo;
        System.out.println("Seleciona el módulo");
        System.out.println("1. EDD - 1DAW");
        System.out.println("2. PGR - 1DAW");
        System.out.println("3. BD - 1DAW");
        System.out.println("4. LM - 1DAW");
        System.out.println("5. SI - 1DAW");
        System.out.println("6. DPL - 2DAW");
        System.out.println("7. ESERV - 2DAW");
        System.out.println("8. ECLIEN - 2DAW");
        System.out.println("9. DINT - 2DAW");
        System.out.println("10.LC - 2DAW");

        int op = s.nextInt();
        s.nextLine();

        switch (op) {
            case 1:
                modulo = new Modulo("EDD", "1DAW", 3);
                break;
            case 2:
                modulo = new Modulo("PGR", "1DAW", 8);
                break;
            case 3:
                modulo = new Modulo("BD", "1DAW", 6);
                break;
            case 4:
                modulo = new Modulo("LM", "1DAW", 4);
                break;
            case 5:
                modulo = new Modulo("SI", "1DAW", 6);
                break;
            case 6:
                modulo = new Modulo("DPL", "2DAW", 3);
                break;
            case 7:
                modulo = new Modulo("ESERV", "2DAW", 8);
                break;
            case 8:
                modulo = new Modulo("ECL", "2DAW", 6);
                break;
            case 9:
                modulo = new Modulo("DINT", "2DAW", 6);
                break;
            case 10:
                modulo = new Modulo("LC", "2DAW", 3);
                break;
            default:
                System.out.println("No se ha selecionado un módulo de la lista , se creará uno vacío");
                modulo = new Modulo();
        }
        return modulo;

    }
}
