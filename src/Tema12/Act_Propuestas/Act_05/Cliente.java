package Tema12.Act_Propuestas.Act_05;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Cliente implements Comparable<Cliente> {
    Integer dni;
    String nombre;
    LocalDate fechaNacimiento;

    public Cliente(Integer dni, String nombre, String fecha) {
        this.dni = dni;
        this.nombre = nombre;
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.fechaNacimiento = LocalDate.parse(fecha, f);
    }

    @Override
    public boolean equals(Object o) {
        Cliente cliente = (Cliente) o;
        return dni.equals(cliente.dni);
    }

    public int edad() {
        return (int)fechaNacimiento.until(LocalDate.now(), ChronoUnit.YEARS);
    }

    public String toString() {
        return "\nDNI: " + this.dni + " | Nombre: " + this.nombre + " | Edad: " + this.edad();
    }

	@Override
	public int compareTo(Cliente o) {
		return this.dni - o.dni;
	}
}
