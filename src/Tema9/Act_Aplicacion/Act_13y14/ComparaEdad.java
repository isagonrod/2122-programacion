package Tema9.Act_Aplicacion.Act_13y14;

/* ACTIVIDAD 9.14
 * Añadir a la actividad de aplicación 9.13 un comparador que ordene los futbolistas por edades y, para aquellos que
 * tienen la misma edad, por nombres.
 */

import java.util.Comparator;

public class ComparaEdad implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        int resultado;
        resultado = ((Futbolista)o1).edad  - ((Futbolista)o2).edad;
        if (resultado == 0) {
            resultado = ((Futbolista)o1).nombre.compareTo(((Futbolista)o2).nombre);
        }
        return resultado;
    }
}
