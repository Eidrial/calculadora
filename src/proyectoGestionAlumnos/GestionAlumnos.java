/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectoGestionAlumnos;

import java.util.Scanner;

/**
 *
 * @author Azahara
 */
public class GestionAlumnos {

    private static Scanner s = new Scanner(System.in);
    private static Alumno[] alumno;

    private static int menu() {
        int op = 0;

        //Men� principal.
        do {
            System.out.print("\t---MEN�--- "
                    + "\n1. Matricular alumnos."
                    + "\n2. Listar alumnos de la clase."
                    + "\n3. Cargar notas de los alumnos."
                    + "\n4. Listar califaciones de los alumnos."
                    + "\n5. Salir del programa."
                    + "\n\n"
                    + "Introduce un n�mero del men�: ");
            op = s.nextInt();
            if (op < 1 || op > 5) { //Control para que no elija un n�mero que no est� en el men�.
                System.out.print("Opci�n no v�lida.");
            }
        } while (op < 1 || op > 5);

        return op;
    }

    public static Modulo selecModulo() {
        Modulo modulo;
        System.out.println("\nSeleciona el m�dulo:");
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
                System.out.println("No se ha selecionado un m�dulo de la lista , se crear� uno vac�o");
                modulo = new Modulo();
        }
        return modulo;

    }

    private static void cargaDatos() {
        System.out.print("Introduce el n�mero de alumnos a matricular: ");

        alumno = new Alumno[s.nextInt()];

        System.out.println("\n ~ CARGAR ALUMNOS ~ ");

        for (int i = 0; i < alumno.length; i++) {

            alumno[i] = new Alumno();

            s.nextLine();
            System.out.println("\nIntroduce el nombre del alumno n�mero " + (i + 1) + ":");
            alumno[i].setNombre(s.nextLine());

            System.out.println("\nIntroduce los apellidos del alumno n�mero " + (i + 1) + ":");
            alumno[i].setApellidos(s.nextLine());

            System.out.println("\nIntroduce el DNI del alumno n�mero " + (i + 1) + ":");
            alumno[i].setDni(s.nextLine());

            System.out.println("\nIntroduce la direcci�n del alumno n�mero " + (i + 1) + ":");
            alumno[i].setDireccion(s.nextLine());

            System.out.println("\nIntroduce el n�mero de t�lefono del alumno " + (i + 1) + ":");
            alumno[i].setTelefono(s.nextInt());

            System.out.println("\n�De cu�ntos m�dulos se va a matricular el alumno n�mero " + (i + 1) + "? ");
            Modulo[] listaModulos = new Modulo[s.nextInt()];

            for (int j = 0; j < listaModulos.length; j++) {
                listaModulos[j] = new Modulo();
            }

            Modulo selec;
            boolean siModulo;

            for (int j = 0; j < listaModulos.length; j++) {
                do {
                    siModulo = false;
                    System.out.println("\nIndique el m�dulo " + (j + 1) + " en el que el alumno n�mero " + (i + 1) + " va a matricularse: ");
                    selec = selecModulo();
                    for (int k = 0; k < listaModulos.length; k++) {
                        //Con el siguiente IF controlamos que el alumno no se matricule en un modulo en el que ya se haya matriculado.
                        if (listaModulos[k].getNombre() != null && listaModulos[k].getNombre().equals(selec.getNombre())) {
                            //Si se intenta matricular en uno que ya lo est�, un booleano se pondr� true para que el bucle se repita hasta que se matricule en uno nuevo.
                            siModulo = true;
                            System.out.println("\nEl alumno ya ha sido matriculado en este m�dulo.");
                        }
                    }
                } while (siModulo);
                listaModulos[j] = selec;
            }
            alumno[i].setModulos(listaModulos); //Guaramos los datos que acabamos de introducir en el alumno actual.

            System.out.println("\nIntroduce el nombre del centro del alumno n�mero " + (i + 1) + ":");
            alumno[i].setCentro(s.nextLine());

            System.out.print("\nPulsa intro para continuar.");

        }
    }

    private static void cargaNotas() {

        System.out.println("\n ~ CARGAR NOTAS ~ ");

        for (int i = 0; i < alumno.length; i++) {
            System.out.println("\nAlumno: " + alumno[i].getApellidos() + " , " + alumno[i].getNombre());
            Modulo[] modulos = alumno[i].getModulos();

            for (int j = 0; j < modulos.length; j++) {

                System.out.println("M�dulo: " + modulos[j].getNombre());
                double nota1;
                double nota2;
                double nota3;

                do {
                    System.out.print("\nIntroduce la nota 1 para el m�dulo: ");
                    nota1 = s.nextDouble();
                    modulos[j].setNota1(nota1);
                    if (nota1 < 0.0 || nota1 > 10.00) { //Controlamos que la nota introducida no sea menor de 0.0, ni mayor de  10.00
                        System.out.println("Nota no v�lida.");
                    }
                } while (nota1 < 0.0 || nota1 > 10.00); //Mantenemos el bucle hasta que se introduzca una nota v�lida.

                do {
                    System.out.print("\nIntroduce la nota 2 para el m�dulo: ");
                    nota2 = s.nextDouble();
                    modulos[j].setNota2(nota2);
                    if (nota2 < 0.0 || nota2 > 10.00) { //Controlamos que la nota introducida no sea menor de 0.0, ni mayor de  10.00
                        System.out.println("Nota no v�lida.");
                    }
                } while (nota2 < 0.0 || nota2 > 10.00); //Mantenemos el bucle hasta que se introduzca una nota v�lida.

                do {
                    System.out.print("\nIntroduce la nota 3 para el m�dulo: ");
                    nota3 = s.nextDouble();
                    modulos[j].setNota3(nota3);
                    if (nota3 < 0.0 || nota3 > 10.00) { //Controlamos que la nota introducida no sea menor de 0.0, ni mayor de  10.00
                        System.out.println("Nota no v�lida.");
                    }
                } while (nota3 < 0.0 || nota3 > 10.00); //Mantenemos el bucle hasta que se introduzca una nota v�lida.

            }
        }
    }

    private static void listarCalificaciones() {
        for (int i = 0; i < alumno.length; i++) {
            System.out.println("Informaci�n y notas del alumno: \n" + alumno[i].getNombre() + " " + alumno[i].getApellidos() + alumno[i].toString());
            if (alumno[i].promociona()) {
                System.out.println("\nEl alumno: " + alumno[i].getNombre() + " " + alumno[i].getApellidos() + " est�: Aprobado.\n");
            } else {
                System.out.println("\nEl alumno: " + alumno[i].getNombre() + " " + alumno[i].getApellidos() + " est�: Suspenso.\n");
            }
        }
    }

    public static void main(String[] args) {

        boolean salir = false;
        boolean alumnosCargados = false;
        boolean notasCargadas = false;

        do {
            switch (menu()) {
                case 1:
                    cargaDatos();
                    alumnosCargados = true;
                    System.out.println("\n�Alumnos cargados!\n");
                    break;
                case 2:
                    if (!alumnosCargados) {
                        System.out.println("Introduce los datos de los alumnos antes de usar esta opci�n, gracias.");
                    } else {
                        System.out.println("");
                        for (int i = 0; i < alumno.length; i++) {
                            System.out.println("\n" + alumno[i].toStringPersona());
                        }
                        System.out.println("");
                    }
                    break;
                case 3:
                    if (!alumnosCargados) {
                        System.out.println("Introduce los datos de los alumnos antes de usar esta opci�n.");
                    } else {
                        System.out.println("");
                        cargaNotas();
                        notasCargadas = true;
                        System.out.println("");
                    }
                    break;
                case 4:
                    if (!notasCargadas) {
                        System.out.println("Introduce las notas de los alumnos antes de usar esta opci�n, gracias.");
                    } else if (!alumnosCargados) {
                        System.out.println("Introduce los datos de los alumnos antes de usar esta opci�n.");
                    } else {
                        System.out.println("");
                        listarCalificaciones();
                        System.out.println("");
                    }
                    break;
                case 5:
                    salir = true;
                    System.out.println("\nHasta pronto.");
                    break;
                default:
                    System.out.println("Opci�n no v�lida.");
            }
        } while (!salir);

    }

}
