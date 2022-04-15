package Tema11.Práctica;

import java.io.Serializable;
import java.util.Arrays;

public class Alumno implements Comparable, Serializable {
    private String nombre;
    private String dni;
    private CalificacionAsignatura[] notas;

    public Alumno(String nombre, String dni, CalificacionAsignatura[] notas) {
        this.nombre = nombre;
        this.dni = dni;
        this.notas = notas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public CalificacionAsignatura[] getNotas() {
        return notas;
    }

    public void setNotas(CalificacionAsignatura[] notas) {
        this.notas = notas;
    }

	public String toString() {
		return "Alumno/a: " + this.nombre + " | DNI: " + this.dni + "\nNotas: " + Arrays.toString(this.notas) + "\n";
	}

	@Override
	public int compareTo(Object o) {
		return this.nombre.compareToIgnoreCase(((Alumno)o).nombre);
	}
}
