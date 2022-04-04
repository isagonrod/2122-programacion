package Tema11.Act_Aplicacion.Act_22;

import java.io.Serializable;

public class Empleado implements Serializable {
	private int dni;
	private String nombre;
	private double sueldo;

	public Empleado() {
	}

	public Empleado(int dni, String nombre, double sueldo) {
		this.dni = dni;
		this.nombre = nombre;
		this.sueldo = sueldo;
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

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public String toString() {
		return "DNI: " + this.dni + " | Nombre: " + this.nombre + " | Sueldo: " + this.sueldo + "\n";
	}
}
