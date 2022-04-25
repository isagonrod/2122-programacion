package Tema12.Act_Resueltas.Act_11;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Socio implements Comparable<Socio>, Serializable {
    String dni;
    String nombre;
    LocalDate fechaAlta;

    public Socio(String dni, String nombre, String alta) {
        this.dni = dni;
        this.nombre = nombre;
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.fechaAlta = LocalDate.parse(alta, f);
    }

    public Socio(String dni) {
        this.dni = dni;
    }

    int antiguedad() {
        return (int)this.fechaAlta.until(LocalDate.now(), ChronoUnit.YEARS);
    }

    @Override
    public int compareTo(Socio o) {
        return dni.compareToIgnoreCase(o.dni);
    }

    @Override
    public boolean equals(Object o) {
        return dni.equals(((Socio)o).dni);
    }

    @Override
    public String toString() {
        return "DNI: " + this.dni + " | Nombre: " + this.nombre + " | Antigüedad: " + this.antiguedad() + "\n";
    }
}
