package Tema9.Act_Aplicacion.Act_13y14;

import java.util.Comparator;

public class ComparaNombre implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {

        return ((Futbolista)o1).nombre.compareToIgnoreCase(((Futbolista)o2).nombre);
    }
}
