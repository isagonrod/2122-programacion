package Tema9.Act_Propuestas.Act_03a05;

/* ACTIVIDAD 9.5
 * Define una clase comparadora que ordene los socios por orden alfabético de nombres.
 */

import Tema9.Act_Resueltas.Act_07a10.Socio;

import java.util.Comparator;

public class ComparaNombre implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        return ((Socio)o1).nombre.compareToIgnoreCase(((Socio)o2).nombre);
    }
}
