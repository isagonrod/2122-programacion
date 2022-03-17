package Tema10.Act_Ampliacion.Act_31;

import Utilidades.Teclado;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Cliente implements Comparable {
    private String dni;
    private String nombreCompleto;
    private LocalDate fechaNacimiento;
    private Double saldo;

    public Cliente(String dni, String nombreCompleto, String fechaNacimiento, Double saldo) {
        this.dni = dni;
        this.nombreCompleto = nombreCompleto;
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        this.fechaNacimiento = LocalDate.parse(fechaNacimiento, f);
        this.saldo = saldo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public int edad() {
        return (int)fechaNacimiento.until(LocalDate.now(), ChronoUnit.YEARS);
    }

    public static Cliente pedirDatosCliente() {
        return new Cliente(
                Teclado.getString("DNI: "),
                Teclado.getString("Nombre completo: "),
                Teclado.getString("Fecha de nacimiento: "),
                Teclado.getDouble("Saldo: ")
        );
    }

    public String toString() {
        return "DNI: " + this.dni + " | Nombre completo: " + this.nombreCompleto + " | Saldo: " + this.saldo
                + " | Edad: " + edad() + "\n";
    }

    @Override
    public int compareTo(Object o) {
        return this.dni.compareTo(((Cliente)o).dni);
    }
}
