package Tema12.Act_Ampliacion;

/* ACTIVIDAD DE AMPLIACIÓN 12.28
 * Implementa la función uneCadenas, con el siguiente prototipo:
 *      List<Character> uneCadenas(List<Character> cad1, List<Character> cad2),
 * que devuelve una lista con la concatenación de cad1 y cad2.
 */

import java.util.ArrayList;
import java.util.List;

public class Act_28 {
    public static void main(String[] args) {
        List<Character> cad1 = new ArrayList<>();
        List<Character> cad2 = new ArrayList<>();
        List<Character> concatenacion;

        cad1.add('a');
        cad1.add('e');
        cad1.add('i');
        cad1.add('o');
        cad1.add('u');

        cad2.add('b');
        cad2.add('c');
        cad2.add('d');
        cad2.add('f');
        cad2.add('g');

        concatenacion = uneCadenas(cad1, cad2);

        System.out.println("Lista 1: " + cad1);
        System.out.println("Lista 2: " + cad2);
        System.out.println("Concatenación de las dos listas: " + concatenacion);
    }

    public static List<Character> uneCadenas(List<Character> cad1, List<Character> cad2) {
        List<Character> lista = new ArrayList<>(cad1);
        lista.addAll(cad2);
        return lista;
    }
}
