package Tema12.Anexo;

/* ACTIVIDAD 4 DEL ANEXO
 * En el proceso de selección de personal de una empresa, el conocimiento de idiomas (inglés, francés y alemán) de los
 * candidatos es uno de los factores a evaluar. Para ello se hizo una prueba por cada idioma, y se generó un conjunto
 * por cada idioma con los candidatos que superaron cada prueba.
 * Implementar un método estático que dados los tres conjuntos (uno para cada idioma), devuelva un array con los siguientes
 * conjuntos:
 *  a) Candidatos que superaron la prueba de inglés y otra más.
 *  b) Candidatos que superaron al menos dos idiomas.
 *  c) Candidatos que solo dominan un idioma.
 */

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Act_4 {
    public static void main(String[] args) {
        Set<String> english = new TreeSet<>();
        Set<String> français = new TreeSet<>();
        Set<String> deutsch = new TreeSet<>();

        english.add("Isa");
        english.add("Sara");
        français.add("Sara");
        français.add("Ángel");
        deutsch.add("Isa");
        deutsch.add("Miguel");
    }

    static Set[] candidatos(Set<String> english, Set<String> français, Set<String> deutsch) {
        Set[] candidatos = {english, français, deutsch};
        Set[] resultados = new TreeSet[3];

        // Candidatos que superaron la prueba de inglés y otra más

        // Candidatos que superaron al menos dos idiomas.

        // Candidatos que solo dominan un idioma.

        return resultados;
    }
}
