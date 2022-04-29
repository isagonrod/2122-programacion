package Tema12.Act_Aplicacion;

/* ACTIVIDAD DE APLICACIÓN 12.23
 * Repite la actividad de aplicación 12.22 de forma que se inserten los nombres manteniendo el orden alfabético.
 */

import Utilidades.Teclado;

import java.util.Set;
import java.util.TreeSet;

public class Act_23 {
    public static void main(String[] args) {
        Set<String> conjuntoNombres = new TreeSet<>();
        String nombre;

        do {
            nombre = Teclado.getString("Introduce nombre: ");
            conjuntoNombres.add(nombre);
        }
        while (!nombre.equals("fin"));

        conjuntoNombres.remove("fin");

        System.out.println("Colección de nombres: " + conjuntoNombres);
    }
}
