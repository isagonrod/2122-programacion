package Tema12.Anexo.Act_10;

import java.util.Comparator;

public class ComparaMedia implements Comparator<Alumno> {
    @Override
    public int compare(Alumno o1, Alumno o2) {
        return o1.media() - o2.media();
    }
}