package Tema9.Act_Aplicacion.Act_13y14;

import Tema7.Anexo.Act_1.Conjunto;

import java.util.Arrays;

public class ConjuntoFutbolistas {
    Futbolista[] equipo;

    public ConjuntoFutbolistas() {
        this.equipo = new Futbolista[0];
    }

    void ordenarDni() {
        Arrays.sort(this.equipo);
    }

    void ordenarNombre() {
        Arrays.sort(this.equipo, new ComparaNombre());
    }

    void ordenarEdad() {
        Arrays.sort(this.equipo, new ComparaEdad());
    }

    int numeroElementos() {
        return this.equipo.length;
    }

    boolean insertar(Futbolista nuevo) {
        boolean insertado = false;

        if (!this.pertenece(nuevo)) {
            this.equipo = Arrays.copyOf(this.equipo, this.equipo.length + 1);
            this.equipo[this.equipo.length - 1] = nuevo;
            insertado = true;
        }

        return insertado;
    }

    boolean insertar(ConjuntoFutbolistas otroConjunto) {
        boolean insertado = false;
        Futbolista actual;

        for (int i = 0; i < otroConjunto.numeroElementos(); i++) {
            actual = otroConjunto.get(i);

            if (this.insertar(actual)) {
                insertado = true;
            }
        }

        return insertado;
    }

    boolean eliminarElemento(Futbolista elemento) {
        boolean eliminado = false;
        Integer aEliminar = this.buscar(elemento);

        if (aEliminar != -1) {
            if (aEliminar >= 0 && aEliminar < this.equipo.length) {
                for (int i = aEliminar + 1; i < this.equipo.length; i++) {
                    this.equipo[i-1] = this.equipo[i];
                }
                this.equipo = Arrays.copyOf(this.equipo, this.equipo.length - 1);
            }
            eliminado = true;
        }

        return eliminado;
    }

    boolean eliminarConjunto(ConjuntoFutbolistas otroConjunto) {
        boolean eliminado = false;
        Futbolista actual;

        for (int i = 0; i < otroConjunto.numeroElementos(); i++) {
            actual = otroConjunto.get(i);

            if (this.eliminarElemento(actual)) {
                eliminado = true;
            }
        }

        return eliminado;
    }

    boolean pertenece(Futbolista elemento) {
        return this.buscar(elemento) != -1;
    }

    public void muestra() {
        System.out.println("Lista: " + Arrays.toString(this.equipo));
    }

    static boolean incluido(ConjuntoFutbolistas c1, ConjuntoFutbolistas c2) {
        boolean incluido = true;

        for (int i = 0; i < c2.numeroElementos(); i++) {
            if (!c1.pertenece(c2.get(i))) {
                incluido = false;
                break;
            }
        }

        return incluido;
    }

    public Futbolista get (int indice) {
        Futbolista resultado = null;
        if (indice >= 0 && indice < this.equipo.length) {
            resultado = this.equipo[indice];
        }
        return resultado;
    }

    public int buscar(Futbolista claveBusqueda) {
        int indice = -1;
        for (int i = 0; i < this.equipo.length; i++) {
            if (this.equipo[i].equals(claveBusqueda)) {
                indice = i;
            }
        }
        return indice;
    }
}
