package Tema10.Act_Aplicacion;

/* ACTIVIDAD DE APLICACIÓN 10.13
 * Implementa un programa que lea dos listas de números enteros no ordenados de sendos archivos con un número por línea,
 * los reúna en una lista única y los guarde en orden creciente en un tercer archivo, de nuevo uno por línea.
 */

import Tema9.Act_Aplicacion.Act_11y12_15a18_24y25.Lista;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Act_13 {
    public static void main (String[] args) {
        Lista lista1 = new Lista(), lista2 = new Lista(), lista3 = new Lista();

        procesaFichero("NumerosEnteros1.txt", lista1);
        procesaFichero("NumerosEnteros2.txt", lista2);

        lista3.insertarFinal(lista1);
        lista3.insertarFinal(lista2);
        lista3.ordenar();

        escribeFichero("NumerosEnteros3.txt", lista3);
    }

    public static void procesaFichero(String origen, Lista lista) {
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader("archivos_txt/" + origen));
            String linea = br.readLine();
            while (linea != null) {
                lista.encolar(Integer.valueOf(linea));
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
                bw.write(((Integer)lista.desencolar()).toString());
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
