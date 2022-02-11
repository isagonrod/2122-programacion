package Tema6.Act_Aplicacion;

import java.util.Arrays;
import java.util.Scanner;

public class Act_18 {
    /* Escribe una aplicación que convierte una frase (que puede estar escrita con cualquier combinación de mayúsculas
     * y minúsculas) en el nombre de una variable que utilice la nomenclatura Camel.
     * Por ejemplo: la frase <<Me GUsta merenDAR gaLLEtas>>, se convertirá en <<meGustaMerendarGalletas>>.
     * Supondremos que cada palabra que compone la frase está separada por un único espacio en blanco.
     */
    public static void main (String[] args) {
        String frase = getString("Introduce una frase sin distinguir mayúsculas de minúsculas: ");
        frase = frase.toLowerCase();

        frase = transformarFrase(frase);

        System.out.println(frase);
    }

    static String transformarFrase(String frase) {
        char[] cadenaTemporal = frase.toCharArray();
        int i;

        for (i = 0; i < cadenaTemporal.length; i++) {
            if (cadenaTemporal[i] == ' ') {
                cadenaTemporal[i + 1] = (char)(cadenaTemporal[i + 1] - 32);
                System.arraycopy(cadenaTemporal, i + 1, cadenaTemporal, i, cadenaTemporal.length - 1 - i);
                cadenaTemporal = Arrays.copyOf(cadenaTemporal, cadenaTemporal.length - 1);
            }
        }
        return String.valueOf(cadenaTemporal);
    }

    static String getString (String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextLine();
    }
}
