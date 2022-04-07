package Tema11.Act_Ampliacion.Act_28y29;

import Tema10.Act_Ampliacion.Act_31.Cliente;
import Utilidades.Teclado;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Familiar implements Comparable, Serializable {
    private String dni;
    private String nombre;
    private LocalDate fechaNacimiento;

    public Familiar(String dni, String nombre, String fechaNacimiento) {
        this.dni = dni;
        this.nombre = nombre;
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.fechaNacimiento = LocalDate.parse(fechaNacimiento, f);
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
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

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    int edad() {
        return (int)this.fechaNacimiento.until(LocalDate.now(), ChronoUnit.YEARS);
    }

    @Override
    public int compareTo(Object o) {
        return ((Familiar)o).edad() - this.edad();
    }

    public String toString() {
        return "\tFamiliar: " + this.nombre + " (DNI: " + this.dni + " Edad: " + this.edad() + ")\n";
    }

	public static Familiar pedirDatosFamiliar() {
		return new Familiar(
				Teclado.getString("DNI: "),
				Teclado.getString("Nombre completo: "),
				Teclado.getString("Fecha de nacimiento: "));
	}
}
