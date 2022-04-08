package Tema11.Act_Ampliacion.Act_31;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Cliente implements Comparable, Serializable {
    private String dni;
    private String nombre;
    private LocalDate fechaNacimiento;
    private double saldo;

    public Cliente(String dni, String nombre, String fechaNacimiento, double saldo) {
        this.dni = dni;
        this.nombre = nombre;
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.fechaNacimiento = LocalDate.parse(fechaNacimiento, f);
        this.saldo = saldo;
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

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public int compareTo(Object o) {
        return this.dni.compareTo(((Cliente)o).dni);
    }

    public String toString() {
        return "DNI: " + this.dni +
                " | Nombre: " + this.nombre +
                " | Edad: " + this.edad() +
                " | Saldo: " + this.saldo + " €\n";
    }

    int edad() {
        return (int)this.fechaNacimiento.until(LocalDate.now(), ChronoUnit.YEARS);
    }
}
