package Tema10.Act_Aplicacion;

/* ACTIVIDAD DE APLICACIÓN 10.12
 * Diseña una aplicación que pida al usuario su nombre y edad.
 * Estos datos deben guardarse en el fichero datos.txt.
 * Si este fichero existe, deben añadirse al final en una nueva línea, y en caso de no existir, debe crearse.
 */

import Utilidades.Teclado;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Act_12 {
    public static void main (String[] args) {
        String nombre = Teclado.getString("Introduczca su nombre: ");
        Integer edad = Teclado.getNumber("Introduzca su edad: ");
        String linea = "Nombre: " + nombre + ", edad: " + edad;

        BufferedWriter out = null;

        try {
            out = new BufferedWriter(new FileWriter("archivos_txt/DatosPersonales.txt", true));
            out.write(linea);
            out.newLine();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
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
