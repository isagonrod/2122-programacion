package Tema12.Anexo.Act_5y6;

/* ACTIVIDAD 5 DEL ANEXO
 * Implemente una clase llamada Ejercicio10 que tenga los métodos siguientes:
 *  a) Un método añadirPalabras que reciba como parámetro un conjunto ordenado (orden natural) y añada cadenas a este
 *      conjunto. Las cadenas se leerán por teclado y el bucle estará controlado por una variable booleana también leída
 *      por teclado.
 *  b) Un método mostrarSubconjunto que reciba un conjunto ordenado de objetos de la clase String como parámetro y
 *      muestre en la pantalla el subconjunto de cadenas comprendidas entre dos cadenas leídas por teclado. Para poder
 *      mostrar el subconjunto, la cadena primera tiene que ser menor que la segunda, si no, se eleva una excepción de
 *      tipo IllegalArgumentException que se debe capturar.
 *  c) Un método mayoresOigualesQue que reciba un conjunto ordenado de objetos de la clase String como parámetro y
 *      muestre en la pantalla las cadenas del conjunto mayores o iguales a una cadena leída por teclado.
 *  d) Un método menoresQue que reciba un conjunto ordenado de objetos de la clase String como parámetro y muestre en la
 *      pantalla las cadenas del conjunto menores estrictamente que una cadena leída por el teclado.
 *  e) Un método main en el que se crea un conjunto ordenado llamado diccionario y se prueban los métodos anteriores.
 *      Además, muestra en la pantalla el tamaño del diccionario, la primera y la última cadena del diccionario y el
 *      comparador con el que están ordenadas las cadenas que forman parte de él.
 *
 * NOTA: Ver métodos de Set. Recordar los métodos subSet, tailSet y headSet de SortedSet.
 */

import Utilidades.Teclado;

import java.util.SortedSet;
import java.util.TreeSet;

public class Ejercicio10 {
    /** Un método añadirPalabras que reciba como parámetro un conjunto ordenado (orden natural) y añada cadenas a este
     *  conjunto. Las cadenas se leerán por teclado y el bucle estará controlado por una variable booleana también leída
     *  por teclado.
     */
    static void addPalabra(SortedSet<String> conjunto) {
        boolean seguir;
        do {
            conjunto.add(Teclado.getString("Nueva palabra: "));
            seguir = Teclado.getString("¿Quieres seguir? ").equals("si");
        } while(seguir);
    }

    /** Un método mostrarSubconjunto que reciba un conjunto ordenado de objetos de la clase String como parámetro y
     *  muestre en la pantalla el subconjunto de cadenas comprendidas entre dos cadenas leídas por teclado. Para poder
     *  mostrar el subconjunto, la cadena primera tiene que ser menor que la segunda, si no, se eleva una excepción de
     *  tipo IllegalArgumentException que se debe capturar.
     */
    static void mostrarSubconjunto(SortedSet<String> conjunto) {
        String palabra1 = Teclado.getString("Cadena 1: "), palabra2 = Teclado.getString("Cadena 2: ");

        if (palabra1.compareTo(palabra2) < 0) {
            System.out.println("Subconjunto entre " + palabra1 + " y " + palabra2 + ": " +
                    conjunto.subSet(palabra1, palabra2));
        }
        else {
            throw new IllegalArgumentException();
        }
    }

    /** Un método mayoresOigualesQue que reciba un conjunto ordenado de objetos de la clase String como parámetro y
     *  muestre en la pantalla las cadenas del conjunto mayores o iguales a una cadena leída por teclado.
     */
    static void mayoresOigualesQue(SortedSet<String> conjunto) {
        String palabra = Teclado.getString("Palabra: ");
        System.out.println("Palabras mayores o iguales que " + palabra + ": " + conjunto.tailSet(palabra));
    }

    /** Un método menoresQue que reciba un conjunto ordenado de objetos de la clase String como parámetro y muestre en la
     *  pantalla las cadenas del conjunto menores estrictamente que una cadena leída por el teclado.
     */
    static void menoresQue(SortedSet<String> conjunto) {
        String palabra = Teclado.getString("Palabra: ");
        System.out.println("Palabras menores que " + palabra + ": " + conjunto.headSet(palabra));
    }

    public static void main(String[] args) {
        SortedSet<String> diccionario = new TreeSet<>();
        Ejercicio10.addPalabra(diccionario);
        Ejercicio10.mostrarSubconjunto(diccionario);
        Ejercicio10.mayoresOigualesQue(diccionario);
        Ejercicio10.menoresQue(diccionario);

        SortedSet<String> nuevoDiccionario = new TreeSet<>(new ComparadorLongitud());
        nuevoDiccionario.addAll(diccionario);

        System.out.println("Nuevo diccionario utilizando " + ComparadorLongitud.class.getName());
        System.out.println(nuevoDiccionario);
    }
}
