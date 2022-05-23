package Tema12.Act_Clase.Practica_Examen;

import java.time.LocalDate;

public class Persona implements Comparable<Persona> {
	private String nombre;
	private String apellido;
	private Fecha fechaNacimiento;

	public Persona(String nombre, String apellido, Fecha fechaNacimiento) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Fecha getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Fecha fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public int edad() {
		LocalDate actual = LocalDate.now();
		int actualYear = actual.getYear(), edad;

		edad = actualYear - this.fechaNacimiento.getAño();

		return edad;
	}

	public String toString() {
		return this.nombre + " " + this.apellido + " (edad: " + this.edad() + ")\n";
	}

	@Override
	public int compareTo(Persona o) {
		return this.nombre.compareToIgnoreCase(o.nombre);
	}
}


