package Tema9.Act_Resueltas.Act_01a04;

/* EJERCICIO 9.4
 * Añadir a la clase Lista la implementación de la interfaz Pila, junto a la interfaz Cola, ya implementada.
 */

import Tema9.Act_Propuestas.Act_02.ColaDoble;

import java.util.Arrays;

public class Lista implements Pila, Cola, ColaDoble {
    public Integer[] lista;

    public Lista() {
        this.lista = new Integer[0];
    }

    @Override
    public void encolar(Integer nuevo) {
        lista = Arrays.copyOf(lista, lista.length + 1);
        lista[lista.length - 1] = nuevo;
    }

    @Override
    public Integer desencolar() {
        Integer eliminado;

        eliminado = this.lista[0];
        System.arraycopy(this.lista, 1, this.lista, 0, this.lista.length - 1);
        this.lista = Arrays.copyOf(this.lista, this.lista.length - 1);

        return eliminado;
    }

    @Override
    public void apilar(Integer elemento) {
        encolar(elemento);
    }

    @Override
    public Integer desapilar() {
        Integer eliminado;

        eliminado = this.lista[lista.length - 1];
        System.arraycopy(this.lista, 0, this.lista, 0, this.lista.length - 1);
        this.lista = Arrays.copyOf(this.lista, this.lista.length - 1);

        return eliminado;
    }

    @Override
    public void encolarCabeza(Integer nuevo) {
        lista = Arrays.copyOf(lista, lista.length + 1);
        System.arraycopy(lista, 0, lista, 1, lista.length - 1);
        lista[0] = nuevo;
    }

    @Override
    public Integer desencolarFinal() {
        return desapilar();
    }
}
