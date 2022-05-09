package Tema12.Act_Ampliacion.Act_33;

import java.util.*;

public class ListaOrdenada<E extends Comparable<E>> {
    private List<E> objetos;
    private Comparator<E> comparador;

    public ListaOrdenada() {
        // Aplicar Orden natural y ordenar (sort)
        this.objetos = new LinkedList<>();
        this.comparador = Comparator.naturalOrder();
    }

    public ListaOrdenada(Comparator<E> c) {
        // Aplicar Orden de 'c' y ordenar (sort)
        this.objetos = new LinkedList<>();
        this.comparador = c;
    }

    public List<E> getObjetos() {
        return this.objetos;
    }

    public void setObjetos(List<E> objetos) {
        this.objetos = objetos;
    }

    public Comparator<E> getComparador() {
        return this.comparador;
    }

    public void setComparador(Comparator<E> comparador) {
        this.comparador = comparador;
    }

    public void insertarPrincipio (E elem) {
        this.objetos.add(0, elem);
        this.ordenar(this.comparador);
    }

    public void insertarFinal (E elem) {
        this.objetos.add(elem);
        this.ordenar(this.comparador);
    }

    public void insertarEn (int indice, E elem) {
        this.objetos.add(indice, elem);
        this.ordenar(this.comparador);
    }

    public void eliminar (int indice) {
        this.objetos.remove(indice);
    }

    public void eliminar (E elem) {
        this.objetos.remove(elem);
    }

    public void eliminarTodos (E elem) {
        boolean eliminado;
        do {
            eliminado = this.objetos.remove(elem);
        } while (eliminado);
    }

    public int buscar (E elem) {
        return Collections.binarySearch(this.objetos, elem);
    }

    public String toString() {
        return this.objetos.toString();
    }

    public void ordenar (Comparator<E> c) {
        this.objetos.sort(c);
    }
}
