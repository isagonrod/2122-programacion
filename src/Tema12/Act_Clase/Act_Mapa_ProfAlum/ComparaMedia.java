package Tema12.Act_Clase.Act_Mapa_ProfAlum;

import java.util.Comparator;

public class ComparaMedia implements Comparator<Alumno> {
    @Override
    public int compare(Alumno o1, Alumno o2) {
        return o2.media() - o1.media();
    }
}
