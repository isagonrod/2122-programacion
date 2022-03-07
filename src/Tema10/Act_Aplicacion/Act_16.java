package Tema10.Act_Aplicacion;

/* ACTIVIDAD DE APLICACIÓN 10.16
 * Un libro de firmas es útil para recoger los nombres de todas las personas que han pasado por un determinado lugar.
 * Crea una aplicación que permita mostrar el libro de firmas e insertar un nuevo nombre (comprobando que no se
 * encuentre repetido).
 * Llamaremos al fichero firmas.txt
 */

import Tema9.Act_Aplicacion.Act_11y12_15a18_24y25.Lista;
import Utilidades.Teclado;

import java.io.*;

public class Act_16 {
    public static void main (String[] args) {
        Lista listaNombres = new Lista();
        String nuevoNombre;

        procesaFichero("firmas.txt", listaNombres);

        System.out.println(listaNombres);

        nuevoNombre = Teclado.getString("Inserte nuevo nombre para el libro: ");
        while (listaNombres.buscar(nuevoNombre) != -1) {
            nuevoNombre = Teclado.getString("Repetido. Inserte de nuevo un nombre para el libro: ");
        }

        listaNombres.encolar(nuevoNombre);

        escribeFichero("firmas.txt", listaNombres);
    }

    public static void procesaFichero(String origen, Lista lista) {
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader("archivos_txt/" + origen));
            String linea = br.readLine();
            while (linea != null) {
                lista.encolar(linea);
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

    public static void escribeFichero(String destino, Lista lista) {
        BufferedWriter bw = null;

        try {
            bw = new BufferedWriter(new FileWriter("archivos_txt/" + destino));
            while (lista.getLength() != 0) {
                bw.write(((String)lista.desencolar()));
                bw.newLine();
            }
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage() + " - " + destino);
        }
        finally {
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException ex) {
                    System.out.println(ex);
                }
            }
        }
    }
}
