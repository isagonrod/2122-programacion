package Tema7.Anexo.Act_1;

/* Repite el ejercicio propuesto 7.22 del libro, implementando la clase Conjunto sin usar la clase Lista
*/

import java.util.Arrays;

public class Conjunto {
    private Integer[] conjunto;

    public Conjunto() {
        this.conjunto = new Integer[0];
    }
    public Conjunto(Integer[] nueva) {
        this.conjunto = nueva;
    }

    int numeroElementos() {
        return conjunto.length;
    }

    boolean insertar(Integer nuevo) {
        boolean insertado = false;

        if (!this.pertenece(nuevo)) {
            conjunto = Arrays.copyOf(conjunto, conjunto.length + 1);
            conjunto[conjunto.length - 1] = nuevo;
            insertado = true;
        }

        return insertado;
    }

    boolean insertar(Conjunto otroConjunto) {
        boolean insertado = false;
        int numActual;

        for (int i = 0; i < otroConjunto.numeroElementos(); i++) {
            numActual = otroConjunto.get(i);

            if (this.insertar(numActual)) {
                insertado = true;
            }
        }

        return insertado;
    }

    boolean eliminarElemento(Integer elemento) {
        boolean eliminado = false;
        Integer aEliminar = this.buscar(elemento);

        if (aEliminar != -1) {
            if (aEliminar >= 0 && aEliminar < conjunto.length) {
                for (int i = aEliminar + 1; i < conjunto.length; i++) {
                    conjunto[i-1] = conjunto[i];
                }
                conjunto = Arrays.copyOf(conjunto, conjunto.length - 1);
            }
            eliminado = true;
        }

        return eliminado;
    }

    boolean eliminarConjunto(Conjunto otroConjunto) {
        boolean eliminado = false;
        int numActual;

        for (int i = 0; i < otroConjunto.numeroElementos(); i++) {
            numActual = otroConjunto.get(i);

            if (this.eliminarElemento(numActual)) {
                eliminado = true;
            }
        }

        return eliminado;
    }

    boolean pertenece(Integer elemento) {
        return this.buscar(elemento) != -1;
    }

    public void muestra() {
        System.out.println("Lista: " + Arrays.toString(conjunto));
    }

    static boolean incluido(Conjunto c1, Conjunto c2) {
        boolean incluido = true;

        for (int i = 0; i < c2.numeroElementos(); i++) {
            if (!c1.pertenece(c2.get(i))) {
                incluido = false;
                break;
            }
        }

        return incluido;
    }

    static Conjunto union(Conjunto c1, Conjunto c2) {
        Conjunto aux = new Conjunto();

        aux.conjunto = c1.conjunto;
        aux.insertar(c2);

        return aux;
    }

    static Conjunto interseccion(Conjunto c1, Conjunto c2) {
        Conjunto aux = new Conjunto();
        int numActual;

        for (int i = 0; i < c2.numeroElementos(); i++) {
            numActual = c2.get(i);

            if (c1.pertenece(numActual)) {
                aux.insertar(numActual);
            }
        }

        return aux;
    }

    static Conjunto diferencia(Conjunto c1, Conjunto c2) {
        Conjunto aux = new Conjunto();
        int numActual;

        aux.conjunto = c1.conjunto;

        for (int i = 0; i < c2.numeroElementos(); i++) {
            numActual = c2.get(i);

            if (aux.pertenece(numActual)) {
                aux.eliminarElemento(numActual);
            }
        }

        return aux;
    }

    public Integer get (int indice) {
        Integer resultado = null;
        if (indice >= 0 && indice < conjunto.length) {
            resultado = conjunto[indice];
        }
        return resultado;
    }

    public int buscar(Integer claveBusqueda) {
        int indice = -1;
        for (int i = 0; i < conjunto.length; i++) {
            if (conjunto[i].equals(claveBusqueda)) {
                indice = i;
            }
        }
        return indice;
    }
}
