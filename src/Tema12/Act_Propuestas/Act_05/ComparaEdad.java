package Tema12.Act_Propuestas.Act_05;

import java.util.Comparator;

public class ComparaEdad implements Comparator<Cliente> {
    @Override
    public int compare(Cliente o1, Cliente o2) {
        return o2.edad() - o1.edad();
    }
}
