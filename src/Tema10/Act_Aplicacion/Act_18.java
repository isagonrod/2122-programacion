package Tema10.Act_Aplicacion;

/* ACTIVIDAD DE APLICACIÓN 10.18
 * Escribe la función Integer[] leerEnteros(String texto), al que se le pasa una cadena y devuelve una tabla con todos
 * los enteros que aparecen en ella.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Act_18 {
    public static void main (String[] args) {
        String texto = "En la casa había 7 hermanas con 20 gatos de 4 patas cada 1";
        System.out.println(Arrays.toString(leerEnteros(texto)));
    }

    public static Integer[] leerEnteros(String texto) {
        Integer[] tablaEnteros = new Integer[0];
        Scanner sc = new Scanner(texto);

        for (int i = 0; sc.hasNext(); i++) {
            try {
                tablaEnteros = Arrays.copyOf(tablaEnteros, tablaEnteros.length + 1);
                tablaEnteros[i] = Integer.parseInt(sc.next());
            }
            catch (NumberFormatException ex) {
                System.out.println(ex.getMessage());
                tablaEnteros = Arrays.copyOf(tablaEnteros, tablaEnteros.length - 1);
                i--;
            }
        }

        return tablaEnteros;
    }
}
