package Tema7.Act_Aplicacion.Act_18;

/* Una cola es otra estructura dinámica como la pila, donde los elementos, en vez de apilarse y desapilarse, se encolan
 * y desencolan. La diferencia con las pilas es que se desencola el primer elemento encolado, ya que así es como funcionan
 * las colas del autobús o del cine. El primero que llega es el primero que sale de la cola (vamos a suponer que nadie
 * se cuela). Por tanto, los elementos se encolan y desencolan en extremos opuestos de la estructura, llamados primero
 * (el que está primero y será el próximo en abandonar la cola) y último (el que llegó último).
 *
 * Implementa la clase Cola donde los elementos Integer encolados se guardan en una tabla.
 */

import java.util.Arrays;

public class Cola {
    private Integer[] cola;

    // constructor
    public Cola () {
        this.cola = new Integer[0];
    }

    // encolar
    void encolar (Integer elemento) {
        this.cola = Arrays.copyOf(cola, this.cola.length + 1);
        this.cola[this.cola.length - 1] = elemento;
    }

    // desencolar
    Integer desencolar() {
        Integer eliminado;

        eliminado = this.cola[0];
        System.arraycopy(this.cola, 1, this.cola, 0, this.cola.length - 1);
        this.cola = Arrays.copyOf(this.cola, this.cola.length - 1);

        return eliminado;
    }

    public String toString() {
        return "Cola: " + Arrays.toString(cola);
    }
}

// FIFO : First In First Out = COLA
// LIFO : Last In First Out = PILA