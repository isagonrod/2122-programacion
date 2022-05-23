package Tema12.Act_Clase.Practica_Examen;

public class Empleado extends Persona implements Comparable<Persona> {
	private String puesto;
	private Fecha fechaIngreso;
	private Double sueldo;

	public Empleado(String nombre, String apellido, Fecha fechaNacimiento, String puesto, Fecha fechaIngreso, Double sueldo) {
		super(nombre, apellido, fechaNacimiento);
		this.puesto = puesto;
		this.fechaIngreso = fechaIngreso;
		this.sueldo = sueldo;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public Fecha getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Fecha fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public Double getSueldo() {
		return sueldo;
	}

	public void setSueldo(Double sueldo) {
		this.sueldo = sueldo;
	}

	public String toString() {
		return super.toString() +
				"\tPuesto: " + this.puesto + " | Fecha de ingreso: " + this.fechaIngreso + " | Sueldo: " + this.sueldo + '\n';
	}

	@Override
	public int compareTo(Persona o) {
		return this.fechaIngreso.diferenciaDias(((Empleado)o).fechaIngreso);
	}
}
