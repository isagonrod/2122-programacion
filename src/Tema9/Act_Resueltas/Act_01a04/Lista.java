package Tema9.Act_Resueltas.Act_01a04;

/* EJERCICIO 9.4
 * Añadir a la clase Lista la implementación de la interfaz Pila, junto a la interfaz Cola, ya implementada.
 */

import Tema9.Act_Propuestas.Act_02.ColaDoble;

import java.util.Arrays;

public class Lista implements Pila, Cola, ColaDoble {
    public Integer[] tabla;

    public Lista() {
        this.tabla = new Integer[0];
    }

    @Override
    public String toString() {
        return "Lista: " + Arrays.toString(tabla);
    }

    @Override
    public void encolar(Integer nuevo) {
        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        tabla[tabla.length - 1] = nuevo;
    }

    @Override
    public Integer desencolar() {
        Integer eliminado = null;

        if (this.tabla.length != 0) {
            eliminado = this.tabla[0];
            System.arraycopy(this.tabla, 1, this.tabla, 0, this.tabla.length - 1);
            this.tabla = Arrays.copyOf(this.tabla, this.tabla.length - 1);
        }
        return eliminado;
    }

    @Override
    public void apilar(Integer elemento) {
        encolar(elemento);
    }

    @Override
    public Integer desapilar() {
        Integer eliminado = null;

        if (this.tabla.length != 0) {
            eliminado = this.tabla[tabla.length - 1];
            System.arraycopy(this.tabla, 0, this.tabla, 0, this.tabla.length - 1);
            this.tabla = Arrays.copyOf(this.tabla, this.tabla.length - 1);
        }

        return eliminado;
    }

    @Override
    public void encolarCabeza(Integer nuevo) {
        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        System.arraycopy(tabla, 0, tabla, 1, tabla.length - 1);
        tabla[0] = nuevo;
    }

    @Override
    public Integer desencolarFinal() { // TODO : Supongo que tampoco funcionará
        return desapilar();
    }
}
