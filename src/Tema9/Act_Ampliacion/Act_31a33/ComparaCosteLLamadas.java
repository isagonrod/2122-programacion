package Tema9.Act_Ampliacion.Act_31a33;

/* ACTIVIDAD DE AMPLIACIÓN 9.33
 * Implementar una clase comparadora que ordene las llamadas por coste.
 * Usarla para ordenar la lista de la actividad de ampliación 9.32 y mostrar el resultado por pantalla.
 */

import java.util.Comparator;

public class ComparaCosteLLamadas implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        return (int)(((Llamada)o1).costeLlamada() - ((Llamada)o2).costeLlamada());
    }
}
