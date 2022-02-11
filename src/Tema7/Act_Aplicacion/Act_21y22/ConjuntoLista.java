package Tema7.Act_Aplicacion.Act_21y22;

/* EJERCICIO 7.21
 * Un conjunto es una estructura dinámica de datos como la lista, con dos diferencias: en primer lugar, en una lista
 * puede haber elementos repetidos, mientras que en un conjunto, no. Además, en una lista el orden de inserción de los
 * elementos puede ser relevante y debemos tenerlo en cuenta, mientras que en un conjunto solo interesa si un elemento
 * pertenece o no al conjunto y no el lugar que ocupa.
 * Se pide implementar la clase Conjunto utilizando una lista para
 * almacenar números de tipo Integer. Implementa los siguientes métodos:
 *      - Un constructor sin parámetros.
 *      - int numeroElementos(): devuelve el número de elementos del conjunto.
 *      - boolean insertar(Integer nuevo): inserta un nuevo elemento en el conjunto.
 *      - boolean insertar(Conjunto otroConjunto): añade al conjunto los elementos de conjunto 'otroConjunto'.
 *      - boolean eliminarElemento(Integer elemento): en caso de pertenecer al conjunto, elimina elemento.
 *      - boolean eliminarConjunto (Conjunto otroConjunto): elimina del conjunto invocante los elementos del conjunto
 *          que se pasa como parámetro.
 *      - boolean pertenece(Integer elemento): indica si el elemento que se le pasa como parámetro pertenece o no al
 *          conjunto.
 *      - muestra(): muestra el conjunto por consola.
 * De forma general, los métodos que devuelven un booleano indican con él si el conjunto se ha modificado.
 */
/* EJERCICIO 7.22
 * Añade a la clase Conjunto los siguientes métodos estáticos:
 *      - static boolean incluido(Conjunto c1, Conjunto c2): que devuelve true si c1 está incluido en c2, es decir,
 *          si todos los elementos de c1 están también en c2.
 *      - static Conjunto union(Conjunto c1, Conjunto c2): devuelve un nuevo conjunto con todos los elementos que están
 *          en c1, en c2 o en ambos (elementos comunes y no comunes).
 *      - static intersección(Conjunto c1, Conjunto c2): que devuelve un nuevo conjunto con todos los elementos que están
 *          en c1 y en c2 a la vez (elementos comunes).
 *      - static diferencia(Conjunto c1, Conjunto c2): que devuelve un nuevo conjunto con todos los elementos que están
 *          en c1, pero no en c2.
 */

import Tema7.Act_Resueltas.Act_11a13.Lista;

public class ConjuntoLista {
    private Lista conjunto;

    public ConjuntoLista() {
        this.conjunto = new Lista();
    }
    public ConjuntoLista(Integer[] nueva) {
        this();
        this.conjunto.tabla = nueva;
    }

    int numeroElementos() {
        return this.conjunto.numeroElementos();
    }

    boolean insertar(Integer nuevo) {
        boolean insertado = false;

        if (!this.pertenece(nuevo)) {
            this.conjunto.insertarFinal(nuevo);
            insertado = true;
        }

        return insertado;
    }

    boolean insertar(ConjuntoLista otroConjunto) {
        boolean insertado = false;
        int numActual;

        for (int i = 0; i < otroConjunto.numeroElementos(); i++) {
            numActual = otroConjunto.conjunto.get(i);

            if (this.insertar(numActual)) {
                insertado = true;
            }
        }

        return insertado;
    }

    boolean eliminarElemento(Integer elemento) {
        boolean eliminado = false;
        Integer aEliminar = this.conjunto.buscar(elemento);

        if (aEliminar != -1) {
            this.conjunto.eliminar(aEliminar);
            eliminado = true;
        }

        return eliminado;
    }

    boolean eliminarConjunto(ConjuntoLista otroConjunto) {
        boolean eliminado = false;
        int numActual;

        for (int i = 0; i < otroConjunto.numeroElementos(); i++) {
            numActual = otroConjunto.conjunto.get(i);

            if (this.eliminarElemento(numActual)) {
                eliminado = true;
            }
        }

        return eliminado;
    }

    boolean pertenece(Integer elemento) {
        return this.conjunto.buscar(elemento) != -1;
    }

    public void muestra() {
        this.conjunto.mostrar();
    }

    static boolean incluido(ConjuntoLista c1, ConjuntoLista c2) {
        boolean incluido = true;

        for (int i = 0; i < c2.numeroElementos(); i++) {
            if (!c1.pertenece(c2.conjunto.get(i))) {
                incluido = false;
                break;
            }
        }

        return incluido;
    }

    static ConjuntoLista union(ConjuntoLista c1, ConjuntoLista c2) {
        ConjuntoLista aux = new ConjuntoLista();

        aux.conjunto.tabla = c1.conjunto.tabla;
        aux.insertar(c2);

        return aux;
    }

    static ConjuntoLista interseccion(ConjuntoLista c1, ConjuntoLista c2) {
        ConjuntoLista aux = new ConjuntoLista();
        int numActual;

        for (int i = 0; i < c2.numeroElementos(); i++) {
            numActual = c2.conjunto.get(i);

            if (c1.pertenece(numActual)) {
                aux.insertar(numActual);
            }
        }

        return aux;
    }

    static ConjuntoLista diferencia(ConjuntoLista c1, ConjuntoLista c2) {
        ConjuntoLista aux = new ConjuntoLista();
        int numActual;

        aux.conjunto.tabla = c1.conjunto.tabla;

        for (int i = 0; i < c2.numeroElementos(); i++) {
            numActual = c2.conjunto.get(i);

            if (aux.pertenece(numActual)) {
                aux.eliminarElemento(numActual);
            }
        }

        return aux;
    }
}
