package Tema7.Act_Aplicacion.Act_19;

/* Implementa la clase Pila para números Integer, usando directamente una tabla para guardar los elementos apilados.
 */

import java.util.Arrays;

//Las colas son LIFO (Last in, first out)
public class Pila {
    private Integer[] pila;

    //constructor
    public Pila() {
        this.pila = new Integer[0];
    }

    //apilar
    void apilar (Integer elemento) {
        this.pila = Arrays.copyOf(this.pila, this.pila.length + 1);
        this.pila[this.pila.length - 1] = elemento;
    }

    //desapilar - simplemente cambiamos de tamaño, porque el que sale es el último
    Integer desapilar () {
        Integer eliminado;

        eliminado = this.pila[this.pila.length - 1];
        this.pila = Arrays.copyOf(this.pila, this.pila.length - 1);

        return eliminado;
    }

    public String toString() {
        return "Pila: " + Arrays.toString(pila);
    }
}
