package Tema12.Act_Aplicacion;

/* ACTIVIDAD DE APLICACIÓN 12.22
 * Introduce por teclado, hasta que se introduzca "fin", una serie de nombres, que se insertarán en una colección,
 * de forma que se conserve el orden de inserción y que no puedan repetirse.
 * Al final, la colección se mostrará por pantalla.
 */

import Utilidades.Teclado;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Act_22 {
    public static void main(String[] args) {
        Set<String> conjuntoNombres = new LinkedHashSet<>();
        String nombre;

        do {
            nombre = Teclado.getString("Introduce nombre: ");
            conjuntoNombres.add(nombre);
        }
        while (!Objects.equals(nombre, "fin"));

        conjuntoNombres.remove("fin");

        System.out.println("Colección de nombres: " + conjuntoNombres);
    }
}
