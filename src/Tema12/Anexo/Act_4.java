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

import java.util.*;

public class Act_4 {
    public static void main(String[] args) {
        Set<String> english = new TreeSet<>();
        Set<String> francais = new TreeSet<>();
        Set<String> deutsch = new TreeSet<>();
        Set<String>[] resultados;

        english.add("Isa");
        english.add("Sara");
        francais.add("Sara");
        francais.add("Ángel");
        deutsch.add("Isa");
        deutsch.add("Miguel");

        resultados = candidatos(english, francais, deutsch);

        System.out.println(Arrays.toString(resultados));
    }

    static Set<String>[] candidatos(Set<String> english, Set<String> francais, Set<String> deutsch) {
        Set<String>[] resultados = new TreeSet[3];
        Set<String> aux = new TreeSet<>();

        // Candidatos que superaron la prueba de inglés y otra más
        resultados[0] = new TreeSet<>();
        aux.addAll(english);
        aux.retainAll(francais);
        resultados[0].addAll(aux);
        aux.clear();
        aux.addAll(english);
        aux.retainAll(deutsch);
        resultados[0].addAll(aux);
        aux.clear();

        // Candidatos que superaron al menos dos idiomas.
        resultados[1] = new TreeSet<>();
        aux.addAll(francais);
        aux.retainAll(deutsch);
        resultados[1].addAll(aux);
        aux.addAll(english);
        aux.retainAll(deutsch);
        resultados[1].addAll(aux);
        aux.addAll(english);
        aux.retainAll(francais);
        resultados[1].addAll(aux);
        aux.clear();

        // Candidatos que solo dominan un idioma.
        resultados[2] = new TreeSet<>();
        aux.addAll(english);
        aux.addAll(francais);
        aux.addAll(deutsch);
        aux.removeAll(resultados[1]);
        resultados[2].addAll(aux);

        return resultados;
    }
}
