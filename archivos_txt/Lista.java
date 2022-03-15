package Tema7.Act_Resueltas.Act_11a13;

/* EJERCICIO RESUELTO 7.11.
 * Las listas son estructuras dinámicas de datos donde se pueden insertar o eliminar elementos de un determinado tipo
 * sin limitación de espacio.
 * Implementar la clase Lista correspondiente a una lista de números de la clase Integer.
 * Los números se guardarán en una tabla que se redimensionará con las inserciones y eliminaciones, aumentando o
 * disminuyendo la capacidad de la lista según el caso.
 * Entre los métodos de la clase, se incluirán las siguientes tareas:
 *      - Un constructor que inicialice la tabla con un tamaño 0.
 *      - Obtener el número de elementos insertados en la lista.
 *      - Insertar un número al final de la lista.
 *      - Insertar un número al principio de la lista.
 *      - Insertar un número en un lugar de la lista cuyo índice, que es el de la tabla, se para como parámetro.
 *      - Añadir al final de la lista los elementos de otra lista que se pasa como parámetro.
 *      - Eliminar un elemento cuyo índice en la lista se pasa como parámetro.
 *      - Obtener el elemento cuyo índice se pasa como parámetro.
 *      - Buscar un número en la lista, devolviendo el índice del primer lugar donde se encuentre. Si no está, devolverá -1.
 *      - Mostrar los elementos de la lista por consola.
 *
 * Además,
 *
 */
/* EJERCICIO RESUELTO 7.12.
 * Añadir a la clase Lista el método estático: Lista concatena(Lista l1, Lista l2) que construye y devuelve una lista
 * que contiene, en el mismo orden, una copia de todos los elementos de l1 y l2.
 */

import java.util.Arrays;

public class Lista {
    public Integer[] tabla;

    public Lista() {
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

    public void insertarFinal(Lista otraLista) {
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

    public void mostrar() {
        System.out.println("Lista: " + Arrays.toString(tabla));
    }

    static Lista concatena(Lista l1, Lista l2) {
        Lista resultado = new Lista();
        for (Integer e : l1.tabla) {
            resultado.insertarFinal(e);
        }
        for (Integer e : l2.tabla) {
            resultado.insertarFinal(e);
        }
        return resultado;
    }
}
