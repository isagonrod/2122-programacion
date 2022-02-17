package Tema9.Act_Aplicacion.Act_11y12;

/* ACTIVIDAD 9.11
 * Implementar la clase Lista para almacenar elementos de tipo String.
 */
/* ACTIVIDAD 9.12
 * Definir las interfaces Cola y Pila para objetos String e implementarlos en la clase Lista definida en la Actividad
 * de aplicación 9.11
 */

import java.util.Arrays;

public class Lista implements Cola, Pila {
    String[] tabla;

    public Lista() {
        this.tabla = new String[0];
    }

    void insertarPrincipio(String nuevo) {
        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        System.arraycopy(tabla, 0, tabla,1,tabla.length - 1);
        tabla[0] = nuevo;
    }

    void insertarFinal(Lista otraLista) {
        int tamIni = tabla.length;
        tabla = Arrays.copyOf(tabla, tabla.length + otraLista.tabla.length);
        System.arraycopy(otraLista.tabla, 0, tabla, tamIni, otraLista.tabla.length);
    }

    void insertar(int posicion, String nuevo) {
        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        System.arraycopy(tabla, posicion, tabla, posicion + 1, tabla.length - posicion - 1);
        tabla[posicion] = nuevo;
    }

    String eliminar(int indice) {
        String eliminado = null;
        if (indice >= 0 && indice < tabla.length) {
            eliminado = tabla[indice];
            for (int i = indice + 1; i < tabla.length; i++) {
                tabla[i - 1] = tabla[i];
            }
            tabla = Arrays.copyOf(tabla, tabla.length - 1);
        }
        return eliminado;
    }

    String get(int indice) {
        String resultado = null;
        if (indice >= 0 && indice < tabla.length) {
            resultado = tabla[indice];
        }
        return resultado;
    }

    int buscar(String claveBusqueda) {
        int indice = -1;
        for (int i = 0; i < tabla.length && indice == -1; i++) {
            if (tabla[i].equals(claveBusqueda)) {
                indice = i;
            }
        }
        return indice;
    }

    public String toString() {
        return Arrays.deepToString(tabla);
    }

    @Override
    public void encolar(String nuevo) {
        insertar(tabla.length, nuevo);
    }

    @Override
    public String desencolar() {
        return eliminar(0);
    }

    @Override
    public void apilar(String elemento) {
        insertar(tabla.length, elemento);
    }

    @Override
    public String desapilar() {
        return eliminar(tabla.length - 1);
    }
}
