package Tema12.Anexo.Act_3;

import java.util.Comparator;

public class ComparadorPuntosYGoles implements Comparator<IEquipo> {
    /** Implementar el comparador ComparadorPuntosYGoles de manera que podamos ordenar una colección de equipos (IEquipo)
     *  de forma descendente por puntos.
     *  En caso de que dos equipos tengan los mismos puntos, se ordena también de forma descendente según la diferencia
     *  entre los goles a favor y los goles en contra.
     *
     * @param o1 the first object to be compared.
     * @param o2 the second object to be compared.
     * @return
     */
    @Override
    public int compare(IEquipo o1, IEquipo o2) {
        int resultado;

        if (o2.getPuntos() != o1.getPuntos()) {
            resultado = o2.getPuntos() - o1.getPuntos();
        } else {
            int diferencia1 = o1.getGolesFavor() - o1.getGolesContra();
            int diferencia2 = o2.getGolesFavor() - o2.getGolesContra();
            resultado = diferencia2 - diferencia1;
        }

        return resultado;
    }
}
