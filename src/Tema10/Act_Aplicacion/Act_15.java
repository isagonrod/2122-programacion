package Tema10.Act_Aplicacion;

/* ACTIVIDAD DE APLICACIÓN 10.15
 * En el archivo numeros.txt disponemos de una serie de números (uno por cada línea).
 * Diseña un programa que procese el fichero y nos muestre el menor y el mayor.
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Act_15 {
    public static void main (String[] args) {
        Integer menorMayor[] = {9999999, 0};
        procesaFichero("numeros.txt", menorMayor);

        System.out.println("El menor es el " + menorMayor[0] + " y el mayor es el " + menorMayor[1]);
    }

    public static void procesaFichero(String origen, Integer menorMayor[]) {
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader("archivos_txt/" + origen));
            String linea = br.readLine();
            while (linea != null) {
                menorMayor[0] = Math.min(menorMayor[0], Integer.parseInt(linea));
                menorMayor[1] = Math.max(menorMayor[1], Integer.parseInt(linea));
                linea = br.readLine();
            }
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage() + " - " + origen);
        }
        finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException ex) {
                    System.out.println(ex);
                }
            }
        }
    }
}
