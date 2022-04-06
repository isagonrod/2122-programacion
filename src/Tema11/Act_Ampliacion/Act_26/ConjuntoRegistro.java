package Tema11.Act_Ampliacion.Act_26;

import java.util.Arrays;

public class ConjuntoRegistro {
    private Registro[] tabla;

    public ConjuntoRegistro() {
        this.tabla = new Registro[0];
    }

    public Registro[] getTabla() {
        return tabla;
    }

    public void setTabla(Registro[] tabla) {
        this.tabla = tabla;
    }

    public String toString() {
        return Arrays.deepToString(this.tabla);
    }

    public Registro[] nuevoRegistro(Registro nuevo) {

        this.tabla = Arrays.copyOf(tabla, tabla.length + 1);
        this.tabla[tabla.length - 1] = nuevo;

        return this.tabla;
    }

    /** Calcula el valor máximo de entre el tipo de registro seleccionado.
     *
     * @param tipo - 1 para las máximas, 2 para las mínimas, 3 para las variaciones
     * @return la temperatura máxima del tipo seleccionado
     */
    public double calcularMax(int tipo) {
        double max = 0.0, aux = 0;

        for (Registro elemento : this.tabla) {
            switch (tipo) {
                case 1 -> aux = elemento.getTempMax();
                case 2 -> aux = elemento.getTempMin();
                case 3 -> aux = elemento.variacion();
            }

            if (aux > max) {
                max = aux;
            }
        }

        return max;
    }

    /** Calcula el valor mínimo de entre el tipo de registro seleccionado.
     *
     * @param tipo - 1 para las máximas, 2 para las mínimas, 3 para las variaciones
     * @return la temperatura mínima del tipo seleccionado
     */
    public double calcularMin(int tipo) {
        double min = 9999999.0, aux = 0;

        for (Registro elemento : this.tabla) {
            switch (tipo) {
                case 1 -> aux = elemento.getTempMax();
                case 2 -> aux = elemento.getTempMin();
                case 3 -> aux = elemento.variacion();
            }

            if (aux < min) {
                min = aux;
            }
        }

        return min;
    }

    /** Calcula el valor medio de entre el tipo de registro seleccionado.
     *
     * @param tipo - 1 para las máximas, 2 para las mínimas, 3 para las variaciones
     * @return la temperatura media del tipo seleccionado
     */
    public double calcularMedia(int tipo) {
        double media = 0.0, aux = 0;

        for (Registro elemento : this.tabla) {
            switch (tipo) {
                case 1 -> aux = elemento.getTempMax();
                case 2 -> aux = elemento.getTempMin();
                case 3 -> aux = elemento.variacion();
            }

            media += aux;
        }

        media /= this.tabla.length;

        return media;
    }
}
