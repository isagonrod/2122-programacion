package Tema9.Act_Aplicacion.Act_13y14;

/* ACTIVIDAD 9.13
 * Diseñar la clase Futbolista con los siguientes atributos: dni, nombre, edad y número de goles.
 * Implementar:
 *      - Un constructor y los métodos toString() y equals() (este último basado en el DNI).
 *      - La interfaz Comparable con un criterio de ordenación basado también en el DNI.
 *      - Un comparador para hacer ordenaciones basadas en el nombre y otro basado en la edad.
 * Crear una tabla con 5 futbolistas y mostrarlos ordenados por DNI, por nombre y por edad.
 */
/* ACTIVIDAD 9.14
 * Añadir a la actividad de aplicación 9.13 un comparador que ordene los futbolistas por edades y, para aquellos que
 * tienen la misma edad, por nombres.
 */

import java.util.Comparator;

public class Futbolista implements Comparable {
    String dni, nombre;
    Integer edad, nGoles;

    public Futbolista(String dni, String nombre, Integer edad, Integer nGoles) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.nGoles = nGoles;
    }

    public String toString() {
        return "DNI: " + this.dni + " | Nombre: " + this.nombre + " | Edad: " + this.edad + " | Nº de goles: "
                + this.nGoles;
    }

    public boolean equals(Futbolista otroFutbolista) {
        return this.dni == otroFutbolista.dni;
    }

    @Override
    public int compareTo(Object otroFutbolista) {
        return this.dni.compareTo(((Futbolista)otroFutbolista).dni);
    }
}
