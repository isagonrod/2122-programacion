package Tema8.Act_Aplicacion.Act_14a20;

/* EJERCICIO 8.14
 * Reimplementa la clase Lista de la actividad resuelta 7.11, sustituyendo el método mostrar() por el método toString().
 */
/* EJERCICIO 8.15
 * Escribe en la clase Lista un método equals() para compararlas.
 * Dos listas se considerarán iguales si tienen los mismos elementos (incluidas las repeticiones) en el mismo orden.
 */

import java.util.Arrays;

public class ListaNueva {
    public Integer[] tabla;

    public ListaNueva() {
        tabla = new Integer[0];
    }

    public void insertarPrincipio(Integer nuevo) {
        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        System.arraycopy(tabla, 0, tabla, 1, tabla.length - 1);
        tabla[0] = nuevo;
    }

    public void insertarFinal(Integer nuevo) {
        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        tabla[tabla.length - 1] = nuevo;
    }

    public void insertarFinal(ListaNueva otraLista) {
        int tamIni = tabla.length;
        tabla = Arrays.copyOf(tabla, tabla.length + otraLista.tabla.length);
        System.arraycopy(otraLista.tabla, 0, tabla, tamIni, otraLista.tabla.length);
    }

    public void insertar(int posicion, Integer nuevo) {
        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        System.arraycopy(tabla, posicion, tabla, posicion + 1, tabla.length - posicion - 1);
        tabla[posicion] = nuevo;
    }

    public Integer eliminar(int indice) {
        Integer eliminado = null;
        if (indice >= 0 && indice < tabla.length) {
            eliminado = tabla[indice];
            for (int i = indice + 1; i < tabla.length; i++) {
                tabla[i-1] = tabla[i];
            }
            tabla = Arrays.copyOf(tabla, tabla.length - 1);
        }
        return eliminado;
    }

    public Integer get (int indice) {
        Integer resultado = null;
        if (indice >= 0 && indice < tabla.length) {
            resultado = tabla[indice];
        }
        return resultado;
    }

    public int buscar(Integer claveBusqueda) {
        int indice = -1;
        for (int i = 0; i < tabla.length; i++) {
            if (tabla[i].equals(claveBusqueda)) {
                indice = i;
            }
        }
        return indice;
    }

    public int numeroElementos() {
        return tabla.length;
    }

    @Override
    public String toString() {
        return "ListaNueva{" + "tabla=" + Arrays.toString(tabla) + '}';
    }

    static ListaNueva concatena(ListaNueva l1, ListaNueva l2) {
        ListaNueva resultado = new ListaNueva();
        for (Integer e : l1.tabla) {
            resultado.insertarFinal(e);
        }
        for (Integer e : l2.tabla) {
            resultado.insertarFinal(e);
        }
        return resultado;
    }

    @Override
    public boolean equals(Object o) {
        boolean iguales;
        int i, coincidencias = 0;

        if (this == o) { //si coinciden las referencias de memoria
            iguales = true;
        } else if (o == null || this.getClass() != o.getClass()) { //si el otro es nulo o no son de la misma clase
            iguales = false;
        } else {
            ListaNueva otro = (ListaNueva) o;

            for (i = 0; i < this.tabla.length; i++) {
                if (this.tabla[i].equals(otro.tabla[i])) { //igualdad en el mismo orden
                    coincidencias++;
                }
            }

            iguales = coincidencias >= this.tabla.length; //si no hemos visto menos coincidencias que el tamaño, serán iguales
            //iguales = Arrays.equals(tabla, otro.tabla);
        }
        return iguales;
    }
}
