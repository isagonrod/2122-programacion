package Tema9.Act_Resueltas.Act_07;

/* ACTIVIDAD 9.7
 * Implementar la interfaz Comparable en la clase Socio para que, por defecto, se ordene según los números de
 * identificación -id- crecientes.
 */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Socio implements Comparable {
    int id;
    String nombre;
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
    public int compareTo(Object ob) {
        int resultado;
        Socio otroSocio = (Socio)ob;
        if (id < otroSocio.id) {
            resultado = -1;
        } else if (id > otroSocio.id) {
            resultado = 1;
        } else {
            resultado = 0;
        }
        return resultado;
    }

    public int compareToTwo(Object ob) {
        return id - ((Socio)ob).id;
    }

    public String toString() {
        return "Id: " + id + "| Nombre: " + nombre + "| Edad: " + edad() + "\n";
    }
}
