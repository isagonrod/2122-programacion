package Tema9.Act_Ampliacion.Act_28a30;

/* ACTIVIDAD DE AMPLIACIÓN 9.30
 * Implementar una clase comparadora para ordenar las jornadas de trabajo (ver actividades anteriores) por orden de
 * número de minutos trabajados.
 * Ordenar la lista de la actividad de ampliación 9.29 por dicho orden y mostrarla por pantalla.
 */

import java.util.Comparator;

public class ComparaJornadas implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        return ((Jornada)o1).tiempoTrabajado() - ((Jornada)o2).tiempoTrabajado();
    }
}
