package Tema12.Act_Ampliacion.Act_33;

import java.util.Comparator;
import java.util.List;

public class ListaOrdenada<E extends Comparable<E>> {
    private List<E> objetos;
    private Comparator<E> comparador;

    public ListaOrdenada() {
        // Aplicar Orden natural y ordenar (sort)
    }

    public ListaOrdenada(Comparator c) {
        // Aplicar Orden de 'c' y ordenar (sort)
    }

    public List<E> getObjetos() {
        return objetos;
    }

    public void setObjetos(List<E> objetos) {
        this.objetos = objetos;
    }

    public Comparator<E> getComparador() {
        return comparador;
    }

    public void setComparador(Comparator<E> comparador) {
        this.comparador = comparador;
    }

    // void insertarPrincipio (E obj)

    // void insertarFinal (E obj)

    // void insertarEn (int indice, E elem)

    // void eliminar (int indice)

    // void eliminar (E obj)

    // void eliminarTodos (E obj)

    // int buscar (E obj)

    // String toString()
}
