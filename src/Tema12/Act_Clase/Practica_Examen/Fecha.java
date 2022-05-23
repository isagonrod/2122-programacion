package Tema12.Act_Clase.Practica_Examen;

public class Fecha {
	private int dia;
	private int mes;
	private int año;

	public Fecha(int dia, int mes, int año) {
		this.dia = dia;
		this.mes = mes;
		this.año = año;
	}

	public Fecha(String fecha) {
		String[] fechaSeparada = fecha.split("/");
		this.dia = Integer.parseInt(fechaSeparada[0]);
		this.mes = Integer.parseInt(fechaSeparada[1]);
		this.año = Integer.parseInt(fechaSeparada[2]);
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public int diferenciaDias(Fecha f2) {
		int resultado;

		resultado = (f2.año - this.año) * 365;
		if (f2.mes - this.mes != 0) {
			resultado += (f2.mes - this.mes) * 30;
		} else {
			resultado += (f2.dia - this.dia);
		}

		return resultado;
	}

	public String toString() {
		return this.dia + "/" + this.mes + "/" + this.año;
	}
}
