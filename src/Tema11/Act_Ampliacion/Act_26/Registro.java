package Tema11.Act_Ampliacion.Act_26;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Registro implements Serializable {
    private double tempMax;
    private double tempMin;
    private LocalDate fecha;

    public Registro(double tempMax, double tempMin, String fecha) {
        this.tempMax = tempMax;
        this.tempMin = tempMin;
		 DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.fecha = LocalDate.parse(fecha, f);
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

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
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
