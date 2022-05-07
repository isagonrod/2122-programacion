package Tema12.Act_Aplicacion.Act_25;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class SocioApodo implements Comparable<SocioApodo> {
	String apodo;
	String nombre;
	LocalDate fechaIngreso;

	public SocioApodo(String apodo, String nombre, String fechaIngreso) {
		this.apodo = apodo;
		this.nombre = nombre;
		DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		this.fechaIngreso = LocalDate.parse(fechaIngreso, f);
	}

	public SocioApodo(String apodo) {
		this.apodo = apodo;
	}

	@Override
	public boolean equals(Object o) {
		SocioApodo that = (SocioApodo) o;
		return apodo.equals(that.apodo);
	}

	@Override
	public int compareTo(SocioApodo o) {
		return this.apodo.compareToIgnoreCase(o.apodo);
	}

	int antigüedad() {
		return (int)this.fechaIngreso.until(LocalDate.now(), ChronoUnit.YEARS);
	}

	@Override
	public String toString() {
		return "Apodo: " + this.apodo + " | Nombre real: " + this.nombre + " | Fecha de ingreso: " + this.fechaIngreso +
				" | Antigüedad: " + this.antigüedad() + " años";
	}

	public boolean esAnterior(String fecha) {
		DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate fechaAComprobar = LocalDate.parse("01/01/" + fecha, f);

		return this.fechaIngreso.isBefore(fechaAComprobar);
	}
}
