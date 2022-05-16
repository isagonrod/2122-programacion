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

import java.util.Set;

public class Principal_5 {
    public static void main(String[] args) {
        Ejercicio10 diccionario = new Ejercicio10();
        //diccionario.addPalabra();
    }
}
