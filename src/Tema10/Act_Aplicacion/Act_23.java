package Tema10.Act_Aplicacion;

/* ACTIVIDAD DE APLICACIÓN 10.23
 * Con el fichero deportistas.txt de la Actividad de aplicación 10.22, implementa una aplicación que lea los datos de los
 * deportistas y los guarde en otros tres ficheros, uno con los nombres y las edades, otro con los nombres y los pesos
 * y el tercero con los nombres y las estaturas.
 */

import java.io.*;
import java.util.Scanner;

public class Act_23 {
    public static void main (String[] args) {
        String[] deportistas = procesarDeportistas();
        guardarEnFichero(deportistas[0],"deport1.txt");
        guardarEnFichero(deportistas[1],"deport2.txt");
        guardarEnFichero(deportistas[2],"deport3.txt");
    }

    static String[] procesarDeportistas() {
        FileInputStream deportistas = null;
        String nombre;
        String[] resultado = {"", "", ""};
        int edad;
        double peso, estatura;

        try {
            deportistas = new FileInputStream("archivos_txt/deportistas.txt");
            Scanner sc = new Scanner(deportistas);

            sc.nextLine();
            while (sc.hasNext()) {
                nombre = "";

                do {
                    nombre += sc.next() + " ";
                } while (!sc.hasNextInt());

                nombre = nombre.trim(); //para quitar el espacio que sobra del do-while
                edad = sc.nextInt();
                peso = sc.nextDouble();
                estatura = sc.nextDouble();

                resultado[0] = resultado[0] + nombre + " " + edad + "\n";
                resultado[1] = resultado[1] + nombre + " " + peso + "\n";
                resultado[2] = resultado[2] + nombre + " " + estatura + "\n";
            }
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        finally {
            if (deportistas != null) {
                try {
                    deportistas.close();
                }
                catch (IOException ex) {
                    System.out.println(ex);
                }
            }
        }

        return resultado;
    }

    static void guardarEnFichero(String contenido, String destino) {
        BufferedWriter out = null;

        try {
            out = new BufferedWriter(new FileWriter("archivos_txt/" + destino));
            out.write(contenido);
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        finally {
            if (out != null) {
                try {
                    out.close();
                } catch (IOException ex) {
                    System.out.println(ex);
                }
            }
        }
    }
}
