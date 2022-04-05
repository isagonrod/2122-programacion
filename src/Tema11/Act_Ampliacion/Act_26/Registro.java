package Tema11.Act_Ampliacion.Act_26;

import java.io.Serializable;

public class Registro implements Serializable {
    private double tempMax;
    private double tempMin;
    private String fecha;

     public Registro(double tempMax, double tempMin, String fecha) {
        this.tempMax = tempMax;
        this.tempMin = tempMin;
        this.fecha = fecha;
    }

    public double getTempMax() {
        return tempMax;
    }

    public void setTempMax(double tempMax) {
        this.tempMax = tempMax;
    }

    public double getTempMin() {
        return tempMin;
    }

    public void setTempMin(double tempMin) {
        this.tempMin = tempMin;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double variacion() {
        return this.tempMax - this.tempMin;
    }

    public String toString() {
        return "\nFecha: " + this.fecha + " | Temp.Máxima: " + this.tempMax + " | Temp.Mínima: " + this.tempMin
                + " | Variación: " + variacion();
    }
}
