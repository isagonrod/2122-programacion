package Proyectos_Menu.Socio;

import Utilidades.Teclado;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Socio implements Comparable {
    public static int idSocioActual = 1;
    int idSocio;
    public String nombre;
    LocalDate fechaNacimiento;

    public Socio(int idSocio, String nombre, String fechaNacimiento) {
        this.idSocio = idSocio;
        this.nombre = nombre;
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        this.fechaNacimiento = LocalDate.parse(fechaNacimiento, f);
    }

    int edad() {
        return (int)fechaNacimiento.until(LocalDate.now(), ChronoUnit.YEARS);
    }

    @Override
    public int compareTo(Object otro) {
        return this.idSocio - ((Socio)otro).idSocio;
    }

    public String toString() {
        return "Id: " + this.idSocio + " | Nombre: " + this.nombre + " | Fecha de nacimiento: " + this.fechaNacimiento
                + " | Edad: " + edad() + "\n";
    }

    public static Socio pedirDatosSocio() {
        return new Socio(
                Teclado.getNumber("ID: "),
                Teclado.getString("NOMBRE: "),
                Teclado.getString("FECHA DE NACIMIENTO: ")
        );
    }
}
