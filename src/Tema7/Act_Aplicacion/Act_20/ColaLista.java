package Tema7.Act_Aplicacion.Act_20;

/* Repite la Actividad de aplicación 7.18, usando una Lista para guardar los elementos encolados.
 */

import Tema7.Act_Resueltas.Act_11a13.Lista;

//Las colas son FIFO (First in, first out)
public class ColaLista {
    private Lista cola;

    public ColaLista() {
        this.cola = new Lista();
    }

    // encolar
    void encolar(Integer elemento) {
        cola.insertarFinal(elemento);
    }

    // desencolar
    Integer descolar() {
        return cola.eliminar(0);
    }

    public void mostrar() {
        cola.mostrar();
    }
}
