package Tema11.Act_Ampliacion.Act_27;

import Utilidades.Teclado;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Deportista implements Comparable<Deportista>, Serializable {
	private int dni;
	private String nombre;
	private LocalDate fechaNacimiento;
	private Deporte deporte;

	public Deportista(int dni, String nombre, String fechaNacimiento, Deporte deporte) {
		this.dni = dni;
		this.nombre = nombre;
		DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		this.fechaNacimiento = LocalDate.parse(fechaNacimiento, f);
		this.deporte = deporte;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
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

	public Deporte getDeporte() {
		return deporte;
	}

	public void setDeporte(Deporte deporte) {
		this.deporte = deporte;
	}

	int edad() {
		return (int)this.fechaNacimiento.until(LocalDate.now(), ChronoUnit.YEARS);
	}

//	@Override
//	public int compareTo(Object o) {
//		return this.nombre.compareToIgnoreCase(((Deportista)o).nombre);
//	}
	@Override
	public int compareTo(Deportista o) {
		return this.nombre.compareToIgnoreCase(o.nombre);
	}

	public String toString() {
		return "\nDNI: " + this.dni + " | NOMBRE: " + this.nombre + " | EDAD: " + this.edad() + " | DEPORTE: " + this.deporte;
	}


}
