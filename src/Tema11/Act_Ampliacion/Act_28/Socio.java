package Tema11.Act_Ampliacion.Act_28;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Socio implements Comparable, Serializable {
	public static int numSocioActual = 1;
	private int numSocio;
	private String nombre;
	private LocalDate fechaNacimiento;
	private LocalDate fechaAlta;
	private int telefono;
	private String email;

	public Socio(String nombre, String fechaNacimiento, String fechaAlta, int telefono, String email) {
		this.numSocio = numSocioActual;
		this.nombre = nombre;
		DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		this.fechaNacimiento = LocalDate.parse(fechaNacimiento, f);
		this.fechaAlta = LocalDate.parse(fechaAlta, f);
		this.telefono = telefono;
		this.email = email;
	}

	public int getNumSocio() {
		return numSocio;
	}

	public void setNumSocio(int numSocio) {
		this.numSocio = numSocio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		this.fechaNacimiento = LocalDate.parse(fechaNacimiento, f);
	}

	public LocalDate getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(String fechaAlta) {
		DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		this.fechaAlta = LocalDate.parse(fechaAlta, f);
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	int edad() {
		return (int)this.fechaNacimiento.until(LocalDate.now(), ChronoUnit.YEARS);
	}

	int antigüedad() {
		return (int)this.fechaAlta.until(LocalDate.now(), ChronoUnit.MONTHS);
	}

	@Override
	public int compareTo(Object o) {
		return this.nombre.compareToIgnoreCase(((Socio)o).nombre);
	}

	public String toString() {
		return "Nº de socio: " + this.numSocio + " | Nombre: " + this.nombre + " | Edad: " + this.edad()
				+ " | Antigüedad: " + this.antigüedad() + " meses | Teléfono: " + this.telefono
				+ " | Correo electrónico: " + this.email + "\n";
	}
}
