package Tema12.Act_Propuestas.Act_05;

import java.util.Comparator;

public class ComparaNombre implements Comparator<Cliente> {
    @Override
    public int compare(Cliente o1, Cliente o2) {
        return o1.nombre.compareToIgnoreCase(o2.nombre);
    }
}
