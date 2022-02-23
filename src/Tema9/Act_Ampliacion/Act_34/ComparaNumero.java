package Tema9.Act_Ampliacion.Act_34;

import java.util.Comparator;

public class ComparaNumero implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        return ((Carta)o1).num - ((Carta)o2).num;
    }
}
