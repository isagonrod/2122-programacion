package Tema12.Act_Clase;

/*
 * Probar todos los métodos de la clase Collections de forma secuencial. Los métodos son los siguientes:
 *  - sort (con y sin Comparator)
 *  - binarySearch (con y sin Comparator)
 *  - swap
 *  - replaceAll
 *  - fill
 *  - copy
 *  - shuffle
 *  - max
 *  - min
 *  - reverse
 *  - singleton
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Clase_Collections {
    public static void main(String[] args) {
        List<Integer> lista1 = new ArrayList<>();

        lista1.add(1);
        lista1.add(2);
        lista1.add(3);
        lista1.add(4);
        lista1.add(5);
        System.out.println("Lista 1 original: " + lista1);

        Collections.fill(lista1, 69);
        System.out.println("Lista después de sustituir todos sus elementos: " + lista1);

        lista1.add(2, 33);
        lista1.add(44);
        lista1.add(55);
        lista1.add(11);
        lista1.add(22);
        System.out.println("Lista con más elementos: " + lista1);

        Collections.replaceAll(lista1, 69, 88);
        System.out.println("Lista con elementos reemplazados: " + lista1);

        Collections.sort(lista1);
        System.out.println("Lista ordenada de menor a mayor: " + lista1);

        System.out.println("Lugar en el que se encuentra el elemento buscado: " + Collections.binarySearch(lista1, 44));

        Comparator<Integer> c = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        };
        Collections.sort(lista1, c);
        System.out.println("Lista ordenada de mayor a menor: " + lista1);

        System.out.println("Lugar del elemento buscado (orden inverso): " + Collections.binarySearch(lista1, 44, c));

        Collections.shuffle(lista1);
        System.out.println("Lista desordenada: " + lista1);

        lista1.removeAll(Collections.singleton(88));
        System.out.println("Lista con elementos eliminados: " + lista1);

        System.out.println("Número más pequeño de la lista: " + Collections.min(lista1));
        System.out.println("Número más grande de la lista: " + Collections.max(lista1));

        Collections.reverse(lista1);
        System.out.println("Lista invertida: " + lista1);

        Collections.swap(lista1, 0, lista1.size() - 1);
        System.out.println("Lista con los números intercambiados: " + lista1);

        List<Integer> lista2 = new ArrayList<>();
        lista2.add(1);
        lista2.add(2);
        System.out.println("\nLista 2 original: " + lista2);

        Collections.copy(lista1, lista2);
        System.out.println("Lista 2 copiada en la lista 1: " + lista1);
    }
}
