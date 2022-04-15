package Tema11.Práctica;

import java.io.Serializable;

public class CalificacionAsignatura implements Serializable {
    private int codigo;
    private double calificacion;

    public CalificacionAsignatura(int codigo, double nota) {
        this.codigo = codigo;
        this.calificacion = nota;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public String toString() {
        return "Cód.Asig: " + this.codigo + " | Calificación: " + this.calificacion + "\n";
    }
}
