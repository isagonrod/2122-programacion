package Tema12.Anexo.Act_5y6;

/* ACTIVIDAD 6 DEL ANEXO
 * Implemente una clase llamada ComparadorLongitud donde se defina como criterio de comparación entre dos cadenas su
 * longitud. En el caso de que dos cadenas tengan la misma longitud, el orden será el orden natural de los objetos de
 * la clase String.
 *
 * En el método main del ejercicio anterior, cree un nuevo conjunto ordenado según este comparador llamado nuevodiccionario
 * donde se añadan todas las palabras del diccionario anterior y algunas nuevas.
 * Imprima en la pantalla el nuevo diccionario para ver cómo queda ordenado según el nuevo orden.
 * Imprima además el comparador usado.
 */

import java.util.Comparator;

public class ComparadorLongitud implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        int resultado = o1.length() - o2.length();
        if (resultado == 0) {
            resultado = o1.compareToIgnoreCase(o2);
        }
        return resultado;
    }
}
