package Tema12.Act_Aplicacion.Act_25;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class SocioApodo implements Comparable<SocioApodo>, Serializable {
	String nombre;
	LocalDate fechaIngreso;

	public SocioApodo(String nombre, String fechaIngreso) {
		this.nombre = nombre;
		DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		this.fechaIngreso = LocalDate.parse(fechaIngreso, f);
	}

	@Override
	public boolean equals(Object o) {
		SocioApodo that = (SocioApodo) o;
		return nombre.equals(that.nombre);
	}

	@Override
	public int compareTo(SocioApodo o) {
		return this.nombre.compareToIgnoreCase(o.nombre);
	}

	int antigüedad() {
		return (int)this.fechaIngreso.until(LocalDate.now(), ChronoUnit.YEARS);
	}

	@Override
	public String toString() {
		return "Nombre: " + this.nombre + " | Fecha de ingreso: " + this.fechaIngreso +
				" | Antigüedad: " + this.antigüedad() + " años";
	}

	public boolean esAnterior(String fecha) {
		DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate fechaAComprobar = LocalDate.parse("01/01/" + fecha, f);

		return this.fechaIngreso.isBefore(fechaAComprobar);
	}
}
