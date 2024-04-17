/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestionEmpleados;

import java.util.Scanner;

/**
 *
 * @author María Azahara Parrales Cuevass
 */
public class MainEmpleados {

    //Variables que no se inicializan pero sí se declaran (Scanner sí se inicializa)
    //Atributos de l clase Main
    private static Scanner s = new Scanner(System.in);
    private static Empleados[] empleado;

    //Métodos
    private static int menu() {
        int op = 0;

        do {
            System.out.print("\t---MENÚ--- "
                    + "\n1. Cargar empleados."
                    + "\n2. Listar empleados."
                    + "\n3. Listar las nóminas de los empleados."
                    + "\n4. Salir."
                    + "\n\n"
                    + "Introduce un número del menú: ");
            op = s.nextInt();
            if (op < 1 || op > 4) {
                System.out.print("Opción no válida.");
            }
        } while (op < 1 || op > 4);

        return op;
    }

    private static void cargaDatos() {
        System.out.print("Introduce el número de empleados: ");

        empleado = new Empleados[s.nextInt()];

        for (int i = 0; i < empleado.length; i++) {

            empleado[i] = new Empleados();

            s.nextLine();
            System.out.println("\nIntroduce el nombre del empleado número " + (i + 1) + ":");
            empleado[i].setNombre(s.nextLine());

            System.out.println("\nIntroduce los apellidos del empleado número " + (i + 1) + ":");
            empleado[i].setApellidos(s.nextLine());

            System.out.println("\nIntroduce la edad del empleado número " + (i + 1) + ":");
            empleado[i].setEdad(s.nextInt());

            s.nextLine();
            System.out.println("\nIntroduce el DNI del empleado número " + (i + 1) + ":");
            empleado[i].setDni(s.nextLine());

            System.out.println("\nIntroduce la dirección del empleado número " + (i + 1) + ":");
            empleado[i].setDireccion(s.nextLine());

            System.out.println("\nIntroduce el código postal del empleado número " + (i + 1) + ":");
            empleado[i].setCodigoPostal(s.nextInt());

            s.nextLine();
            System.out.println("\nIntroduce la población del empleado número " + (i + 1) + ":");
            empleado[i].setPoblacion(s.nextLine());

            System.out.println("\nIntroduce la provincia del empleado número " + (i + 1) + ":");
            empleado[i].setProvincia(s.nextLine());

            System.out.println("\nA. Director."
                    + "\nB. Técnico Superior."
                    + "\nC. Técnico Medio."
                    + "\nD. Auxiliar."
                    + "\nIntroduce la categoría del empleado número " + (i + 1) + ":");
            empleado[i].setCategoria(s.nextLine().toUpperCase().charAt(0));

            System.out.println("\nIntroduce la cantidad de hijos del empleado número " + (i + 1) + ":");
            empleado[i].setnHijos(s.nextInt());

            s.nextLine();
            System.out.println("\n1. Nivel Inicial"
                    + "\n2. Nivel Medio."
                    + "\n3. Nivel Avanzado."
                    + "\nIntroduce el nivel de inglés del empleado número " + (i + 1) + ":");
            empleado[i].setNivelIngles(s.nextInt());

            s.nextLine();
            System.out.println("\nIntroduce la antigüedad del empleado número " + (i + 1) + ":");
            empleado[i].setAntiguedad(s.nextInt());
        }
    }

    private static void nominasEmpleados() {
        for (int i = 0; i < empleado.length; i++) {
            System.out.println("\n" + empleado[i].toString() + "\n\n\tSueldo: " + empleado[i].sueldoBase() + ""
                    + "\n\n\tRetención: " + empleado[i].retencionIFPF() + "% " +(empleado[i].sueldoBase() * empleado[i].retencionIFPF() / 100) + ""
                    + "\n\n\tSueldo neto: " + (empleado[i].sueldoBase() * (100 - empleado[i].retencionIFPF()) / 100));
        }
    }

    public static void main(String[] args) {

        boolean salir = true;

        do {
            switch (menu()) {
                case 1:
                    cargaDatos();
                    System.out.println("\n¡Empleados cargados!\n");
                    break;
                case 2:
                    System.out.println("");
                    for (int i = 0; i < empleado.length; i++) {
                        System.out.println("\n" + empleado[i].toString());
                    }
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("");
                    nominasEmpleados();
                    System.out.println("");
                    break;
                case 4:
                    salir = false;
                    System.out.println("\nHasta pronto.");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (salir);
    }
}
