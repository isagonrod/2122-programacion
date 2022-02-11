package Tema4.Recursividad;

import java.util.Arrays;

public class Act_Clase_02 {
    /* Encontrar el valor máximo dentro de un vector */

    public static void main (String[] args) {
        int[] vector = new int[5];
        rellenar(vector);

        System.out.println("VECTOR: " + Arrays.toString(vector));
        System.out.println("El valor máximo dentro del vector es: " + encontrarValorMax(vector, 0, -1));
        System.out.println("El valor máximo dentro del vector es: " + maxRec(vector, vector.length-1, -1));
    }

    static void rellenar (int[] vector) {
        int i;
        for (i = 0; i < vector.length; i++) {
            vector[i] = (int)(Math.random()*100+1);
        }
    }

    //mi versión
    static int encontrarValorMax (int[] vector, int posActual, int maxActual) {
        int max = maxActual; //variable para evitar los retornos dobles

        if (vector.length != posActual) { //ejecutar la recursión mientras no lleguemos al último índice, no necesita else
            if (maxActual < vector[posActual]) {
                max = vector[posActual];
            }
            max = encontrarValorMax(vector, posActual + 1, max);
        }

        return max;
    }

    //versión de Eva
    static int maxRec (int[] vector, int i, int max) {
        if (i == 0) {
            return max; //no se hacen retornos condicionales, ni retornos en medio del código
        } else {
            if (max < vector[i]) {
                max = vector[i];
            }
            return (maxRec (vector, i-1, max));
        }
    }
}
