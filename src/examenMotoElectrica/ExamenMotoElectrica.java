/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenMotoElectrica;

/**
 *
 * @author Azahara
 *
 * La moto tiene como características marca, modelo, identificador alfanumérico,
 * la velocidad a la que circula y la dirección.
 *
 * La velocidad se mide de 0 a 50. La dirección de mide con los valores -2, -1 ,
 * 0, 1 , 2 de la siguiente forma: 0 es en línea recta, -1 es 25 grados izda, -2
 * es 45 grados izda, 1 es 25 grados derecha y 2 es 45 grados derecha.
 *
 * La moto tiene los siguientes métodos:
 *
 * - acelerar() que recibe como parámetro un número de segundos y modifica la
 * velocidad de la moto de forma que por cada segundo aumenta en 2 Km/h. Cuando
 * llega a 50 km/h la velocidad no sube aunque sigamos acelerando porque está
 * limitada a esa velocidad.
 *
 * - frenar() que recibe como parámetro el tiempo en segundos que se pisa el
 * freno y que modifica la velocidad de la bicicleta disminuyéndola 5 Km/h por
 * cada segundo que se activa.
 *
 * - girar() que recibe el carácter ?i? o ?d? según giramos a la izquierda o a
 * la derecha. Si el valor de la dirección es -2 o 2 no se puede girar más.
 */
public class ExamenMotoElectrica {

    //Atributos de la clase.
    private String marca;
    private String modelo;
    private String identificador;
    private int velocidad;
    private int direccion;

    //Constructor
    public ExamenMotoElectrica(String marca, String modelo, String identificador) {
        this.marca = marca;
        this.modelo = modelo;
        this.identificador = identificador;
        this.velocidad = 0; //Inicialmente está parada
        this.direccion = 0; //Inicialmente está parada
    }

    //Constructor vacío
    public ExamenMotoElectrica() {
    }

    //Métodos
    public void acelerar(int segundos) {
        for (int i = 0; i < segundos; i++) {
            if (this.velocidad <= 48) {
                this.velocidad += 2;
            } else if (this.velocidad == 50) {
                this.velocidad = 50;
            }
        }
    }

    public void frenar(int segundos) {
        for (int i = 0; i < segundos; i++) {
            if (this.velocidad > 0) {
                this.velocidad -= 5;
            }
        }
    }

    public void girar(char direccionGiro) {
        if (direccionGiro == 'i') {
            //Girar hacia la izquierda
            if (this.direccion > -2) {
                if (this.direccion == -1) {
                    this.direccion = -2; //Cambiar de -1 a -2 (45 grados a la izquierda)
                } else {
                    this.direccion = -1; //Cambiar de 0 a -1 (25 grados a la izquierda)
                }
            }
        } else if (direccionGiro == 'd') {
            //Girar hacia la derecha
            if (this.direccion < 2) {
                if (this.direccion == 1) {
                    this.direccion = 2; //Cambiar de 1 a 2 (45 grados a la derecha)
                } else {
                    this.direccion = 1; //Cambiar de 0 a 1 (25 grados a la derecha)
                }
            }
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getDireccion() {
        return direccion;
    }

    public void setDireccion(int direccion) {
        this.direccion = direccion;
    }

    public void mostrarEstado() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Identificador: " + identificador);
        System.out.println("Velocidad: " + velocidad + " km/h");
        System.out.println("Dirección: " + direccion);
    }
}
