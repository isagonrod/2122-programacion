package Tema12.Act_Clase.Act_Mapa_ProfAlum;

import Utilidades.Teclado;

import java.util.Arrays;
import java.util.Objects;

public class Alumno implements Comparable<Alumno> {
    private String dni;
    private String nombreApellido;
    private Double[] notas;

    public Alumno(String dni, String nombreApellido) {
        this.dni = dni;
        this.nombreApellido = nombreApellido;
        this.notas = new Double[5];
        insertarNotas();
    }

    public String getDni() {
        return dni;
    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public Double[] getNotas() {
        return notas;
    }

    public void setNotas(Double[] notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "Alumno: " + this.nombreApellido + " (" + this.dni + ") | Nota media: " + this.media() + " | Notas: " + Arrays.toString(this.notas);
    }

    @Override
    public boolean equals(Object o) {
        Alumno alumno = (Alumno) o;
        return Objects.equals(dni, alumno.dni);
    }

    @Override
    public int compareTo(Alumno o) {
        return this.dni.compareToIgnoreCase(o.dni);
    }

    public int media() {
        int media = 0;
        for (int i = 0; i < this.notas.length; i++) {
            media += this.notas[i];
        }
        media /= this.notas.length;
        return media;
    }

    public Double[] insertarNotas() {
        for (int i = 0; i < this.notas.length; i++) {
            notas[i] = Teclado.getDouble("Nota " + (i+1) + ": ");
        }
        return this.notas;
    }
}
