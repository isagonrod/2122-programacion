package Tema10.Anexo;

/* ANEXO - ACTIVIDAD 7
 * Escribe un programa que guarde en un fichero con nombre: primos.txt los números primos que hay entre 1 y 500.
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Act_07 {
    public static void main (String[] args) {
        int[] primos = new int[0];
        int numPrimos = 0;
        BufferedWriter out = null;

        for (int i = 0; i <= 500; i++) {
            if (esPrimo(i)) {
                primos = Arrays.copyOf(primos,primos.length + 1);
                primos[numPrimos] = i;
                numPrimos++;
            }
        }

        try {
            out = new BufferedWriter(new FileWriter("archivos_txt/primos.txt"));
            String nPrimos = Arrays.toString(primos);
            out.write(nPrimos);
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        finally {
            if (out != null) {
                try {
                    out.close();
                }
                catch (IOException ex) {
                    System.out.println(ex);
                }
            }
        }
    }

    static boolean esPrimo (int n) {
        boolean primo = true;
        int i = 2;
        if (n < 1) {
            primo = false;
        }
        while (i <= (int) Math.sqrt(n) && primo == true) {
            if (n % i == 0) {
                primo = false;
            }
            i++;
        }
        return (primo);
    }
}
