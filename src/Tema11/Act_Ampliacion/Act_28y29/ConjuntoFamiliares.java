package Tema11.Act_Ampliacion.Act_28y29;

import java.util.Arrays;

public class ConjuntoFamiliares {
    private Familiar[] familares;

    public ConjuntoFamiliares() {
        this.familares = new Familiar[0];
    }

    public Familiar[] getFamilares() {
        return familares;
    }

    public void setFamilares(Familiar[] familares) {
        this.familares = familares;
    }

    public String toString() {
        return Arrays.deepToString(this.familares);
    }

    public Familiar[] introducirDatosFamiliar(Familiar nuevo) {
        Familiar[] aux = this.familares;
        int posicion = Arrays.binarySearch(aux, nuevo);

        if (posicion < 0) {
            posicion = Math.abs(posicion) - 1;

            aux = Arrays.copyOf(aux, aux.length + 1);
            System.arraycopy(aux, 0, aux, 0, posicion);
            System.arraycopy(aux, posicion, aux, posicion + 1, aux.length - posicion - 1);

            aux[posicion] = nuevo;

            this.familares = aux;
        }

        return this.familares;
    }

    public void listadoOrdenadoEdad() {
        Arrays.sort(this.familares);
        System.out.println(Arrays.deepToString(this.familares));
    }
}
