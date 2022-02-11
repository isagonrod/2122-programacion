package Tema5.Anexo;

import java.util.Arrays;

public class Act_01 {

    /* Crea tres arrays de 20 números enteros cada uno, con nombres: numero, cuadrado y cubo.
     *  Carga el array numero con valores aleatorios entre 0 y 100.
     *  En el array cuadrado se deben almacenar los cuadrados de los valores de la misma posición que hay en el array numero.
     *  En el array cubo se deben almacenar los cubos de los valores que hay en numero.
     *  A continuación, muestra el contenido de los tres arrays dispuestos en tres columnas.
     */

    public static void main (String args[]) {

        int numero[] = new int[20];
        int cuadrado[] = new int[20];
        int cubo[] = new int[20];

        rellenar(numero);
        rellenarCuadrado(numero,cuadrado);
        rellenarCubo(numero,cubo);

        System.out.println("Tabla 'numero': " + Arrays.toString(numero));
        System.out.println("Tabla 'cuadrado': " + Arrays.toString(cuadrado));
        System.out.println("Tabla 'cubo': " + Arrays.toString(cubo));
    }

    static void rellenar (int vector[]) {
        int aux;
        for (int i = 0; i < vector.length; i++) {
            aux = (int)(Math.random() * 101);
            vector[i] = aux;
        }
    }

    static void rellenarCuadrado (int vector1[], int vector2[]) {
        int aux;
        for (int i = 0; i < vector1.length; i++) {
            aux = (int)(Math.pow(vector1[i],2));
            vector2[i] = aux;
        }
    }

    static void rellenarCubo (int vector1[], int vector3[]) {
        int aux;
        for (int i = 0; i < vector1.length; i++) {
            aux = (int)(Math.pow(vector1[i],3));
            vector3[i] = aux;
        }
    }
}