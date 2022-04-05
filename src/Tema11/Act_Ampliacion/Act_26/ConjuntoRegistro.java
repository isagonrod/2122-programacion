package Tema11.Act_Ampliacion.Act_26;

import Utilidades.Teclado;

import java.util.Arrays;

public class ConjuntoRegistro {
    private Registro[] tabla;

    public ConjuntoRegistro() {
        this.tabla = new Registro[0];
    }

    public Registro[] getTabla() {
        return tabla;
    }

    public void setTabla(Registro[] tabla) {
        this.tabla = tabla;
    }

    public String toString() {
        return Arrays.deepToString(this.tabla);
    }

    public Registro[] nuevoRegistro(Registro nuevo) {

        this.tabla = Arrays.copyOf(tabla, tabla.length + 1);
        this.tabla[tabla.length - 1] = nuevo;

        return this.tabla;
    }

    public double calcularMax(double temp) {
        return Math.max(temp, 0);
    }

    public double calcularMin(double temp) {
        return Math.min(temp,9999);
    }

    public double calcularMedia(double temp) {
        double resultado = 0;

        return resultado;
    }
}
