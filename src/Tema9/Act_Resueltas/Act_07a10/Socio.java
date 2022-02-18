package Tema9.Act_Resueltas.Act_07a10;

/* ACTIVIDAD 9.7
 * Implementar la interfaz Comparable en la clase Socio para que, por defecto, se ordene según los números de
 * identificación -id- crecientes.
 */
/* ACTIVIDAD DE APLICACIÓN 9.19
 * Implementa la interfaz Comparable en la clase Socio para que el criterio de ordenación natural sea de menor a mayor
 * edad.
 */
/* ACTIVIDAD DE APLICACIÓN 9.20
 * Repetir actividad de aplicación 9.19 para que se ordene por edades y, si dos socios tienen la misma edad, vaya antes
 * el que tenga un número de socio menor.
 */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Socio implements Comparable {
    int id;
    public String nombre;
    LocalDate fechaNacimiento;

    public Socio(int id, String nombre, String fechaNacimiento) {
        this.id = id;
        this.nombre = nombre;
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        this.fechaNacimiento = LocalDate.parse(fechaNacimiento, f);
    }

    int edad() {
        return (int)fechaNacimiento.until(LocalDate.now(), ChronoUnit.YEARS);
    }

    @Override
    public int compareTo(Object otro) {
        int resultado;
        resultado = this.edad() - ((Socio)otro).edad();
        if (resultado == 0) {
            resultado = this.id - ((Socio)otro).id;
        }
        return resultado;
    }

    public String toString() {
        return "Id: " + id + " | Nombre: " + nombre + " | Edad: " + edad() + "\n";
    }
}
