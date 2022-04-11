package Tema11.Act_Ampliacion.Act_32;

import java.util.Arrays;

public class ConjuntoLlamadas {
    private Llamada[] tabla;

    public ConjuntoLlamadas() {
        this.tabla = new Llamada[0];
    }

    public Llamada[] getTabla() {
        return tabla;
    }

    public void setTabla(Llamada[] tabla) {
        this.tabla = tabla;
    }

    public String toString() {
        return Arrays.deepToString(this.tabla);
    }

    public Llamada[] nuevoRegistroLlamada(Llamada nueva) {
        Llamada[] aux = this.tabla;
        int posicion = Arrays.binarySearch(aux, nueva);

        if (posicion < 0) {
            posicion = Math.abs(posicion) - 1;

            aux = Arrays.copyOf(aux, aux.length + 1);
            System.arraycopy(aux, 0, aux, 0, posicion);
            System.arraycopy(aux, posicion, aux, posicion + 1, aux.length - posicion - 1);

            aux[posicion] = nueva;

            this.tabla = aux;
        }

        return this.tabla;
    }

    public void mostrarListaLlamadas(String dni) {
    }
}
